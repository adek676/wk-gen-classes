package pl.gov.coi.login.artifactresolutionservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2023-09-06T09:51:49.448+02:00
 * Generated source version: 3.5.1
 *
 */
@WebServiceClient(name = "ArtifactResolutionService",
                  wsdlLocation = "file:/home/adecode/IdeaProjects/jaxb-test/src/main/resources/wsdl/wk/wk-artifact-resolve.wsdl",
                  targetNamespace = "http://www.coi.gov.pl/login/ArtifactResolutionService")
public class ArtifactResolutionService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.coi.gov.pl/login/ArtifactResolutionService", "ArtifactResolutionService");
    public final static QName ArtifactResolutionServicePort = new QName("http://www.coi.gov.pl/login/ArtifactResolutionService", "ArtifactResolutionServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/adecode/IdeaProjects/jaxb-test/src/main/resources/wsdl/wk/wk-artifact-resolve.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ArtifactResolutionService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/adecode/IdeaProjects/jaxb-test/src/main/resources/wsdl/wk/wk-artifact-resolve.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ArtifactResolutionService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ArtifactResolutionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ArtifactResolutionService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns ArtifactResolutionServiceInterface
     */
    @WebEndpoint(name = "ArtifactResolutionServicePort")
    public ArtifactResolutionServiceInterface getArtifactResolutionServicePort() {
        return super.getPort(ArtifactResolutionServicePort, ArtifactResolutionServiceInterface.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ArtifactResolutionServiceInterface
     */
    @WebEndpoint(name = "ArtifactResolutionServicePort")
    public ArtifactResolutionServiceInterface getArtifactResolutionServicePort(WebServiceFeature... features) {
        return super.getPort(ArtifactResolutionServicePort, ArtifactResolutionServiceInterface.class, features);
    }

}