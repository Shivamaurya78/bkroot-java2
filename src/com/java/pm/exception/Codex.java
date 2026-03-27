package com.java.pm.exception;
class CodeX {

        String description;

        CodeX(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            CodeX program = new CodeX("This program adds two numbers and displays the result");

            program.showDescription();

            int num1 = 25;
            int num2 = 15;
            program.addNumbers(num1, num2);
        }

        void showDescription() {
            System.out.println(description);
        }

        void addNumbers(int a, int b) {
            int sum = a + b;
            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
            System.out.println("Sum = " + sum);
        }
    }

