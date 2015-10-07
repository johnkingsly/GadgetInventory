
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity

public class Item implements Serializable {

    @ElementCollection
    @CollectionTable(name = "Type", joinColumns = {
        @JoinColumn(name = "x", referencedColumnName = "y", table = "Type", insertable = true, nullable = true, unique = false, updatable = true)})
    private Collection<Long> TypeID;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String mfrID;

    @ElementCollection
    private Collection<String> pictureID;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Timestamp dateOfPurchase;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private double price;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long ID;

    public Item() {

    }

    public Collection<Long> getTypeID() {
        return this.TypeID;
    }

    public void setTypeID(Collection<Long> TypeID) {
        this.TypeID = TypeID;
    }

    public String getMfrID() {
        return this.mfrID;
    }

    public void setMfrID(String mfrID) {
        this.mfrID = mfrID;
    }

    public Collection<String> getPictureID() {
        return this.pictureID;
    }

    public void setPictureID(Collection<String> pictureID) {
        this.pictureID = pictureID;
    }

    public Timestamp getDateOfPurchase() {
        return this.dateOfPurchase;
    }

    public void setDateOfPurchase(Timestamp dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
