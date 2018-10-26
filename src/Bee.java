public class Bee extends Animal {
    public Bee(String name) { super(name, "pollen"); }

    public void eat (String food) {
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food);
            sleep();
        }else if(!food.equals(favoriteFood)){
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
    public void sleep(){System.out.println(name + " never sleeps"); }

}
