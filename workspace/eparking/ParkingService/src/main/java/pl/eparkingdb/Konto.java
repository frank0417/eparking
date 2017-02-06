package pl.eparkingdb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the konto database table.
 * 
 */
@Entity
@Table(name="konto")
@NamedQuery(name="Konto.findAll", query="SELECT k FROM Konto k")
public class Konto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(name="RACHUNEK_ID", nullable=false, length=100)
	private String rachunekId;

	@Column(name="TYP", nullable=false, length=100)
	private String typ;

	//bi-directional many-to-one association to Kierowca
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="KIEROWCA_ID", nullable=false)
	private Kierowca kierowca;

	//bi-directional many-to-one association to Pojazd
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="POJAZD_ID", nullable=false)
	private Pojazd pojazd;

	//bi-directional many-to-one association to Parking
	@OneToMany(mappedBy="konto")
	private List<Parking> parkings;

	public Konto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRachunekId() {
		return this.rachunekId;
	}

	public void setRachunekId(String rachunekId) {
		this.rachunekId = rachunekId;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public Kierowca getKierowca() {
		return this.kierowca;
	}

	public void setKierowca(Kierowca kierowca) {
		this.kierowca = kierowca;
	}

	public Pojazd getPojazd() {
		return this.pojazd;
	}

	public void setPojazd(Pojazd pojazd) {
		this.pojazd = pojazd;
	}

	public List<Parking> getParkings() {
		return this.parkings;
	}

	public void setParkings(List<Parking> parkings) {
		this.parkings = parkings;
	}

	public Parking addParking(Parking parking) {
		getParkings().add(parking);
		parking.setKonto(this);

		return parking;
	}

	public Parking removeParking(Parking parking) {
		getParkings().remove(parking);
		parking.setKonto(null);

		return parking;
	}

}