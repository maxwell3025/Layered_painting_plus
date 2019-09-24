package layers;

import java.awt.Color;

public class bitmap {
Color[][] pixs = new Color[500][500]; 
	public bitmap() {
		
	}
	public void setcol(int x, int y, Color c){
		pixs[x][y]=c;
	}

}
