package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class MainServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("Server started. Waiting for connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

            String clientGreeting = in.readLine();
            System.out.println("Client greeted: " + clientGreeting);

            boolean containsRussian = clientGreeting.matches(".*[а-яА-ЯёЁ].*");

            if (containsRussian) {
                out.println("What is palyanitsa?");
                String response = in.readLine();
                if (response.equalsIgnoreCase("tasty dish")) {

                    LocalDateTime currentDateTime = LocalDateTime.now();
                    out.println("Current date and time: " + currentDateTime);
                } else {
                    out.println("Incorrect answer. Connection terminated.");
                    clientSocket.close();
                }
            } else {
                out.println("Hello!");
            }

            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
