
import org.junit.Assert;
import org.junit.Test;

public class WeatherTest {

    @Test
    public void testGetWeatherChennai() {
        Weather weather = new Weather();
        String result = weather.getWeather("Chennai");
        Assert.assertEquals("Sunny", result);
    }

    @Test
    public void testGetWeatherBangalore() {
        Weather weather = new Weather();
        String result = weather.getWeather("Bangalore");
        Assert.assertEquals("Cool", result);
    }

    @Test
    public void testGetWeatherKerala() {
        Weather weather = new Weather();
        String result = weather.getWeather("Kerala");
        Assert.assertEquals("Warm and wet", result);
    }

}
