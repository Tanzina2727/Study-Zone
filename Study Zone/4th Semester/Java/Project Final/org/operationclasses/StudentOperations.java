package org.operationclasses;
import org.classes.Patron;
import org.classes.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentOperations{
    Scanner sc = new Scanner(System.in);
    public void insertStudent(Student s){
        System.out.print("Enter Patron ID: ");
        int pId=sc.nextInt();
        sc.nextLine();
        s.setId(pId);
        System.out.println("");
        System.out.print("Enter Patron Name: ");
        String pName = sc.nextLine();
        s.setName(pName);
        System.out.println("");
        System.out.print("Enter Patron Department Name: ");
        String departmentName = sc.nextLine();
        s.setDepartmentName(departmentName);
        System.out.println("");
        System.out.print("Enter Patron Email: ");
        String email=sc.nextLine();
        s.setEmail(email);
        System.out.println("");
        System.out.print("Enter Patron Contact No: ");
        String contactNo=sc.nextLine();
        s.setContactNo(contactNo);
        System.out.println("");
        System.out.print("Enter Patron Address: ");
        String pAddress=sc.nextLine();
        s.setAddress(pAddress);
        System.out.println("");
        System.out.print("Enter Amount(Patron): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        s.setAmount(amount);
        System.out.println("");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        s.setStudentId(studentId);
        System.out.println("");
        System.out.print("Enter Guardian Name: ");
        String guardianName = sc.nextLine();
        s.setGuardianName(guardianName);
        System.out.println("");
        System.out.print("Enter Guardian Contact No: ");
        String guardianContactNo = sc.nextLine();
        s.setGuardianContactNo(guardianContactNo);
        System.out.println("");

        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+studentId+".txt");
        FileWriter fw=null;
        try{
            f.createNewFile();
            fw = new FileWriter(f);
            String st= "-----------Student Information--------\n";
            fw.write(st);
            st= "Patron ID: "+pId+"\n";
            fw.write(st);
            st= "Patron Name: "+pName+"\n";
            fw.write(st);
            st= "Patron Department Name: "+departmentName+"\n";
            fw.write(st);
            st= "Patron Email : "+email+"\n";
            fw.write(st);
            st= "Patron Contact No: "+contactNo+"\n";
            fw.write(st);
            st= "Patron Address: "+pAddress+"\n";
            fw.write(st);
            st= "Amount(Patron): "+amount+"\n";
            fw.write(st);
            st= "Patron's Student Information: \n";
            fw.write(st);
            st= "Student ID: "+studentId+"\n";
            fw.write(st);
            st= "Student's Guardian Name: "+guardianName+"\n";
            fw.write(st);
            st= "Student's Guardian Contact No: "+guardianContactNo+"\n";
            fw.write(st);
        }
        catch(IOException ie){
            System.out.println("Patron ID Already Exist Give Different Patron ID");
        }
        finally{
            try{
            fw.close();
        }
        catch(IOException ie){
            System.out.println("Cannot Close The Database");
        }
        }
    }
    public void removeStudent(Student s){
        System.out.print("Enter Student ID To Remove A Student:");
        String sid = sc.nextLine();
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+sid+".txt");
        FileWriter fw = null;
        try {
            boolean b = f.delete();
            if(b == true) {
                System.out.println("\nStudent Removed!!");
            }
            else{
                System.out.println("\nFailed To Remove Student Or The Student Not Existed!!");
            }
        }
        catch(Exception ie) {
            ie.printStackTrace();
        }
    }
    public Student getStudent(String studentId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+studentId+".txt");
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            while((st=br.readLine())!=null){
                System.out.println(st);
            }
        }
        catch(Exception e){
            System.out.println("The Student ID You Have Given Not Found In The Database");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
        }
        return null;
    }
    public void showAllStudents( ){
        File folder = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo");
        File[] listOfFiles = folder.listFiles();
        FileReader fr = null;
        BufferedReader br = null;
        for (int i = 0; i < listOfFiles.length; i++) {
        File file = listOfFiles[i];
        if (file.isFile() && file.getName().endsWith(".txt")) {
        try{
          fr = new FileReader(file);
          br = new BufferedReader(fr);
        String content = "";
        while ( (content=br.readLine()) != null) {
          System.out.println(content);
        }
        }
        catch(Exception e) {
        System.out.println("Error Opening Database!!");
        }
        finally {
            try {
            fr.close();
            }
            catch(IOException e) {
            System.out.println("Can not close Database!");
            }
        }
     } 
    }
  }
}