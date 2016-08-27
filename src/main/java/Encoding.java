import java.io.UnsupportedEncodingException;

/**
 * Created on 27-8-2016.
 */
public class Encoding {

    public static void main(String[] args) {
        String ebcdicEncoding37 = "cp037";
        String ebcdicEncoding1140 = "cp1140";
        String windowsEncoding1252 = "Windows-1252";
        byte[] informationBytes = new byte[1];
        informationBytes[0] = (byte) 0x9f;
        try {
            String ebcdic37 = new String(informationBytes, ebcdicEncoding37);
            String ebcdic1140 = new String(informationBytes, ebcdicEncoding1140);
            String windows1252 = new String(informationBytes, windowsEncoding1252);
            System.out.println("parsed with ebcdic 037:" + ebcdic37);
            System.out.println("parsed with ebcdic 1140:" + ebcdic1140);
            System.out.println("parsed with windows 1252:" + windows1252);
            System.out.println("Byte array to Hexadecimal String: " + bytesToHex(informationBytes));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public static String bytesToHex(byte[] in) {
        final StringBuilder builder = new StringBuilder();
        for (byte b : in) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}