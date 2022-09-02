package org.java;

public class FirstClass { 
	public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    System.out.println("2nd time changes");
    System.out.println("2nd time changes");

    System.out.println("change 1st time");
    System.out.println("change 1st time");

//<<<<<<< HEAD
//=======
//>>>>>>> adf8aec80c13da5cd2dc71f25a415b4fab738aa8
    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}



