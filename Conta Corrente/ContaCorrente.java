public class ContaCorrente{

    private int numero;
    private Double saldo, limiteVar, limiteMax, saldoespecial;
    private boolean status;


    public ContaCorrente(int numero, Double saldo, Double limiteMax, Double limiteVar , Double saldoespecial, boolean status) {
        this.numero = numero;
        this.saldo = saldo;
        this.limiteVar = limiteVar;
        this.limiteMax = limiteMax;
        this.status = status;
        this.saldoespecial = saldoespecial;
    }



    public void saque(Double sacar){
        this.saldo -= sacar;
    }

    public void depositar(Double deposito){   
        if(this.limiteVar < this.limiteMax){
            this.saldoespecial = this.limiteMax - this.limiteVar;
            if (deposito>=this.saldoespecial){
                deposito -= this.saldoespecial;
                this.saldo += deposito;
                this.limiteVar += this.saldoespecial; 
            } else { 
                this.saldoespecial -= deposito; 
                this.limiteVar += deposito; 
            }
            
         } else this.saldo += deposito;
    }
        

    public void cheque(Double chequeEspecial){
        this.limiteVar -= chequeEspecial;
        this.saldo += chequeEspecial;
        
    }


    

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
  
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }



    public Double getSaldoespecial() {
        return saldoespecial;
    }
    public void setSaldoespecial(Double saldoespecial) {
        this.saldoespecial = saldoespecial;
    }



    public Double getLimiteVar() {
        return limiteVar;
    }



    public void setLimiteVar(Double limiteVar) {
        this.limiteVar = limiteVar;
    }



    public Double getLimiteMax() {
        return limiteMax;
    }



    public void setLimiteMax(Double limiteMax) {
        this.limiteMax = limiteMax;
    } 


}
