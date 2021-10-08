package network.feign;

import feign.Feign;
import feign.gson.GsonDecoder;
import java.util.List;

public class FeignDemo {
  public static void main(String... args) {
    GitHubApi githubapi = Feign.builder()
        .decoder(new GsonDecoder())
        .target(GitHubApi.class, "https://api.github.com");

    List<Contributor> contributors = githubapi.contributors("OpenFeign", "feign");
    for (Contributor contributor : contributors) {
      System.out.println("Contributor Name: " + contributor.login + " " + contributor.id);
      System.out.println("Link to Contributor: " + contributor.url);
    }
  }

}
