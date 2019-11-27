import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public final class ServerTest{
    public static void main(String[] args) throws IOException {
        //在1025端口创建了一个seversocket对象
        ServerSocket serverSocket = new ServerSocket(1025);
        //接受accept方法，返回一个socket对象
        Socket clientSocket = serverSocket.accept();
        //获得了clientsocket的输入流并对其进行读取，得到客户端传输过来的字节数据
        int intFromClient = clientSocket.getInputStream().read();
        //获取针对客户端的响应对象
        OutputStream response = clientSocket.getOutputStream();
        //将得到的数据强制转换为char型打印
        System.out.println((char) intFromClient);
        //通过响应对象向客户端输出
        response.write(intFromClient*2);
        //关闭ServerSocket对象
        serverSocket.close();
    }
}