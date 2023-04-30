import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        try {


            MessageDigest md = MessageDigest.getInstance("SHA-256");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();


            md.update(str.getBytes());
            byte[] digest = md.digest();

            for(byte b :digest)
                System.out.printf("%02x",b);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}