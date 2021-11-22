package activities;
	
	 abstract class Book {
		
		String title;
		public abstract void setTitle(String title);
		
		public String getTitle() {
			return title;
		}

	}
	
	 class MyBook extends Book {

		@Override
		public void setTitle(String s) {
			
			title=s;
			
		}

	}

	public class Activity5 {
		
	public static void main(String[] args) {
		
		MyBook newNovel = new MyBook();
		String title="Harry Potter";
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());

	}

}

 
