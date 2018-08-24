import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map= new ConcurrentHashMap<>();
		map.put("A", "India");
		map.put("B", "Sri Lanka");
		map.put("C", "Germany");
		map.put("z", "USA");
		
		Set<Entry<String,String>> entry= map.entrySet();
		Iterator<Entry<String,String>> iterator=entry.iterator();
	    while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entries= (Map.Entry<java.lang.String, java.lang.String>)iterator.next();
			if(entries.getKey().equals("A"))
			{
				map.put("x", "New Country");
				System.out.println(map);
			
		}
		}
	}

}
