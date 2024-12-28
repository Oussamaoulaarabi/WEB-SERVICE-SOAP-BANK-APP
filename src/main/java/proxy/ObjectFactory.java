
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Conversion_QNAME = new QName("http://banque/", "conversion");
    private static final QName _ConversionResponse_QNAME = new QName("http://banque/", "conversionResponse");
    private static final QName _Getcompte_QNAME = new QName("http://banque/", "getcompte");
    private static final QName _GetcompteResponse_QNAME = new QName("http://banque/", "getcompteResponse");
    private static final QName _Getlistcompte_QNAME = new QName("http://banque/", "getlistcompte");
    private static final QName _GetlistcompteResponse_QNAME = new QName("http://banque/", "getlistcompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     * @return
     *     the new instance of {@link Conversion }
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     * @return
     *     the new instance of {@link ConversionResponse }
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link Getcompte }
     * 
     * @return
     *     the new instance of {@link Getcompte }
     */
    public Getcompte createGetcompte() {
        return new Getcompte();
    }

    /**
     * Create an instance of {@link GetcompteResponse }
     * 
     * @return
     *     the new instance of {@link GetcompteResponse }
     */
    public GetcompteResponse createGetcompteResponse() {
        return new GetcompteResponse();
    }

    /**
     * Create an instance of {@link Getlistcompte }
     * 
     * @return
     *     the new instance of {@link Getlistcompte }
     */
    public Getlistcompte createGetlistcompte() {
        return new Getlistcompte();
    }

    /**
     * Create an instance of {@link GetlistcompteResponse }
     * 
     * @return
     *     the new instance of {@link GetlistcompteResponse }
     */
    public GetlistcompteResponse createGetlistcompteResponse() {
        return new GetlistcompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "getcompte")
    public JAXBElement<Getcompte> createGetcompte(Getcompte value) {
        return new JAXBElement<>(_Getcompte_QNAME, Getcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "getcompteResponse")
    public JAXBElement<GetcompteResponse> createGetcompteResponse(GetcompteResponse value) {
        return new JAXBElement<>(_GetcompteResponse_QNAME, GetcompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getlistcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getlistcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "getlistcompte")
    public JAXBElement<Getlistcompte> createGetlistcompte(Getlistcompte value) {
        return new JAXBElement<>(_Getlistcompte_QNAME, Getlistcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetlistcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetlistcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://banque/", name = "getlistcompteResponse")
    public JAXBElement<GetlistcompteResponse> createGetlistcompteResponse(GetlistcompteResponse value) {
        return new JAXBElement<>(_GetlistcompteResponse_QNAME, GetlistcompteResponse.class, null, value);
    }

}
