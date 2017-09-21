package bebee.shop.Shop.domain;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

/**
 * Created by nqlong on 21-Sep-17.
 */
@Entity(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    int id;

    String name;
    String passwork;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }
}
