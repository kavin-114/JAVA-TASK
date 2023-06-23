import java.lang.String;
class StringExample{
	public static void main(String args[]){
		String value = "Batch 15 is toxic";

		//contains() checks whether the given value is available in the given variable along with case sensitive
		System.out.println(value.contains(" toxic"));

		// concat() is used to add two different string and present it as a single string
		System.out.println(value.concat(" By birth"));
		
		//equals() check whether the variable and the given string is equal are not it is case sensitive and space concerned
		System.out.println(value.equals("Batch 15 is toxic"));
		
		//equalIgnoreCase() method ignores the case sensitive and checks with the specified variable, also space concerned
		System.out.println(value.equalsIgnoreCase("Batch 15 is TOXIC"));

		//toUpperCase() method converts all characters into uppercase characters.
		System.out.println(value.toUpperCase(value));

		//toLowerCase() method converts all characters into lowercase characters.
		System.out.println(value.toLowerCase(value));

		//length() returns the length of the variable along with space.
		System.out.println(value.length(value));

		//charAt() returns the char that has beeen available in the specified index value
		System.out.println("charAt(): " + value.charAt(4));
		
		//compareTo() returns the lexicographic positive value if it contains any term that has been available in the variable
 		System.out.println("compareTo():  " + value.compareTo(val));

		//compareToIgnoreCase() returns the lexicographic zero value if the variables are same
 		System.out.println("compareToIgnoreCase():  " + value.compareToIgnoreCase(val));

		//compareTo() returns negative value if both the variable are different
 		System.out.println("compareTo():  " + value.compareTo("hello"));

		//indexOf() returns the value of specified char
		System.out.println("indexOf():  " + value.indexOf('s'));

		//isEmpty() method checks whether the given variable is empty or not
		System.out.println("is():  " + value.isEmpty());

		//replace() used to replace the specified word with the specified value
		System.out.println("replace():  " + value.replace('toxic','Vedapuu'));

		//substring() methods return a part of string by getting start and end index of a string.
		System.out.println("substring(): " + value.substring(3,11));

		//trim() methods removes the starting and ending spaces of a string.
		System.out.println("trim(): " + value.trim());

		// returns the index of last occurrence of the given character
		System.out.println("lastIndexOf(): "+value.lastIndexOf('i));

		//hashCode() return the key from the hash table which hold variable as values
		System.out.println("hashCode(): "+value.hashCode());

		//format() changes the given input in the specified format
		System.out.println("format(): "+value.format("%x",5)); //d,x,s

		//join() method si used to set delimiter and join the parameterized values
		System.out.println("join(): "+String.join("*","mouni","john","praveen");

		//replaceAll()
		System.out.println("replaceAll(): "+value.replaceAll("i","y"));

		//split()
		String[] arr1 = value2.split("@",2);
		for(String a1:arr1)
		
		
		

				

}
}