public class Team {
    String name;
    Competitor[] competitors;
    private int countwin = 0;
    public Team(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    void ShowWinners() {
        for (Competitor comp : competitors) {
            if (comp.OnDistance()) {
                countwin++;
                comp.info();
            }
        }
        System.out.println();
        System.out.println();
    }

    void ShowLosers() {
        for (Competitor comp : competitors) {
            if (!comp.OnDistance()) {
                comp.info();
            }
        }
        System.out.println();
        System.out.println();
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public int getCountWin() {
        return countwin;
    }

    public String getName() {
        return name;
    }
}


