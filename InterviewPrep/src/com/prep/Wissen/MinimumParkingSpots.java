package com.prep.Wissen;

import java.io.*;
import java.util.*;

/**
 * QUESTION FROM HACKEREARTH TEST
 * You are operating a parking lot. People come and park their cars for time they booked in advance.Each parking booking consists of start and end time.One parking space can hold one car at a time.Find out the minimum numer of parking space needed to accomadate all the bookings.

int minParkingSpace(int [][] parking start and end time){

params: start and end time of each parking. e.g.
[
[0,10],
[5,20]
]

The first parking booking start at time=0 and ends at time=10,The second parking booking starts at time=5 and ends at time=20, 0<=time<=Integer.MAX_VALUE. The array is not sorted.

Returns: min number of parking required.

}

NOTE: If start of parking coincides with the end of another parking.You can cosider there is no extra space

Sample I/p:
4
5,10 0,20 25,40 35,45

Sample O/P: 2

Explanation:
We need two parking spaces since at any point of time there are at max two car parked

Space1:(0,20),(25,40)
Space 2:(5,10),(35,45)
 * Solution in O(n*log(n)) time
 * @author garijain
 *
 */
/*
 * Creating a class to record parking details i.e. time , and a boolean flag
 * to determining if its arrival time of not
 */
	class ParkingRecord implements Comparator<ParkingRecord> {

		int time;
		boolean arrived;

		public ParkingRecord(int time, boolean arrived) {
			this.time = time;
			this.arrived = arrived;
		}

		public ParkingRecord() {
			
		}
		
		public int compare(ParkingRecord p1, ParkingRecord p2) {
			return p1.time - p2.time;
		}
		
		public String toString(){
			return ("Time: "+time+" and is it arrival time: "+arrived);
		}
		}
		/*
		 * Main class
		 */
		public class MinimumParkingSpots {
		static int minParkingSpaces(int[][] parkingStartEndTimes) {

			int minParkingReqd = 0;
			int carCount = 0;
			//Creating a list to store parking records
			List<ParkingRecord> parkingRecords = new ArrayList<ParkingRecord>();
			
			//Adding the records from the matrix
			//parkingStartEndTimes.length gives number of rows i.e. total timestamps entered
			for (int i = 0; i < parkingStartEndTimes.length; i++) {
				/*
				 * We know that there are 2 columns in each row; 0th column is arrival time, and 1st one
				 * is departure time, setting arrival flag as true & false respectively.
				 */
				
				parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][0], true));
				parkingRecords.add(new ParkingRecord(parkingStartEndTimes[i][1], false));
			}
			 
			//Printing the records in the arraylist for understanding
			System.out.println("Timestamps Details"+parkingRecords);
			
			//Using Comparator sorting for the list
			Collections.sort(parkingRecords, new ParkingRecord());;
			
			//Printing the records in the sorted arraylist for understanding
			System.out.println("Timestamps Details"+parkingRecords);
			
			/*
			 * Now we will iterate through the sorted list of records and whenever we will see
			 * arrival of any car i.e. new entry we are increasing the counter carCount and whenever any car goes 
			 * we will see decrement it.
			 * We are storing count value from carCount in minParkingreqd ; we store whatever is max out of 
			 * carCount or minParkingReqd because we need the parking to accomodate all card with the 
			 * overlapping of time
			 * 
			 */
			for (ParkingRecord pr : parkingRecords) {
				if (pr.arrived) {
					carCount++;
					/*
					 * This value stores the parking reqd as carCount will keep varying while we are
					 * iterating through the list
					 * for eg 
					 * 3
					   5,10 10,15 15,20
					   Timestamps Details[Time: 5 and is it arrival time: true,
									      Time: 10 and is it arrival time: false, 
									      Time: 10 and is it arrival time: true, 
									      Time: 15 and is it arrival time: false, 
									      Time: 15 and is it arrival time: true, 
									      Time: 20 and is it arrival time: false]
									      we can see carCount will be +1,0,+1,0,+1,-0
						So storing the max value in minParkingReqd helps
					 * 5
						0,20 5,10 15,35 40,60 35,45 ## Output = 2
						Timestamps Details[Time: 0 and is it arrival time: true,  ##carCount = 1;minParkingReqd(MAX)=1
											Time: 5 and is it arrival time: true, ##carCount = 2;minParkingReqd=2
											Time: 10 and is it arrival time: false,##carCount = 1;minParkingReqd=2 
											Time: 15 and is it arrival time: true,##carCount = 2;minParkingReqd=2 
											Time: 20 and is it arrival time: false,##carCount = 1;minParkingReqd=2 
											Time: 35 and is it arrival time: false,##carCount = 0;minParkingReqd=2 
											Time: 35 and is it arrival time: true, ##carCount = 1;minParkingReqd=2
											Time: 40 and is it arrival time: true, ##carCount = 2;minParkingReqd=2
											Time: 45 and is it arrival time: false, ##carCount = 1;minParkingReqd=2
											Time: 60 and is it arrival time: false]##carCount = 0;minParkingReqd=2

						 * 5
						0,20 5,10 15,35 30,60 34,45
						Output = 3

					 */
					
					minParkingReqd = Math.max(minParkingReqd, carCount);
				} else {
					carCount--;
				}
			}
			return minParkingReqd;
		}

		// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter wr = new PrintWriter(System.out);
			int n = Integer.parseInt(br.readLine().trim());
			int[][] parkingStartEndTimeList = new int[n][2];
			String[] parkingStartEndTimes = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
				for (int j = 0; j < parkingStartEndTime.length; j++) {
					parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
				}
			}

			int out = minParkingSpaces(parkingStartEndTimeList);
			System.out.println(out);

			wr.close();
			br.close();
		}
		}


