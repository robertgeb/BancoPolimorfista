abstract public class Conta {
    protected String nome;  //THIS
    protected String endereco;
    protected int cpf,data;
    protected double saldo;
    public Conta(String nome, String endereco, int cpf, int data, double saldo){
      // Nome pode ser o parametro ou a váriavel da classe Conta.
      // Quando chama o this, está chamando o Nome dá classe não do parametro desse metodo
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
    public double getSaldo(){
        return(saldo);
    }
    public boolean sacar(double valor){
      if (valor > saldo) {
        return false;
      }
      saldo -= valor;
      return true;
    }
}
