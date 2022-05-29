package com.anki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        System.out.println("Welcome to student management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("press 1 to Add student");
            System.out.println("press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit app");
            int c = Integer.parseInt(br.readLine());
            if(c==1)
            {
                //add student
                System.out.println("Enetr user name :");
                String name = br.readLine();
                System.out.println("enter user phone :");
                String phone = br.readLine();
                System.out.println("enter user city :");
                String city = br.readLine();
                // create student object to store student
                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if(answer)
                {
                    System.out.println("Student is added successfully:");
                }
                else
                {
                    System.out.println("Something wents wrong:");
                }
                System.out.println(st);
            }
            else if(c==2)
            {
                //delete student
            }
            else if(c==3)
            {
                //display students
            }

            else if(c==4)
            {
                //exit
                break;
            }
            else
            {

            }


        }
        System.out.println("Thank you for using my application....");
        System.out.println("See you soon....by by");
    }

}