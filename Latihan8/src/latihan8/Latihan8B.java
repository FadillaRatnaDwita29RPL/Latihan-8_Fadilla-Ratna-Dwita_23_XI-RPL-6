package latihan8;

public class Latihan8B {

    public static void main(String[] args) {
        System.out.println("======= Latihan 8B ===========");
        
        int matriksA [] [] = {{1, 6}, {5, 3}, {9,6}};
        int matriksB [] [] = {{2}, {3}};
                     
        int hasilKali [] [] = new int [matriksA.length] [matriksB[0].length];
        
        System.out.println("Matriks A * Matriks B : ");
        
        for (int m = 0; m < matriksA.length; m++ ){         //BARIS matriksA
            for (int n = 0; n < matriksB[0].length; n++){   //Kolom matriksB
                
                for (int k =0; k < matriksB.length; k++){   //kolom matriksA atau baris  matriksB 
                    hasilKali [m] [n] += matriksA [m] [k] * matriksB [k] [n];
                }
                    System.out.print(hasilKali [m] [n] + "  ");
            }
                    System.out.println(" ");
        }
    }
    
}
