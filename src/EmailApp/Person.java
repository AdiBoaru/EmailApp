package EmailApp;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int defaultPasswordLength = 10;
    private int mailbox =500;
    Scanner scanner = new Scanner(System.in);

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Department : "+ department);
        this.password = randomPassword(defaultPasswordLength);
    }

    private String setDepartment(){
        System.out.println("Enter the department\n1 for Seles\n2 for Development \n3 for Accounting \n0 for none");
        System.out.print("Code : ");
        int depChoice = scanner.nextInt();
        if(depChoice == 1){
            return "seles";
        }else if(depChoice == 2){
            return "development";
        }else if(depChoice == 3){
            return "accounting";
        }else
            return "none";
    }
    public String showInfo(){
        return "Display name : "+firstName +" " +lastName+"\n" +
                "Emial : "+getEmail()+"\n" +
                "Password : "+password+";\n" +
                "Mailbox capacity : "+mailbox+"mb";
    }
    //display the name
    public String getName() {
        String full_name = " First Name : " + firstName + "\n " +
                "Last Name : " + lastName;
        return full_name;
    }

    //display the mail
    public String getEmail() {
      //  System.out.print("Email  : ");
        return email = firstName + "." + lastName + "@" + department + ".company.com";
    }

    //display mailBox capacity
    public void set_mailBox_capacity(int capacity) {
        this.mailbox = capacity;
    }

    public String getPassword() {
        return password;
    }

    //change the password
    public void setNewPassword() {
        System.out.println("Set the new password");
        password = scanner.nextLine();
        System.out.println("Done!");
    }

    //alternativ mail
    public void setalternativEmail() {
        System.out.println("Alternativ email");
        String aleternativ_email = scanner.nextLine();
    }

    //generate a random password
    public String randomPassword(int length) {
          String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
          char[] password = new char[length];
          for(int i = 0; i < length; i++){
              int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);
          }
        System.out.println("Your random password is : "+new String(password));
          return new String(password);
    }
}
