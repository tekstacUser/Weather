
public class Weather {

	 public String getWeather(String city) {
	        
		 if(city.equalsIgnoreCase("Chennai")) {
			 return "Sunny";
		 }else if(city.equalsIgnoreCase("Bangalore")) {
			 return "Cool";
		 }else if(city.equalsIgnoreCase("Kerala")) {
			 return "Warm and wet";
		 }
	        return "";
	 }
	 
	 public static void main(String[] args) {
		 Weather weather = new Weather();
		String chennai = weather.getWeather("Chennai");
		
		System.out.println("Chennai Weather Report : "+chennai);
		
		
	}
	
}
