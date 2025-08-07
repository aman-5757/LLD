package org.lld.solid.LiskovSubstitution.GoodCode;

public class WritableFile extends ReadableFile implements Writable {
    @Override
    public void write() {
        System.out.println("writing file..");
    }
}
