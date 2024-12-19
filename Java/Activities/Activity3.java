package Activity1;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double EarthSeconds = 31557600;

        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

    
        double ageOnEarth = seconds / EarthSeconds;
        double ageOnMercury = ageOnEarth / MercurySeconds;
        double ageOnVenus = ageOnEarth / VenusSeconds;
        double ageOnMars = ageOnEarth / MarsSeconds;
        double ageOnJupiter = ageOnEarth / JupiterSeconds;
        double ageOnSaturn = ageOnEarth / SaturnSeconds;
        double ageOnUranus = ageOnEarth / UranusSeconds;
        double ageOnNeptune = ageOnEarth / NeptuneSeconds;

        //to print calculated ages
        System.out.println("Age on Earth: " + ageOnEarth + " years");
        System.out.println("Age on Mercury: " + ageOnMercury + " years");
        System.out.println("Age on Venus: " + ageOnVenus + " years");
        System.out.println("Age on Mars: " + ageOnMars + " years");
        System.out.println("Age on Jupiter: " + ageOnJupiter + " years");
        System.out.println("Age on Saturn: " + ageOnSaturn + " years");
        System.out.println("Age on Uranus: " + ageOnUranus + " years");
        System.out.println("Age on Neptune: " + ageOnNeptune + " years");
    }
}

