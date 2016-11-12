import java.util.List;

public class Commande implements IVisitable {
	
	private String name;
	private List<LigneCommande> ligneCommande;
	
	
	

	public Commande(String name) {
		super();
		this.name=name;
	}
	
	public Commande(String name, String nameLigne) {
		super();
		this.name=name;
		this.ligneCommande.add(new LigneCommande(nameLigne)); 
	}
	
	public String  getname() {
		return name ;
	}
	
	public void addLigne(LigneCommande ligneCommande){
		this.ligneCommande.add(ligneCommande);
	}

	@Override
	public void accept(Visitor visito) {
		visito.visit(this);
		for (LigneCommande l: ligneCommande ) {
			l.accept(visito);
		}
		
	}

}
