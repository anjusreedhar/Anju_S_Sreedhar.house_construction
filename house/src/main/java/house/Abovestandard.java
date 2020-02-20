package house;
import java.util.*;
public class Abovestandard 
{
	float area; 
	Scanner s=new Scanner(System.in);
	public Abovestandard(float area)
	{
	this.area=area;
	}
	public void result()
	{
		float cost_of_construction=1500 * area;
		System.out.format("%s","The cost of construction is:"+cost_of_construction);
	}

}
