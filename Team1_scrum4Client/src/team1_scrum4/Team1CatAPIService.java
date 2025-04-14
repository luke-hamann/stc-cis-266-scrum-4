
package team1_scrum4;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "Team1_Cat_APIService", targetNamespace = "http://Team1_scrum4/", wsdlLocation = "WEB-INF/wsdl/Team1CatAPIService.wsdl")
public class Team1CatAPIService
    extends Service
{

    private final static URL TEAM1CATAPISERVICE_WSDL_LOCATION;
    private final static WebServiceException TEAM1CATAPISERVICE_EXCEPTION;
    private final static QName TEAM1CATAPISERVICE_QNAME = new QName("http://Team1_scrum4/", "Team1_Cat_APIService");

    static {
            TEAM1CATAPISERVICE_WSDL_LOCATION = team1_scrum4.Team1CatAPIService.class.getResource("/WEB-INF/wsdl/Team1CatAPIService.wsdl");
        WebServiceException e = null;
        if (TEAM1CATAPISERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/Team1CatAPIService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        TEAM1CATAPISERVICE_EXCEPTION = e;
    }

    public Team1CatAPIService() {
        super(__getWsdlLocation(), TEAM1CATAPISERVICE_QNAME);
    }

    public Team1CatAPIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEAM1CATAPISERVICE_QNAME, features);
    }

    public Team1CatAPIService(URL wsdlLocation) {
        super(wsdlLocation, TEAM1CATAPISERVICE_QNAME);
    }

    public Team1CatAPIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEAM1CATAPISERVICE_QNAME, features);
    }

    public Team1CatAPIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Team1CatAPIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Team1CatAPIDelegate
     */
    @WebEndpoint(name = "Team1_Cat_APIPort")
    public Team1CatAPIDelegate getTeam1CatAPIPort() {
        return super.getPort(new QName("http://Team1_scrum4/", "Team1_Cat_APIPort"), Team1CatAPIDelegate.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Team1CatAPIDelegate
     */
    @WebEndpoint(name = "Team1_Cat_APIPort")
    public Team1CatAPIDelegate getTeam1CatAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Team1_scrum4/", "Team1_Cat_APIPort"), Team1CatAPIDelegate.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEAM1CATAPISERVICE_EXCEPTION!= null) {
            throw TEAM1CATAPISERVICE_EXCEPTION;
        }
        return TEAM1CATAPISERVICE_WSDL_LOCATION;
    }

}
