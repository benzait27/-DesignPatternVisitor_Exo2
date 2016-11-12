import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupClient  implements Iterable <Client> {

	 private String name;
	 private List <Client> clients = new ArrayList<Client>();
	
	 
	 @Override
	public Iterator<Client> iterator() {
		 return this.clients.iterator();
	}
	 
	 public GroupClient(String name) {
		super();
		this.name = name;
	}
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addClient(Client c){ 
		 this.clients.add(c);
		 }
}
