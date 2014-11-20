public class ListDoublePoints {

	public Link {
		public Object data;             // data item (Object)
		public Link next;
	}
	
		public Link(Object o) { // constructor
			data = o;
		}
	
	public void displayLink() {
	
		System.out.print("{"+data.toString()+"}");
	}  
	
	// contains DoublePoints
	DoublePoint a = new DoublePoint(1, 9);
	DoublePoint b = new DoublePoint(2,10);
	DoublePoint c = new DoublePoint(4,8);
	DoublePoint d = new DoublePoint(9,2);
}
