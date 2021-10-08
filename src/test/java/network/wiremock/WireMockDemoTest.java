package network.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Rule;
import org.junit.Test;

public class WireMockDemoTest {
  @Rule
  public WireMockRule wireMockRule = new WireMockRule();

  @Test
  public void firstTest() throws Exception {
    configureFor("localhost", 8080);
    stubFor(get(urlEqualTo("/api/test"))
        .willReturn(aResponse().withBody("Hi Boyan!")));

    CloseableHttpClient httpClient = HttpClients.createDefault();
    HttpGet request = new HttpGet("http://localhost:8080/api/test");
    try {
      HttpResponse httpResponse = httpClient.execute(request);
      String responseString = convertResponseToString(httpResponse);
      verify(getRequestedFor(urlEqualTo("/api/test")));
      assertEquals("Hi Boyan!", responseString);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void secondTest() throws Exception {
    stubFor(get(urlEqualTo("/api/test/phasetwo"))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody("Body here!")));

    CloseableHttpClient httpClient = HttpClients.createDefault();
    HttpGet request = new HttpGet("http://localhost:8080/api/test/phasetwo");
    try {
      HttpResponse httpResponse = httpClient.execute(request);
      String responseString = convertResponseToString(httpResponse);
      verify(getRequestedFor(urlEqualTo("/api/test/phasetwo")));
      assertEquals("Body here!", responseString);
      assertEquals(200, httpResponse.getStatusLine().getStatusCode());
      assertEquals("application/json", httpResponse.getFirstHeader("Content-Type").getValue());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void thirdTest() throws Exception {
    stubFor(post(urlEqualTo("/api/test"))
        .withHeader("Content-Type", equalTo("application/json"))
        .withRequestBody(containing("\"testing-library\": \"WireMock\""))
        .willReturn(aResponse()
            .withStatus(200)
            .withBody("Successful!")));

    CloseableHttpClient httpClient = HttpClients.createDefault();
    HttpPost request = new HttpPost("http://localhost:8080/api/test");
    request.addHeader("Content-Type", "application/json");

    StringEntity entity = new StringEntity("\"testing-library\": \"WireMock\"");
    request.setEntity(entity);

    try {
      HttpResponse httpResponse = httpClient.execute(request);
      String responseString = convertResponseToString(httpResponse);

      verify(postRequestedFor(urlEqualTo("/api/test"))
          .withHeader("Content-Type", equalTo("application/json")));
      assertEquals("Successful!", responseString);
      assertEquals(200, httpResponse.getStatusLine().getStatusCode());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static String convertResponseToString(HttpResponse response) throws IOException {
    InputStream responseStream = response.getEntity().getContent();
    Scanner scanner = new Scanner(responseStream, "UTF-8");
    String responseString = scanner.useDelimiter("\\Z").next();
    scanner.close();
    return responseString;
  }

}