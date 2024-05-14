public class AFLTeamMember 
{
String name;
String position;
public AFLTeamMember(String name, String position) 
{
this.name = name;
this.position = position;
}
public AFLTeamMember()
{
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public String getPosition() 
{
return position;
}
public void setPosition(String position) 
{
if(position.equals("FB") || position.equals("HB") || position.equals("C") || position.equals("HF") || 
position.equals("FF") || position.equals("FOL") || position.equals("IC") || position.equals("COACH"))
{
this.position = position;
}        
}
@Override
public String toString() 
{
return name + ", " + position.toUpperCase() + '}';
}
}
