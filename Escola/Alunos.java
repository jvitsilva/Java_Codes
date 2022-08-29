public class Alunos {
    private String nome;
    private Double matricula, nota1, nota2, nota3, nota4;

    public Alunos(String nome, Double matricula, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
 

    public static void notafinal1(double notaA1, double notaA2, double notaA3, double notaA4){
        double media1 = (notaA1 + notaA2 + notaA3 + notaA4)/4;  
        System.out.println("Média final: " + media1);     
        if (media1>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");
    }

    public static void notafinal2(double notaB1, double notaB2, double notaB3, double notaB4){
        double media2 = (notaB1 + notaB2 + notaB3 + notaB4)/4;
        System.out.println("Média final: " + media2);    
        if (media2>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");   
    }

    public static void notafinal3(double notaC1, double notaC2, double notaC3, double notaC4){
        double media3 = (notaC1 + notaC2 + notaC3 + notaC4)/4;
        System.out.println("Média final: " + media3); 
        if (media3>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");      
    }

    public static void notafinal4(double notaD1, double notaD2, double notaD3, double notaD4){
        double media4 = (notaD1 + notaD2 + notaD3 + notaD4)/4; 
        System.out.println("Média final: " + media4);   
        if (media4>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");   
    }

    public static void notafinal5(double notaE1, double notaE2, double notaE3, double notaE4){
        double media5 = (notaE1 + notaE2 + notaE3 + notaE4)/4;  
        System.out.println("Média final: " + media5); 
        if (media5>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");    
    }

    public static void notafinal6(double notaF1, double notaF2, double notaF3, double notaF4){
        double media6 = (notaF1 + notaF2 + notaF3 + notaF4)/4;
        System.out.println("Média final: " + media6);   
        if (media6>=7){
            System.out.println("Situação: Aprovado");
        } else System.out.println("Situação: Reprovado");    

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMatricula() {
        return matricula;
    }

    public void setMatricula(Double matricula) {
        this.matricula = matricula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }
}