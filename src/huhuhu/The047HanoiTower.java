package huhuhu;

public class The047HanoiTower {
	static void moveDishes(int lv,char from,char to,char media){
		if(lv==1){
			System.out.println("从"+from+"移动 到1号到"+to);
		}else{
			moveDishes(lv-1,from,media,to);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		moveDishes(1, A, B, C);

	}

}
