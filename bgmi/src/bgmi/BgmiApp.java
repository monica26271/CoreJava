package bgmi;

public class BgmiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bgmi b1=new Bgmi();
		System.out.println("UserId "+b1.userId+" Name "+b1.playerName+" Gender "+b1.Gender+" Email "+b1.EmailId);
		
		b1.userId=5678902;
		b1.playerName="JiminaaaJk";
		b1.Gender='F';
		b1.EmailId="vijayamonica2606@gmail.com";
		System.out.println("UserId "+b1.userId+" Name "+b1.playerName+" Gender "+b1.Gender+" Email "+b1.EmailId);

		b1.playSolo();
		b1.sendRequest();
		b1.acceptRequest();
		b1.endGame();
		
		
		
	}

}
