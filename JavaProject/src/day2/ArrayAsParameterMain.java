package day2;

public class ArrayAsParameterMain {
	
		
		private static float[] getSquareRoots(int[] numsArray) {
			int size = numsArray.length;
			float squareRoots[] = new float[size];//Building a dynamic array
			int index = 0;
			for(int num : numsArray) {
				float squareRoot = (float)Math.sqrt(num);//Type casting from 'double' to 'float'
				squareRoots[index] = squareRoot;
				index++;
			}
			return squareRoots;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int numbers[] = {34, 46,49, 81, 98};
			float allSquareRoots[] = getSquareRoots(numbers);
			for(float sqRoot : allSquareRoots)
				System.out.println(sqRoot);

		}

}
