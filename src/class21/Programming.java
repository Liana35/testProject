package class21;

public class Programming {

  Programming (){
      System.out.println("I love programming");
  }
    Programming (String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        Programming pr= new Programming("java");
        Programming pr2= new Programming();

        //or
        new Programming("Java");
    }

}
