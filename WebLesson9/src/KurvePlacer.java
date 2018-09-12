import apcslib.*;

import java.util.*;

import javax.swing.JOptionPane;

public class KurvePlacer {

	public static void main(String[] args) {
		KurveBuilder koch = new KurveBuilder();

		List<String> optionList = new ArrayList<String>();
		 optionList.add("<Select Below>");
		 optionList.add("Depth One");
		 optionList.add("Depth Two");
		 optionList.add("Depth Three");
		 optionList.add("Depth Four");
		 optionList.add("Depth Five");
		 optionList.add("Depth Six - ONLY ON LARGE SIZES!!!");
		 Object[] options = optionList.toArray();
		 Object value = JOptionPane.showInputDialog(null, "How many levels of curve do you desire?", "input box", 0, null, options, 0);
		 int index = optionList.indexOf(value);
		 int lSize = 300;
		 int xSize = -150;
		 int ySize = -100;
		 if(index == 0)
			 return;
		 if(index == 6){
			 lSize = 750;
			 xSize = -250;
			 ySize = -420;
		 }
		 koch.setupWorld();
		 koch.drawStar(lSize, index, xSize, ySize);
		 System.out.println("Index = "+index);
	}

}
