public class Person {

    int getCurrentAgeYears() {
        return (6 + 10) + 10;
    }
}

class Me extends Person {

    public String name;

    Me() {

        super.getCurrentAgeYears();
        System.out.println("I am a Developer Using Java");
    }

    String getName() {
        return (this.name.equals("James")) ? "Hello Ryan" : "Hello James";
    }
}