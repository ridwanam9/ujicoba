/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.TI.Activity_1;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
public class ControllerAct {
    
    //    inputdata inda = new inputdata();
    
    int cost;
    public int early_cost(String a, String b){
        int harga_awal = 0;
        
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        harga_awal = inta * intb;
        cost = harga_awal;
        return harga_awal;
    }
    
    public int diskon(){
        int dis = 0;
        
        if (cost <= 16000){
            dis = 0 / 100;
        }
        else if( cost > 16000 && cost <= 25000){
            dis = 10 / 100;
        }
        else {
            dis = 15 /100;
        }
        return dis;
    }
    
    public int harga_diskon(){
        int dis_pri = 0;
        
        dis_pri = cost * diskon();
        
        return dis_pri;
    }
    
    public int harga_total(){
        int total_pri = 0;
        
        total_pri = cost - harga_diskon();
        
        return total_pri;
    }
    
    
    
    @RequestMapping("/activity")
    public String lihatdata(HttpServletRequest data, Model model){
    
        String nama_barang = data.getParameter("var_name");
        String harga_kilo = data.getParameter("var_cost");
        String jumlah_beli = data.getParameter("var_amount");
        
        int product_cost = early_cost(harga_kilo, jumlah_beli);
        
        model.addAttribute("name", nama_barang);
        model.addAttribute("cost", harga_kilo);
        model.addAttribute("amount", jumlah_beli);
        model.addAttribute("awal", product_cost);
        model.addAttribute("diskon", diskon());
        model.addAttribute("harga_diskon", harga_diskon());
        model.addAttribute("harga_total", harga_total());
        
        
        return "Ridwan";
    }
    
}
