package de.istec;

import javax.persistence.*;

@Entity
@NamedNativeQuery(name = "getAllData", query = "SELECT d.id, d.name, d.devmode FROM data d")
public class Data {

    @Id
    private Long id;
    private String name;
    private boolean devmode;
    private Long number;

    public Data(Long id, String name, boolean devmode, Long number) {
        this.id = id;
        this.name = name;
        this.devmode = devmode;
        this.number = number;
    }

    public Data() {

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

    public boolean isDevmode() {
        return devmode;
    }

    public void setDevmode(boolean devmode) {
        this.devmode = devmode;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
