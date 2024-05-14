import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AFLMatch 
{
int homeGoals;
int homeBehinds;
int awayGoals;
int awayBehinds;
File teamFile;
BufferedReader teamReader;
String lines = null;
int i = 0;
public static void main(String[] args) throws FileNotFoundException, IOException 
{
Scanner sc = new Scanner(System.in);
AFLMatch match =new AFLMatch();
match.home(args[0]);
match.away(args[1]);
double home = 0.0, away = 0.0;
int homeGoal = 0, awayGoal = 0;
while (true) 
{
System.out.print("Which team scored? ");
String value = sc.nextLine();
if (value.equals("h") || value.equals("a") || value.equals("f")) 
{
switch (value) 
{
case "h":
System.out.print("Goal or behind? ");
String ans = sc.nextLine(); 
if (ans.equals("b") || ans.equals("g")) 
{
if (ans.equals("b")) 
{
home = home + 0.1;
homeGoal++;
} else 
{
home = home + 1.0;
homeGoal = homeGoal + 6;
}
} else 
{
System.err.println("Invalid input"); 
break;
}
break;
case "a":
System.out.print("Goal or behind? ");
ans = sc.nextLine();
if (ans.equals("b") || ans.equals("g")) 
{ 
if (ans.equals("b")) 
{
away = away + 0.1;
awayGoal++;
} else 
{
away = away + 1.0;
awayGoal = awayGoal + 6;
}
} else 
{
System.err.println("Invalid input");
break;
}
break;
case "f":
if (homeGoal > awayGoal) 
{ 
System.out.println("Melbourne Demons " + home + "(" + homeGoal + ") defeted Western Bulldogs " + away + " (" + awayGoal + ").");
} 
else 
{
System.out.println("Western Bulldogs " + away + "(" + awayGoal + ")" + "Melbourne Demons " + home + " (" + homeGoal + ").");
}
System.exit(0);
break;
}
}
else 
{
System.err.println("Invalid input");
}
System.out.print("The current score is " + home + " (" + homeGoal + ") to " + away + " (" + awayGoal + ").");
if (value.equals("h") || value.equals("a") || value.equals("f")) 
{
} 
else if (value.equals("f")) 
{
break;
} 
else 
{
System.out.println("Invalid input");
break;
}
System.out.println();
}
}
public void home(String args) throws FileNotFoundException, IOException 
{
teamFile = new File("MelbourneDemons.txt");
teamReader = new BufferedReader(new FileReader(teamFile));
AFLTeam[] home = new AFLTeam[24];
while ((lines = teamReader.readLine()) != null) 
{  
String[] split = lines.split(",");
home[i] = new AFLTeam();
if (split.length > 1) 
{
if (split.length == 2) 
{
AFLPlayer player = new AFLPlayer();
player.setName(split[0]);
player.setPosition(split[1]);
home[i].setTeamPlayer(player);
} 
else if (split.length > 3) 
{
AFLPlayer player = new AFLPlayer(Integer.parseInt(split[0]), split[3], split[1], split[2]);
home[i].setTeamPlayer(player);
} 
else 
{
AFLPlayer player = new AFLPlayer(Integer.parseInt(split[0]), null, split[1], split[2]);
home[i].setTeamPlayer(player);
}
}
i++;
}
if (i < 22) 
{
System.err.println("Not enough players in the home team.");
}
}
public void away(String args) throws FileNotFoundException, IOException 
{
teamFile = new File("WesternBulldogs.txt");
teamReader = new BufferedReader(new FileReader(teamFile));
i = 0;
lines = null;
AFLTeam[] away = new AFLTeam[24];
while ((lines = teamReader.readLine()) != null) 
{
String[] split = lines.split(",");
away[i] = new AFLTeam();
if (split.length > 1) 
{
if (split.length == 2) 
{
AFLPlayer play = new AFLPlayer();
play.setName(split[0]);
play.setPosition(split[1]);
away[i].setTeamPlayer(play);
}
else if (split.length > 3) 
{
AFLPlayer play = new AFLPlayer(Integer.parseInt(split[0]), split[3], split[1], split[2]);
away[i].setTeamPlayer(play);
} else 
{
AFLPlayer play = new AFLPlayer(Integer.parseInt(split[0]), null, split[1], split[2]);
away[i].setTeamPlayer(play);
}
}
i++;
}
if (i < 22) 
{
System.err.println("Not enough players in the away team.");
}
}
}