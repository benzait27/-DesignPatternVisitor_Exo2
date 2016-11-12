
public class RapportCommandes implements Visitor {

	@Override
	public void visit(Client c) {
		// TODO Auto-generated method stub
		System.out.println("je suis clinet"+c.getName());
	}

	@Override
	public void visit(Commande o) {
		// TODO Auto-generated method stub
		System.out.println("je suis clinet"+o.getname());
	}

	@Override
	public void visit(LigneCommande c) {
		// TODO Auto-generated method stub
		System.out.println("je suis clinet"+c.getName());
	}

	@Override
	public void afficherCommande() {
		// TODO Auto-generated method stub
		
	}

}
