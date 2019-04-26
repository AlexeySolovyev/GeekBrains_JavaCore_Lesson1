public class Human implements Competitor{
    protected String name;
    protected String type;

    protected int maxDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected Boolean onDist=true;

    public Human(String name, int maxDistance, int maxjumpheight, int maxSwimDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxjumpheight;
        this.maxSwimDistance = maxSwimDistance;
    }
    @Override
    public void run(int dist) {
        if (dist <= maxDistance)
            System.out.println(name + " успешно пробежал кросс");
        else {
            onDist = false;
            System.out.println(name + " не смог пробежать кросс");
        }
    }
    @Override
    public void jump(int height)
    {
        if (height <= maxJumpHeight)
            System.out.println(name + " успешно перепрыгнул препятствие");
        else
        {
            onDist=false;
            System.out.println(name + " не смог перепрыгнуть препятствие");
        }
    }

    @Override
    public void swim(int dist)
    {
        if (dist <= maxSwimDistance)
            System.out.println(name + " успешно проплыл дистанцию");
        else
        {
            onDist=false;
            System.out.println(name + " не смог переплыть дистанцию");
        }
    }

    @Override
    public void info() {
        if (onDist)
            System.out.println(name + " прошел полосу!");
        else System.out.println(name + " не смог пройти полосу");
    }

    @Override
    public boolean OnDistance() {
        return onDist;
    }
}

