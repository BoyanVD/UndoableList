# UndoableList
This is my implementation of a list, that provides undo functionality. There are also tests included.

# Implementation info
My implementation idea is to have an interface, with a single method "undo()". Than we have separate classes for every undo action, each of them implements
the "Undoable" interface and specify the "undo" action for the specific case. Finally in the "UndoableList" class we have "Stack" where we
push and pop the undoable actions when needed.

# Why that kind of implementation
You may ask why i have different classes for every undo action, instead of just keeping track of list history.
The reason is that if you keep track of the list history, you have to keep too many lists in-memory (separate list for every list modification).
If we have huge dataset with many modifications, it won't be good solution (it would be too "memory-expensive"). There are still couple undo actions like
UndoClearAction, UndoAddAllAction etc., that are very memory-expensive, because we store whole sub-lists.
