abstract public class Conta {
    protected String nome;
    protected String endereco;
    protected int cpf,data;
    protected float saldo;
    public Conta(String nome, String endereco, int cpf, int data, float saldo){
      this.nome = nome;
      this.endereco = endereco;
      this.cpf = cpf;
      this.data = data;
      this.saldo = saldo;
    }
    public String getNome(){
        return(nome);
    }
    public String getEndereco(){
        return(endereco);
    }
    public int getCpf(){
        return(cpf);
    }
    public int getData(){
        return(data);
    }
    public float getSaldo(){
        return(saldo);
    }
    public boolean sacar(float valor){
      if (valor > saldo) {
        return false;
      }
      saldo -= valor;
      return true;
    }
}
