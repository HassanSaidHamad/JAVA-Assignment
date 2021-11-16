class PatternOne {

    public static void main(String[] args) {

        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

       int n2 = 5;
       for (int row = 1; row <= n2; row++) {
           for (int space = row; space <= n2; space++) {
               System.out.print(" ");
           }
           for (int col = 1; col <= row; col++) {
               System.out.print("*");
           }
           System.out.println();
       }

      int n3 = 5;
       for (int r = 1; r <= n3; r++) {
           for (int c = r; c <= n3; c++) {
               System.out.print("*");
           }
           System.out.println();
       }

       int n4 = 5;
       for (int row = 1; row <= n4; row++) {
           for (int col = 1; col <= row; col++) {
               System.out.print(col);
           }
           System.out.println();
       }


   

    }
}
