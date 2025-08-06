package dsa.Problems.practice;
class Dog implements Cloneable{

    Cat c;
    int i =10;

    Dog(Cat c, int i){
        this.c =c;
        this.i=i;
    }

    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }
}

class Cat {
    int j=30;
}

public class ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat c = new Cat();
        Dog d1 = new Dog(c,20);
        d1.c.j=40;
        Dog d2 = d1.clone();
        System.out.println(d1.c.j);
        System.out.println(d2.c.j);
    }
}
