import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner bob = new Scanner (System.in);
    double n=bob.nextDouble();
  	int a=(int)n;
  	double b=n-a,c;
  	c=b*100;
  	int d=(int)c,e,f,g,h,i,j,k,l,m,r,o,p,q,s,t,u,v,w,x,y,z;
  	e=a/100;
  	z=a%100;
  	f=z/50;
  	y=z%50;
  	g=y/20;
  	x=y%20;
  	h=x/10;
  	w=x%10;
  	i=w/5;
  	v=w%5;
  	j=v/2;
  	if(v%2==0)
  	k=0;
  	else
  	k=1;

  	l=d/50;
  	u=d%50;
 	 	m=u/25;
  	t=u%25;
  	r=t/10;
  	s=t%10;
  	o=s/5;
  	p=s%5;
    System.out.println("NOTAS:");
    System.out.println(e + " nota(s) de R$ 100.00");
    System.out.println(f + " nota(s) de R$ 50.00");
    System.out.println(g + " nota(s) de R$ 20.00");
    System.out.println(h + " nota(s) de R$ 10.00");
    System.out.println(i + " nota(s) de R$ 5.00");
    System.out.println(j + " nota(s) de R$ 2.00");

    System.out.println("MOEDAS:");
    System.out.println(k + " moeda(s) de R$ 1.00");
    System.out.println(l + " moeda(s) de R$ 0.50");
    System.out.println(m + " moeda(s) de R$ 0.25");
    System.out.println(r + " moeda(s) de R$ 0.10");
    System.out.println(o + " moeda(s) de R$ 0.05");
    System.out.println(p + " moeda(s) de R$ 0.01");
  }
}
