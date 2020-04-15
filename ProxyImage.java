package proxy;

public class ProxyImage implements Image {
	private final String fileName;
	private RealImage image;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		if (image == null) {
			image = new RealImage(fileName);
		}
		image.displayImage();
		
	}

	@Override
	public void showData() {
		if (image == null) {
		System.out.println("file info: " +this.fileName);
		// TODO Auto-generated method stub
		}else {
			image.showData();
		}
		
	}
	

}
