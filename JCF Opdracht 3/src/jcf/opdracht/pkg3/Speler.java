
package jcf.opdracht.pkg3;

/**s
 *
 * @author marouano
 */
public class Speler {
    public String gameName;
    public String teamName;
    public String userName;
    public int kills;
    public int deaths;
    public int assists;
    
    public Speler(String gameName, String teamName, String username, int kills,
            int deaths, int assists) {
        this.gameName = gameName;
        this.teamName = teamName;
        this.userName = username;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }
    
    public String getKDA()
    {
        return kills + "/" + deaths + "/" + assists;
    }
}
