package pattern;

public class Pattern {
    public static void main(String[] args) {
        // for(int i=0; i<4;i++){
        //     System.out.println("* * * *");
        // }

        //print star Pattern

        // for(int i=1; i<=40;i++){
        //     for( int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //print Inverted-STAR pattern
        // int n=4;
        // for(int i=1; i<=4; i++){
        //     for(int s=1; s<=4-i+1;s++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
// Print Half-Pyramid pattern
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
// print character pattern
        int n = 4;
        char ch ='A';

        for(int i=1; i<=n;i++ ){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
