//Nao pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private Double salario;

    //metodo sem corpo, nao há implementação
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
