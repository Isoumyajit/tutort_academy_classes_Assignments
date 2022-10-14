package week_8;

public class ifAstraightLine {
    public boolean checkStraightLine(int[][] coordinates) {

        int len = coordinates.length;
        if (len == 2)
            return true;
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        int dx = x2 - x1;
        int dy = y2 - y1;
        for (int i = 2; i < len; i++) {
            if (dy * (coordinates[i][0] - x2) != dx * (coordinates[i][1] - y2))
                return false;
        }

        return true;
    }
}
