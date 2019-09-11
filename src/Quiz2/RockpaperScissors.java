package Quiz2;

import java.util.Scanner;

public class RockpaperScissors {
    public static void main(String[] args) {
        int A1, A2; //ตั้งตัวแปร
        Scanner in = new Scanner(System.in);
        System.out.println("1 = Rock");
        System.out.println("2 = paper");
        System.out.println("3 = Scissors");
        System.out.println("Payer 1 : ");//กำหนดผู้เล่นคนที่1
        A1 = in.nextInt();
        System.out.println("Payer 2 : ");//กำหนดผู้เล่นคนที่2
        A2 = in.nextInt();
        if (A1 == A2) {
            System.out.println("Always");//เช็ดค่าเสมอ

        } else if (A1 == 1 && A2 == 3) {
            System.out.println("Payer 1 Winer ");//เช็ดค่า 1กับ3 ว่าใครชนะ

        } else if (A1 == 3 && A2 == 2) {
            System.out.println("Payer 1 Winer ");//เช็ดค่า 3กับ2 ว่าใครชนะ

        } else if ((A1 == 2) && (A2 == 1)) {
            System.out.println("Payer 1 Winer ");//เช็ดค่า 2กับ1 ว่าใครชนะ

        } else if (A1 == 1 && A2 == 2) {
            System.out.println("Payer 2 Winer ");//เช็ดค่า 1กับ2 ว่าใครชนะ

        } else if (A1 == 3 && A2 == 1) {
            System.out.println("Payer 2 Winer ");//เช็ดค่า 3กับ1 ว่าใครชนะ

        } else if (A1 == 2 && A2 == 3) {
            System.out.println("Payer 2 Winer ");//เช็ดค่า 2กับ3 ว่าใครชนะ

        } else if (A1 == 1 && A2 == 2) {
            System.out.println("Payer 2 Winer ");//เช็ดค่า 1กับ2 ว่าใครชนะ

        } else if (A1 == 2 && A2 == 1) {
            System.out.println("Payer 1 Winer ");//เช็ดค่า 2กับ1 ว่าใครชนะ

        }
    }
}

