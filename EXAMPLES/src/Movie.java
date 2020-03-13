
public class Movie {
	String id;
	String name;
	String date;
	String Showdate;
	String Showtime;
    String status;
    public static void main(String args[]) {
    	Movie m=new Movie("1015", "aarya", "9.00 am", "balcony", "29-01-2020","good");	
    	
    	
    	
    	
    	m.showDetails();
    }
	public Movie(String id, String name, String date, String showdate, String showtime, String status) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		Showdate = showdate;
		Showtime = showtime;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getShowdate() {
		return Showdate;
	}
	public void setShowdate(String showdate) {
		Showdate = showdate;
	}
	public String getShowtime() {
		return Showtime;
	}
	public void setShowtime(String showtime) {
		Showtime = showtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
	public void showDetails() {
		System.out.println("movie id is="+id);
		System.out.println("movie name is="+name);
		System.out.println("movie showdate is="+Showdate);
		System.out.println("movie showtime is="+Showtime);
		System.out.println("movie status is="+status);
	}
	

	
		

	}


