
	public class CabinRental 	
	{
		private int cabinNum;
		protected int rate;
		public CabinRental(int number) 
		{
			cabinNum=number;
			if(number==1 || number==2 || number==3)
			{
				rate=950;
			}

			else
			{
				rate=1100;
			}
		}

		public int getCabinNum()
		{
			return cabinNum;
		}

		public int getRate() 
		{
			return rate;
		}
		

}