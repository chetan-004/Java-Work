class Test {
    public static void main(String[] args) {
       
     System.out.println("Main method has started execution");
     try {
            int a = 10;
            int b = 0;
            int c = a / b; 
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }     System.out.println("Main method has completed execution");
    }
}