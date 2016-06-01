package br.ufrpe.pixengine.mrnom;

import br.ufrpe.pixengine.components.GameObject;
import br.ufrpe.pixengine.core.GameContainer;
import br.ufrpe.pixengine.core.Renderer;

public class Score extends GameObject {
	double score;
	public Score(double score,int x, int y) {
		this.score = score;
	}

	@Override
	public void update(GameContainer gc, float dt) {
		updateComponents(gc, dt);
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		r.drawFillRect((int) x, (int) y, (int) w, (int) h, 0xff00ff00);
	}

	@Override
	public void dispose() {

	}

	@Override
	public void componentEvent(String name, GameObject object) {
		
	}

}
