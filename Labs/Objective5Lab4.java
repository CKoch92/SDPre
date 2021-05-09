public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    int userNum = 43;
    System.out.println(userNum);

    if(userNum % 2 == 0){
      System.out.println("The number is even");
    }
    else{
      System.out.println("The number is odd");
    }

  }
}
