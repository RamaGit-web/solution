package question;

public class FindPrimeBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		System.out.println(isPrime(primes, 3));
		System.out.println(isPrime(primes, 4));
		System.out.println(isPrime(primes, 67));
		System.out.println(isPrime(primes, 36));

	}
	
	public static boolean isPrime(int[] prime, int num){
		int lowIndex = 0;
		int highIndex = prime.length - 1;
		while (lowIndex <= highIndex) {
			int midpoint = (lowIndex+highIndex)/2;
			if (prime[midpoint] == num) {
				return true;
			}
			if (prime[midpoint] > num) {
				highIndex = midpoint-1;
			}
			if (prime[midpoint] < num) {
				lowIndex = midpoint+1;
			}
		}
		return false;
		
	}

}
