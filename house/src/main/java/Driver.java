import house.Standard;
import house.Abovestandard;
import house.Highstandard;
import house.Automation;
import java.util.*;
public class Driver {

		public static void main(String[] args) 
		{
			int automation=0;
			System.out.format("%s","Enter the material standard(1: standard,2:above standard or 3:high standard)");
			Scanner s=new Scanner(System.in);
			int material=s.nextInt(); 
			if(material==3)
			{
			System.out.format("%s","Enter if you want the house to be fully automated: 1:yes or 2:no");
			automation=s.nextInt();
			}
			System.out.format("%s","Enter the area of the house in squarefeets");
			float area=s.nextFloat();
			if(material==1)
			{
				Standard obj1=new Standard(area);
				obj1.result();
			}
			if(material==2)
			{
				Abovestandard obj2=new Abovestandard(area);
				obj2.result();
			}
			if(material==3)
			{
				Highstandard obj3=new Highstandard(area);
				obj3.result();
			}
			if(material==1 && automation==1)
			{
				Automation obj4=new Automation(area);
				obj4.result();
			}
		}
}
