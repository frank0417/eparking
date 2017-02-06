
package pl.eparking.parkingservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import pl.eparking.technical.BaseResponse;


/**
 * <p>Java class for updateParkingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateParkingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://eparking.pl/technical}BaseResponse"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateParkingResponse")
public class UpdateParkingResponse
    extends BaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
