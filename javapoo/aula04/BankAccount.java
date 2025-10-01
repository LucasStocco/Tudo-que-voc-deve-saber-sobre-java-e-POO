package aula04;

public class BankAccount {
    //Atributos 
    public int numAccount; //Número da conta
    public String type; // Tipo da conta
    public String user; //Dono
    public float balance; //Saldo 
    public boolean status; 

    public void line() {
        int numberRepeat = 40; // Número de repetições
        System.out.println("=".repeat(numberRepeat));
    }

    //Métodos Personalizados
    //Método do estato atual da conta, serve para mostrar o estado atual do objeto
    public void currentStatus() {
        System.out.println("Conta: " + this.getNumAccount());
        line();
        System.out.println("Tipo de conta: " + this.getType());
        line();
        System.out.println("Nome do usuário: " + this.getUser());
        line();
        System.out.println("Saldo na conta: " + this.getBalance());
        line();
        System.out.println("Status da conta: " + this.getStatus());
        line();
    }
    //Método para abrir a conta
    public void openAccount(String t) {
        this.setType(t); //Utilizando um método modificador
        this.status = true; //Acessando diretamente o atributo
        if (t == "CC") {
            this.setBalance(50);
        } else if (t == "CP") {
            this.setBalance(150);
        }
        //Mensagem para toda vez que abrir uma conta
        System.out.println("Conta aberta com sucesso!");
        System.out.println("--------------------------------------");
    }
    //Método para fechar a conta
    public void closeAccount() {
        //Verificando se o saldo é positivo, ou seja, se o saldo é maior que 0
        if (this.getBalance() > 0) {
            //Saída específica do print 1
            System.out.println(">>ERRO! A conta não pode ser fechada porque ainda tem dinheiro.");
        //Verificando se a conta possui saldo negativo, ou seja, dépito
        } else if (this.getBalance() < 0) {
            //Saída específica do print 2
            System.out.println(">>ERRO! A conta não pode ser fechada pois tem débito.");
        } else {
            //Se o saldo da conta não é negativo, e nem posivo, ele só pode ser neutro(0), ou seja, não á saldo algum
            this.setStatus(false);
            //saída específica do print 3
            System.out.println("Conta fechada com sucesso!");
        }
    }
    //Método para depositar
    public void deposit(float v) {
        //Se o status é verdadeiro, logo significa que a conta está aberta
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + v);
            //Saída específica do print 1
            System.out.println("Depósito realizado com sucesso na conta de: " + "[" + this.getUser() + "]");
        //Se o status é falso, logo significa que a conta está fechada
        } else {
            //saída específica do print 2
            System.out.println(">>ERRO! Impossível depositar em uma conta fechada!");
        }
    }
    //Método para sacar
    public void withdraw(float v) {
        //Se o status é verdadeiro, ou seja, significa que ah uma conta aberta
        if (this.getStatus()) {
            //Se o saldo é maior ou igual ao valor requerido, logo, é possível fazer o saque sem problemas
            if (this.getBalance() >= v) {
                this.setBalance(this.getBalance() - v);
                //Saída especifica
                System.out.println("Saque realizado com sucesso na conta de: " + "[" +  this.getUser() + "]");
            //Se o saldo é menor que o valor requerido, não é possível fazer o saque
            } else {
                //Saída específica
                System.out.println(">>ERRO! saldo insuficiente para saque.");
            }
        //Se o status é falso, ou seja, significa que a conta está aberta
        } else {
            //Saída específica
            System.out.println(">>ERRO! Impossível sacar de uma conta fechada!");
        }
    }
    //Método para pagar a mensalidade
    public void payMonthlyfee() {
        int v = 0; //Variável local
        //Verifica se o tipo de conta é corrente ou poupança
        if (this.getType() == "CC") {
            //Paga uma mensalidade de R$12,00 caso o tipo de conta seja corrente
            v = 12; 
        //Se o tipo de conta não é corrente, então ela so pode ser do tipo poupança
        } else if (this.getType() == "CP") { 
            //Paga uma mensalidade de R$20,00 caso o tipo de conta seja poupança
            v = 20;
        }
        //Verificando se é possível pagar o valor da mensalidade
        if (this.getStatus()) {
            this.setBalance(this.getBalance() - v);
            //Saída específica
            System.out.println("Mensalidade paga com sucesso por: " + "[" + this.getUser() + "]");
        } else {
            //Saída específica
            System.out.println("ERRO! Impossível pagar uma conta fechada!");
        }
    }

    //Métodos Especiais(get/set)
    //Método Construtor
    public BankAccount() {
        this.balance = 0;
        this.status = false;
    }
    public int getNumAccount() {
        return numAccount;
    }
    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}   
