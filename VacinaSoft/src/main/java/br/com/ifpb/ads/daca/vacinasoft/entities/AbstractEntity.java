package br.com.ifpb.ads.daca.vacinasoft.entities;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractEntity Extended abstract entity by other entities, have on your 
 * body just the Id attribute.
 * @author WitaloCarlos
 */
@MappedSuperclass
public abstract class AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    /*
    Getters and Setters
    */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
