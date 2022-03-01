public class Primer {
 public static void main(String[] args){
  System.out.println("Please enter a number:");
  long n = new java.util.Scanner(System.in).nextLong();
  java.util.Set<Long> s = new java.util.LinkedHashSet<>();
  for (long i = 2; i <= n / 2;  i++)
    s.addAll((n%i==0)? java.util.Arrays.asList(i):java.util.Arrays.asList());
  System.out.printf(s.isEmpty()?"%d is prime":"Divisors of %d are "+s,n);
 }
}
