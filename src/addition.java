public class Addition {
   public int getAdd() {
     int num1 = Integer.parseInt(args[0]);
     int num2 = Integer.parseInt(args[1]);
     
     int sum = num1 + num2;
     System.out.println("Sum of these numbers: "+sum);
     return sum;
   }
   public static void main(String[] args) {
        
      Addition add = new Addition();
      add.getAdd();   
   }
}
