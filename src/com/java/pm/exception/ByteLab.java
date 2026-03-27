package com.java.pm.exception;
class ByteLab {

        String description;

        ByteLab(String desc) {
            description = desc;
        }

        public static void main(String[] args) {
            ByteLab lab = new ByteLab("This program demonstrates byte operations in Java");

            lab.showDescription();

            byte num1 = 10;
            byte num2 = 20;
            lab.addBytes(num1, num2);

            lab.multiplyBytes(num1, num2);
        }

        void showDescription() {
            System.out.println(description);
            System.out.println("----------------------");
        }

        void addBytes(byte a, byte b) {
            int sum = a + b;
            System.out.println("Adding bytes: " + a + " + " + b + " = " + sum);
        }

        void multiplyBytes(byte a, byte b) {
            int product = a * b;
            System.out.println("Multiplying bytes: " + a + " * " + b + " = " + product);
        }
    }

