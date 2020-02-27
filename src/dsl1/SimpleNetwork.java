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
public class SimpleNetwork {
    
    private String name,IP,subnet,status;

    public SimpleNetwork(String name, String IP, String subnet, String status) {
        this.name = name;
        this.IP = IP;
        this.subnet = subnet;
        this.status = status;
    }
    //check if can ping 
    public String ping(SimpleNetwork host){
        boolean check1,check2,check3;
        if(this.IP.equals(host.IP)||this.IP.substring(0).equals(host.IP)||host.IP.substring(0).equals(this.IP)){
            check1=true;
        }
        else
            check1=false;
        
        if(this.subnet.equals(host.subnet)){
            check2=true;
        }
        else 
            check2=false;
        
        if(this.status.equalsIgnoreCase("UP")&&host.status.equalsIgnoreCase("UP")){
            check3=true;
        }
        else 
            check3=false;
        
        
        
        
        if(check1==false){
            return this.name+" cannot ping "+host.name+" because the destination "+host.name+" is located in a different network";
        }
        else if(check2==false){
            return this.name+" cannot ping "+host.name+" because the subnet of "+host.name+" is different";
        }
        else if(check3==false){
            return this.name+" cannot ping "+host.name+" because the destination "+host.name+" is down";
        }
        else
            return this.name+" can ping "+host.name;
        
        
    }

    @Override
    public String toString() {
        return "Host Name: "+name+" IP: "+IP+" Subnet Mask: "+subnet+" Status: "+status;
    }
    

    
    
}
