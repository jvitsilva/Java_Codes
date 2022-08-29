import java.util.Scanner;

public class Conversao {

        public static void main(String[] args) {

                Double cEscolha, fEscolha, kEscolha, reEscolha, rEscolha;
                int escolha, desejo;
                do {
                        try (Scanner ler = new Scanner(System.in)) {
                                System.out.println("##### Conversor de Temperaturas #####");
                                System.out.println("\n1 - Celsius para Fahrenheit");
                                System.out.println("2 - Fahrenheit para Celsius");
                                System.out.println("3 - Celsius para Kelvin");
                                System.out.println("4 - Kelvin para Celsius");
                                System.out.println("5 - Celsius para Réaumur");
                                System.out.println("6 - Réaumur para Celsius");
                                System.out.println("7 - Kelvin para Rankine");
                                System.out.println("8 - Rankine para Kelvin");
                                System.out.print("\nEscolha 1 das seguintes operações:");
                                escolha = ler.nextInt();

                                switch (escolha) {
                                        case 1:
                                                System.out.print("Digite o valor em Celsius a ser convetido: ");
                                                cEscolha = ler.nextDouble();

                                                ConvDeUnidPad.temp1(cEscolha);

                                                break;

                                        case 2:
                                                System.out.print("Digite o valor em Fahrenheit a ser convetido: ");
                                                fEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp2(fEscolha);
                                                break;

                                        case 3:
                                                System.out.print("Digite o valor em Celsius a ser convetido: ");
                                                cEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp3(cEscolha);
                                                break;

                                        case 4:
                                                System.out.print("Digite o valor em Kelvin a ser convetido: ");
                                                kEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp4(kEscolha);
                                                break;

                                        case 5:
                                                System.out.print("Digite o valor em Celsius a ser convetido: ");
                                                cEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp5(cEscolha);
                                                break;

                                        case 6:
                                                System.out.print("Digite o valor em Réaumur a ser convetido: ");
                                                reEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp6(reEscolha);
                                                break;

                                        case 7:
                                                System.out.print("Digite o valor em Kelvin a ser convetido: ");
                                                kEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp7(kEscolha);
                                                break;

                                        case 8:
                                                System.out.print("Digite o valor em Rankine a ser convetido: ");
                                                rEscolha = ler.nextDouble();
                                                ConvDeUnidPad.temp8(rEscolha);
                                                break;

                                }

                                System.out.println("Deseja fazer outra operação? 1-sim  0-não");
                                desejo = ler.nextInt();
                        }
                } while (desejo == 1);

        }
}