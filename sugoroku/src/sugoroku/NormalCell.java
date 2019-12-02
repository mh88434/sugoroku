/**
 * 
 */
package sugoroku;

/**
 * 普通なマスの実装クラス
 * @author 3d152
 *
 */
public class NormalCell extends Cell {

	/**
	 * コンストラクタ
	 */
	public NormalCell() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.addPoint(100);
		return true;
	}

	@Override
	public String getCaption() {
		return "少しゴールに近づいた";
	}

}
