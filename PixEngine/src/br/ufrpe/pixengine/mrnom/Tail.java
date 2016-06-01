package br.ufrpe.pixengine.mrnom;

import br.ufrpe.pixengine.components.Collider;
import br.ufrpe.pixengine.components.GameObject;
import br.ufrpe.pixengine.core.GameContainer;
import br.ufrpe.pixengine.core.Renderer;

public class Tail extends GameObject {	
	public Tail(int x, int y) {
		setTag("tail");
		this.x = x;
		this.y = y;
		w = 32;
		h = 32;
		addComponent(new Collider());
	}

	@Override
	public void update(GameContainer gc, float dt) {
		
		updateComponents(gc, dt);
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		r.drawFillRect((int) x, (int) y, (int) w, (int) h, 0xffffffff);
	}

	@Override
	public void dispose() {

	}

	@Override
	public void componentEvent(String name, GameObject object) {

	}

}
