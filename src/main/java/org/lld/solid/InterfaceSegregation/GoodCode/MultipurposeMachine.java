package org.lld.solid.InterfaceSegregation.GoodCode;

import org.lld.solid.InterfaceSegregation.BadCode.Document;
import org.lld.solid.InterfaceSegregation.BadCode.Machine;

public class MultipurposeMachine implements Copier, Scanner, Printer {
    @Override
    public void copy(Document doc) {
        System.out.println("Copying document..");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing document..");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document..");
    }
}
