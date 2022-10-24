public class btvn_bai3 {
    public static void main(String[] args){
        int a,b, c;
        for(a = 1; a < 20 ; a++){
            for(b=1 ; b < 33 ; b++){
                c=100-a-b;
                if( (a+b+c==100) && (15*a+9*b+c==300)){
                    System.out.println("So trau dung : " +a);
                    System.out.println("So trau nam : " +b);
                    System.out.println("So trau gia : " +c);

                }

            }
        }
    }

}
