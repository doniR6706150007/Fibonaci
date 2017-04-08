‘modified sum of fibonacci’
‘modified sum of fibonacci’
 */
package rpl;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class RPL {
     public RPL() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, tian, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Berikan Batas Deret Fibbonaci = ");
        n = input.nextInt();
   
           for(i=1; i<=n; i++)
           {
          
        tian = countFibbo(i);
        System.out.print(tian+" ");
           } 
    }
    //Fungsi Rekusif nya
    public static int countFibbo(int n){  
        int chan;
        if(n==0)
            return 0;
        if(n==1)
            return(1); 
        else
            chan = countFibbo(n-1) + countFibbo(n-2);           
        return chan;
    }
    
}
