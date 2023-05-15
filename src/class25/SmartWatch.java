package class25;

interface washAble{
    void wash();
}


public class SmartWatch implements washAble {
    @Override
    public void wash() {
        System.out.println("You van wash this smartwatch without any issues");
    }
}


class Phone implements washAble{

  public void wash(){  // has to be overridden or we have to add public otherwise its default and we cant undercast?
        System.out.println("I am IP65 Rated you can wash me");
    }

    void turnOn(){
        System.out.println("Press the power button to turn me on");
    }
}

class Inverter implements washAble{

  public  void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
