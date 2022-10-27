// Patterns using for loops

class pattern{
    public static void main(String[] args){
        pattern1(6);
        pattern2(6);
        pattern3(6);
        
        pattern4(6);
    }

    /*

             *
            **
           ***
          ****
         *****
        ******

              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *
          * * * * *
           * * * *
            * * *
             * *
              *

                  1 
                2 1 2 
              3 2 1 2 3 
            4 3 2 1 2 3 4 
          5 4 3 2 1 2 3 4 5 
        6 5 4 3 2 1 2 3 4 5 6 
          5 4 3 2 1 2 3 4 5 
            4 3 2 1 2 3 4 
              3 2 1 2 3 
                2 1 2 
                  1 

                5 5 5 5 5 5 5 5 5 5 5 
                5 4 4 4 4 4 4 4 4 4 5 
                5 4 3 3 3 3 3 3 3 4 5 
                5 4 3 2 2 2 2 2 3 4 5 
                5 4 3 2 1 1 1 2 3 4 5 
                5 4 3 2 1 0 1 2 3 4 5 
                5 4 3 2 1 1 1 2 3 4 5 
                5 4 3 2 2 2 2 2 3 4 5 
                5 4 3 3 3 3 3 3 3 4 5 
                5 4 4 4 4 4 4 4 4 4 5 
                5 5 5 5 5 5 5 5 5 5 5 
     */


    static void pattern1(int n){
            for(int i=1;i<=n;i++){
                for(int sp=1;sp<=n-i;sp++){
                    System.out.print(" ");
                }
                for(int st=1;st<=i;st++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    static void pattern2(int n){
        for (int i = 1; i <= (n*2)-1; i++) {
            for(int sp=1;sp<=(i<n?n-i:i-n);sp++)
            System.out.print(" ");
            for(int col=1;col<=(i>n?(2*n)-i:i);col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    

    static void pattern3(int n){
        for (int i = 1; i <= (n*2)-1; i++) {
            for(int sp=1;sp<=(i>n?i-n:n-i);sp++)
            System.out.print("  ");
            for(int j=(i>n?(2*n)-i:i);j>=1;j--)
            System.out.print(j+" ");
            for(int j=2;j<=(i>n?(2*n)-i:i);j++)
            System.out.print(j+" ");
           System.out.println(); 
        }
    }


    static void pattern4(int n){
        for(int i=1;i<=(2*n)-1;i++){
            for(int j=1;j<=(2*n)-1;j++){
                System.out.print(n-Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j))+" ");
            }
            System.out.println();
        }
    }
}