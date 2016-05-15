public class ContaEspecial extends Conta {
  double limite;
  public ContaEspecial(String nome, String endereco, int cpf, int data, double saldo, double limite){
    super(nome, endereco, cpf, data, saldo);
    this.limite = limite;
  }
  public boolean sacar(double valor){
    if(valor > (super.saldo + limite)){
      return false;
    }
    return true;
  }
}
