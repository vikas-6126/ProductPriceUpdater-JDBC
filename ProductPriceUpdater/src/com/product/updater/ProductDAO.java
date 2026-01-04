package com.product.updater;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {

    public boolean updatePrice(int id, double newPrice) {
        String sql = "UPDATE products SET price = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}