package Abstract;

public class Chess extends IndoorSports {

    @Override
    public String getStadium() {
        return "NTR Stadium";
    }

    @Override
    public String getSportName() {
        return "Chess";
    }

    public String performCheckmate() {
        return "Checkmate";
    }

}
