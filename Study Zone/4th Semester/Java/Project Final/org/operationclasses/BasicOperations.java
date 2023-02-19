package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;
import org.classes.Student;
import org.classes.Book;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.operationclasses.IBasicOperations;

public class BasicOperations implements IBasicOperations{
    Scanner sc = new Scanner(System.in);
    public void borrow(Student s,Teacher t,Book b){
        while(true){
            System.out.print("\nPress 0 To 2 For These Operations\n0.Exit,1.For Student,2.For Teacher:");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch(sw){
                case 0:
                return;
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+studentId+".txt");
                if(f.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Borrow\\"+studentId+".txt");
                    FileWriter fw=null;
                    try{
                        f2.createNewFile();
                        fw = new FileWriter(f2);
                        String st= "-----------Borrow Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Student ID: "+studentId+"\n";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Borrow Request Have Been Saved In The Database");
                }
                else{
                    System.out.println("You Are Not Eligible To Borrow Book");
                }
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\"+teacherId+".txt");
                if(f3.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Borrow\\"+teacherId+".txt");
                    FileWriter fw=null;
                    try{
                        f4.createNewFile();
                        fw = new FileWriter(f4);
                        String st= "-----------Borrow Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Teacher ID: "+teacherId+"\n";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Borrow Request Have Been Saved In The Database");
                }
                else{
                    System.out.println("You Are Not Eligible To Borrow Book");
                }
                break;
                default:
                System.out.println("Wrong Pressing Press From 0 To 2");
            }
            }
    }
    public void returnBook(Student s,Teacher t, Book b){
        while(true){
            System.out.print("\nPress 0 To 2 For These Operations\n0.Exit,1.For Student,2.For Teacher:");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch(sw){
                case 0:
                return;
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+studentId+".txt");
                if(f.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Return\\"+studentId+".txt");
                    FileWriter fw=null;
                    try{
                        f2.createNewFile();
                        fw = new FileWriter(f2);
                        String st= "-----------Return Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Student ID: "+studentId+"\n";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Return Request Have Been Saved In The Database");
                }
                else{
                    System.out.println("You Are Not Eligible To Return Book");
                }
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\"+teacherId+".txt");
                if(f3.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Return\\"+teacherId+".txt");
                    FileWriter fw=null;
                    try{
                        f4.createNewFile();
                        fw = new FileWriter(f4);
                        String st= "-----------Return Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Teacher ID: "+teacherId+"\n";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Return Request Have Been Saved In The Database");
                }
                else{
                    System.out.println("You Are Not Eligible To Return Book");
                }
                break;
                default:
                System.out.println("Wrong Pressing Press From 0 To 2");
            }
            }
    }
    public void fine(Student s,Teacher t, double amount){
            System.out.print("\nPress 0 To 2 For These Operations\n0.Exit,1.For Student,2.For Teacher:");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch(sw){
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+studentId+".txt");
                if(f.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Fine\\"+studentId+".txt");
                    FileWriter fw=null;
                    try{
                        f2.createNewFile();
                        fw = new FileWriter(f2);
                        String st= "-----------Fine Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Student ID: "+studentId+"\n";
                        fw.write(st);
                        st= "Fine Amount: "+amount+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Fine Amount Has Been Recorded");
                }
                else{
                    System.out.println("Student ID Not Found In The Database");
                }
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\"+teacherId+".txt");
                if(f3.exists()){
                    System.out.print("Enter Your Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Fine\\"+teacherId+".txt");
                    FileWriter fw=null;
                    try{
                        f4.createNewFile();
                        fw = new FileWriter(f4);
                        String st= "-----------Fine Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+"\n";
                        fw.write(st);
                        st= "Teacher ID: "+teacherId+"\n";
                        fw.write(st);
                        st= "Fine Amount: "+amount+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Return Request Have Been Saved In The Database");
                }
                else{
                    System.out.println("Teacher ID Not Found In The Database");
                }
                break;
                default:
                System.out.println("Wrong Pressing Press From 1 To 2");
            }
    }
}