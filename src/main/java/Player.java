public class Player extends Person{
    private int number;

    public int getNumber() {
        return number;
    }

    public Position getPosition() {
        return position;
    }

    private Position position;
    public Player(String name, String address, int number, Position position) {
        super(name, address);
        this.number=number;
        this.position=position;
    }
}
