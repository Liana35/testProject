package class20;

public class Sport {


    String name;
    String country;
    Sport(String name, String country){ //initializing variables with constructor
        this.name=name;
        this.country=country;
    }
     public void display(){   // method
         System.out.println(name+" is played in "+country);
     }
}

class Cricket extends Sport{
    String helmet;
    Cricket(String name, String country, String helmet){
        super(name,country); // makes a call to the immediate  super class constr
        // super() must be the first line
        this.helmet=helmet;
    }
}

class Soccer extends Sport{

    // parent has a const so we need to do one to initialize?

    String team;
    int numberOfPlayers;
    Soccer(String name, String country, String team, int numberOfPlayers){
        super(name,country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;
    }

    void displayTeam(){   // method
        System.out.println((team+" consists of "+numberOfPlayers+" players"));
    }

}



