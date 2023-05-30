package org.example;

import com.sun.net.httpserver.HttpExchange;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        Http_Connection httpConnection = new Http_Connection();
        try {
            httpConnection.startServer();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}