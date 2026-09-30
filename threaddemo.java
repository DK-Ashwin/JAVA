public class threaddemo{
	public static void main(String[] args){
		Thread t=Thread.currentThread();
		System.out.println("Enter your Name : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
	}
}
