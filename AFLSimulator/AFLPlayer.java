public class AFLPlayer extends AFLTeamMember 
{
int number;
String captain;
public AFLPlayer() 
{
}
public AFLPlayer(int number, String captain, String name, String position) 
{
super(name, position);
this.number = number;
this.captain = captain;
}
public int getNumber() 
{
return number;
}
public void setNumber(int number) 
{
if(number>0)
{
this.number = number;
}
else
{
System.err.println("The positive value is required");
}
}
public String getCaptain() 
{
return captain;
}
public void setTeamCaptain(String captain) 
{
if(captain.equals("C"))
{
this.captain = captain;
}
}
@Override
public String toString() 
{
if (captain.equals("C")) 
{
return "["+number+"] " + name + ", " + position + "( " + captain+")";
} 
else 
{
return "["+number+"] " + name + ", " + position;
}
}
}