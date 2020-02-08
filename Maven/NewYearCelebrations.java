package Maven;
public class NewYearCelebrations
{
	public static void main(String args[])
	{
		Sweet s=new Sweet(10,50,45);
		s.setSweetName("Jilebi");
		String sname=s.getSweetName();
		System.out.println("Sweet name is "+sname);
		System.out.println("Weight : "+s.getweight()+"Fat Content : "+s.getFatContent()+"Protein Content : "+s.getProteinContent());
		System.out.println("Cost of "+sname+" is "+s.sweetCost(20));
		System.out.println("It is a "+s.sweetType(60,55));

		Chocolate c=new Chocolate(20,30,40);
		System.out.println("MilkContent : "+c.getMilk()+"Cocoa Content : "+c.getCocoa()+"Caramel Content : "+c.getCaramel());
		System.out.println("First Chocolate is "+c.chocolateType(60));
		System.out.println("Second Chocolate is "+c.chocolateType(75,45));

	}
}