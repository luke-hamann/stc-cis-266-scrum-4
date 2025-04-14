
package team1_scrum4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team1_scrum4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateCat_QNAME = new QName("http://Team1_scrum4/", "createCat");
    private final static QName _CreateCatResponse_QNAME = new QName("http://Team1_scrum4/", "createCatResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team1_scrum4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCat }
     * 
     */
    public CreateCat createCreateCat() {
        return new CreateCat();
    }

    /**
     * Create an instance of {@link CreateCatResponse }
     * 
     */
    public CreateCatResponse createCreateCatResponse() {
        return new CreateCatResponse();
    }

    /**
     * Create an instance of {@link Team1Cat }
     * 
     */
    public Team1Cat createTeam1Cat() {
        return new Team1Cat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Team1_scrum4/", name = "createCat")
    public JAXBElement<CreateCat> createCreateCat(CreateCat value) {
        return new JAXBElement<CreateCat>(_CreateCat_QNAME, CreateCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Team1_scrum4/", name = "createCatResponse")
    public JAXBElement<CreateCatResponse> createCreateCatResponse(CreateCatResponse value) {
        return new JAXBElement<CreateCatResponse>(_CreateCatResponse_QNAME, CreateCatResponse.class, null, value);
    }

}
