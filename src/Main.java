public class Main {
    public static void main(String[] args) {

        Course c1 = new Course(new Obstacle[]
                {new Wall(2),new Cross(100)});

        Course c2 = new Course(new Obstacle[]
                {new Wall(6),new Cross(30),new Water(40), new Cross(30)});

        Team t1 = new Team("Отчаянные",new Competitor[]
                {new Cat("Пушок"), new Cat("Барсик"), new Dog("Алый"), new Rabbit("Ушастик"),
                        new Human("Семен Семеныч", 60,2,50)});

        Team t2 = new Team("Неустрашимые", new Competitor[]
                {new Human("Сидор Матрасыч", 100,10,100),
                new Dog("Шарик"), new Dog("Барбос"), new Dog("Смирный")});

        c1.DoIt(t1);
        c1.DoIt(t2);
        t1.ShowWinners();
        t2.ShowWinners();
        t1.ShowLosers();
        t2.ShowLosers();
        c1.Won(t1, t2);
    }
}
