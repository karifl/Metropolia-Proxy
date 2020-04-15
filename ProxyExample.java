package proxy;
import java.util.ArrayList;
import java.util.List;

public class ProxyExample  {

	public static void main(final String[] arguments) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new ProxyImage("Coat of Arms.jpg");
		
		
		List<Image>  photobook = new ArrayList <Image>();
		photobook.add(image1);
		photobook.add(image2);
		photobook.add(image3);
		
		//Näytetään kuva-tiedostojen tiedot
		photobook.get(0).showData();
		photobook.get(1).showData();
		photobook.get(2).showData();
		System.out.println("\n");
		
		//Näytetään kuva-tiedostojen tiedot lataamisen jälkeen.
		photobook.get(0).displayImage();
		photobook.get(0).showData();
		System.out.println();
		photobook.get(1).displayImage();
		photobook.get(1).showData();
		System.out.println();
		photobook.get(2).displayImage();
		photobook.get(2).showData();
	}
	
	


}
