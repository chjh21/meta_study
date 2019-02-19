package http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer_5 {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		while(true) {
            Socket socket =  server.accept();
            System.out.println("��û�� ���Խ��ϴ� " + new Date());
            Processor_6 processor = new Processor_6(socket);
            executorService.execute(processor);
        }
	}
}
