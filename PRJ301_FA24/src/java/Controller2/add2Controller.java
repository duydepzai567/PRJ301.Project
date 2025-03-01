/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller2;

import dao.ManagementDAO;
import model.Management;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author DUCDUY2003
 */
@WebServlet(name = "add2Controller", urlPatterns = {"/addmanage"})
public class add2Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ManagementDAO dao1 = new ManagementDAO();
        ArrayList<Management> data1 = dao1.getCustomer();
        request.setAttribute("da1", data1);

        ManagementDAO dao2 = new ManagementDAO();
        ArrayList<Management> list = dao2.getEmployees();
        request.setAttribute("da2", list);
        
        ManagementDAO dao3 = new ManagementDAO();
        ArrayList<Management> pro = dao3.getProducts();
        request.setAttribute("da3", pro);

        request.getRequestDispatcher("add2.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String IOputID = request.getParameter("IOputID");
        String CustomerID = request.getParameter("CustomerID");
        String EmployeesID = request.getParameter("EmployeesID");
        String ProductID = request.getParameter("ProductID");
        String DateofReceipt = request.getParameter("DateofReceipt");
        String ShippingDate = request.getParameter("ShippingDate");
        String PurchasePrice = request.getParameter("PurchasePrice");
        String SellingPrice = request.getParameter("SellingPrice");

        //get data from DAO
        ManagementDAO dao = new ManagementDAO();
        dao.insert(EmployeesID, DateofReceipt, ShippingDate, PurchasePrice, SellingPrice, IOputID, CustomerID, ProductID);
        response.sendRedirect("manalist");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
