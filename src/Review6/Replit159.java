package Review6;

class Animal {

      final  String reverseStr(String input) {
         StringBuilder st=new StringBuilder(input);
          st.reverse();


          return st.toString();
    }
}

class testerAnimal{
    public static void main(String[] args) {

            Animal an= new Animal();

        System.out.println(an.reverseStr("hello"));

        }
    }

