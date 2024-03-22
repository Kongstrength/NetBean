import javax.persistence.*; 
@Entity
@Table(name = "monster")
public class Monster {
    @Id
    @Column(name = "id ")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "level")
    private int level;
    @Column(name = "atk")
    private int atk;
    @Column(name = "def")
    private int def;


    public Monster(int id, String name, int level, int atk, int def) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.atk = atk;
        this.def = def;
    }
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    

    
}