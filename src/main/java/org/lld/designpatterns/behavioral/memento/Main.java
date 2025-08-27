package org.lld.designpatterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();          //history / state mgmt

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);

        //Problem - > Undo the last write!
        editor.write("C");
        caretaker.saveState(editor);

        caretaker.undo(editor);

        System.out.println(editor.getContent());


    }
}
