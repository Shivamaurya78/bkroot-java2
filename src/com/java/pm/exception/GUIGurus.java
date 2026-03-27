package com.java.pm.exception;
import javax.swing.JOptionPane;

    class GUIGurus {

        String description;

        GUIGurus(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            GUIGurus gui = new GUIGurus("Welcome to GUIGurus: Simple GUI Example");

            gui.showDescription();

            String name = JOptionPane.showInputDialog("Enter your name:");
            String ageStr = JOptionPane.showInputDialog("Enter your age:");

            int age = Integer.parseInt(ageStr);

            gui.showMessage(name, age);
        }

        void showDescription() {
            JOptionPane.showMessageDialog(null, description);
        }

        void showMessage(String name, int age) {
            String message = "Hello " + name + "!\nYour age is " + age + " years.";
            JOptionPane.showMessageDialog(null, message);
        }
    }

