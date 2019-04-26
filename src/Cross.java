public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void DoIt(Competitor competitor) {
        competitor.run(dist);
    }
}

