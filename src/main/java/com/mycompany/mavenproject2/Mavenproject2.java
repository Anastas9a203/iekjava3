 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author User
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if(x>y) {
            System.out.println ("x is greater than y");
            
            String name;//To hold the employee's name
            int age;
            char gender;//To hold the employee's gender
            double salary;//To hold the employee's salary 
            
            
            Scanner console = new Scanner( System.in);
            
            System.out.printl("Enter name:");
                    
            name=console.nextine();
                    
            System.out.println("Enter age");     
            age=console.nextInt();
                   
            System.out.println("Enter gender:(F/M");
            gender=console.next().charAt(0);
                    
            System.out.println("Enter salary:");
                    
            System.out.print("enter salary:");
            salary = console.nextDouble();
                    
            
            System.out.println ("Name:" + name + "Age:"+ age + "Gender:"
                            +gender + "Salary" + salary);
                            
            }
        }
    }

