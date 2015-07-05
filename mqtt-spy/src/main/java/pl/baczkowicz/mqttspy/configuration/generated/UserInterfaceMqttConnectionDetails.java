//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.05 at 09:29:59 PM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import pl.baczkowicz.mqttspy.common.generated.MessageLog;
import pl.baczkowicz.mqttspy.common.generated.MqttConnectionDetails;
import pl.baczkowicz.mqttspy.common.generated.PublicationDetails;
import pl.baczkowicz.mqttspy.common.generated.ScriptDetails;


/**
 * <p>Java class for UserInterfaceMqttConnectionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInterfaceMqttConnectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}MqttConnectionDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Publication" type="{http://baczkowicz.pl/mqtt-spy/common}PublicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subscription" type="{http://baczkowicz.pl/mqtt-spy-configuration}TabbedSubscriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserAuthentication" type="{http://baczkowicz.pl/mqtt-spy-configuration}UserAuthenticationOptions" minOccurs="0"/&gt;
 *         &lt;element name="AutoOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Formatter" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="MinMessagesStoredPerTopic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxMessagesStored" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PublicationScripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchScripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackgroundScript" type="{http://baczkowicz.pl/mqtt-spy/common}ScriptDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MessageLog" type="{http://baczkowicz.pl/mqtt-spy/common}MessageLog" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInterfaceMqttConnectionDetails", propOrder = {
    "publication",
    "subscription",
    "userAuthentication",
    "autoOpen",
    "autoConnect",
    "autoSubscribe",
    "formatter",
    "minMessagesStoredPerTopic",
    "maxMessagesStored",
    "publicationScripts",
    "searchScripts",
    "backgroundScript",
    "messageLog"
})
public class UserInterfaceMqttConnectionDetails
    extends MqttConnectionDetails
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Publication")
    protected List<PublicationDetails> publication;
    @XmlElement(name = "Subscription")
    protected List<TabbedSubscriptionDetails> subscription;
    @XmlElement(name = "UserAuthentication")
    protected UserAuthenticationOptions userAuthentication;
    @XmlElement(name = "AutoOpen", defaultValue = "true")
    protected Boolean autoOpen;
    @XmlElement(name = "AutoConnect", defaultValue = "false")
    protected Boolean autoConnect;
    @XmlElement(name = "AutoSubscribe", defaultValue = "false")
    protected Boolean autoSubscribe;
    @XmlElement(name = "Formatter")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object formatter;
    @XmlElement(name = "MinMessagesStoredPerTopic")
    protected Integer minMessagesStoredPerTopic;
    @XmlElement(name = "MaxMessagesStored")
    protected Integer maxMessagesStored;
    @XmlElement(name = "PublicationScripts")
    protected String publicationScripts;
    @XmlElement(name = "SearchScripts")
    protected String searchScripts;
    @XmlElement(name = "BackgroundScript")
    protected List<ScriptDetails> backgroundScript;
    @XmlElement(name = "MessageLog")
    protected MessageLog messageLog;

    /**
     * Default no-arg constructor
     * 
     */
    public UserInterfaceMqttConnectionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UserInterfaceMqttConnectionDetails(final List<PublicationDetails> publication, final List<TabbedSubscriptionDetails> subscription, final UserAuthenticationOptions userAuthentication, final Boolean autoOpen, final Boolean autoConnect, final Boolean autoSubscribe, final Object formatter, final Integer minMessagesStoredPerTopic, final Integer maxMessagesStored, final String publicationScripts, final String searchScripts, final List<ScriptDetails> backgroundScript, final MessageLog messageLog) {
        this.publication = publication;
        this.subscription = subscription;
        this.userAuthentication = userAuthentication;
        this.autoOpen = autoOpen;
        this.autoConnect = autoConnect;
        this.autoSubscribe = autoSubscribe;
        this.formatter = formatter;
        this.minMessagesStoredPerTopic = minMessagesStoredPerTopic;
        this.maxMessagesStored = maxMessagesStored;
        this.publicationScripts = publicationScripts;
        this.searchScripts = searchScripts;
        this.backgroundScript = backgroundScript;
        this.messageLog = messageLog;
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationDetails }
     * 
     * 
     */
    public List<PublicationDetails> getPublication() {
        if (publication == null) {
            publication = new ArrayList<PublicationDetails>();
        }
        return this.publication;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabbedSubscriptionDetails }
     * 
     * 
     */
    public List<TabbedSubscriptionDetails> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<TabbedSubscriptionDetails>();
        }
        return this.subscription;
    }

    /**
     * Gets the value of the userAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthenticationOptions }
     *     
     */
    public UserAuthenticationOptions getUserAuthentication() {
        return userAuthentication;
    }

    /**
     * Sets the value of the userAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthenticationOptions }
     *     
     */
    public void setUserAuthentication(UserAuthenticationOptions value) {
        this.userAuthentication = value;
    }

    /**
     * Gets the value of the autoOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoOpen() {
        return autoOpen;
    }

    /**
     * Sets the value of the autoOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoOpen(Boolean value) {
        this.autoOpen = value;
    }

    /**
     * Gets the value of the autoConnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoConnect() {
        return autoConnect;
    }

    /**
     * Sets the value of the autoConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoConnect(Boolean value) {
        this.autoConnect = value;
    }

    /**
     * Gets the value of the autoSubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoSubscribe() {
        return autoSubscribe;
    }

    /**
     * Sets the value of the autoSubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoSubscribe(Boolean value) {
        this.autoSubscribe = value;
    }

    /**
     * Gets the value of the formatter property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFormatter() {
        return formatter;
    }

    /**
     * Sets the value of the formatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFormatter(Object value) {
        this.formatter = value;
    }

    /**
     * Gets the value of the minMessagesStoredPerTopic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinMessagesStoredPerTopic() {
        return minMessagesStoredPerTopic;
    }

    /**
     * Sets the value of the minMessagesStoredPerTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinMessagesStoredPerTopic(Integer value) {
        this.minMessagesStoredPerTopic = value;
    }

    /**
     * Gets the value of the maxMessagesStored property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMessagesStored() {
        return maxMessagesStored;
    }

    /**
     * Sets the value of the maxMessagesStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMessagesStored(Integer value) {
        this.maxMessagesStored = value;
    }

    /**
     * Gets the value of the publicationScripts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationScripts() {
        return publicationScripts;
    }

    /**
     * Sets the value of the publicationScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationScripts(String value) {
        this.publicationScripts = value;
    }

    /**
     * Gets the value of the searchScripts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchScripts() {
        return searchScripts;
    }

    /**
     * Sets the value of the searchScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchScripts(String value) {
        this.searchScripts = value;
    }

    /**
     * Gets the value of the backgroundScript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundScript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundScript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScriptDetails }
     * 
     * 
     */
    public List<ScriptDetails> getBackgroundScript() {
        if (backgroundScript == null) {
            backgroundScript = new ArrayList<ScriptDetails>();
        }
        return this.backgroundScript;
    }

    /**
     * Gets the value of the messageLog property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLog }
     *     
     */
    public MessageLog getMessageLog() {
        return messageLog;
    }

    /**
     * Sets the value of the messageLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLog }
     *     
     */
    public void setMessageLog(MessageLog value) {
        this.messageLog = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<PublicationDetails> thePublication;
            thePublication = (((this.publication!= null)&&(!this.publication.isEmpty()))?this.getPublication():null);
            strategy.appendField(locator, this, "publication", buffer, thePublication);
        }
        {
            List<TabbedSubscriptionDetails> theSubscription;
            theSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            strategy.appendField(locator, this, "subscription", buffer, theSubscription);
        }
        {
            UserAuthenticationOptions theUserAuthentication;
            theUserAuthentication = this.getUserAuthentication();
            strategy.appendField(locator, this, "userAuthentication", buffer, theUserAuthentication);
        }
        {
            Boolean theAutoOpen;
            theAutoOpen = this.isAutoOpen();
            strategy.appendField(locator, this, "autoOpen", buffer, theAutoOpen);
        }
        {
            Boolean theAutoConnect;
            theAutoConnect = this.isAutoConnect();
            strategy.appendField(locator, this, "autoConnect", buffer, theAutoConnect);
        }
        {
            Boolean theAutoSubscribe;
            theAutoSubscribe = this.isAutoSubscribe();
            strategy.appendField(locator, this, "autoSubscribe", buffer, theAutoSubscribe);
        }
        {
            Object theFormatter;
            theFormatter = this.getFormatter();
            strategy.appendField(locator, this, "formatter", buffer, theFormatter);
        }
        {
            Integer theMinMessagesStoredPerTopic;
            theMinMessagesStoredPerTopic = this.getMinMessagesStoredPerTopic();
            strategy.appendField(locator, this, "minMessagesStoredPerTopic", buffer, theMinMessagesStoredPerTopic);
        }
        {
            Integer theMaxMessagesStored;
            theMaxMessagesStored = this.getMaxMessagesStored();
            strategy.appendField(locator, this, "maxMessagesStored", buffer, theMaxMessagesStored);
        }
        {
            String thePublicationScripts;
            thePublicationScripts = this.getPublicationScripts();
            strategy.appendField(locator, this, "publicationScripts", buffer, thePublicationScripts);
        }
        {
            String theSearchScripts;
            theSearchScripts = this.getSearchScripts();
            strategy.appendField(locator, this, "searchScripts", buffer, theSearchScripts);
        }
        {
            List<ScriptDetails> theBackgroundScript;
            theBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            strategy.appendField(locator, this, "backgroundScript", buffer, theBackgroundScript);
        }
        {
            MessageLog theMessageLog;
            theMessageLog = this.getMessageLog();
            strategy.appendField(locator, this, "messageLog", buffer, theMessageLog);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UserInterfaceMqttConnectionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UserInterfaceMqttConnectionDetails that = ((UserInterfaceMqttConnectionDetails) object);
        {
            List<PublicationDetails> lhsPublication;
            lhsPublication = (((this.publication!= null)&&(!this.publication.isEmpty()))?this.getPublication():null);
            List<PublicationDetails> rhsPublication;
            rhsPublication = (((that.publication!= null)&&(!that.publication.isEmpty()))?that.getPublication():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publication", lhsPublication), LocatorUtils.property(thatLocator, "publication", rhsPublication), lhsPublication, rhsPublication)) {
                return false;
            }
        }
        {
            List<TabbedSubscriptionDetails> lhsSubscription;
            lhsSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            List<TabbedSubscriptionDetails> rhsSubscription;
            rhsSubscription = (((that.subscription!= null)&&(!that.subscription.isEmpty()))?that.getSubscription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscription", lhsSubscription), LocatorUtils.property(thatLocator, "subscription", rhsSubscription), lhsSubscription, rhsSubscription)) {
                return false;
            }
        }
        {
            UserAuthenticationOptions lhsUserAuthentication;
            lhsUserAuthentication = this.getUserAuthentication();
            UserAuthenticationOptions rhsUserAuthentication;
            rhsUserAuthentication = that.getUserAuthentication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userAuthentication", lhsUserAuthentication), LocatorUtils.property(thatLocator, "userAuthentication", rhsUserAuthentication), lhsUserAuthentication, rhsUserAuthentication)) {
                return false;
            }
        }
        {
            Boolean lhsAutoOpen;
            lhsAutoOpen = this.isAutoOpen();
            Boolean rhsAutoOpen;
            rhsAutoOpen = that.isAutoOpen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoOpen", lhsAutoOpen), LocatorUtils.property(thatLocator, "autoOpen", rhsAutoOpen), lhsAutoOpen, rhsAutoOpen)) {
                return false;
            }
        }
        {
            Boolean lhsAutoConnect;
            lhsAutoConnect = this.isAutoConnect();
            Boolean rhsAutoConnect;
            rhsAutoConnect = that.isAutoConnect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoConnect", lhsAutoConnect), LocatorUtils.property(thatLocator, "autoConnect", rhsAutoConnect), lhsAutoConnect, rhsAutoConnect)) {
                return false;
            }
        }
        {
            Boolean lhsAutoSubscribe;
            lhsAutoSubscribe = this.isAutoSubscribe();
            Boolean rhsAutoSubscribe;
            rhsAutoSubscribe = that.isAutoSubscribe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoSubscribe", lhsAutoSubscribe), LocatorUtils.property(thatLocator, "autoSubscribe", rhsAutoSubscribe), lhsAutoSubscribe, rhsAutoSubscribe)) {
                return false;
            }
        }
        {
            Object lhsFormatter;
            lhsFormatter = this.getFormatter();
            Object rhsFormatter;
            rhsFormatter = that.getFormatter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatter", lhsFormatter), LocatorUtils.property(thatLocator, "formatter", rhsFormatter), lhsFormatter, rhsFormatter)) {
                return false;
            }
        }
        {
            Integer lhsMinMessagesStoredPerTopic;
            lhsMinMessagesStoredPerTopic = this.getMinMessagesStoredPerTopic();
            Integer rhsMinMessagesStoredPerTopic;
            rhsMinMessagesStoredPerTopic = that.getMinMessagesStoredPerTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMessagesStoredPerTopic", lhsMinMessagesStoredPerTopic), LocatorUtils.property(thatLocator, "minMessagesStoredPerTopic", rhsMinMessagesStoredPerTopic), lhsMinMessagesStoredPerTopic, rhsMinMessagesStoredPerTopic)) {
                return false;
            }
        }
        {
            Integer lhsMaxMessagesStored;
            lhsMaxMessagesStored = this.getMaxMessagesStored();
            Integer rhsMaxMessagesStored;
            rhsMaxMessagesStored = that.getMaxMessagesStored();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxMessagesStored", lhsMaxMessagesStored), LocatorUtils.property(thatLocator, "maxMessagesStored", rhsMaxMessagesStored), lhsMaxMessagesStored, rhsMaxMessagesStored)) {
                return false;
            }
        }
        {
            String lhsPublicationScripts;
            lhsPublicationScripts = this.getPublicationScripts();
            String rhsPublicationScripts;
            rhsPublicationScripts = that.getPublicationScripts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicationScripts", lhsPublicationScripts), LocatorUtils.property(thatLocator, "publicationScripts", rhsPublicationScripts), lhsPublicationScripts, rhsPublicationScripts)) {
                return false;
            }
        }
        {
            String lhsSearchScripts;
            lhsSearchScripts = this.getSearchScripts();
            String rhsSearchScripts;
            rhsSearchScripts = that.getSearchScripts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchScripts", lhsSearchScripts), LocatorUtils.property(thatLocator, "searchScripts", rhsSearchScripts), lhsSearchScripts, rhsSearchScripts)) {
                return false;
            }
        }
        {
            List<ScriptDetails> lhsBackgroundScript;
            lhsBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            List<ScriptDetails> rhsBackgroundScript;
            rhsBackgroundScript = (((that.backgroundScript!= null)&&(!that.backgroundScript.isEmpty()))?that.getBackgroundScript():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backgroundScript", lhsBackgroundScript), LocatorUtils.property(thatLocator, "backgroundScript", rhsBackgroundScript), lhsBackgroundScript, rhsBackgroundScript)) {
                return false;
            }
        }
        {
            MessageLog lhsMessageLog;
            lhsMessageLog = this.getMessageLog();
            MessageLog rhsMessageLog;
            rhsMessageLog = that.getMessageLog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageLog", lhsMessageLog), LocatorUtils.property(thatLocator, "messageLog", rhsMessageLog), lhsMessageLog, rhsMessageLog)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<PublicationDetails> thePublication;
            thePublication = (((this.publication!= null)&&(!this.publication.isEmpty()))?this.getPublication():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publication", thePublication), currentHashCode, thePublication);
        }
        {
            List<TabbedSubscriptionDetails> theSubscription;
            theSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscription", theSubscription), currentHashCode, theSubscription);
        }
        {
            UserAuthenticationOptions theUserAuthentication;
            theUserAuthentication = this.getUserAuthentication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userAuthentication", theUserAuthentication), currentHashCode, theUserAuthentication);
        }
        {
            Boolean theAutoOpen;
            theAutoOpen = this.isAutoOpen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoOpen", theAutoOpen), currentHashCode, theAutoOpen);
        }
        {
            Boolean theAutoConnect;
            theAutoConnect = this.isAutoConnect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoConnect", theAutoConnect), currentHashCode, theAutoConnect);
        }
        {
            Boolean theAutoSubscribe;
            theAutoSubscribe = this.isAutoSubscribe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoSubscribe", theAutoSubscribe), currentHashCode, theAutoSubscribe);
        }
        {
            Object theFormatter;
            theFormatter = this.getFormatter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatter", theFormatter), currentHashCode, theFormatter);
        }
        {
            Integer theMinMessagesStoredPerTopic;
            theMinMessagesStoredPerTopic = this.getMinMessagesStoredPerTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minMessagesStoredPerTopic", theMinMessagesStoredPerTopic), currentHashCode, theMinMessagesStoredPerTopic);
        }
        {
            Integer theMaxMessagesStored;
            theMaxMessagesStored = this.getMaxMessagesStored();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxMessagesStored", theMaxMessagesStored), currentHashCode, theMaxMessagesStored);
        }
        {
            String thePublicationScripts;
            thePublicationScripts = this.getPublicationScripts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicationScripts", thePublicationScripts), currentHashCode, thePublicationScripts);
        }
        {
            String theSearchScripts;
            theSearchScripts = this.getSearchScripts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchScripts", theSearchScripts), currentHashCode, theSearchScripts);
        }
        {
            List<ScriptDetails> theBackgroundScript;
            theBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backgroundScript", theBackgroundScript), currentHashCode, theBackgroundScript);
        }
        {
            MessageLog theMessageLog;
            theMessageLog = this.getMessageLog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageLog", theMessageLog), currentHashCode, theMessageLog);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof UserInterfaceMqttConnectionDetails) {
            final UserInterfaceMqttConnectionDetails copy = ((UserInterfaceMqttConnectionDetails) draftCopy);
            if ((this.publication!= null)&&(!this.publication.isEmpty())) {
                List<PublicationDetails> sourcePublication;
                sourcePublication = (((this.publication!= null)&&(!this.publication.isEmpty()))?this.getPublication():null);
                @SuppressWarnings("unchecked")
                List<PublicationDetails> copyPublication = ((List<PublicationDetails> ) strategy.copy(LocatorUtils.property(locator, "publication", sourcePublication), sourcePublication));
                copy.publication = null;
                if (copyPublication!= null) {
                    List<PublicationDetails> uniquePublicationl = copy.getPublication();
                    uniquePublicationl.addAll(copyPublication);
                }
            } else {
                copy.publication = null;
            }
            if ((this.subscription!= null)&&(!this.subscription.isEmpty())) {
                List<TabbedSubscriptionDetails> sourceSubscription;
                sourceSubscription = (((this.subscription!= null)&&(!this.subscription.isEmpty()))?this.getSubscription():null);
                @SuppressWarnings("unchecked")
                List<TabbedSubscriptionDetails> copySubscription = ((List<TabbedSubscriptionDetails> ) strategy.copy(LocatorUtils.property(locator, "subscription", sourceSubscription), sourceSubscription));
                copy.subscription = null;
                if (copySubscription!= null) {
                    List<TabbedSubscriptionDetails> uniqueSubscriptionl = copy.getSubscription();
                    uniqueSubscriptionl.addAll(copySubscription);
                }
            } else {
                copy.subscription = null;
            }
            if (this.userAuthentication!= null) {
                UserAuthenticationOptions sourceUserAuthentication;
                sourceUserAuthentication = this.getUserAuthentication();
                UserAuthenticationOptions copyUserAuthentication = ((UserAuthenticationOptions) strategy.copy(LocatorUtils.property(locator, "userAuthentication", sourceUserAuthentication), sourceUserAuthentication));
                copy.setUserAuthentication(copyUserAuthentication);
            } else {
                copy.userAuthentication = null;
            }
            if (this.autoOpen!= null) {
                Boolean sourceAutoOpen;
                sourceAutoOpen = this.isAutoOpen();
                Boolean copyAutoOpen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autoOpen", sourceAutoOpen), sourceAutoOpen));
                copy.setAutoOpen(copyAutoOpen);
            } else {
                copy.autoOpen = null;
            }
            if (this.autoConnect!= null) {
                Boolean sourceAutoConnect;
                sourceAutoConnect = this.isAutoConnect();
                Boolean copyAutoConnect = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autoConnect", sourceAutoConnect), sourceAutoConnect));
                copy.setAutoConnect(copyAutoConnect);
            } else {
                copy.autoConnect = null;
            }
            if (this.autoSubscribe!= null) {
                Boolean sourceAutoSubscribe;
                sourceAutoSubscribe = this.isAutoSubscribe();
                Boolean copyAutoSubscribe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autoSubscribe", sourceAutoSubscribe), sourceAutoSubscribe));
                copy.setAutoSubscribe(copyAutoSubscribe);
            } else {
                copy.autoSubscribe = null;
            }
            if (this.formatter!= null) {
                Object sourceFormatter;
                sourceFormatter = this.getFormatter();
                Object copyFormatter = ((Object) strategy.copy(LocatorUtils.property(locator, "formatter", sourceFormatter), sourceFormatter));
                copy.setFormatter(copyFormatter);
            } else {
                copy.formatter = null;
            }
            if (this.minMessagesStoredPerTopic!= null) {
                Integer sourceMinMessagesStoredPerTopic;
                sourceMinMessagesStoredPerTopic = this.getMinMessagesStoredPerTopic();
                Integer copyMinMessagesStoredPerTopic = ((Integer) strategy.copy(LocatorUtils.property(locator, "minMessagesStoredPerTopic", sourceMinMessagesStoredPerTopic), sourceMinMessagesStoredPerTopic));
                copy.setMinMessagesStoredPerTopic(copyMinMessagesStoredPerTopic);
            } else {
                copy.minMessagesStoredPerTopic = null;
            }
            if (this.maxMessagesStored!= null) {
                Integer sourceMaxMessagesStored;
                sourceMaxMessagesStored = this.getMaxMessagesStored();
                Integer copyMaxMessagesStored = ((Integer) strategy.copy(LocatorUtils.property(locator, "maxMessagesStored", sourceMaxMessagesStored), sourceMaxMessagesStored));
                copy.setMaxMessagesStored(copyMaxMessagesStored);
            } else {
                copy.maxMessagesStored = null;
            }
            if (this.publicationScripts!= null) {
                String sourcePublicationScripts;
                sourcePublicationScripts = this.getPublicationScripts();
                String copyPublicationScripts = ((String) strategy.copy(LocatorUtils.property(locator, "publicationScripts", sourcePublicationScripts), sourcePublicationScripts));
                copy.setPublicationScripts(copyPublicationScripts);
            } else {
                copy.publicationScripts = null;
            }
            if (this.searchScripts!= null) {
                String sourceSearchScripts;
                sourceSearchScripts = this.getSearchScripts();
                String copySearchScripts = ((String) strategy.copy(LocatorUtils.property(locator, "searchScripts", sourceSearchScripts), sourceSearchScripts));
                copy.setSearchScripts(copySearchScripts);
            } else {
                copy.searchScripts = null;
            }
            if ((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty())) {
                List<ScriptDetails> sourceBackgroundScript;
                sourceBackgroundScript = (((this.backgroundScript!= null)&&(!this.backgroundScript.isEmpty()))?this.getBackgroundScript():null);
                @SuppressWarnings("unchecked")
                List<ScriptDetails> copyBackgroundScript = ((List<ScriptDetails> ) strategy.copy(LocatorUtils.property(locator, "backgroundScript", sourceBackgroundScript), sourceBackgroundScript));
                copy.backgroundScript = null;
                if (copyBackgroundScript!= null) {
                    List<ScriptDetails> uniqueBackgroundScriptl = copy.getBackgroundScript();
                    uniqueBackgroundScriptl.addAll(copyBackgroundScript);
                }
            } else {
                copy.backgroundScript = null;
            }
            if (this.messageLog!= null) {
                MessageLog sourceMessageLog;
                sourceMessageLog = this.getMessageLog();
                MessageLog copyMessageLog = ((MessageLog) strategy.copy(LocatorUtils.property(locator, "messageLog", sourceMessageLog), sourceMessageLog));
                copy.setMessageLog(copyMessageLog);
            } else {
                copy.messageLog = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UserInterfaceMqttConnectionDetails();
    }

}
