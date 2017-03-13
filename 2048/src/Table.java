
public class Table {
	
	public int[][] grid;
	public Table()
	{
		grid = new int[4][4];
		
		for(int z = 0; z<4; z++)
		{
			for(int c = 0; c<4; c++)
			{
				//JLabel el = new JLabel("",JLabel.CENTER);
				//Font settings, put in Gui
				
				grid[z][c] = 0;
			}
		}
		
	}


	public boolean equals(Object other){
		if(other == this) return true;
		if(other == null) return false;
		if(getClass() != other.getClass()) return false;
		if(this.hashCode() == other.hashCode()) return true;
		
		return false;
	}

	
	public String toString()
	{
		String s = "";
		
		for(int q = 0; q < 4; q++)
		{
			for(int w = 0; w < 4; w++)
			{
				s += "-" + grid[q][w];
			}
		}
		return s;
	}
}

