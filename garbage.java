class abc
{
	public void finalize()
	{
		System.out.println("Garbage Collect");
	}
}
class garbage
{
	public static void main(String ar[])
	{
		abc a1=new abc();
		abc a2=new abc(); 
		a1=null;
		a2=null;
		System.gc();
	}
}