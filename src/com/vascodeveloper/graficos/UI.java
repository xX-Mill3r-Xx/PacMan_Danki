package com.vascodeveloper.graficos;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.vascodeveloper.main.Game;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial",Font.BOLD,18));
		g.drawString("Apples: "+Game.frutas_atual+"/"+Game.frutas_contagem, 30,30);
	}
	
}

