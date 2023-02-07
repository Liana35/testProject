package class19;

public class Store {
    public static void main(String[] args) {
        // when we typme "new" the object gets created
        // table - referance variable
        Furniture table =new Furniture("Table", 100,"White");
        table.print();


         Furniture chair=new Furniture("Chair",30,"brown");
        chair.print();
    }

}
