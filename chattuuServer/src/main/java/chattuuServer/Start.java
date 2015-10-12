package chattuuServer;

import chattuuServer.controller.AppLock;
import chattuuServer.visuals.ServerFrame;

public class Start {

	public static void main(String[] args) {
		// TODO
		ServerFrame instance = null;
		try {
		    
		    if (!AppLock.setLock("MY_SUPER_KAWAI_CUSTOM_LOCK_KEY")) {
		        throw new RuntimeException("Solo es posible correr una sola instancia de la aplicacion a la vez...!");
		    }

		    instance = ServerFrame.getFrameInstance();
		    instance.setVisible(true);
		} finally {}
		
	}

}
