package com.item;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.seller.Seller;
import com.seller.SellerDBUtil;

@WebServlet("/ItemInsert")
@MultipartConfig
public class ItemInsert extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String priceStr = request.getParameter("price");
        double price = 0.0;

        try {
            price = Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            // Handle the exception 
        }

        Part filePart = request.getPart("imageFile"); // Get the uploaded file
        String imageFileName = null;

        if (filePart != null) {
            // Get the filename from the Part
            String fileName = getSubmittedFileName(filePart);

         // Define the directory of uploaded images
            String uploadDirectory = getServletContext().getRealPath("/uploads");

            // Create the directory if it doesn't exist
            File uploadDir = new File(uploadDirectory);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Generate a unique file name 
            imageFileName = fileName;

            // Save the file to the directory
            String imagePath = uploadDirectory + File.separator + imageFileName;

            filePart.write(imagePath);
        }

        // save the imageFileName in your database
        boolean isTrue = ItemDBUtil.insertitem(name, category, price, imageFileName);

        if (isTrue) {
        	// Read the updated item data from the database
            List<Item> itemDetails = ItemDBUtil.getItemDetails();

            // Set the updated data
            request.setAttribute("itemDetails", itemDetails);

            RequestDispatcher dispatcher = request.getRequestDispatcher("allItems.jsp");
            dispatcher.forward(request, response);
        } else {
            // Failure
            response.sendRedirect("unsuccess.jsp");
        }
    }

    private static String getSubmittedFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1);
            }
        }
        return null;
    }
}
