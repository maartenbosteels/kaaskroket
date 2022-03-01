import java.util.*; public class v3 { public static void main(String[] a) {
java.util.Set s=new LinkedHashSet<>();long n=Long.parseLong(a[0]);
for(long i=2;i<=n;i++)s.addAll((n%i==0)?Arrays.asList(i):Arrays.asList());
System.out.printf(s.isEmpty()?"%d is prime":"Factors of %d:"+s,n); } }
