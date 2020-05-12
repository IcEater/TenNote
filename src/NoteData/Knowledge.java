package NoteData;

import java.awt.Image;
import java.util.Vector;

public class Knowledge {
	//该类为知识类，需要能够实例化，拥有详细设计中要求的各项功能
	private String text;
	private Vector<Image> pic=new Vector<Image>();
	public Knowledge(String text, Image[] pic)
	{
		this.text=text;
		for(int i=0; i<pic.length; i++)
		{
			this.pic.add(pic[i]);
		}
	}
	public String getText()
	{
		return text;
	}
	public Vector<Image> getPics()
	{
		return pic;
	}
}
