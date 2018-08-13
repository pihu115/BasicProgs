package Day5;

import java.net.InetAddress;

public class Ipadd {

	public static void main(String[] args)throws Exception {
		InetAddress myIp= InetAddress.getLocalHost();
		System.out.println("my Ip address is.."+myIp.getHostAddress());

	}

}
