package pl.eparkingdb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pojazd database table.
 * 
 */
@Entity
@Table(name="pojazd")
@NamedQuery(name="Pojazd.findAll", query="SELECT p FROM Pojazd p")
public class Pojazd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_PRODUKCJI")
	private Date dataProdukcji;

	@Column(name="KOLOR", length=100)
	private String kolor;

	@Column(name="MARKA", nullable=false, length=100)
	private String marka;

	@Column(name="MODEL", length=100)
	private String model;

	@Column(name="NUMER_REJESTRACYJNY", nullable=false, length=100)
	private String numerRejestracyjny;

	@Column(name="NUMER_VIN", nullable=false, length=100)
	private String numerVin;

	@Column(name="TYP", nullable=false, length=100)
	private String typ;

	//bi-directional many-to-one association to Konto
	@OneToMany(mappedBy="pojazd")
	private List<Konto> kontos;

	//bi-directional many-to-one association to Parking
	@OneToMany(mappedBy="pojazd")
	private List<Parking> parkings;

	public Pojazd() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataProdukcji() {
		return this.dataProdukcji;
	}

	public void setDataProdukcji(Date dataProdukcji) {
		this.dataProdukcji = dataProdukcji;
	}

	public String getKolor() {
		return this.kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumerRejestracyjny() {
		return this.numerRejestracyjny;
	}

	public void setNumerRejestracyjny(String numerRejestracyjny) {
		this.numerRejestracyjny = numerRejestracyjny;
	}

	public String getNumerVin() {
		return this.numerVin;
	}

	public void setNumerVin(String numerVin) {
		this.numerVin = numerVin;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public List<Konto> getKontos() {
		return this.kontos;
	}

	public void setKontos(List<Konto> kontos) {
		this.kontos = kontos;
	}

	public Konto addKonto(Konto konto) {
		getKontos().add(konto);
		konto.setPojazd(this);

		return konto;
	}

	public Konto removeKonto(Konto konto) {
		getKontos().remove(konto);
		konto.setPojazd(null);

		return konto;
	}

	public List<Parking> getParkings() {
		return this.parkings;
	}

	public void setParkings(List<Parking> parkings) {
		this.parkings = parkings;
	}

	public Parking addParking(Parking parking) {
		getParkings().add(parking);
		parking.setPojazd(this);

		return parking;
	}

	public Parking removeParking(Parking parking) {
		getParkings().remove(parking);
		parking.setPojazd(null);

		return parking;
	}

}