class mythread extends Thread{
	public void run(){
		System.out.println("Concurrent thread started running");
	}
}

public class threaddemo_extension{
	public static void main(String[] args){
		mythread t1=new mythread();
		t1.start();
	}
}
