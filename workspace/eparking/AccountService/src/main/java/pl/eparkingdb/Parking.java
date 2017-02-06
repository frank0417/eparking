package pl.eparkingdb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the parking database table.
 * 
 */
@Entity
@Table(name="parking")
@NamedQuery(name="Parking.findAll", query="SELECT p FROM Parking p")
public class Parking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PARKING_END")
	private Date parkingEnd;

	@Column(name="PARKING_ID", nullable=false)
	private int parkingId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PARKING_START", nullable=false)
	private Date parkingStart;

	@Column(name="PARKING_STATUS", length=100)
	private String parkingStatus;

	@Column(name="PARKING_TYPE", nullable=false, length=100)
	private String parkingType;

	//bi-directional many-to-one association to Konto
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="KONTO_ID", nullable=false)
	private Konto konto;

	//bi-directional many-to-one association to Pojazd
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="POJAZD_ID", nullable=false)
	private Pojazd pojazd;

	public Parking() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getParkingEnd() {
		return this.parkingEnd;
	}

	public void setParkingEnd(Date parkingEnd) {
		this.parkingEnd = parkingEnd;
	}

	public int getParkingId() {
		return this.parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public Date getParkingStart() {
		return this.parkingStart;
	}

	public void setParkingStart(Date parkingStart) {
		this.parkingStart = parkingStart;
	}

	public String getParkingStatus() {
		return this.parkingStatus;
	}

	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}

	public String getParkingType() {
		return this.parkingType;
	}

	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	public Konto getKonto() {
		return this.konto;
	}

	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public Pojazd getPojazd() {
		return this.pojazd;
	}

	public void setPojazd(Pojazd pojazd) {
		this.pojazd = pojazd;
	}

}