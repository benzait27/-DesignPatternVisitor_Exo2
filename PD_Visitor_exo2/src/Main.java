
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RapportCommandes cv = new RapportCommandes();
      GroupClient gc= new GroupClient("Custmer");
      
      Client c1= new Client("zaki");
      Commande o1 = new Commande("C1");
      LigneCommande l1= new LigneCommande("sucre");
      LigneCommande l2= new LigneCommande("milk");
      LigneCommande l3= new LigneCommande("gourgete");
    
      o1.addLigne(l1);
      o1.addLigne(l2);
      o1.addLigne(l3);
      c1.addCommande(o1);
      gc.addClient(c1);
      
      c1.accept(cv);
      
	}

}
