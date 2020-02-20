package house;
import java.util.*;
public class Automation
{
	float area; 
	Scanner s=new Scanner(System.in);
	public Automation(float area)
	{
	this.area=area;
	}
	public void result()
	{
		float cost_of_construction=2500 * area;
		System.out.format("%s","The cost of construction is:"+cost_of_construction);
	}

}
