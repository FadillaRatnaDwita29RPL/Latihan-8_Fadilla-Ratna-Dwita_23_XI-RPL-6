package latihan8;

public class Latihan8C {

    public static void main(String[] args) {
        System.out.println("======= Latihan 7C ===========");
        int matriksA [] [] = {{1}, {3}, {6}};
        int matriksB [] [] = {{2, 4, 6}};
        
         int hasil [] [] = new int [matriksA.length] [matriksB[0].length];
       
        System.out.println("Matriks A * Matriks B : ");
       
          System.out.println("Perkalian matrix A dengan matrix B :");
         for (int m = 0; m < matriksA.length; m++ ){         //BARIS matriksA
            for (int n = 0; n < matriksB[0].length; n++){   //Kolom matriksB
                
                for (int k =0; k < matriksB.length; k++){   //kolom matriksA atau baris  matriksB 
                    hasil [m] [n] += matriksA [m] [k] * matriksB [k] [n];
                }
                    System.out.print(hasil [m] [n] + "     ");
            }
                    System.out.println(" ");
        }
    }
    
}
