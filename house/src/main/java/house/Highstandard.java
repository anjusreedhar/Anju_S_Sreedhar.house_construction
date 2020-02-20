package house;
import java.util.*;
public class Highstandard 
{
	float area; 
	Scanner s=new Scanner(System.in);
	public Highstandard(float area)
	{
	this.area=area;
	}
	public void result()
	{
		float cost_of_construction=1800 * area;
		System.out.format("%s","The cost of construction is:"+cost_of_construction);
	}

}
