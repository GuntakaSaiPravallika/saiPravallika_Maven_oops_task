package Maven;
public class SweetClass implements SweetInterface
{
	float weight;
	float fatcontent,proteincontent;
	SweetClass(float w,float fc,float pc)
	{
		weight=w;
		fatcontent=fc;
		proteincontent=pc;
	}
	public float getweight()
	{
		return weight;
	}
	public float getFatContent()
	{
		return fatcontent;
	}
	public float getProteinContent()
	{
		return proteincontent;
	}
	public float sweetCost(float weight)
	{
		float cost=weight*50;
		return cost;
	}
	public String sweetType(int f,int p)
	{
		if(f>p)
			return "More calories content Sweet";
		else
			return "Low calories content Sweet";
	}

}