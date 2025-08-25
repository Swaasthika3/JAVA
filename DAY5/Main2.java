//package Practise;
import java.util.*;
abstract class Animal {
abstract String sound();
abstract String category();

private int teeth;
public Animal(int teeth){
	this.teeth=teeth;
}
public int teethfun() {
	return teeth;
}
}
class Cat extends Animal{
	Cat(){
		super(32);
	}
	public String sound() {
		return "meow meow";
	}
	public String category() {
		return "felidae family";
	}
}
class Dog extends Animal{
	Dog(){
		super(40);
	}
	public String sound() {
		return "vow vow ";
	}
	public String category() {
		return "wolves family";
	}
}
public class Main2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.Cat \n 2.Dog");
		int n=s.nextInt();
		Animal a;
		switch(n) {
		case 1:
			a=new Cat();
			System.out.println(a.sound());
			System.out.println(a.category());
			System.out.println(a.teethfun());
			break;
		case 2:
			a=new Dog();
			System.out.println(a.sound());
			System.out.println(a.category());
			System.out.println(a.teethfun());
			break;
		}
	}
}