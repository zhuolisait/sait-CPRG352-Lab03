/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author i5
 */
//@WebServlet(name = "ageCalcServlet", urlPatterns = {"/ageCalcServlet"})
public class Age_Calc_Servlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // get requests end up here
        
        //load JSP file from the servlet
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalcForm.jsp").forward(request, response);
        return; // stop the code call
        
    }
    
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         //int age = Integer.parseInt(request.getParameter("user_age"));
         String age = request.getParameter("user_age");
         String message = "";

         request.setAttribute("age", age);
         
         //validation
         if(age.equals("")){
             message = "You must give your current age.";
             request.setAttribute("message", message);
             
         }
         else if(age.matches("[0-9]+") == false){
             message = "You must enter a number.";
             request.setAttribute("message", message);
         }
         else{
             int int_age = Integer.parseInt(age);
             int_age += 1;
             message = "Your age next birthday will be " + int_age;
             request.setAttribute("message", message);
             
         }
         
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalcForm.jsp").forward(request, response);
            //stop code call
            return;
     }
}
