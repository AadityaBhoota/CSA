import java.io.File;
import java.util.Scanner;

public class StringHandlerDriver {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File ("pwd.txt"));

            while (sc.hasNext()) {
                PasswordSecurityHandler psh = new PasswordSecurityHandler();
                StringParser sp = new StringParser(psh);
                String pwd = sc.nextLine();
                sp.parse(pwd);
                System.out.println(pwd + "\'s security is " + psh.securityLevel());
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Scanner sc = new Scanner(new File ("hex.txt"));

            while (sc.hasNext()) {
                HexStringHandler hsh = new HexStringHandler();
                StringParser sp = new StringParser(hsh);
                String hex = sc.nextLine();
                sp.parse(hex);
                if (hsh.isValid())
                    System.out.println(hex + " = " + hsh.getDecimalValue());
                else
                    System.out.println(hex + " is not a valid hex number.");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}