public class Giraffe extends Animal {

    public Giraffe(String name) { super(name, "leaves"); }

    public void eat (String food) {
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food);
            super.sleep();
        }else if(!food.equals(favoriteFood)){
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }

    }


}
