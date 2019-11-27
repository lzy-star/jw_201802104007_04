import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //创建一个Socket对象
        Socket serverSocket = new Socket("127.0.0.1",1025);
        //获得Socket对象的输出流，并写入
        serverSocket.getOutputStream().write(7);
        //获得clientsocket的输入流并对其进行读取
        int intFromServer = serverSocket.getInputStream().read();
        System.out.println("From server:" + intFromServer);
        //关闭Socket对象
        serverSocket.close();
    }
}

