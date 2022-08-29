import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
            
            Disciplina disc = new Disciplina(" ", "14h:30", "8");
            Professor prof1 = new Professor(" ", " ", " ");
            Alunos aluno1 = new Alunos("João", 22121.0, 0.0, 0.0, 0.0, 0.0);
            Alunos aluno2 = new Alunos("Maria", 22122.0, 0.0, 0.0, 0.0, 0.0);
            Alunos aluno3 = new Alunos("Vitor", 22123.0, 0.0, 0.0, 0.0, 0.0);
            Alunos aluno4 = new Alunos("Paulo", 22124.0, 0.0, 0.0, 0.0, 0.0);
            Alunos aluno5 = new Alunos("Carlos", 22125.0, 0.0, 0.0, 0.0, 0.0);
            Alunos aluno6 = new Alunos("Marcos", 22126.0, 0.0, 0.0, 0.0, 0.0);


            Scanner lerProf = new Scanner(System.in); 
            System.out.println("SEJA BEM VINDO PROFESSOR!");
            System.out.println("Digite seu nome: ");
            String nomeProf = lerProf.nextLine();
            prof1.setNome(nomeProf);
            System.out.println("Digite seu departamento: ");
            String depProf = lerProf.nextLine();
            prof1.setDepartamento(depProf);
            System.out.println("Digite seu email: ");
            String emailProf = lerProf.nextLine();
            prof1.setDepartamento(emailProf);
            System.out.println("Digite sua disciplina: ");
            String nomeDisc = lerProf.nextLine();
            disc.setNome(nomeDisc);


            System.out.println("Coloque as notas dos seus alunos abaixo");
            Scanner ler1 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno1.getNome() + ":");
            Double nota11 = Double.parseDouble(ler1.nextLine());
            aluno1.setNota1(nota11);
            System.out.println("Digite a segunda nota do " + aluno1.getNome() + ":");
            Double nota12 = Double.parseDouble(ler1.nextLine());
            aluno1.setNota2(nota12);
            System.out.println("Digite a terceira nota do " + aluno1.getNome() + ":");
            Double nota13 = Double.parseDouble(ler1.nextLine());
            aluno1.setNota3(nota13);
            System.out.println("Digite a quarta nota do " + aluno1.getNome() + ":");
            Double nota14 = Double.parseDouble(ler1.nextLine());
            aluno1.setNota4(nota14);

            Scanner ler2 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno2.getNome() + ":");
            Double nota21 = Double.parseDouble(ler2.nextLine());
            aluno2.setNota1(nota21);
            System.out.println("Digite a segunda nota do " + aluno2.getNome() + ":");
            Double nota22 = Double.parseDouble(ler2.nextLine());
            aluno2.setNota2(nota22);
            System.out.println("Digite a terceira nota do " + aluno2.getNome() + ":");
            Double nota23 = Double.parseDouble(ler2.nextLine());
            aluno2.setNota3(nota23);
            System.out.println("Digite a quarta nota do " + aluno2.getNome() + ":");
            Double nota24 = Double.parseDouble(ler2.nextLine());
            aluno2.setNota4(nota24);

            Scanner ler3 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno3.getNome() + ":");
            Double nota31 = Double.parseDouble(ler3.nextLine());
            aluno3.setNota1(nota31);
            System.out.println("Digite a segunda nota do " + aluno3.getNome() + ":");
            Double nota32 = Double.parseDouble(ler3.nextLine());
            aluno3.setNota2(nota32);
            System.out.println("Digite a terceira nota do " + aluno3.getNome() + ":");
            Double nota33 = Double.parseDouble(ler3.nextLine());
            aluno3.setNota3(nota33);
            System.out.println("Digite a quarta nota do " + aluno3.getNome() + ":");
            Double nota34 = Double.parseDouble(ler3.nextLine());
            aluno3.setNota4(nota34);


            Scanner ler4 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno4.getNome() + ":");
            Double nota41 = Double.parseDouble(ler4.nextLine());
            aluno4.setNota1(nota41);
            System.out.println("Digite a segunda nota do " + aluno4.getNome() + ":");
            Double nota42 = Double.parseDouble(ler4.nextLine());
            aluno4.setNota2(nota42);
            System.out.println("Digite a terceira nota do " + aluno4.getNome() + ":");
            Double nota43 = Double.parseDouble(ler4.nextLine());
            aluno4.setNota3(nota43);
            System.out.println("Digite a quarta nota do " + aluno4.getNome() + ":");
            Double nota44 = Double.parseDouble(ler4.nextLine());
            aluno4.setNota4(nota44);


            Scanner ler5 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno5.getNome() + ":");
            Double nota51 = Double.parseDouble(ler5.nextLine());
            aluno5.setNota1(nota51);
            System.out.println("Digite a segunda nota do " + aluno5.getNome() + ":");
            Double nota52 = Double.parseDouble(ler5.nextLine());
            aluno5.setNota2(nota52);
            System.out.println("Digite a terceira nota do " + aluno5.getNome() + ":");
            Double nota53 = Double.parseDouble(ler5.nextLine());
            aluno5.setNota3(nota53);
            System.out.println("Digite a quarta nota do " + aluno5.getNome() + ":");
            Double nota54 = Double.parseDouble(ler5.nextLine());
            aluno5.setNota4(nota54);


            Scanner ler6 = new Scanner(System.in); 
            System.out.println("\nAgora digite a primeira nota do " + aluno6.getNome() + ":");
            Double nota61 = Double.parseDouble(ler6.nextLine());
            aluno6.setNota1(nota61);
            System.out.println("Digite a segunda nota do " + aluno6.getNome() + ":");
            Double nota62 = Double.parseDouble(ler6.nextLine());
            aluno6.setNota2(nota62);
            System.out.println("Digite a terceira nota do " + aluno6.getNome() + ":");
            Double nota63 = Double.parseDouble(ler6.nextLine());
            aluno6.setNota3(nota63);
            System.out.println("Digite a quarta nota do " + aluno6.getNome() + ":");
            Double nota64 = Double.parseDouble(ler6.nextLine());
            aluno6.setNota4(nota64);


            
            Scanner mediaScanner = new Scanner(System.in);
            System.out.println("\n1 - João");
            System.out.println("2 - Maria");
            System.out.println("3 - Vitor");
            System.out.println("4 - Paulo");
            System.out.println("5 - Carlos");
            System.out.println("6 - Marcos");
            System.out.println("De qual aluno você deseja ver a média final? 1-6\n");
            int mediafinal = mediaScanner.nextInt();


            switch (mediafinal){

                case 1: 
                System.out.println("Aluno: " + aluno1.getNome() + "\nNotas: " + aluno1.getNota1() + " " + aluno1.getNota2() + " " + aluno1.getNota3() + " " + aluno1.getNota4());
                Alunos.notafinal1(nota11, nota12, nota13, nota14); break;

                case 2:
                System.out.println("Aluno: " + aluno2.getNome() + "\nNotas: " + aluno2.getNota1() + " " + aluno2.getNota2() + " " + aluno2.getNota3() + " " + aluno2.getNota4());
                Alunos.notafinal2(nota21, nota22, nota23, nota24); break;

                case 3: 
                System.out.println("Aluno: " + aluno3.getNome() + "\nNotas: " + aluno3.getNota1() + " " + aluno3.getNota2() + " " + aluno3.getNota3() + " " + aluno3.getNota4());
                Alunos.notafinal2(nota31, nota32, nota33, nota34); break;
                case 4:
                System.out.println("Aluno: " + aluno4.getNome() + "\nNotas: " + aluno4.getNota1() + " " + aluno4.getNota2() + " " + aluno4.getNota3() + " " + aluno4.getNota4());
                Alunos.notafinal2(nota41, nota42, nota43, nota44); break;

                case 5:
                System.out.println("Aluno: " + aluno5.getNome() + "\nNotas: " + aluno5.getNota1() + " " + aluno5.getNota2() + " " + aluno5.getNota3() + " " + aluno5.getNota4());
                Alunos.notafinal2(nota51, nota52, nota53, nota54); break;

                case 6:
                System.out.println("Aluno: " + aluno6.getNome() + "\nNotas: " + aluno6.getNota1() + " " + aluno6.getNota2() + " " + aluno6.getNota3() + " " + aluno6.getNota4());
                Alunos.notafinal2(nota61, nota62, nota63, nota64); break;
            }



        }
        
    }


