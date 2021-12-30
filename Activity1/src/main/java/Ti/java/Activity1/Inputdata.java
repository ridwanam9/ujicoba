package Ti.java.Activity1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package java.ti.Activity1;*/


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



/**
 *
 * @author DELL
 */
@Controller
public class Inputdata {
    
    String nama_barang;
    String harga_kilo;
    String jumlah_beli;
    
    public void input(HttpServletRequest data, Model model)
    {
        
        nama_barang = data.getParameter("var_name");
        harga_kilo = data.getParameter("var_cost");
        jumlah_beli = data.getParameter("var_amount");
    }
    
}
