
package team1_scrum4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Team1_Cat_APIDelegate", targetNamespace = "http://Team1_scrum4/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Team1CatAPIDelegate {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns team1_scrum4.Team1Cat
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCat", targetNamespace = "http://Team1_scrum4/", className = "team1_scrum4.CreateCat")
    @ResponseWrapper(localName = "createCatResponse", targetNamespace = "http://Team1_scrum4/", className = "team1_scrum4.CreateCatResponse")
    @Action(input = "http://Team1_scrum4/Team1_Cat_APIDelegate/createCatRequest", output = "http://Team1_scrum4/Team1_Cat_APIDelegate/createCatResponse")
    public Team1Cat createCat(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

}
