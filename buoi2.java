import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
    //        System.out.println("Nhap a :"); // Xuat
    //        int a = scanner.nextInt();
    //        System.out.println("a= " + a);

//            System.out.println("Nhap a, b, c : ");
//            int a = scanner.nextInt();
//            //short b = (short) a ;// ep kieu ve nho hon hoac lon hon : widdening , narrowing
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//    //        System.out.println("A chua ep kieu " +a);
//    //        System.out.println( "A sau ep kieu " + (float) a);
//            //System.out.println( "A sau ep kieu " +a);
//    //        System.out.println(" Tong la : " +(a+b));
//    //        System.out.println(" Hieu la : " +(a-b));
//            // Toan tu , So sanh same C++
//            int max = a;
//            if(max < b){
//                max = b;
//            }
//            if(max < c){
//                max = c;
//            }
//            System.out.println(" Max la  " +max);
            // switch case
    //        switch (bien){
    //            case 1 : break;
    //            case 2 : break;
    //            default: " Khi 0 có case nao dung thì nhảy vào default "
    //        }

    //Nhap vao thang, in ra so ngay tuong ung voi thang do
        System.out.println("Nhap vao thang ");
        int a;

        do{
            a = scanner.nextInt();
        }while(a < 1 || a> 12);

        switch (a){
            case 1 :
            case 3 :
            case 5 :
            case 9 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println(" So ngay la : 31 " );
                break;
            case 4 :
            case 7 :
            case 11 :
                System.out.println(" So ngay la : 30 " );
                break;
            case 2 :
                System.out.println(" So ngay la : 28 " );
            default: System.out.println(" Hiii " );
        }
    }
}
