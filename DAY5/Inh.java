class Animal 
{
    String name = "swaasthika";
    void eat()
    {
        System.out.println("eating");
    }
     void sleep()
    {
        System.out.println("sleeping");
    }
}
class Monkey extends Animal
{
     void eat()
    {
        System.out.println("banana");
    }
}
class Human extends Animal
{
     void display()
    {
        System.out.println(name);
    }
}

class Inh{
    public static void main(String[] args) {
        Animal n=new Animal();
        Human h=new Human();
        Monkey m=new Monkey();
        h.display();
n.eat();
m.eat();
    }
}