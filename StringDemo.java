
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bobo";
		String x="to",y="night",c;
		String d="a",e="a",f="c";
		String a="Alex",b="Bob";
		String example="Alexander is the richest guy in the world!";
		String letter1="A", letter2="b";
		boolean result;
		char letter;
		String old="Welcome to School!";
		String example1="Hello buddy";
		String first="Hello";
		letter= name.charAt(2);
		c=x.concat(y);
		result=a.equalsIgnoreCase(b);
		
		
		System.out.println(letter);
		System.out.println(c);
		System.out.println(d.equals(e));
		System.out.println(d.equals(f));
		System.out.println("Are "+a+" and "+b+"the same guy? "+result);
		System.out.println(a.indexOf("e"));
		System.out.println(example.lastIndexOf("e"));
		System.out.println(letter1.toLowerCase());
		System.out.println(letter2.toUpperCase());
		System.out.println(old.replace("School", "school"));
		System.out.println(example1.substring(6));
		System.out.println(example1.substring(1, 4));
		System.out.println(first.trim()+" what's up");
	}

}
