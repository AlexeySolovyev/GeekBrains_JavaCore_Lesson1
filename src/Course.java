public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] ob) {
        this.obstacles = ob;
    }
    public void DoIt(Team t)
    {
        Competitor[] com= t.getCompetitors();
        for(Competitor c: com)
        {
            for(Obstacle o: obstacles) {
                o.DoIt(c);
            }
            System.out.println();
            System.out.println();
        }
    }
    public void Won(Team t1, Team t2) {

        System.out.println("Счет: " + t1.getCountWin() + " " + t2.getCountWin());

        if (t1.getCountWin() > t2.getCountWin()) {
            System.out.println("Победила команда '" + t1.getName() + "'!!");
        }
        else if (t1.getCountWin() < t2.getCountWin()) {
            System.out.println("Победила команда '" + t2.getName() + "'!!");
        }
        else System.out.println("Ничья!");
    }
}

