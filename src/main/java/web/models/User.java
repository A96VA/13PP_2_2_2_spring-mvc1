package web.models;

public class User {


    private int id;
    private int nomer;
    private String nameUs;
    private String lastNameUs;

    public User(int nomer, String nameUs, String lastNameUs) {
        this.nomer = nomer;
        this.nameUs = nameUs;
        this.lastNameUs = lastNameUs;
    }

    public User(int id, int nomer, String nameUs, String lastNameUs) {
        this.id = id;
        this.nomer = nomer;
        this.nameUs = nameUs;
        this.lastNameUs = lastNameUs;
    }

    public User() {
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getNameUs() {
        return nameUs;
    }

    public void setNameUs(String nameUs) {
        this.nameUs = nameUs;
    }

    public String getLastNameUs() {
        return lastNameUs;
    }

    public void setLastNameUs(String lastNameUs) {
        this.lastNameUs = lastNameUs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nomer=" + nomer +
                ", nameUs='" + nameUs + '\'' +
                ", lastNameUs='" + lastNameUs + '\'' +
                '}';
    }
}
