import java.util.Scanner;

public class btvn_bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        }while(n<0);

        int count=0;
        while(n>0){
            int du = n%10;
                if(Math.pow(Math.sqrt(du),2)==du){
                System.out.println( " "+ du);
                count++;
                 }
            n = n/10;
        }
        if(count==0)  System.out.println( "No");
    }
}
