public class Programa{
    public static void main(String[] args) {
        Conta[] contas = new Conta[2];
        
        Conta contaMaria = new Conta();
        contaMaria.setBanco("Banco das Chaves");
        contaMaria.setAgencia("013098756");
        contaMaria.setTitular("Maria das Neves");
        contaMaria.setSaldo(5);
        contas[0] = contaMaria;

        Conta contaRamon = new Conta();
        contaRamon.setBanco("Banco Grêmio");
        contaRamon.setAgencia("013765290");
        contaRamon.setTitular("Dom Ramon");
        contaRamon.setSaldo(0);
        contas[1] = contaRamon;
        
        contaMaria.transfere(5, contaRamon);
        

        for(int i = 0; i < contas.length; i++){
            System.out.println("Banco: " + contas[i].banco);
            System.out.println("Agência: " + contas[i].agencia);
            System.out.println("Titular: " + contas[i].titular);
            System.out.println("Saldo: " + contas[i].saldo + "\n");
        }
        

    }
  }