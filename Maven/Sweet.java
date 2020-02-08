package Maven;

public class Sweet extends SweetClass
{
	String sweetname;
	Sweet(float weight,float fat,float protein)
	{
		super(weight,fat,protein);
	}
	public void setSweetName(String s)
	{
		sweetname=s;
	}
	public String getSweetName()
	{
		return sweetname;
	}
}