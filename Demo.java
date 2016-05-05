import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Demo
{
	public static void main(String [] args)
	{
		String line="hi this is 300 d";
		String pat="(.*)(\\d+)(.*)";
		Pattern r=Pattern.compile(pat);
		Matcher m=r.matcher(line);
		if(m.find())
		{
			System.out.println("found : "+m.group(0));
			System.out.println("found : "+m.group(1));
			System.out.println("found : "+m.group(2));
		}
		else 
			System.out.println("no");
	}
}