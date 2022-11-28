package web.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "nomer")
    private int nomer;
    @Column (name = "nameUs")
    private String nameUs;
    @Column (name = "lastNameUs")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && nomer == user.nomer && nameUs.equals(user.nameUs) && lastNameUs.equals(user.lastNameUs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomer, nameUs, lastNameUs);
    }
}
