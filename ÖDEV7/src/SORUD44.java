
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Floyd üçkensel sayı 
1
2 3
4 5 6
7 8 9 10
11 12 13 15
16 17 18 19 20

*/
/**
 *
 * @author Mehmet
 */
public class SORUD44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısı GİRİNİZ");
        int N=input.nextInt();
        System.out.println("FLOYD ÜÇKENİ");
        int s=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                
                System.out.printf("%d\t",s);
                s=s+1;
                
            }
            System.out.println(" ");
        }
    }
    
}
