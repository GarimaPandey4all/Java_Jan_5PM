class CLI {
    public static void main(String[] args) {

        // args[0] = 100;
        // args[1] = 200; 
        
        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);

            int result = firstNumber + secondNumber;

            System.out.println("Addition is: "+result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }    
}
