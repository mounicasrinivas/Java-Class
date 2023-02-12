package Abstract;

public class TestSports {
    public static void main(String[] args) {
        Sports c = fetchSportFromOlympic(1);
        System.out.println(c.getSportName());
        // c.performCheckmate();
    }

    public static Sports fetchSportFromOlympic(int i) {
        if (i == 1) {
            return new Chess();
        } else if (i == 2) {
            return new Cricket();
        }
        return new Chess();
    }
}
