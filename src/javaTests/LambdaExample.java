package javaTests;

interface Names {
   public void sayName(String name);
 
}
 
public class LambdaExample {
 
     public static void main(String[] args) {
       myName(n -> System.out.println("My name is " + n), "John");
    }
 
     private static void myName(Names nameInstance, String name) {
      nameInstance.sayName(name);
    }
}