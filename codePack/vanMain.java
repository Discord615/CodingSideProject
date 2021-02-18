package codePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class vanMain {

    public static void main(String[] args) throws Exception {
        loginReg();
    }

    private static void loginReg() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        String line = "-------------------------";
        while (true) {
            System.out.printf("%sMenu%s\n[1]Login\n[2]Register\nEnter Choice: ", line, line);
            try {
                String ph = in.readLine();
                choice = Integer.parseInt(ph);

                switch (choice) {
                    case 1:
                        System.out.println("test");
                        break;
                }
                break;
            } catch (Exception e) {
                System.out.println("Not a number");
                TimeUnit.MILLISECONDS.sleep(1500);
                continue;
            }
        }
    }
}
