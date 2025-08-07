package org.lld.solid.LiskovSubstitution.BadCode;

public class ReadOnlyFile extends File{
    public void write(){
        throw new UnsupportedOperationException("Cannot write to read-only file");
    }
}
