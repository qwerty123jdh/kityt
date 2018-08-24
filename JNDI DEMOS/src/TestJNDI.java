import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.Binding;

public class TestJNDI {

	public static void main(String[] rgstring) {
		// TODO Auto-generated method stub
		try {
		
		Hashtable hashtableEnvironment= new Hashtable();
		hashtableEnvironment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		hashtableEnvironment.put(Context.PROVIDER_URL, rgstring[0]);
		

			Context context= new InitialContext(hashtableEnvironment);
			
			if(rgstring.length==1) {
				NamingEnumeration namingenumeration = context.listBindings("");
				while(namingenumeration.hasMore()) {
					Binding binding = (Binding) namingenumeration.next();
					System.out.println(binding.getName()+" "+binding.getObject());
				}
			}
			context.close();
		} catch (NamingException namingexception) {
			// TODO Auto-generated catch block
			namingexception.printStackTrace();
		}
		

	}

}
