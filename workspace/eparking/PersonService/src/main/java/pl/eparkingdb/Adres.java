package pl.eparkingdb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the adres database table.
 * 
 */
@Entity
@Table(name="adres")
@NamedQuery(name="Adres.findAll", query="SELECT a FROM Adres a")
public class Adres implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(name="KOD_POCZTOWY", nullable=false, length=100)
	private String kodPocztowy;

	@Column(name="MIEJSCOWOSC", nullable=false, length=100)
	private String miejscowosc;

	@Column(name="NUMER_BUDYNKU", length=100)
	private String numerBudynku;

	@Column(name="NUMER_LOKALU", length=100)
	private String numerLokalu;

	@Column(name="OPIS_DODATKOWY", length=100)
	private String opisDodatkowy;

	@Column(name="PIETRO", length=100)
	private String pietro;

	@Column(name="TYP", nullable=false, length=100)
	private String typ;

	@Column(name="ULICA", nullable=false, length=100)
	private String ulica;

	@Column(name="WOJEWODZTWO", nullable=false, length=100)
	private String wojewodztwo;

	//bi-directional many-to-one association to Kierowca
	@OneToMany(mappedBy="adres", cascade={CascadeType.ALL})
	private List<Kierowca> kierowcas;

	public Adres() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKodPocztowy() {
		return this.kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getMiejscowosc() {
		return this.miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getNumerBudynku() {
		return this.numerBudynku;
	}

	public void setNumerBudynku(String numerBudynku) {
		this.numerBudynku = numerBudynku;
	}

	public String getNumerLokalu() {
		return this.numerLokalu;
	}

	public void setNumerLokalu(String numerLokalu) {
		this.numerLokalu = numerLokalu;
	}

	public String getOpisDodatkowy() {
		return this.opisDodatkowy;
	}

	public void setOpisDodatkowy(String opisDodatkowy) {
		this.opisDodatkowy = opisDodatkowy;
	}

	public String getPietro() {
		return this.pietro;
	}

	public void setPietro(String pietro) {
		this.pietro = pietro;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getUlica() {
		return this.ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getWojewodztwo() {
		return this.wojewodztwo;
	}

	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public List<Kierowca> getKierowcas() {
		return this.kierowcas;
	}

	public void setKierowcas(List<Kierowca> kierowcas) {
		this.kierowcas = kierowcas;
	}

	public Kierowca addKierowca(Kierowca kierowca) {
		getKierowcas().add(kierowca);
		kierowca.setAdres(this);

		return kierowca;
	}

	public Kierowca removeKierowca(Kierowca kierowca) {
		getKierowcas().remove(kierowca);
		kierowca.setAdres(null);

		return kierowca;
	}

}