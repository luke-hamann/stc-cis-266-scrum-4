package Team1_scrum4;

public class Team1_Cat_API {
	public Team1_Cat createCat(String name, String color, double weight) {
		try {
			Team1_Cat cat = new Team1_Cat(name, color, weight);
			return cat;
		} catch(Exception err) {
			Team1_Cat cat = new Team1_Cat(err.toString());
			return cat;
		}
	}
}
