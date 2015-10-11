package chattuuServer;

import chattuuServer.controller.AppLock;
import chattuuServer.visuals.ServerFrame;

public class Start {

	public static void main(String[] args) {
		// TODO

		/**
		 * Prueba, comentar debajo para probar
		 * que funcione bien
		 * */
		ServerFrame instance = null;
		try {
		    
		    if (!AppLock.setLock("MY_CUSTOM_LOCK_KEY")) {
		        throw new RuntimeException("Only one application instance may run at the same time!");
		    }

		    instance = ServerFrame.getFrameInstance();
		    instance.setVisible(true);
		} finally {}
		/*
		finally{
		    AppLock.releaseLock(); // Release lock
		    if(instance != null)
		    	instance.dispose();
		}*/
		
	}

}
