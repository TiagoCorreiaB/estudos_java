package Objetos.AtvBanco;

public class ObjetoBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodo especial (construtor)
    public ObjetoBanco(){
        this.saldo = 0;
        this.status = false;
    }

    // Metodos especias (getters e setters)
    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    // Metodos comuns
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equalsIgnoreCase("cc")){
            this.setSaldo(50);
        }
        else if(t.equalsIgnoreCase("cp")){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois está com dinheiro"); // Geralmente não se escreve dentro de metodo, mas vamos tolerar agora
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else{
            System.out.println("Conta fechada");
            this.setStatus(false);
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v); //Maneira mais correta de somar, parecido com: this.saldo = this.saldo + v
        }
        else{
            System.out.println("A conta esta fechada, erro");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta de " + this.getDono());
            }
            else{
                System.out.println("Saldo insuficiente para saque de " + getDono());
            }
        }
        else{
            System.out.println("Impossivel sacar de conta fechada");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if (this.getTipo().equalsIgnoreCase("cc")){
            v = 12;
        }
        else if (this.getTipo().equalsIgnoreCase("cp")){
            v = 20;
        }

        if (this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Conta inativa");
        }
    }

}
