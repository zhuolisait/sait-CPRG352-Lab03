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
public class ArtithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String message = "---";
            request.setAttribute("message", message);    
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return; // stop the code call       
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String first = request.getParameter("first");
            String second = request.getParameter("second");
            String calc_type = request.getParameter("calc_type");
            String message = "";
            
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            
            //validation
            if(second == null || first == null || first.equals("") || second.equals("") || !first.matches("[0-9]+") || !second.matches("[0-9]+")){
                message = "invalid";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                //stop code call
                return;
                
            }
            
            //calculations
            int int_first = Integer.parseInt(first);
            int int_second = Integer.parseInt(second);
            if(calc_type.equals("+")){
                message = Integer.toString(int_first + int_second) + "";
            }
            else if(calc_type.equals("-")){
                message = Integer.toString(int_first - int_second);
            }
            else if(calc_type.equals("*")){
                message = Integer.toString(int_first * int_second);
            }
            else if(calc_type.equals("%")){
                message = Integer.toString(int_first % int_second);
            }
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            //stop code call
            return;
    }


}
