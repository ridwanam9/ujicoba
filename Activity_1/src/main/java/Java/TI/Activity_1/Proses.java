/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.TI.Activity_1;

/**
 *
 * @author DELL
 */
public class Proses {
    
    int cost;
    public int early_cost(String a, String b){
        int harga_awal = 0;
        
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        harga_awal = inta * intb;
        cost = harga_awal;
        return harga_awal;
    }
    
    public String diskon(){
        String dis;
        
        if (cost <= 16000){
            dis = "0%";
        }
        else if( cost > 16000 && cost <= 25000){
            dis = "10%";
        }
        else {
            dis = "15%";
        }
        return dis;
    }
    
    public int harga_diskon(){
        int dis_pri;
        
        if (cost <= 16000){
            dis_pri = cost * 0 / 100;
        }
        else if( cost > 16000 && cost <= 25000){
            dis_pri = cost * 10 / 100;
        }
        else {
            dis_pri = cost * 15 / 100;
        }
        
        return dis_pri;
    }
    
    public int harga_total(){
        int total_pri = 0;
        
        total_pri = cost - harga_diskon();
        
        return total_pri;
    }
    
}
