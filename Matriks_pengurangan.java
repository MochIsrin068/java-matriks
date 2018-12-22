import java.util.Scanner;

public class Matriks_pengurangan {
    public static void main(String[] args){
        // Membuat Scanner Inputan Matriks
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Ordo Matriks A, B dan C : ");

        // Membuat Variable Untuk inputan scanner
        int n = input.nextInt();

        // Membuat Array 2 Dimensi Untuk Matriks A, B dan C
        // C adalah Matriks Hasil Pengurangan dari Matriks A - B
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // Membuat Matriks A, yang di inputkan oleh user
        System.out.println("Masukkan Nilai Matriks A ");
        for (int a = 0; a < A.length ; a++){
            for (int b = 0; b < A[a].length; b++){
                System.out.print("Nilai Matriks A[" + a + "]" + "[" + b + "] : ");
                A[a][b] = input.nextInt();
            }
            System.out.print("");
        }

        System.out.print("\n");
        // Menampilkan Nilai Matriks A Yang Telah diinputkan
        System.out.println("Nilai Matriks A : ");
        for (int a = 0; a < A.length ; a++){
            for (int b = 0; b < A[a].length; b++){
                System.out.print(A[a][b] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        // Membuat Matriks B, yang di inputkan oleh user
        System.out.println("Masukkan Nilai Matriks B");
        for (int a = 0; a < B.length ; a++){
            for (int b = 0; b < B[a].length; b++){
                System.out.print("Nilai Matriks B[" + a + "]" + "[" + b + "] : ");
                B[a][b] = input.nextInt();
            }
            System.out.print("");
        }

        System.out.print("\n");
        // Menampilkan Nilai Matriks B Yang Telah diinputkan
        System.out.println("Nilai Matriks B : ");
        for (int a = 0; a < B.length ; a++){
            for (int b = 0; b < B[a].length; b++){
                System.out.print(B[a][b] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");


        // Membuat Matriks C yang Merupakan Hasil Pengurangan dari Matriks A - B
        for (int a = 0; a < C.length ; a++){
            for (int b = 0; b < C[a].length; b++){
                C[a][b] = A[a][b] - B[a][b];
            }
        }
        // Menampilkan Nilai Matriks C = A+B
        System.out.println("Nilai Matriks C yang Merupakan Hasil Pengurangan Matriks A - B :");
        for (int a = 0; a < C.length ; a++){
            for (int b = 0; b < C[a].length; b++){
                System.out.print(C[a][b] + "\t");
            }
            System.out.println("");
        }

    }
}
