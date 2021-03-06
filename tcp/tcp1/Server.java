package tcp1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	int port;
	ServerSocket serversocket;
	Socket socket;
	OutputStream out;
	OutputStreamWriter outw;
	boolean flag= true;

	public Server() throws IOException {
		port = 7777;
		serversocket = new ServerSocket(port); // 働舛匂闘研 戚遂馬食 辞獄蝕醗聖 拝依戚陥. 陥献紫寓戚 辞獄研紫遂馬壱赤聖凶 紫遂災亜
	}

	public void startServer() throws IOException {

		while (flag) {

			System.out.println("Start Server....");
			System.out.println("Ready Server....");
			try {

				socket = serversocket.accept(); // server楕拭辞 刊浦亜亜(client) 級嬢神奄穿猿走 叔楳照喫
				System.out.println("Accepted Server...." + socket.getInetAddress());
				out = socket.getOutputStream();
				outw = new OutputStreamWriter(out);
				outw.write("剰襟虞照括??~~~~~~~~~~神潅亀髪特楳><神潅榎睡ぇ戚陥ぞぞぞせせせせせせせせせせ焼角蟹重涯倍左臆悦汽神潅繊宿怯査戚股聖猿紫茨幻虐厩袴越猿~");

			} catch (IOException e) {
				throw e;
			} finally {
				if(outw!=null) {
					outw.close();
				}
				if(socket!=null) {
				socket.close();
				}
			}
			
			System.out.println("End Server");

		} //while庚

	}

	public static void main(String[] args) {
		Server server = null;
		try {
			server = new Server();
			server.startServer();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}