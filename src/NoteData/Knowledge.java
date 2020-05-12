package NoteData;

import java.awt.Image;
import java.util.Vector;

public class Knowledge {
	//����Ϊ֪ʶ�࣬��Ҫ�ܹ�ʵ������ӵ����ϸ�����Ҫ��ĸ����
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
