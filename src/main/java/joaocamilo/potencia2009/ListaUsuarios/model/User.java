package joaocamilo.potencia2009.ListaUsuarios.model;

public class User {

    private Long id;
    private String name;
    private String Arroba;
    private int cpf;

    public User(Long id, String name, String arroba, int cpf) {
        this.id = id;
        this.name = name;
        this.Arroba = arroba;
        this.cpf = cpf;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArroba() {
        return Arroba;
    }
    public void setArroba(String arroba) {
        this.Arroba = arroba;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
