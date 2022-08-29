import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente(124578, 0.0, 10000.0, 10000.0, 0.0, true);
       
        
        System.out.println("\nOlá, eu sou a Ju, bem vindo ao Banco Itaú!");
        System.out.println("Deseja acessar nosso caixa eletrônico? \n1-sim 2-não");
        int desejo = ler.nextInt();
        while(desejo == 1){
            System.out.println("\n####################");
            System.out.println("1 - Saldo\n2 - deposito\n3 - sacar\n4 - Verificar limite\n5 - Cheque especial\n6 - Sair");
            System.out.println("####################");
            int escolha = ler.nextInt();
            


                switch(escolha){
                    case 1: System.out.println("(Seu saldo é R$" + conta1.getSaldo() + ")");
                        break;


                    case 2:
                        
                        double deposito = 0;
                        System.out.println("informe o valor que deseja depositar: ");
                        deposito = ler.nextDouble();
                        conta1.depositar(deposito);
                        System.out.println("(Valor depositado com sucesso!)");
                        break;

                    case 3:
                    
                        System.out.println("informe o valor que deseja sacar:");
                        Double saque = ler.nextDouble();

                        if(saque > conta1.getSaldo()){
                        System.out.println("(Saldo indisponível!)");
                    }   else{
                        conta1.saque(saque);
                        System.out.println("(Saque feito com sucesso!)");
                    } break;

                    case 4: 

                        System.out.println("(Seu limite é de R$" + conta1.getLimiteVar() + ")");

                    break;
                    
                    case 5: 
                    
                        if (conta1.isStatus() == true){
                            System.out.println("Digite o valor de empréstimo desejado:");
                            Double emprest = ler.nextDouble();
                            conta1.cheque(emprest);      
                            System.out.println("(Empréstimo feito com sucesso!)");              

                    } else System.out.println("(Desculpe, você não pode fazer empréstimo)"); break;    
                      
                    case 6: desejo = 0; break;
                }
        }  System.out.println("\n(Até logo!)");
    }   
}



