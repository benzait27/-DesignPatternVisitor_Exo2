import java.util.List;


public interface Visitor {

	 public void  visit (Client c);
	 public void  visit (Commande o);
	 public void  visit (LigneCommande c);
	 public void  afficherCommande ();
	 

}
