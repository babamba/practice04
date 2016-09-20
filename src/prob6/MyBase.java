package prob6;

public class MyBase extends Base{

	@Override	//service 재정의
	public void service(String state) {	
		if(state.equals("오후")){
			afternoon();
			return;
		}
		super.service(state);//상위클래스 걸치고	
	}	

	@Override	//재정의
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}
//
//	@Override
//	public void night() {
//		System.out.println("night");
//	}
//	
	public void afternoon(){
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	
	
}
//( state.equals( "낮" ) ) {
//	day();
//} else if(state.equals("밤")){
//	night();
//} else if