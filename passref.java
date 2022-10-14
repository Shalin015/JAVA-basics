class op2
{
	int c=50;
	void change(op2 op)
	{
		op.c=op.c+100;
	}
}
class passref
{
	public static void main(String ar[])
	{
		op2 op=new op2();
		System.out.println("globle C :"+op.c);
		op.change(op);
		System.out.println("C : "+op.c);
	}
}