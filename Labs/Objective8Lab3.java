public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for(counter; counter <= 20; counter += 1) {
      if(counter % 2 == 0){
        System.out.println(counter + " is even");
      }
      else{
        System.out.println(counter + " is odd");
      }
    }
  }
}
