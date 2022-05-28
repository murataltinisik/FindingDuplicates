import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n;
        int loop = 0;
        int average = 0;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        // RESULT
        for(int i=0; i<=n; i++){
            if(i % 3 == 0 && i % 4 == 0){
                loop++;
                average += i;
            }
        }

        average /= loop;

        System.out.println("3 & 4 İle Bölünen Sayıların Ortalaması: " + average);


    }
}
