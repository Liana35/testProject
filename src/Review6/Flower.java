package Review6;

public class Flower {
    // attributes, properties, fields   - we define them in a from of variable
    // attributes in a form of variables
    String color, type,name;
    int price;


    static boolean pretty=true;



    // create an object = instantiate a class
    // behaviours
    void smell(){
        System.out.println(name+" smells good");
    }
    void bloom(){
        System.out.println(name+" flower blooms");
    }
    void grow(){
        System.out.println(name+" flower grows");
    }

    public static void main(String[] args){






        Flower flower1= new Flower();   // flower1- referance variable

        System.out.println(Flower.pretty);// the right way is throgh a class
        System.out.println(flower1.pretty);  // not the right way to access static through variable
        flower1.pretty=false;


        // accesing variables of flower class;
        flower1.name="Hibiscus";  // initializing variables, assigning values
        flower1.color="red";
        flower1.price=10;

        // accesing methods of flower class
        flower1.bloom();
        flower1.grow();
        flower1.smell();


        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="pink";
        flower2.price=12;
        flower2.bloom();
        flower2.grow();
        flower2.smell();



        Flower flower3=new Flower();




        for (int i=0;i<3;i++){
            System.out.println(i);
        }
     //   System.out.println(i);  i - local variable , only available inside the block of code


    }

}
