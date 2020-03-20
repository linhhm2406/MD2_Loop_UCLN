import com.sun.org.apache.xpath.internal.axes.OneStepIterator;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = inputNumber.nextInt();

        System.out.print("Nhap so b: ");
        int b = inputNumber.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if(a==0 && b==0){
            System.out.println("Khong co UCLN");
        } else if (a==0 || b==0) {
            System.out.println("UCLN la : " + Math.abs(a-b));
        } else {
            while (a!=b){
                if (a>b){
                    a=a-b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("UCLN la : "+a);
        }
    }
}
