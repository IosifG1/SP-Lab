
public class Image implements Element {

	String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}

	public String print() {
//		System.out.println(this.imageName);
		return this.imageName;
	}

}