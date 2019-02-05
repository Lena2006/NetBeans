/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

/**
 *
 * @author User
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humibity;
    private float pressure;
    private WeatherData weatherData;
    
    
    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" current conditions: " + temperature + " C degree and " + humibity + " % humibity " + " pressure " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humibity = humidity;
        this.pressure = pressure;
        display();
                
    }
    
}
  