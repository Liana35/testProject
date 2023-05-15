package class25;

public class OwnableTester {
    public static void main(String[] args) {

        Ownable [] ownable= {new Car(), new Dog()};
        for(Ownable own1:ownable){
            own1.own();
        }
       // Ownable [] ownables= {new Car(), new Dog()};



    }
}
