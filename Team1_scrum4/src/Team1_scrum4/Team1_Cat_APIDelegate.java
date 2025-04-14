package Team1_scrum4;

import javax.jws.WebService;


@WebService (targetNamespace="http://Team1_scrum4/", serviceName="Team1_Cat_APIService", portName="Team1_Cat_APIPort")
public class Team1_Cat_APIDelegate{

    Team1_scrum4.Team1_Cat_API _team1_Cat_API = null;

    public Team1_Cat createCat (String name, String color, double weight) {
        return _team1_Cat_API.createCat(name,color,weight);
    }

    public Team1_Cat_APIDelegate() {
        _team1_Cat_API = new Team1_scrum4.Team1_Cat_API(); }

}