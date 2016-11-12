import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable {

	
	private String name;
	private List<Commande> commandes;
	
	
	
	public Client(String name) {
		super();
		this.name = name;
		commandes = new ArrayList<Commande>();
	}


	@Override
	public void accept(Visitor visito) {
		visito.visit(this);
		for (Commande c:commandes) {
			c.accept(visito);
		}
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void addCommande(Commande commande){
		
		this.commandes.add(commande);
	}
}
