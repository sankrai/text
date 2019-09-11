package Quiz5;

import java.util.Scanner;

public class BMI {
        public static void main(String[] args){
            Scanner as = new Scanner(System.in);
            System.out.println("น้ำหนัก(kg):");


            double W = as.nextDouble(); //กำหนดค่า w
            System.out.print("ส่วนสูง(cm):");

            double h = as.nextDouble();  //กำหนดค่า h
            h = h/100;
            double bmi=W / (h*h);

            System.out.print("ค่ารวม:"+bmi);//แสดงค่าน้ำหนัก +ค่าส่วนสูง
            if (bmi>=40){
                System.out.println("อ้วนสูงสุด");
            }
            else if (bmi>=35){
                System.out.println("อ้วนขึ้นที่2");
            }
            else if (bmi>=28.5){
                System.out.println("อ้วนขึ้นที่1");
            }
            else if (bmi>=23.5){
                System.out.println("น้ำหนักเกิน");
            }
            else if (bmi>=18.5){
                System.out.println("อยู่ในเกณปกติ");
            }
            else if (bmi<=18.5){
                System.out.println("น้ำหนักต่ำกว่าเกณ");
            }




        }
    }


