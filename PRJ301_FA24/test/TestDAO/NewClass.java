/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDAO;

import model.Inventory;
import dao.ProductDAO;
import java.util.List;

/**
 *
 * @author DUCDUY2003
 */
public class NewClass {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Inventory> list = dao.getAll();
        for (Inventory o : list) {
            System.out.println(o);

        }
    }
}
