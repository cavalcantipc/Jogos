package br.ufrpe.pixengine.mrnom;

import br.ufrpe.pixengine.components.ObjectManager;
import br.ufrpe.pixengine.components.State;
import br.ufrpe.pixengine.core.GameContainer;
import br.ufrpe.pixengine.core.Renderer;
import javafx.scene.image.Image;

public class PlayState extends State {
	public PlayState() {
		manager.addObject(new GameImage(new Image("/mr.nom/background.png"),0 ,0));
		manager.addObject(new Player(0, 0));
		manager.addObject(new Stain(156, 116));
		manager.addObject(new Score(450, 160));
	}

	@Override
	public void update(GameContainer gc, float dt) {
		manager.updateObjects(gc, dt);
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		manager.renderObjects(gc, r);
	}

	@Override
	public void dipose() {
		manager.diposeObjects();
	}

	public ObjectManager getManager() {
		return manager;
	}

	public void setManager(ObjectManager manager) {
		this.manager = manager;
	}

}
