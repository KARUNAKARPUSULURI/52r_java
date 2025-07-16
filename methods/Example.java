class Main {
    //numbers -> 1- 100, 0 - 100 -. str, arrays-> 0
    public static void countCharactersInAString(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
        }
        return;
    }
    
    public void hello(){
        System.out.println("hello");
    }
    
    public String positiveOrNegative(int num){
        if(num > 0){
            return "Positive";
        }else{
            return "Negative";
        }
    }
    
    public static String evenOrOdd(int num){
        if(num % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
    
    public static void main(String[] args) {
        Main m1 = new Main();
        String res = Main.evenOrOdd(12); 
        String out = m1.positiveOrNegative(-20);
        m1.hello();
        
        if(countCharactersInAString("John") % 2 == 0){
            System.out.println("even" + "john");
        }else{
            System.out.println("odd");
        }
        System.out.println(res);
        System.out.println(out);
        
    }
    
}