
public class LigneCommande implements IVisitable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LigneCommande(String name) {
		super();
		this.name = name;
	}

	@Override
	public void accept(Visitor visito) {
		visito.visit(this);
		
	}
	
}
