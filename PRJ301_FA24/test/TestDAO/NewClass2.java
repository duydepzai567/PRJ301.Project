/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDAO;
import java.util.List;

import dao.ProductTypeDAO;
import model.ProductTypeList;
/**
 *
 * @author DUCDUY2003
 */
public class NewClass2 {
     public static void main(String[] args) {
        ProductTypeDAO dao = new ProductTypeDAO();
        List<ProductTypeList> list = dao.getAllPro();
        for (ProductTypeList o : list) {
            System.out.println(o);

        }
    }
}
