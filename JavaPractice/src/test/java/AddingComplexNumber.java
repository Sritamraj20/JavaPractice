class Complex {
        private double real;
        private double imaginary;

        // Constructor
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Addition of two complex numbers
        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }

        // Subtraction of two complex numbers
        public Complex subtract(Complex other) {
            return new Complex(this.real - other.real, this.imaginary - other.imaginary);
        }

        // Multiplication of two complex numbers
        public Complex multiply(Complex other) {
            double realPart = this.real * other.real - this.imaginary * other.imaginary;
            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(realPart, imaginaryPart);
        }

        // Convert to string
        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    }

    public class AddingComplexNumber {
        public static void main(String[] args) {
            Complex num1 = new Complex(1, 2);  // 1 + 2i
            Complex num2 = new Complex(3, 4);  // 3 + 4i

            Complex sum = num1.add(num2);
            Complex difference = num1.subtract(num2);
            Complex product = num1.multiply(num2);

            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
        }
    }
