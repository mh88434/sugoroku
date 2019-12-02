/**
 * 
 */
package sugoroku;

/**
 * すごろくのプレイヤーと位置を表すコマクラス
 * @author 3d152
 *
 */
public class Coma {
	/**
	 * プレイヤーの名前
	 */
	private String name;
	/**
	 * 現在位置
	 */
	private int position;
	
	static int point;
	/**
	 * コンストラクタ
	 * @param name プレイヤー名
	 */
	public Coma(String name) {
		this.name=name;
		this.position =0;
		
		
	}
	public int getPosition() {
		// TODO 自動生成されたメソッド・スタブ
		return this.position;
	}

	/**
	 * このコマが指定された分量進みます
	 * amount すすむりょう
	 * @param amount
	 */
	public void procced(int amount) {
		this.position += amount;
	}
	
	public void addPoint(int amount) {
		System.out.println(name + "は"+ amount +"ポイントゲットした" );
		this.point +=amount;
	}
	public void showProfile() {
		System.out.println(name +"の現在のポイントは"+point+"です");
		System.out.println(name+"は"+position+"コマめにいます");
	}
}
