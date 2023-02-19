package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;
import org.classes.Student;
import org.classes.Book;
public interface IBasicOperations{
    void borrow(Student s,Teacher t,Book b);
    void returnBook(Student s,Teacher t, Book b);
    void fine(Student s,Teacher t, double amount);
}