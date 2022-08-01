//Display numbers in a pyramid pattern.

//Prepared by Khushi Shah 21CE127

public class practical1_7 {
    public static void main(String[] args) {
        int a=8;
        int b=1;
        for (int i = a; i > 0; i--)
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= b-1; j++)             
            {
                System.out.print( (int)Math.pow(2, j)+  " ");  
            }
            for (int j = b-1; j >= 1; j--)
            {                    
                System.out.print((int)Math.pow(2, j-1)+" ");
            }                          
            System.out.println();
            b++;
        }
    }
}

