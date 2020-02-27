/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1n2;

/**
 *
 * @author Jassper
 */
public class TestNet {
    
    public static void main(String[] args) {
        SimpleNetwork a = new SimpleNetwork("Host 1","10.1.1","255.255.255.254","UP");
        SimpleNetwork b = new SimpleNetwork("Host 2","10.1.2","255.255.255.254","DOWN");
        SimpleNetwork c = new SimpleNetwork("Host 3","10.1.1.70","255.255.255.254","UP");
        SimpleNetwork d = new SimpleNetwork("Host 4","10.1.15","255.255.255.254","UP");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(a.ping(b));
        System.out.println(a.ping(c));
        System.out.println(a.ping(d));
        //ask about the network difference
    } 
    
}
