
public class BreakName {
	public static String convertName(String name)
{
    String lastname = "";
    String firstname = "";
    for(int i = 0; i < name.length(); i++)

    {
        if(name.charAt(i) == ' ')

        {
            lastname = name.substring(i + 1);

            firstname = name.substring(0, i);    

        }
    }
    return lastname + ", " + firstname;
}

}
