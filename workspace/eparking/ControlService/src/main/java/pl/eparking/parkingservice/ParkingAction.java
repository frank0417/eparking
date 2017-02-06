
package pl.eparking.parkingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="parking_start"/&gt;
 *     &lt;enumeration value="parking_end"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingAction")
@XmlEnum
public enum ParkingAction {

    @XmlEnumValue("parking_start")
    PARKING_START("parking_start"),
    @XmlEnumValue("parking_end")
    PARKING_END("parking_end");
    private final String value;

    ParkingAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingAction fromValue(String v) {
        for (ParkingAction c: ParkingAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
