// Ball - Abstract class
abstract class Ball {

    // attributs
    protected int radius;
    protected String colour;
    protected int weight;
    protected String game;

    // overriding example
    protected String xzy = "xyz-ball";

    // encapluation example
    private String brand;
    private double price;

	public Ball(int radius, String colour, int weight, String game)
	{
        this.radius = radius;
        this.colour = colour;
        this.weight = weight;
        this.game   = game;
	}

    public double getPrice() {
        return price;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Ball() {
    }

    // methods
    public void bounce(int speed)
    {

        // calculate the total bounce back and bounce direction based on
        // speed, gravity and weight.

        // then bounce the ball 

    }

    public void spin(int totalRevolution)
    {
        // based on the revolution and direction determine the
        // spin and spin the ball
    }

    public void roll(int speed)
    {
        // calculate the total distance for the ball to travel 
        // based on speed and gravity and surface of the ball and
        // ground
    }

    public abstract void collissionEffect(int force, String surface);

}


// Football - concrete class
class Football extends Ball {

    // overriding
    public String xzy = "xyz-football";

    // 
    public Football(int radius, String colour, int weight)
    {
        super(radius, colour, weight, "Football");
    }

    // overloading
    public Football(){
        super();
    }

    @Override
    public void collissionEffect(int force, String surface) {
        // TODO Auto-generated method stub

    }

}

class Example1{

    public static void main(String[] args) {
        
        Ball ball = new Football(40, "green", 800);
        System.out.println(ball.xzy);
        ball.bounce(80);

        ball.setBrand("Nivea");
        ball.setPrice(2500.2);

        System.out.println(ball.getBrand() + " football costs " + ball.getPrice() + "rs");


    }

}