import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km, years, roadType;
        double normalAmount, ageDiscount, disAmount, ticketDis, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz :");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz :");
        years = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş :)");
        roadType = inp.nextInt();

        if (years > 0 && km > 0) {
            switch (roadType) {
                case 1 -> {
                    if (years <= 12) {
                        normalAmount = km * 0.10;
                        ageDiscount = (normalAmount * 0.50);
                        disAmount = (normalAmount - ageDiscount);
                        ticketDis = (disAmount * 0.20);
                        System.out.print("Toplam Ücret : " + disAmount + "TL");


                    } else if (years <= 24) {
                        normalAmount = km * 0.10;
                        ageDiscount = (normalAmount * 0.10);
                        disAmount = (normalAmount - ageDiscount);
                        ticketDis = (disAmount * 0.20);
                        System.out.print("Toplam Ücret :" + disAmount + "TL");

                    } else if (years >= 65) {
                        normalAmount = km * 0.10;
                        ageDiscount = (normalAmount * 0.30);
                        disAmount = (normalAmount - ageDiscount);
                        ticketDis = (disAmount * 0.20);
                        System.out.print("Toplam Ücret :" + disAmount + "TL");

                    } else {
                        normalAmount = km * 0.10;
                        ageDiscount = normalAmount * 0.30;
                        disAmount = normalAmount - ageDiscount;
                        ticketDis = (disAmount * 0.20);
                        total = (disAmount - ticketDis);
                        System.out.println("Toplam Ücret : " + total + "TL");

                    }
                } case 2 -> {
                    if (years <= 12) {
                        normalAmount = km * 0.10;
                        ageDiscount = normalAmount * 0.50;
                        disAmount = normalAmount - ageDiscount;
                        ticketDis = disAmount * 0.20;
                        total = (disAmount - ticketDis) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if ((years >= 12) && (years <= 24)) {
                        normalAmount = km * 0.10;
                        ageDiscount = normalAmount * 0.10;
                        disAmount = normalAmount - ageDiscount;
                        ticketDis = disAmount * 0.20;
                        total = (ageDiscount - ticketDis) * 2;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else if (years > 65) {
                        normalAmount = km * 0.10;
                        ticketDis = normalAmount * 0.20;
                        total = normalAmount - ticketDis;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else {
                        normalAmount = km * 0.10;
                        ageDiscount = normalAmount * 0.30;
                        disAmount = normalAmount - ageDiscount;
                        ticketDis = disAmount * 0.20;
                        total = (disAmount - ticketDis);
                        System.out.println("Toplam Ücret : " + total + "TL");
                    }

                }
                default -> System.out.println("Hatalı Giriş Yaptınız.");

            }
        }else{
            System.out.println("Geçersiz Değer Girdiniz.");
        }
    }
}