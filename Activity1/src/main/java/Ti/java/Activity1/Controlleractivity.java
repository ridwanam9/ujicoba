/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ti.java.Activity1;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
public class Controlleractivity {
    
    Proses pc = new Proses();
    Inputdata iut = new Inputdata();
    
    @RequestMapping("/act")
    public String lihatdata(HttpServletRequest data, Model model){
    
        iut.input(data, model);
       
        int product_cost = pc.early_cost(iut.harga_kilo, iut.jumlah_beli);
        
        model.addAttribute("name", iut.nama_barang);
        model.addAttribute("cost", iut.harga_kilo);
        model.addAttribute("amount", iut.jumlah_beli);
        model.addAttribute("awal", product_cost);
        model.addAttribute("diskon", pc.diskon());
        model.addAttribute("harga_diskon", pc.harga_diskon());
        model.addAttribute("harga_total", pc.harga_total());
        
        
        return "RidwanAmirulMaulana";
    }
    
}
