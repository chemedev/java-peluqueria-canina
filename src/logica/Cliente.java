package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Juan E. Chemello <juanchemell@gmail.com>
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String name;
    private String race;
    private String color;
    private Boolean isAlergic;
    private Boolean hasSpecialNeeds;
    private String ownerName;
    private String cellphone;
    private String observations;

    public Cliente() {
    }

    public Cliente(String name, String race, String color, Boolean isAlergic, Boolean hasSpecialNeeds, String ownerName, String cellphone, String observations) {
        this.name = name;
        this.race = race;
        this.color = color;
        this.isAlergic = isAlergic;
        this.hasSpecialNeeds = hasSpecialNeeds;
        this.ownerName = ownerName;
        this.cellphone = cellphone;
        this.observations = observations;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIsAlergic() {
        return isAlergic;
    }

    public void setIsAlergic(Boolean isAlergic) {
        this.isAlergic = isAlergic;
    }

    public Boolean getHasSpecialNeeds() {
        return hasSpecialNeeds;
    }

    public void setHasSpecialNeeds(Boolean hasSpecialNeeds) {
        this.hasSpecialNeeds = hasSpecialNeeds;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

}
