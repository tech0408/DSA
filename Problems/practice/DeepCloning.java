package dsa.Problems.practice;

class Dog1 implements Cloneable{

    Cat1 cat;
    int i=90;

    Dog1(Cat1 cat, int i){
        this.cat=cat;
        this.i=i;
    }

    public Dog1 clone(){
        Cat1 cat1 = new Cat1();
        return new Dog1(cat1,i);
    }
}

class Cat1 {

    int j=60;
}
public class DeepCloning {

    public static void main(String[] args) {

        Cat1 cat = new Cat1();
        Dog1 d1 = new Dog1(cat,20);
        Dog1 d2 = d1.clone();
        d1.cat.j=100;
        System.out.println(d1.cat.j);
        System.out.println(d2.cat.j);
    }
}
