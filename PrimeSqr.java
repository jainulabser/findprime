
public class PrimeSqr {
	public void prime() {
		int num=4880;
		double sqrt=Math.sqrt(num);
		int iSqrt=(int)sqrt;
		boolean flag=true;
		for(int i=2;i<=iSqrt;i++)
		{
			if(num%i==0)
			{
				flag=false;
				System.out.println("Not Prime");
				return;
			}
		}
		if(flag)
		{
			System.out.println("Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeSqr obj = new PrimeSqr();
		obj.prime();

	}

}
