package ir.hajitsu.prototype.registery;

import java.util.Date;

public class Item implements Cloneable {
    private Long id;
    private String name;
    private Date creationDate;

    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
