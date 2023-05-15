package class25;


// interface
public interface Movable { // only the file name can be public key word
    void move();
}




interface Ownable {
    void own();
}

class Car implements Movable, Ownable{
    @Override
    public void own() {
        System.out.println("You can own a car");
    }

    @Override
    public void move() {
        System.out.println("I can move");

    }
}


class Dog implements Movable, Ownable{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own a dog");
    }
}
