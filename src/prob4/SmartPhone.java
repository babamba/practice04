package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("앱")){
			app();
			return;
			}
		// TODO Auto-generated method stub
		super.execute(function);
	}
	
	private void app(){
		System.out.println("앱 실행");
	}
}
