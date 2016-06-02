package br.ufrpe.pixengine.mrnom;

import br.ufrpe.pixengine.components.Collider;
import javafx.scene.image.Image;

public class Tail{	
	public int x;
	public int y;
	public final Image tailImage = new Image("/mr.nom/tail.png");
	
	public Tail(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
