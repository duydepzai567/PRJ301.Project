/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDAO;
import dao.ManagementDAO;
import java.util.List;
import model.Management;
/**
 *
 * @author DUCDUY2003
 */
public class NewClass3 {
     public static void main(String[] args) {
        ManagementDAO dao = new ManagementDAO();
        List<String> list = dao.getManaS();
        for (String o : list) {
            System.out.println(o);

        }
    }
}
