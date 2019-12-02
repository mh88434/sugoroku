/**
 * 
 */
package sugoroku;


/**
 *すごろくに使用されるマス目を表現する 抽象基底クラス
 */
public abstract class Cell {

	
	/**
	 *コンストラクタ(New出来ないのでprotectedにしておく) 
	 */
	protected Cell() {
	}
	/**
	 * なにかしらのイベントを実行できる予定
	 * イベント処理の結果何かが変わるかどうかの情報を返す予定
	 */
	public abstract boolean doEvent(Coma coma);
	/**
	 * このマス目の表示名
	 * @return 表示文字列
	 */
	public abstract String getCaption();
	
}
