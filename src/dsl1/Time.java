/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1;

/**
 *
 * @author Jassper
 */
public class Time {
    
    protected int hour,minute;
    int digTime;
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public boolean check(){
        if(this.hour>23||this.hour<0||this.minute<0||this.minute>59){
            return false;
        }
        else
            return true;    
    }
    public String display(){
        
        switch(hour){
             
            case 13:
                digTime=1;
                break;
            case 14:
                digTime=2;
                break;
            case 15:
                digTime=3;
                break;
            case 16:
                digTime=4;
                break;
            case 17:
                digTime=5;
                break;
            case 18:
                digTime=6;
                break; 
            case 19:
                digTime=7;
                break;    
            case 20:
                digTime=8;
                break;
            case 21:
                digTime=9;
                break;
            case 22:
                digTime=10;
                break;
            case 23:
                digTime=11;
                break;    
            default:
                digTime=this.hour;
                break;
        }
                
        if(this.hour>=0&&this.hour<12&&check()==true){
            return "Hour: "+this.hour+"  Minute: "+this.minute+"    "+digTime+":"+this.minute+" AM";
        }
        else if(this.hour>11&&this.hour<=23&&check()==true)
            return "Hour: "+this.hour+"  Minute: "+this.minute+"    "+digTime+":"+this.minute+" PM";
        else
            return "Hour: "+this.hour+"  Minute: "+this.minute+"    Invalid Time Input";
                    
    }
 }


