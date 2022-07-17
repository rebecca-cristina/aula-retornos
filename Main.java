package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos.sobrecarga.retornos;

public class Main {
    public static void main(String[] args) {

//        Retornos
        System.out.println("Exercício Retornos");

        double areaQuadrado = Retornos.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retornos.area(20,4);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Retornos.area(5,10,15);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
