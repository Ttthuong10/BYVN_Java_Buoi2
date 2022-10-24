import java.util.Scanner;

public class BTVN_Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a,b, c, d : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a==b && c == d && a == c) {
            System.out.println("Khong ton tai so lon thu 2");
            return;
        }
        int max1, max;

        if(a>b) {
            max=a;
            max1=b;
        }else{
            max= b;
            max1 = a;
        }

        if (max < c) {
            max1=max;
            max = c;
        }
        if(max < d){
            max1 = max;
            max = d;
        }

        System.out.println("So lon thu 2 la : " + max1);
    }
}
