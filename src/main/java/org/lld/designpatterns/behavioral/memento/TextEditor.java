package org.lld.designpatterns.behavioral.memento;

//Originator
/* A text editor where the user can undo changes, such as text addition, deletion,
or formatting. The editor stores snapshots of its state (text content)
after each change, enabling the user to revert to previous states.
 */
public class TextEditor {
    private String content;

    public void write(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    //Save the current state of editor
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    //Restore (Memento->update the state of current content)
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}
