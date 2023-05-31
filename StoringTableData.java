package day21_2DArray;

public class StoringTableData {

	public static void main(String[] args) {
		String companies[] = {"Alfreds Futterkiste","Centro comercial Moctezuma","Ernst Handel","Island Trading","Laughing Bacchus Winecellars","Magazzini Alimentari Riuniti"};
		String contactes[] = {"Maria Anders","Francisco Chang","Roland Mendel","Helen Bennett","Yoshi Tannamuri","Giovanni Rovelli"	};
		String contries[] = {"Germany","Mexico","Austria","UK","Canada","Italy"};
	
		String table[][] = {companies,contactes , contries };
		
		
//		for (int i = 0 ; i < table.length ; i++) {
//			
//			for (int j = 0 ; j < table[i].length ; j++) {
//				System.out.println(table[i][j]);
//			}
//			
//		}
		
		
		for (int i = 0 ; i < companies.length ; i++) {
			System.out.println(companies[i] +"\t"+contactes[i]+"\t"+contries[i]);
		}
		
		
		
		
		
		
		
		
		
	
	}
}