package triangles;

public class RightTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println("Triangle");
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		//opposite right triangle
		for(int i=1;i<=n;i++) {
			for(int k=n-i;k>0;k--) {
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	

}
