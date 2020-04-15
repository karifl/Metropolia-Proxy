package proxy;

public class RealImage implements Image {
	private final String fileName;
	

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk();
	}
	
	
	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Displaying " + fileName);
		
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading  " + fileName);
	}


	@Override
	public void showData() {
		System.out.println("This picture's info: " + fileName);
		
	}

}
