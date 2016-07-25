package p01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

public class NIOServer {
	//管理器
	private Selector selector;
	
	public void initServer(int port)throws IOException{
		ServerSocketChannel  channel = ServerSocketChannel.open();
		channel.configureBlocking(false);
		channel.socket().bind(new InetSocketAddress(port));
		this.selector = Selector.open();
		
		channel.register(selector, SelectionKey.OP_ACCEPT);
	}
	
	public void listen() throws IOException{
		System.out.println("Server start");
		while(true){
			selector.select();
			Iterator it = selector.selectedKeys().iterator();
			while(it.hasNext()){
				SelectionKey key =(SelectionKey)it.next();
				it.remove();
				if(key.isAcceptable()){
					ServerSocketChannel server = (ServerSocketChannel)key.channel();
				}
			}
		}
	}
	
	public static void mian(String args[]){
		
	}
}
