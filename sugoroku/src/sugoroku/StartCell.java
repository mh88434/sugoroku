package sugoroku;

public class StartCell extends Cell {

	public StartCell() {
		
	}

	@Override
	public boolean doEvent(Coma coma) {
		return false;
	}

	@Override
	public String getCaption() {
		return "さぁ、ゲームをはじめましょう！";
	}

}
