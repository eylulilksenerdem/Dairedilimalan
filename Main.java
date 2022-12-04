import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,merkezaçı;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        System.out.println("Dairenin yarıçapını giriniz:"+r);
        merkezaçı=sc.nextInt();
        System.out.println("Merkezaçıyı giriniz:"+merkezaçı);
        double pi;
        pi=3.14;
        double alan;
        alan=pi*r*r*merkezaçı/360;
        System.out.println("Dairenin alanını giriniz:"+alan);

    }
}