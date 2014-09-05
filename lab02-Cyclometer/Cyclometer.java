////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/5/2014
//Lab 02
//Cyclometer Java Program
//record two kinds of data
//the time elapsed in seconds
//the number of rotations of the front wheel during that time
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    
    //  main method required for every Java profram
        public static void main(String[] args) {
            //  our input data. 
            int secsTrip1=480;  //time of the first trip in minutes
            int secsTrip2=3220; //time of the second trip in minutes
            int countsTrip1=1561;   //rotation count of the first trip
            int countsTrip2=9037;   //rotation count of the second trip
            double wheelDiameter=27.0,  //diameter of the wheels
            PI=3.14159, //π
            feetPerMile=5280,   //5280 feet per mile
            inchesPerFoot=12,   //12 inches per foot
            secondsPerMinute=60;    //60 seconds per minute
            double distanceTrip1,   distanceTrip2, totalDistance;   //the distance for two trips combined
            
            System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
            System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
                
                //print the number of minutes for each trip
                //print the number of counts for each trip
                //print the distance of each trip in miles
                //print the distance for the two trips combined
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            // Above gives distance in inches
            // (for each count, a rotation of the wheel travels
            //the diameter in inches times PI)
            distanceTrip1/=inchesPerFoot*feetPerMile; // Give distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
                //Print out the output data.
            System.out.println("Trip 1 was "+ distanceTrip1 +" miles");
            System.out.println("Trip 2 was "+ distanceTrip2 +" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
            

        }   //end of main method
}   //end of class