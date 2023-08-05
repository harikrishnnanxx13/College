public class Rallyracing extends players {
    String Experience;
    String PlayerID;
    String Record;

    String Style;

    public Rallyracing(String position) {
        new players();
        super.PlayerID = this.PlayerID;
        this.Experience = Experience;
    }

    public Rallyracing(String position, String style) {
        new players();
        super.PlayerID = this.PlayerID;
        this.Record = Record;
    }


    public String toString() {
        return "{\nPlayerID = " + this.PlayerID + "\nName = " + this.Name + "\nClass =" + this.team_name +  "\nDivision =" + this.Division + "\nExperience =" + this.Experience + "\nrecord =" + this.Record + "\n}";
    }
}
