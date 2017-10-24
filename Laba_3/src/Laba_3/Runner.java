package Laba_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {    
    
    public static void main(String[] args) {

        ArrayList<Computer> list = new ArrayList<Computer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input objects count: ");
        int how_much = input.nextInt();
        //scan /n after number
        input.nextLine();
        
        for (int i = 0; i < how_much; i++) {
            System.out.print("Input " + (i+1) + " computer processor frequency (MGhz): ");
            int freq = input.nextInt();
            //scan /n after number
            input.nextLine();
            System.out.print("Input " + (i+1) + " computer ram (Gb): ");
            byte ram = input.nextByte();
            //scan /n after number
            input.nextLine();
            System.out.print("Input " + (i+1) + " computer videocard: ");
            String video = input.nextLine();
            Computer temp = new Computer(freq, ram, video);
            list.add(temp);
        }
        
        File file = new File("computers.bin");
        
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for (Computer comp: list)
                System.out.println(comp.toString());
            oo.writeObject(list);
            oo.flush();
            oo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Data has been recorded!");
        System.out.println("Reading...");
        
        try {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println("New list created");
            ArrayList<Computer> list2 = (ArrayList<Computer>)oi.readObject();
            for (int i = 0; i < how_much; i++) {
                System.out.println(list2.get(i).toString());
            }
            oi.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }   
}
