package Quiz1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String pw1 = "aaa";
        String pw2 = "bbb";
        System.out.println("New Password:");
        Scanner input = new Scanner(System.in);
        pw1 = input.nextLine();
        while (!pw2.equals(pw1)){

            System.out.println("comfrim Password:");
            pw2 = input.nextLine();
        }

    }
}
