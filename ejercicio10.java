
import java.util.*;
public class ejercicio10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        int sum2=0;
        int count = 0;
        do{
            System.out.println("ingresar numero ");
            int n= s.nextInt();
            sum += n;
            if(n%6==0){
                count++;
            }
            if(1<=n && n<=10){
                sum2+=n;
            }
        }while(sum<=1000);
        System.out.println("multiplos de 6 "+count);
        System.out.println("suma entre 1 y 10 "+sum2);
    }
}