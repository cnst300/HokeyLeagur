import java.util.logging.Level;

public class Coach extends Person{
    private int numberOfYearsOfExperience;
    private Level level;
    public Coach(String name, String address, Level level, int numberOfYearsOfExperience) {
        super(name, address);
        this.level=level;
        this.numberOfYearsOfExperience= numberOfYearsOfExperience;
    }
}
