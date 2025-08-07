package org.lld.solid.LiskovSubstitution.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        file.write();       //throwing an exception (Runtime error): Violates Liskov Principle
    }
}
