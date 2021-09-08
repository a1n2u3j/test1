
class Parent{
	void meth() {
		System.out.println(" works");

		}
		}
		class Child extends Parent {
		@Override
		void meth() {
			System.out.println("SoftwareEngineer works");

		}
		public static void main(String[] args) {
		Child c= new Child();
		c.meth();
		 }
		}


