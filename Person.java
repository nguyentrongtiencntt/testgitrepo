package iuh;

public class Person {
    //happy, normal, sad
    private String state;

    public Person() {
        state = "normal";
    }

    public void go(){
        if(state.equals("happy"))
                System.out.println("Agree");
        else if(state.equals("normal"))
            System.out.println("Agree normal");
        else System.out.println("Sorry, am sading!");
    }
    public void doExcercise(){
        if(state.equals("happy")) {
            System.out.println("Agree do excercise");
            state="normal";
        }
        else if(state.equals("normal")) {
            System.out.println("Agree do excercise");
            state = "sad";
        }
        else System.out.println("Sorry, no anything, no do exercise!");
    }
    public void doAnything(){
        if(state.equals("happy")) {
            System.out.println("Agree do everything!");
        }
        else if(state.equals("normal")) {
            System.out.println("Agree so so!");
            state = "sad";
        }
        else System.out.println("Sorry, can not do anything, no do exercise!");
    }

    public void setState(String state) {
        this.state = state;
    }
}
