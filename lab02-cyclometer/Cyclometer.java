//Ritika Poddar
//CSE 002 Lab 02
//Date: 9/4/15

//Bicycle Cyclometer program:
//For two trips, given the time and rotation count, 
//this program will print the number of minutes for each trip,
//print the number of counts for each trip, 
//print the distance in miles of each trip,
//print the distance of two miles combined.
//
//
//the class
public class Cyclometer {
        // main method required for every Java program 
        public static void main(String[] args) { 
            // my input data
            int secsTrip1=480;  //the time in seconds for trip one
            int secsTrip2=3320; //the time in seconds for trip two
            int countsTrip1=1561;  // the number of rotations for trip one
            int countsTrip2=9037;  //the number of rotations for trip two
            
            //my intermediate variables and output data
            double wheelDiameter=27.0,  //the diameter of the front wheel
            PI=3.14159,  // the value of pi
            feetPerMile=5280,   // the number of feet per mile
            inchesPerFoot=12,   // the number of inches per foot
            secondsPerMinutes=60;   //the number of seconds per minutes
            double distanceTrip1, distanceTrip2, totalDistance;  // declaring the variables as doubles
            
            System.out.println("Trip 1 took" +
                (secsTrip1/secondsPerMinutes)+" minutes and had "+ countsTrip1+ "counts.");
            System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinutes)+" minutes and had "+
                countsTrip2+" counts.");
                
           // now run the calculations
           //
           //
          distanceTrip1=countsTrip1*wheelDiameter*PI; 
          // this gives the distance in inches
          //for each count, a rotation of the wheel travels the diameter(in inches) times PI
          distanceTrip1/=inchesPerFoot*feetPerMile;
          //this give the distance in Miles of trip one
          distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
          // this give the distanc ein miles of trip two
          totalDistance=distanceTrip1+distanceTrip2;
          // this calculates the total distance
          
          //Print out the output data
          System.out.println("Trip 1 was "+distanceTrip1+" miles");
          System.out.println("Trip 2 was "+distanceTrip2+" miles");
          System.out.println("the total distance was "+totalDistance+" miles");
          
          
          
          
            
            
            
            
            
        }  //end of main method
}