package Abstract;

public abstract class IndoorSports implements Sports {
    public abstract String getStadium();

    @Override
    public String getSportName() {
        return "IndoorSport";
    }
}
