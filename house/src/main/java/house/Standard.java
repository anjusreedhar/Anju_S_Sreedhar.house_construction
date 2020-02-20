package house;
import java.util.*;
public class Standard 
{
	float area; 
	Scanner s=new Scanner(System.in);
	public Standard(float area)
	{
	this.area=area;
	}
	public void result()
	{
		float cost_of_construction=(1200 * area);
		System.out.format("%s","The cost of construction is: Rs."+cost_of_construction);
	}

}
