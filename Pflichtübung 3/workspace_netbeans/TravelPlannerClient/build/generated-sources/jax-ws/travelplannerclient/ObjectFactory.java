
package travelplannerclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the travelplannerclient package. 
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

    private final static QName _CalculateTravel_QNAME = new QName("http://travelplanner/", "calculateTravel");
    private final static QName _CalculateTravelResponse_QNAME = new QName("http://travelplanner/", "calculateTravelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: travelplannerclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateTravel }
     * 
     */
    public CalculateTravel createCalculateTravel() {
        return new CalculateTravel();
    }

    /**
     * Create an instance of {@link CalculateTravelResponse }
     * 
     */
    public CalculateTravelResponse createCalculateTravelResponse() {
        return new CalculateTravelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTravel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travelplanner/", name = "calculateTravel")
    public JAXBElement<CalculateTravel> createCalculateTravel(CalculateTravel value) {
        return new JAXBElement<CalculateTravel>(_CalculateTravel_QNAME, CalculateTravel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTravelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travelplanner/", name = "calculateTravelResponse")
    public JAXBElement<CalculateTravelResponse> createCalculateTravelResponse(CalculateTravelResponse value) {
        return new JAXBElement<CalculateTravelResponse>(_CalculateTravelResponse_QNAME, CalculateTravelResponse.class, null, value);
    }

}
