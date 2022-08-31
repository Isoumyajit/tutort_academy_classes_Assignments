package week_2.class2.Soumyajit;

public class addDigits {

  /* 
  TODO : Approach 1 
    Approach 1: Mathematical: Digital Root
    Formula for the Digital Root

    There is a known formula to compute a digital root in a decimal numeral system

    dr_{10}(n) = 0, \qquad \text{if } n = 0dr
    10
    ​
     (n)=0,if n=0

    dr_{10}(n) = 9, \qquad \text{if } n = 9 kdr
    10
    ​
     (n)=9,if n=9k

    dr_{10}(n) = n \mod 9, \qquad \text{if } n \ne 9 kdr
    10
    ​
     (n)=nmod9,if n
    
    ​
     =9k

    How to derive it? Probably, you already know the following proof from school, where it was used for a divisibility by 9: "The original number is divisible by 9 if and only if the sum of its digits is divisible by 9". Let's revise it briefly.

    The input number could be presented in a standard way, where d_0, d_1, .. d_kd
    0
    ​
     ,d
    1
    ​
     ,..d
    k
    ​
      are digits of n:

    n = d_0 + d_1 \cdot 10^1 + d_2 \cdot 10^2 + ... + d_k \cdot 10^kn=d
*/
  public int addDigits(int num) {
    return (num - 1) % 9 + 1;
  }
}
