package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

  public static void main(String[] args) {
    String MbbUrl =
        "https://hcp5csaazsrundev-3a.dmo.eu.dp.vwg-connect.com/mbbcoauth/vkms/oauth2/v1/requestToken/$(resource)?brand=Audi&amp;homeRegion=ICTO-29706\n"
        + "https://mocksvkms.89995.feature.eu.vwg.vwautocloud.net/mbbcoauth/vkms/oauth2/v1/requestToken/$(resource)?brand=Audi&amp;homeRegion=ICTO-29706\n"
        + "https://hcp5csaazsrundev-3a.dmo.eu.dp.vwg-connect.com/mbbcoauth/vkms/oauth2/v1/requestAGTClient/token?brand=Audi&amp;homeRegion=ICTO-29706\n"
        + "https://hcp5csaazsrundev-3a.dmo.eu.dp.vwg-connect.com/mbbcoauth/vkms/oauth2/v1/requestAGTUser/token?brand=Audi&amp;homeRegion=ICTO-29706\n";

    String MbbUrlReg = "https://.*/mbbcoauth/vkms/oauth2/v1/requestToken.*\\?";
    String MbbUrlReg2 = "https://.*/mbbcoauth/vkms/oauth2/v1/requestToken/\\$\\(resource\\)";
    String GauthUrl = "https://vkms-qua.dev.ece.gauth-vwac.com/oauth2/vkms/ppe/token";
    String newUrl = MbbUrl.replaceAll(MbbUrlReg2, GauthUrl);
    System.out.println(newUrl);

    String installedBase = "<sm:ECUGeneration>HCP5</sm:ECUGeneration>        <sm:firmwareUpdate>            <sm:diagnosticAddresses>                <sm:diagn00/>        <sm:ECUGeneration>ConMod</sm:ECUGeneration>        <sm:notification/>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>            <sm:jobEntry sm:id=>                <sm:protocol>MQTT</sm:protocol>            </sm:jobEntry>        </sm:serviceEntry>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>            <sm:operationEntry sm:id=>                <sm:payloadFormat>ProtoBuf3</sm:payloadFormat>                <sm:payloadSchema>presence_v1_vehicleState_V1M0B0</sm:payloadSchema>                <sm:protocol>MQTT</sm:protocol>            </sm:operationEntry>        </sm:serviceEntry>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>        </sm:serviceEntry>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>        </sm:serviceEntry>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>            <sm:operationEntry sm:id=>                <sm:protocol>HTTP</sm:protocol>            </sm:operationEntry>        </sm:serviceEntry>        <sm:serviceEntry sm:id=>            <sm:codedServiceState>Coded</sm:codedServiceState>            <sm:operationEntry sm:id=>                <sm:protocol>HTTP</sm:protocol>            </sm:operationEntry>            <sm:operationEntry sm:id=>                <sm:protocol>HTTP</sm:protocol>            </sm:operationEntry>            <sm:operationEntry sm:id=>                <sm:payloadFormat>MOSE</sm:payloadFormat>                <sm:protocol>HTTP</sm:protocol>            </sm:operationEntry>            <sm:operationEntry sm:id=>                <sm:protocol>HTTP</sm:protocol>            </sm:operationEntry>        </sm:serviceEntry>        <sm:serviceEntry sm:id>            <sm:codedServiceState>Coded</sm:codedServiceState>        </sm:serviceEntry>        <sm:supportsMQTT>            <sm:mqttVersion>3.1.1</sm:mqttVersion>            <sm:wireMessageVersion>V1M0B2</sm:wireMessageVersion>        </sm:supportsMQTT>    </sm:installedBase></sm:installedBaseCollection>";
    Pattern pattern = Pattern.compile("ECUGeneration>(.+?)<");
    Matcher matcher = pattern.matcher(installedBase);
    System.out.println(matcher.find());
    System.out.println(matcher.group(1));

    String vinReg = ".*HA[IT](APP|DMO).*";
    String testVin = "BAUVALHAXDEVVM008";
    System.out.println(testVin.matches(vinReg));
  }

}
