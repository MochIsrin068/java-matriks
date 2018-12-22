import java.util.Scanner;

public class matriks_transpose {
    public static void main(String args[]){
        Scanner masuk = new Scanner (System.in);
        int [][]matriksA;
        int [][]matriksAt;
        int baris;
        int kolom;
        System.out.print("Masukkan Baris : ");
        baris=masuk.nextInt();
        System.out.print("Masukkan Kolom : ");
        kolom=masuk.nextInt();
        System.out.println();

        matriksA =new int[baris][kolom];
        //Input Matriks A
        System.out.println("-> Matriks A <-");
        for (int i=0;i < baris; i++){
            for (int j = 0; j < kolom;j++){
                System.out.print("Matriks A[" + i + "][" + j + "] = ");
                int isiMatriks = masuk.nextInt();
                matriksA[i][j] = isiMatriks;
            }
        }

        //Rumus Transpose Matriks
        matriksAt =new int[kolom][baris];
        for (int i=0;i < kolom; i++){
            for (int j = 0; j < baris;j++){
                matriksAt[i][j] = matriksA[j][i];
            }
        }
        System.out.println("");

        // Menampilkan Matriks A
        System.out.println("-> Matriks A <-");
        for (int i=0;i < baris; i++){
            for (int j = 0; j < kolom;j++){
                System.out.print(matriksA[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");

        // Menampilkan Transpose Matriks A
        System.out.println("-> Matriks Transpose Dari Matriks A <-");
        for (int i=0;i < kolom; i++){
            for (int j = 0; j < baris;j++){
                System.out.print(matriksAt[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}