AFL Match Simulator in Java

The provided Java program simulates an Australian Football League (AFL) match between two teams. Here's a detailed summary of the program:

1. Classes and Structure:
   - The program consists of three classes: `AFLMatch`, `AFLTeam`, and `AFLPlayer`.
   - `AFLMatch` represents a single match between two teams, tracking the scores and facilitating match simulation.
   - `AFLTeam` represents an AFL team, storing team information such as name, coach, and lineup.
   - `AFLPlayer` represents a player, storing player details like name, position, and whether they are a captain.

2. Input Handling:
   - The program takes two input files as command-line arguments, containing data for the home team and away team.
   - Each input file contains the team name, coach information, and player lineup.
   - The program reads the input files, parses the data, and creates `AFLTeam` objects for each team.

3. Match Simulation:
   - The match simulation occurs interactively through console input.
   - Users input which team scores (home or away) and whether it's a goal or behind for each scoring event.
   - The match continues until the user decides it's full time (by entering 'f').
   - Scores are updated accordingly for each team based on the user's input.

4. Result Printing:
   - After the match simulation concludes, the program calculates and prints the result.
   - It determines the winning team or if it's a draw based on the final scores.

5. Error Handling:
   - The program includes basic error handling for file reading and input validation.
   - It notifies users of any errors encountered during execution.

6. Usability and Interactivity:
   - The program provides a simple yet interactive way to simulate AFL matches.
   - Users can easily understand and interact with the simulation through console prompts and input.
