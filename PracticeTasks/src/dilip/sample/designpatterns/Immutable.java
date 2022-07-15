package dilip.sample.designpatterns;


/*Final class can't be inherited, 
 * final method can't be overridden 
 * final variable value can't be changed. 
*/


/*
 * o	The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
 * o	The class is final so we cannot create the subclass.
 * o	There is no setter methods i.e. we have no option to change the value of the instance variable.
*/

public final class Immutable {
	final int cNo;

	public Immutable(int newNo) {
		this.cNo = newNo;
	}
	
	public int getNo() {
		return cNo;
	}
	
	public static void main(String[] args) {
		// value can only be set through the constructor at initialization
		Immutable im = new Immutable(400);
		System.out.println(im.getNo());
	}
}

// trying extending final class
//class Dummy extends Immutable {
//	error since Immutable is final
//}
