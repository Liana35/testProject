package class30HW;

import java.util.TreeMap;

public class person {

         /*
       Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
         */
        String name;
        String lastName;
        int age;
        int salary;

        person(String name,String lastName,int age,int salary){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;
        }


    public void display(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

    }


       /* public static void main(String[] args) {
            TreeMap<Integer, person> human = new TreeMap<>(); // or just Map<Integer, person>  human= new TreeMap<>();
            // entrySet.add(new Entry(2,"Shah"));
            human.put(12, new person("Clarke", "Phillips", 22, 5000));
            human.put(11, new person("Sarah", "Simon", 25, 7000));
            human.put(22, new person("Bryan", "Andrews", 30, 5500));
            human.put(2, new person("Kristina", "Adams", 55, 8505));

            var users = usersMap.entrySet();
            for (var user : users) {
                System.out.print(user.getKey() + " : ");
                user.getValue().display();
            }
        }

    }*/