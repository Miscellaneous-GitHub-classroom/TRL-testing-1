import java.util.HashMap;

public class PatronStore
{
	private HashMap<String, Patron> patrons;

	public PatronStore()
	{
		patrons = new HashMap<String, Patron>();

		// load sample Patron records
		patrons.put("S1000", new Patron("Eric", "S1000"));
		patrons.put("S1001", new Patron("Linda", "S1001"));
		patrons.put("S1002", new Patron("Anna", "S1002"));
		patrons.put("S1003", new Patron("Moxie", "S1003"));
	}

	public Patron fetchPatron(String patronID)
	{
		return patrons.get(patronID); // null if not there
	}

	public static void main(String[] args)
	{
		PatronStore pStore = new PatronStore();

		Patron p = pStore.fetchPatron("S1000");
		System.out.println(p);

		Copy c = new Copy("4747");
		p.checkCopyOut(c);

		System.out.println(p);
	}
}
