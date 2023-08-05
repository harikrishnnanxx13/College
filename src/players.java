public class players {
    String PlayerID;
    String Name;
    String Branch;
    String Sport;
    String Division;

    String team_name;

    public players() {
        this.PlayerID = this.PlayerID;
        this.Name = this.Name;
        this.Branch = this.Branch;
        this.Sport = "Rally racing";
        this.Division = this.Division;
        this.team_name = this.team_name;
    }

    public String getPlayerID() {
        return this.PlayerID;
    }

    public void setPlayerID(String PlayerID) {
        PlayerID = this.getPlayerID();
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBranch() {
        return this.Branch;
    }

    public void setBranch(String Branch) {
        Branch = this.getBranch();
    }

    public String getSport() {
        return this.Sport;
    }

    public void setSport(String sport) {
        this.Sport = sport;
    }

    public String getDivision() {
        return this.Division;
    }

    public void setTeam_name(String teamname) {
        this.team_name = team_name;
    }

    public String getTeam_name() {
        return this.team_name;
    }

    public void setDivision(String division) {
        this.Division = division;
    }


    public String toString() {
        return "{\nPlayerID = " + this.PlayerID + "\nName = " + this.Name + "\nClass =" + this.Branch + "\nSport =" + this.Sport + "\nDivision =" + this.Division + "\nteam_name="+this.team_name+ "\n}";
    }
}
