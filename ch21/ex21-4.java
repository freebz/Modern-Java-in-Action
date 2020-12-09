// 값 형식

class Complex {
    public final double re;
    public final double im;
    public Complex(double re, double im) {
	this.re = re;
	this.im = im;
    }
    public static Complex add(Complex a, Complex b) {
	return new Complex(a.re+b.re, a.im+b.im);
    }
}


double d1 = 3.14;
double d2 = d1;
Double o1 = d1;
Double o2 = d2;
Double ox = d1;
System.out.println(d1 == d2 ? "yes" : "no");  // yes
System.out.println(o1 == o2 ? "yes" : "no");  // no
System.out.println(d1 == ox ? "yes" : "no");  // yes
