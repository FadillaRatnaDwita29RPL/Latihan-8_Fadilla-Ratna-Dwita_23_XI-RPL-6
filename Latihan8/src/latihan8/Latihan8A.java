package latihan8;

public class Latihan8A {

    public static void main(String[] args) {
        System.out.println("======= Latihan 8A ==========");
        
        int matriksA [] [] = {{1, 6}, {5, 3}};  //Deklarasi matriks A dengan ordo 2.2
        int matriksB [] [] = {{2}, {3}}; //Deklarasi matriksB dengan ordo 1.1
                     
        int hasilKali [] [] = new int [matriksA.length] [matriksB[0].length]; //Mendeklarasi matriks hasilKali dengan ordo/indeks mengambil dari matriksA dan matriksB
                                                                                                                        //dimana baris diambil dari matriksA dan kolom diambil dari matriksB
        
        System.out.println("Matriks A * Matriks B : ");
        
        for (int m = 0; m < matriksA.length; m++ ){         //BARIS matriksA
            for (int n = 0; n < matriksB[0].length; n++){   //Kolom matriksB
                
                for (int k =0; k < matriksB.length; k++){   //kolom matriksA atau baris  matriksB 
                    hasilKali [m] [n] += matriksA [m] [k] * matriksB [k] [n]; //Operasi untuk menghitung hasil jumlah kedua matriks
                }
                    System.out.print(hasilKali [m] [n] + "  "); //Mencetak matriks hasilKali
            }
                    System.out.println(" ");
        }
        
        
        
         
    }
    
}
