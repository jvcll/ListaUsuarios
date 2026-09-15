package joaocamilo.potencia2009.ListaUsuarios.model;

public class User {

    private Long id;
    private String name;
    private String arroba;
    private String cpf;

    public User(Long id, String name, String arroba, String cpf) {
        this.id = id;
        this.name = name;
        this.arroba = arroba;
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
        return arroba;
    }
    public void setArroba(String arroba) {
        this.arroba = arroba;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
