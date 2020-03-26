package uitility;

import org.apache.log4j.Logger;

public class logc {


	public void logup (String m)
	{
		
	
	Logger  log=  Logger.getLogger("devpinoyLogger");
	log.info( m);
	}
	}


