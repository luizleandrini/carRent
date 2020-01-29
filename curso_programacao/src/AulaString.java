
public class AulaString {

	public static void main(String[] args) {
		/*
		 * String original = "asdgas GASG ASG asg sd";
		 * 
		 * String s01 = original.toLowerCase(); 
		 * String s02 = original.toUpperCase();
		 * String s03 = original.trim(); 
		 * String s04 = original.substring(2);
		 * String s05 = original.substring(2, 9); 
		 * String s06 = original.replace('a', 'x'); 
		 * String s07 = original.replace("asd", "xxt"); 
		 * int i = original.indexOf("sd"); 
		 * int j = original.lastIndexOf("sd");
		 * 
		 * System.out.println("Original - " + original + "-");
		 * System.out.println("toLowerCase: - " + s01 + "-"); // tudo minusculo
		 * System.out.println("toUpperCase - " + s02 + "-"); // tudo maiusculo
		 * System.out.println("trim - " + s03 + "-");
		 * System.out.println("substring(2): - " + s04 + "-");
		 * System.out.println("substring(2,9): -" + s05 + "-");
		 * System.out.println("replace('a', 'x'): - " + s06 + "-");
		 * System.out.println("replace('asd', 'xxt'): -" + s07 + "-");
		 * System.out.println("Index of sd : " + i);
		 * System.out.println("Last index of sd: " + j);
		 */
		
		// funão split imprime cada vetor em uma linha
		String s = "potato apple lemon";
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
