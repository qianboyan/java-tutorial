package regex;

public class RegexDemo {

  public static void main(String[] args) {
    String MbbUrl = "https://hcp5csaazsrundev-3a.dmo.eu.dp.vwg-connect.com/mbbcoauth/vkms/oauth2/v1/requestToken/$(resource)?brand=Audi&amp;homeRegion=ICTO-29706";
    String MbbUrlReg = "https://hcp5csaazsrundev-3a..*/vkms/oauth2/v1/requestToken";
    String GauthUrl = "https://vkms-qua.dev.ece.gauth-vwac.com/oauth2/vkms/ppe/token";
    String newUrl = MbbUrl.replaceAll("https://hcp5csaazsrundev-3a..*.eu.dp.vwg-connect.com/mbbcoauth/vkms/oauth2/v1/requestToken", GauthUrl);
    System.out.println(newUrl);
    String newUrl2 = MbbUrl.replaceAll(MbbUrlReg, GauthUrl);
    System.out.println(newUrl2);
  }

}
