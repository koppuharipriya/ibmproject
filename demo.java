class Computer{
    public void playmusic(){
	  System.out.println("Music playing....");
	  
  }  
	 public String getMeAPen(int cost){
		 return "pen";
	 } 
	  
  
}

public class Demo{
	public static void main(String a[]){
		Computer obj = new Computer();
		obj.playmusic();
		String str = obj.getMeAPen(10);
		System.out.println(str);
	}
}