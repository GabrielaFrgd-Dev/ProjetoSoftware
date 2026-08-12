package entidades;

public class conta {
    private String nome;
    private double saldo;
    private String agencia;
    private String conta;

    public conta(String nome, double saldo, String agencia, String conta) {
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                "\nsaldo: " + saldo +
                "\nagencia: " + agencia +
                "\nconta: " + conta;
    }
}
