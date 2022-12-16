package de.istec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import java.math.BigInteger;

@NamedNativeQuery(
        name = "getAllData",
        query = "SELECT * FROM data",
        resultClass = Data.class
)

@Entity
public class Data {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Boolean devMode;
    private BigInteger someNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDevMode() {
        return devMode;
    }

    public void setDevMode(Boolean devMode) {
        this.devMode = devMode;
    }

    public BigInteger getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(BigInteger someNumber) {
        this.someNumber = someNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
