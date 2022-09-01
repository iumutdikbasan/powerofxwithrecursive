import java.util.Scanner;

public class main {
    static int toplam = 1 ;
    static int op(int power,int base){
        if(power==0){
            return 1;

        }
        toplam *= base;
        op(power-1,base);
        return toplam;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the base number : ");
        int base = scan.nextInt();
        System.out.println("Please enter the power number : ");
        int power = scan.nextInt();

        System.out.println(op(power,base));
    }

}
