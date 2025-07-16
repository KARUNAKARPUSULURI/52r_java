class Main {
    static int sum;  //3
    public static void main(String[] args) {
        int num = 30; 
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(num == sum){
            System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }
    }
}
----------------------------------------------
class Main {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int temp2 = num;
        int count = 0;
        int sum = 0; //27
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        while(temp2 > 0){
            int digit = temp2 % 10; //5
            int product = 1;
            for(int i = 0; i < count; i++){
                product = product * digit;
            }
            sum = sum + product;
            temp2 = temp2 / 10;
        }
        if(num == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not a armstrong number");
        }
        
    }
}

-----------------------------------

class Main {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;
        int num = 20;
        System.out.print(prev + " ");
        System.out.print(curr);
        for(int i = 2; i < num; i++){
            int next = prev + curr;
            System.out.print(" " + next);
            prev = curr;
            curr = next;
        }
    }
}
----------------------------------

class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            String star = "";
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    star = star + "*";
                }
                else{
                    star = star + " ";
                }
            }
            System.out.println(star);
        }
    }
}