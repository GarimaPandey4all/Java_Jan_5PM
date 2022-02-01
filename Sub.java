class Sub {
    public static void main(String[] args) {
        
        //manual way of initialization

        int firstNumber = 100;
        int secondNumber = 200;

        // java doesn't support garbage value concept
        // local variable must be initialized before use in java

        int result = firstNumber - secondNumber;

        System.out.println("Subtraction is: "+result);

    }    
}
