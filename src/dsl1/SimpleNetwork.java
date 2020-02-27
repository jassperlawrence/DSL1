/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

/**
 *
 * @author wic190015
 */
public class SimpleNetwork {
    
    private String name,IP,subnet,status;
   

    public SimpleNetwork(String name, String IP, String subnet, String status) {
        this.name = name;
        this.IP = IP;
        this.subnet = subnet;
        this.status = status;
    }
    
    //value of ip and subnet
    //Status UP / DOWN
    //Different Network
    
    @Override
    public String toString() {
        return "Host Name: "+name+" IP: "+IP+" Subnet Mask: "+subnet+" Status: "+status;
    }
    
    public String ping(SimpleNetwork a){
        
        boolean net,stat ;
        
        
        String[]ip1=(IP.split("\\."));
        String[]ip2=(a.IP.split("\\."));
        String[]sb1=(subnet.split("\\."));
        String[]sb2=(a.subnet.split("\\."));
        
            int []IP1= new int [4];
            int []IP2= new int [4];
            int []SB1= new int [4];
            int []SB2= new int [4];
            
        //value 2 arrays then compare
        for (int i = 0; i < sb2.length; i++) {
            
            int temp1=Integer.parseInt(ip1[i]);
            int temp2=Integer.parseInt(ip2[i]);
            int temp3=Integer.parseInt(sb1[i]);
            int temp4=Integer.parseInt(sb2[i]);
            
            IP1[i]=temp1;
            IP2[i]=temp2;
            SB1[i]=temp3;
            SB2[i]=temp4;
            
        }
       
       int host1[]= new int [4];
       int host2[]= new int [4];
        for (int i = 0; i < 4; i++) {
            host1[i]=IP1[i]&SB1[i];
            host2[i]=IP2[i]&SB2[i];
            
        }
        //compare
        //check
        int count=0;
        for (int i = 0; i < host2.length; i++) {
            
           if(host1[i]==host2[i]){
               count++;
           }
           
             
        }
        if(count==4){
            net=true;
        }
        else 
            net=false;//different network connection
        
        if(status.equalsIgnoreCase("UP")&&a.status.equalsIgnoreCase("UP")){
            stat=true;
        }
        else 
            stat=false;
        
        
        if(net==true&&stat==true){
            return name+" can ping "+a.name;
        }
        else if(stat==false){
            return name+" cannot ping "+a.name+" because the destination "+a.name+" is down";
        }
        else
            return name+" cannot ping "+a.name+"because the destination"+a.name+" is located in a different network";
        
    } 
    
    
    
}
