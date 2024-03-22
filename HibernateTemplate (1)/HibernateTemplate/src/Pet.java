import javax.persistence.*;
@Entity
@Table(name = "pet")
  public class Pet {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "petName")
    private String petName;
    @Column(name = "PetOwner")
    private String petOwner;
    @Column(name = "breed")
    private String breed;
    @Column(name = "weight")
    private Double weight;

    public Pet(int id, String petName, String petOwner, String breed, Double weight) {
        this.id = id;
        this.petName = petName;
        this.petOwner = petOwner;
        this.breed = breed;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    
    
    
}
    

   