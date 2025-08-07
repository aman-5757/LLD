package org.lld.solid.InterfaceSegregation.GoodCode;

import org.lld.solid.InterfaceSegregation.BadCode.Document;

public class SimplePrinter implements Printer {
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }
}
