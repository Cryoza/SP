package application;

import java.util.ArrayList;

/**
 * A class containing a list of player objects @ author Simon Emmanuel @ version
 * 1.0
 */
public class ProgramMediator {
	private MatchesList matchesList;
	private PlayerList playerList;
	private PlayersAdapter playerAdapter;
	private MatchesAdapter matchesAdapter;

	/**
    * Adds a player to the Player list
    * 
    * @param name     the name to add to the new player object
    * @param number   the number to add to the new player object
    * @param position the position to add to the new player object
    */
   public void addPlayer(String name, int number, char position) {
      playerList.addPlayer(new Player(name, number, position));
      
      playerAdapter.savePlayers(playerList);
   }

   /**
    * remove a player from the list
    * 
    * @param player the player to remove from the list
    */
   public void removePlayer(Player player) {
      playerList.removePlayer(player);
      
      playerAdapter.savePlayers(playerList);
   }

   /**
    * @return all player objects in player list
    */
   public PlayerList getAllPlayers() {
      return playerList;
   }

   /**
    * Gets a player with String name from the List
    * 
    * @param name the name in the list of the Player Object
    * @return the player with name if one exists, else return null
    */
   public Player getPlayerByName(String name) {
      return playerList.getPlayerByName(name);
   }

   /**
    * Gets player objects by char position from the List
    * 
    * @param position the position in the list of the Player Object
    * @return the players at position if one exists, else return null
    */
   public ArrayList<Player> getPlayersByPosition(char position) {
      return playerList.getPlayersByPosition(position);
   }
   /**
    * Creates a player object.
    * @param player
    */
   public void addPlayer(Player player) {    
      playerList.addPlayer(player);

      playerAdapter.savePlayers(playerList);
   }
   /**
    *  returns a player object by index in PlayerList
    * @param index
    * @return player object from PlayerList
    */
   public Player getPlayer(int index)
   {
      return playerList.getPlayer(index);
   }
   /**
    *  returns a player object by number in PlayerList
    * @param number
    * @return player object from PlayerList
    */
   public Player getPlayerByNumber(int number)
   {
      return playerList.getPlayerbyNumber(number);
   }
   public void addMatch(Match match)
   {
      matchesList.addMatch(match);
      
      matchesAdapter.savePlayers(matchesList);
   }
   public int getNumberOfMatches()
   {
      return matchesList.getNumberOfMatches();
   }
   public ArrayList<Match> getAllMatches()
   {
      return matchesList.getAllMatches();
   }
   public ArrayList<Match> getAllUpcomingMatches()
   {
      return matchesList.getAllUpcomingMatches();
   }
   public ArrayList<Match> getAllPastMatches()
   {
      return matchesList.getAllPastMatches();
   }
   public ArrayList<Match> getMatchByType(String type)
   {
      return matchesList.getMatchesByType(type);
   }
   public ArrayList<Match> getMatchByPlace(String place)
   {
      return matchesList.getMatchesByPlace(place);
   }
   public ArrayList<Match> getMatchByOpponent(String opponent)
   {
      return matchesList.getMatchesByOpponent(opponent);
   }
   public ArrayList<Match> getMatchByDate(MyDate date)
   {
      return matchesList.getMatchByDate(date);
   }
   public void removeMatch(Match match)
   {
      matchesList.removeMatch(match);
      
      matchesAdapter.savePlayers(matchesList);
   }

}
