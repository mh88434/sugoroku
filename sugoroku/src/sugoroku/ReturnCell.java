/**
 * 
 */
package sugoroku;

/**
 * @author 3d152
 *
 */
public class ReturnCell extends Cell {
	
	private int amount;

	/**
	 * 
	 */
	public ReturnCell(int amount) {
		this.amount=amount;
	}

	/* (非 Javadoc)
	 * @see sugoroku.Cell#doEvent(sugoroku.Coma)
	 */
	@Override//ここにコマが止まった時に実行される処理★コマの位置を進めるか戻るか等
	public boolean doEvent(Coma coma) {
		
		return false;
	}

	/* (非 Javadoc)
	 * @see sugoroku.Cell#getCaption()
	 */
	@Override
	public String getCaption() {
		// TODO 自動生成されたメソッド・スタブ
		return "強風にあおられたので後退";
	}

}
