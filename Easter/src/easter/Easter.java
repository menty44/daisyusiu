/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easter;

/**
 *
 * @author fredrick oluoch
 */
public class Easter {

    /**
     * @param args the command line arguments
     */
    
    private static final int YEAR = 2016;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int date = easter(YEAR);
        int day = date/10, month=date%10;
        System.out.printf("Easter %d was on %d/%d/%d%n", YEAR,day,month,YEAR);
    }
    
    private static int easter (int y) {
        int a ,b ,c ,d ,e ,f , g, h, i, k, l, m, n, p;
                
        a = y%19;
        b = y/100 ;
        c = y%100;
        d = b/4 ;
        e = b%4;
        f = (b+8)/25;
        g = (b-f+1)/3;
        h = (19*a+b-d-g+15)%30;
        i = c/4 ;
        k = c%4;
        l = (32+2*e+2*i-h-k)%7;
        m = (a+11*h+22*l)/451;
        n = (h+l-7*m+114)/31; 
        p = (h+l-7*m+114)%31;
        
        return 10*(p+1)+n;
    }           
        
}

