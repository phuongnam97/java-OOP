package demo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class MayTinh {
    int tong(int so1, int so2){
       return so1 + so2;
    }
    int hieu(int so1, int so2){
        return so1 - so2;
    }
    int tich(int so1, int so2){
        return so1 * so2;
    }
    double thuong(int so1, int so2){
        return (double)so1 / (double)so2;
    }

    public static void main(String[] args) {
        MayTinh mt1 = new MayTinh();
        int so2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int so1 = scanner.nextInt();


        do{
            System.out.print("Nhap so thu hai: ");
            so2 = scanner.nextInt();
        } while( so2 == 0);


        System.out.println("Tong la: " + mt1.tong (so1,so2));
        System.out.println("Hieu la: " + mt1.hieu(so1,so2));
        System.out.println("Tich la: " + mt1.tich(so1,so2));
        System.out.println("Thuong la: " + mt1.thuong(so1,so2));
    }

}
