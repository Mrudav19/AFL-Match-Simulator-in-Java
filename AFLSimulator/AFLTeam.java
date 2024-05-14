public class AFLTeam 
{
AFLTeamMember teamMember;
AFLPlayer player;
public AFLTeam() 
{
teamMember = new AFLTeamMember();
player = new AFLPlayer();
}
public AFLTeamMember getTeamMember() 
{
return teamMember;
}
public void setTeamMember(AFLTeamMember teamMember) 
{
this.teamMember = teamMember;
}
public AFLPlayer getPlayer() 
{
return player;
}
public void setTeamPlayer(AFLPlayer player) 
{
this.player = player;
}
@Override
public String toString() 
{
if (player.getCaptain()!= null) 
{
return "["+player.getNumber()+"]"+ player.getName()+ ", " + player.getPosition()+ "(" + player.getCaptain()+")";
} 
else 
{
return "["+player.getNumber()+"]" + player.getName()+ ", " + player.getPosition();
}
}
}