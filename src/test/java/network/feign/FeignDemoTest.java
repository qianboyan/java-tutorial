package network.feign;

import static org.junit.Assert.*;

import feign.Feign;
import feign.gson.GsonDecoder;
import java.util.List;
import org.junit.Test;

public class FeignDemoTest {
  private GitHubApi githubapi = Feign.builder()
      .decoder(new GsonDecoder())
      .target(GitHubApi.class, "https://api.github.com");

  @Test
  public void checkContributorLength() throws Exception {
    List<Contributor> contributors = githubapi.contributors("OpenFeign", "feign");
    assertTrue(contributors.size() > 2);
  }

  @Test
  public void checkFirstContributor() throws Exception {
    List<Contributor> contributors = githubapi.contributors("OpenFeign", "feign");
    assertEquals(contributors.get(0).login, "kdavisk6");
  }
}