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
    
    Inputdata it = new Inputdata();
    Proses pr = new Proses();
    
    @RequestMapping("/activity")
    public String lihatdata(HttpServletRequest data, Model model){
    
        it.masukan(data, model);

        int product_cost = pr.early_cost(it.harga_kilo, it.jumlah_beli);
        
        model.addAttribute("name", it.nama_barang);
        model.addAttribute("cost", it.harga_kilo);
        model.addAttribute("amount", it.jumlah_beli);
        model.addAttribute("awal", product_cost);
        model.addAttribute("diskon", pr.diskon());
        model.addAttribute("harga_diskon", pr.harga_diskon());
        model.addAttribute("harga_total", pr.harga_total());
        
        
        return "Ridwan";
    }
    
}
