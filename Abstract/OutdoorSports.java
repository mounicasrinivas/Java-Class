package Abstract;

public abstract class OutdoorSports implements Sports {
    public abstract String getStadium();;

    @Override
    public String getSportName() {
        return "OutdoorSport";
    }
}
