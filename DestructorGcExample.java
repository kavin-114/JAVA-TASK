class DestructorGcExample{
	public static void main(String args[]){
	System.out.println("System.gc(Garbage Collection)");
	DestructorGcExample obj = new DestructorGcExample();
	obj = null;
	System.gc();
	System.out.println("GC has been calling");
	}
}