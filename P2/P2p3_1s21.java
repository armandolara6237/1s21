public class P2p3_1s21 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            
            
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
            System.out.println(); 
        }
    }
}
