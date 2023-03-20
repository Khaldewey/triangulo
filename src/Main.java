
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = 6.0;
        double B = 4.0;
        double C = 2.0;
        double trapezio;
        double soma;

        if(eTriangulo(A,B,C)){
            soma = A + B + C;
            System.out.println(String.format("Perimetro = %.1f",soma));
        }else{
            trapezio = (A + B)*C/2;
            System.out.println(String.format("Area = %.1f",trapezio));
        }
    }

    public static boolean eTriangulo(double a, double b, double c){

        if(a + b == c || b + c == a || c + a == b){
            return false;
        }
        return true;
    }
}