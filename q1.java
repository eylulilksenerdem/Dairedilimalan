import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        //TODO Auto-generated method
        Scanner sc=new Scanner(System.in);
        int kg;
        kg=sc.nextInt();
        System.out.println("Kilogramı giriniz:"+kg);
        double Kitleendex,boy;
        boy=sc.nextDouble();
        System.out.println("Boyu giriniz:"+boy);
        Kitleendex=kg/boy*boy;
        System.out.println("Vücut kitle endeksini giriniz:"+Kitleendex);
    }

}
