package pl.eparkingdb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the kierowca database table.
 * 
 */
@Entity
@Table(name="kierowca")
@NamedQuery(name="Kierowca.findAll", query="SELECT k FROM Kierowca k")
public class Kierowca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(name="ADRES_EMAIL", nullable=false, length=100)
	private String adresEmail;

	@Column(name="IMIE", nullable=false, length=100)
	private String imie;

	@Column(name="NAZWISKO", nullable=false, length=100)
	private String nazwisko;

	@Column(name="PESEL", nullable=false, length=100)
	private String pesel;

	//bi-directional many-to-one association to Adres
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ADRES_ID", nullable=false)
	private Adres adres;

	//bi-directional many-to-one association to Konto
	@OneToMany(mappedBy="kierowca")
	private List<Konto> kontos;

	public Kierowca() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresEmail() {
		return this.adresEmail;
	}

	public void setAdresEmail(String adresEmail) {
		this.adresEmail = adresEmail;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public Adres getAdres() {
		return this.adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public List<Konto> getKontos() {
		return this.kontos;
	}

	public void setKontos(List<Konto> kontos) {
		this.kontos = kontos;
	}

	public Konto addKonto(Konto konto) {
		getKontos().add(konto);
		konto.setKierowca(this);

		return konto;
	}

	public Konto removeKonto(Konto konto) {
		getKontos().remove(konto);
		konto.setKierowca(null);

		return konto;
	}

}