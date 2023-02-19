package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TeacherOperations{
    Scanner sc = new Scanner(System.in);
    public void insertTeacher(Teacher t){
        System.out.print("Enter Patron ID: ");
        int pId=sc.nextInt();
        sc.nextLine();
        t.setId(pId);
        System.out.println("");
        System.out.print("Enter Patron Name: ");
        String pName = sc.nextLine();
        t.setName(pName);
        System.out.println("");
        System.out.print("Enter Patron Department Name: ");
        String departmentName = sc.nextLine();
        t.setDepartmentName(departmentName);
        System.out.println("");
        System.out.print("Enter Patron Email: ");
        String email=sc.nextLine();
        t.setEmail(email);
        System.out.println("");
        System.out.print("Enter Patron Contact No: ");
        String contactNo=sc.nextLine();
        t.setContactNo(contactNo);
        System.out.println("");
        System.out.print("Enter Patron Address: ");
        String pAddress=sc.nextLine();
        t.setAddress(pAddress);
        System.out.println("");
        System.out.print("Enter Amount(Patron): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        t.setAmount(amount);
        System.out.println("");
        System.out.print("Enter Teacher ID: ");
        String teacherId = sc.nextLine();
        t.setTeacherId(teacherId);
        System.out.println("");
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\"+teacherId+".txt");
        FileWriter fw=null;
        try{
            f.createNewFile();
            fw = new FileWriter(f);
            String st= "-----------Teacher Information--------\n";
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
            st= "Patron's Teacher Information: \n";
            fw.write(st);
            st= "Teacher ID: "+teacherId+"\n";
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
    public Teacher getTeacher(String teacherId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\"+teacherId+".txt");
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
            System.out.println("The Teacher ID You Have Given Not Found In The Database");
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
    public void showAllTeachers( ){
        File folder = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo");
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