package ma.asp.springaspect.beans;

public class Client implements IClient{
	private String nom;
	private Compte cp;
	public Client() {
	}
	public Client(String nom, Compte compte) {
		this.nom=nom;
		this.cp=compte;
	}
	public String getNom() {
	 return nom;
	 }
	public void setNom(String nom) {
	 this.nom = nom;
	 }
	public Compte getCp() {
	 return cp;
	 }
	public void setCp(Compte cp) {
	 this.cp = cp;
	 }
	@Override
	public void retirer(double mt){
		cp.debiter(mt);
	 }
	@Override
	public void verser(double mt){
		cp.approvisionner(mt);
	 } 
}
