class ThrowsExample{
public static void myMethod1(int i)throws Exception
	i = i/0;
}
public static void main(String args[])throws Exception{
	myMethod1(7);
}
}