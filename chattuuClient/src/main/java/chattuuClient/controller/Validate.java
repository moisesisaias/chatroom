package chattuuClient.controller;

import javax.swing.JTextArea;

public class Validate {

	public static boolean validIp(String txtIp, JTextArea txtrError) {
		if(isEmpty(txtIp)) {
			txtrError.setText("Debe llenar los campos.");
			return false;
		} 
		if(txtIp.equals("000.000.000.000")){
			txtrError.setText("IP no valida, ingrese nuevamente.");
			return false;
		}
		String[] numbers = {"","","",""};
		numbers[0] = txtIp.substring(0, 3);
		numbers[1] = txtIp.substring(4, 7);
		numbers[2] = txtIp.substring(8, 11);
		numbers[3] = txtIp.substring(12, 15);
		if(numbers[0].equals("000")|| numbers[3].equals("000")){
			return false;
		}
		for (String num : numbers) {
			try {
				int numI = Integer.parseInt(num);
				// System.out.println(numI);
				if (numI < 0 || numI > 254) {
					txtrError.setText("IP no valida, ingrese nuevamente.");
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validPort(String txtPort, JTextArea txtrError) {
		if(isEmpty(txtPort)) {
			txtrError.setText("Debe llenar los campos.");
			return false;
		} 
		try{
			int port = Integer.parseInt(txtPort);
			if(port < 1 || port > 65636){
				txtrError.setText("Puerto no valido, ingrese nuevamente.");
				return false;
			}
		}catch(Exception e){
			txtrError.setText("El puerto no es valido, debe ser un numero.");
			return false;
		}
		return true;
	}

	private static boolean isEmpty(String text) {
		if (text.equals("")) return true;
		else return false;
	}
}
