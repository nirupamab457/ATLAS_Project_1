class Task32 extends clac, Calculation{
    public static void main(String[] args) {
        
    }
}

class Calculation {
       int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }

}

class clac {
    public void add3(int x, int y, int z) {
        System.out.println("the sum of the 3 given numbers: " + x+y+z);
    }
} 