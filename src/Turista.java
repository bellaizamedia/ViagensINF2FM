public class Turista {
    // Atributos
   private String nome;
   private String cpf;

    // Contrutor Padrão
    Turista(){}

    // Construtor Personalizado
    Turista(String _nome) {
        this.nome = _nome;
    }

    // Seleciona linha --> Botão Direito --> Generate --> Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        // Validar nome
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos
    public String viajar(){
        return "Viajou!!!";

    // Gettars e Setters

    }

}
