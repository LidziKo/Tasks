package codeWars;

// Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

public class GrasshopperPersonalizedMessage {
    public static void main(String[] args) {
        String name = "Daniel";
        String owner = "Daniella";

        System.out.println(greet(name, owner));

    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
