package projeto.intellij.novoprojetointellij.dados.aritimeticos.conversao.metodos.sobrecarga.retornos;

public class Retornos {
    public static double area(double lado) {
        return lado * lado;
    }
    public static double area(double medidaComprimento, double medidaLargura) {
        return medidaComprimento * medidaLargura;
    }
    public static double area(double baseMenor, double baseMaior, double altura) {
        return ((baseMenor + baseMaior) * altura) / 2;
    }

}
