package com.sur0vy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;

        try{
            connection = DriverManager.getConnection( "jdbc:sqlite:d:\\My\\javaProjects\\testORM\\src\\main\\resources\\components.s3db" );
            if ( connection != null ){
                System.out.println("connected!");









            }
        }
        catch ( Exception ex ) {
            System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
            System.out.println("Error connection");
        }

    }
}
