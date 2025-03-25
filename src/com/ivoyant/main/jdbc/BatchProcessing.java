package com.ivoyant.main.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/STUDENTS"; // Change database name
            String user = "root"; // Change username
            String password = "tiger"; // Change password

            Connection conn = null;
            PreparedStatement pstmt = null;


            try {
//                loading and registering the driverclass
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establish Connection
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(false); // Disable auto-commit for batch execution

                //   create a platform to execute the query
                String sql = "INSERT INTO STUDENT (SID, SNAME, MARKS) VALUES (?, ?, ?)";
                pstmt = conn.prepareStatement(sql);

                // Step 3: Add multiple statements to batch
                pstmt.setInt(1, 101);
                pstmt.setString(2, "Alice");
                pstmt.setDouble(3, 45);
                pstmt.addBatch();

                pstmt.setInt(1, 102);
                pstmt.setString(2, "Bob");
                pstmt.setDouble(3, 67);
                pstmt.addBatch();

                pstmt.setInt(1, 103);
                pstmt.setString(2, "Charlie");
                pstmt.setDouble(3, 60);
                pstmt.addBatch();

                // Step 4: Execute batch
                int[] results = pstmt.executeBatch();

                // Step 5: Commit transaction
                conn.commit();
                System.out.println("Batch execution successful!");

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                try {
                    if (conn != null) {
                        conn.rollback();
                    }// Rollback if an error occurs
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } finally {
                // Step 6: Clean up resources
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

