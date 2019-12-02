/**
 * 
 */
/**
 * @author 3d152
 *
 */
package sugoroku;
import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * すごろくチャレンジ
 */
public class Main{
	
	/**
	 * すごろくインスタンスで使用する乱数発生装置
	 */
	private Random rand =new Random();
	/**
	 *すごろくインスタンスで使用する 入力装置 
	 */
	private Scanner input =new Scanner(System.in);
	
	/**
	 * すごろくのマスメ配列
	 */
	private Cell[] path;
	/**
	 * プレイヤーのコマ
	 */
	private Coma player;
	/**
	 * すごろくのメインプログラム
	 * @param args 起動時引数
	 */
	public static void main(String[] args) {


		new Main().run();

	}
	/**
	 * すごろくプログラムの動作
	 */
	private void run() {
		
		initGame();
		//ターンの繰り返し
		do {
			showPath();
			
			//プレイヤーがダイスを振る
			System.out.println("ダイス振ってねー（エンターキー）");
			input.nextLine(); //入力街ち（データは読み取らない）
			int proceed=rand.nextInt(4)+1; //1~4のどれか適当に
			System.out.println(proceed+"が出たよ");
			
			//コマを出目分進める
			player.procced(proceed);
			
			int pos =player.getPosition();
			//どんなマスに来たのか情報を出す
					if(pos<path.length) {
						Cell now=path[pos];
						//どんなマスに来たのか情報を出す
						System.out.println(now.getCaption());
						//マウスに割り振られたイベントが発動する
						now.doEvent(player);
						player.showProfile();
						
					}
			
			
			//もしゴールだったら ゲーム終了
			boolean goal = path.length - 1 <= player.getPosition();
			if(goal) {
				System.out.println("ゴールです"+"あなたの獲得ポイントは"+Coma.point+"点です");
				break;
			}
		
		}while(true);
		
		//ゲームが終わった時の処理
		exitGame();
	}
	
	/**
	 * 現状のすごろく状態
	 */
	private void showPath() {
		//マス目番号を表示
		for (int i=0; i<path.length; i++) {
			if(i<10) {
				System.out.println(" ");
			}
			System.out.println(i+" ");
		}
		System.out.println();//改行
	}	

	
	//プレイヤー位置を表示
	private void showComapos(int pid) {
	
		System.out.println();//改行
	
		for (int i=0; i<path.length; i++) {
		
			//プレイヤーの居る場所の時は*を置く
		
			if(i !=player.getPosition()) {
			
				System.out.println(" ");
		
			}else {
			
				System.out.println("*");
		
			}
	
		}
	
	}
	/**
	 * ゲームが終わった時の処理
	 */
	private void exitGame() {
		
		
	}
	/**
	 * ゲームを始めるための下準備
	 */
	private void initGame() {
		
		path =new Cell[] {
				new StartCell(),
				new NormalCell(),
				new ReturnCell(2),
				new NormalCell(),
				new ReturnCell(2),
				new NormalCell(),
				new ReturnCell(2),
				new NormalCell(),
				new ReturnCell(2),
				new NormalCell(),
				new ReturnCell(2),
				new ReturnCell(10),
				new GallCell(),
		};
	

		path[path.length-1]=new GallCell();
		//プレイヤーを準備
		player=new Coma("プレイヤー1");
		System.out.println(path[0].getCaption());
	}
	


}