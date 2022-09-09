package atelierjeudedes;

public class Test {

    public static void main(String[] args) {
        
        //Dé non Piper
        De monDe1 = new De(1, 6);
        monDe1.lancer();
        System.out.println(monDe1.toString());
         
        //Dé Piper
         monDe1.piper();
        System.out.println(monDe1.toString());

        //Dé non Piper
        De monDe2 = new De(2, 12);
        monDe2.lancer();
        System.out.println(monDe2.toString());
        
        //Dé Piper
        monDe2.piper();
        System.out.println(monDe2.toString());

        //Dé non Piper
        De monDe3 = new De(3, 20);
        monDe3.lancer();
        System.out.println(monDe3.toString());

        //Dé Piper
        monDe3.piper();
        System.out.println(monDe3.toString());

    }

}
