/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author wic190015
 */
public class Txt implements FileIO {

    @Override
    public void read() {
        
        try {
            System.out.println("Read from text file...");
            Scanner in= new Scanner(new FileInputStream("fsktm.txt"));
            
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
            
        } catch (FileNotFoundException e) {
        }
    }

    @Override
    public void write() {
        try {
            System.out.println("Write to text file...");
            PrintWriter p= new PrintWriter(new FileOutputStream("fsktm.txt"));//write to
            System.out.println("Welcome to FSKTM!\nPlease register your matric number.\nPlease register your UMMail account.");
            p.print("Welcome to FSKTM\n");
            p.print("Please register your matric number.\n");
            p.print("Please register your UMMail account.");
            p.close();
        } catch (FileNotFoundException e) {
        }
        
    }
    public static void main(String[] args) {
        Txt a = new Txt();
        a.write();
        a.read();
        }
    
}
