class Main {
  public static void main(String[] args) {
    double FeNo33 = 0.200;
		double SCN = 0.002;
		
		double[][] Data = {{5, 0, 45}, {5,2, 43}, {5, 3, 42}, {5, 4, 41},{5, 5, 40}};
		int i = 0;
	for(double[] d : Data){
		
		double M1 = SCN;
		double V1 = d[1];
		double V2 = d[0]+d[1]+d[2];
		double M2 = (M1*V1)/V2;

		i++;
		System.out.println(M2);
	}
		

		
  }
}