public class ConvDeUnidPad {

    private static Double cParaF;
    private static Double fParaC;
    private static Double cParaK;
    private static Double kParaC;
    private static Double cparaRe;
    private static Double reParaC;
    private static Double kParaR;
    private static Double rParaK;

    public static void temp1(Double c1) {
        cParaF = ((9 * c1 / 5) + 32);
        System.out.println("Valor convertido: " + cParaF);

    }

    public static void temp2(Double f1) {
        fParaC = (f1 - 32) * +5 / 9;
        System.out.println("\nValor convertido: " + fParaC);
    }

    public static void temp3(Double c2) {
        cParaK = c2 + 273.15;
        System.out.println("\nValor convertido: " + cParaK);
    }

    public static void temp4(Double k1) {
        kParaC = k1 - 273.15;
        System.out.println("\nValor convertido: " + kParaC);
    }

    public static void temp5(Double c3) {
        cparaRe = c3 * 4 / 5;
        System.out.println("\nValor convertido: " + cparaRe);
    }

    public static void temp6(Double re) {
        reParaC = re * 5 / 4;
        System.out.println("\nValor convertido: " + reParaC);
    }

    public static void temp7(Double k2) {
        kParaR = k2 * 1.8;
        System.out.println("\nValor convertido: " + kParaR);
    }

    public static void temp8(Double r) {
        rParaK = r / 1.8;
        System.out.println("\nValor convertido: " + rParaK);
    }

}
