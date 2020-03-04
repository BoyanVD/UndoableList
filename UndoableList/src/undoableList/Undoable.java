package undoableList;

import java.util.List;

interface Undoable<T> {
    public void undo(List<T> list) throws UndoableListException;
}