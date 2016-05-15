public class ContaEspecial extends Conta {
  float limite;
  public ContaEspecial(String nome, String endereco, int cpf, int data, float saldo, float limite){
    super(nome, endereco, cpf, data, saldo);
    this.limite = limite;
  }
  public boolean sacar(float valor){
    if(valor > (super.saldo + limite)){
      return false;
    }
    return true;
  }
}
