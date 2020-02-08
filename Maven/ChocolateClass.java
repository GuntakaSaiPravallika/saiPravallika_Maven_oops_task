package Maven;
public class ChocolateClass implements ChocolateInterface
{
	int milk,cocoa,caramel;
	ChocolateClass(int m,int c,int ca)
	{
		milk=m;
		cocoa=c;
		caramel=ca;
	}
	public int getMilk()
	{
		return milk;
	}
	public int getCocoa()
	{
		return cocoa;
	}
	public int getCaramel()
	{
		return caramel;
	}
	public String chocolateType(int m,int c)
	{
		if(m>c)
			return "Milky Bar";
		else
			return "Chocobar";
	}
	public String chocolateType(int c)
	{
		if(c>50)
			return "5Star choclate";
		else
			return "BarOne";
	}
}