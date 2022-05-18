class Racetrack
{
	public static void main(String args[])
	{
	Car c1 = new Car(1,"Honda",300);
	System.out.println(c1.getYear() + " " + c1.getMake() + " " + c1.getSpeed());
	c1.accelerate();
	c1.accelerate();
	System.out.println(c1.getSpeed());
	}
}