package assignment09;

import java.util.function.BinaryOperator;

public class Driver<T> {

		public boolean check(Group<T> g, Set<T> s) throws NotInException{
			for (T i:g.getSet()){
				for (T j:g.getSet()){
					if (!s.contains(g.combine(i,j))){
						return false;
					}
				}
			}
			return true;
		}
		
		public boolean check2(Group<T> g) throws NotInException{
			return check(g,g);
		}
		
		public Ring<T> generateRing(BinaryOperator<T> combine, BinaryOperator<T> mult, T start) throws NotInException{
			Ring<T> ring = new Ring<T>(combine, mult);
			ring.add(start);
			T tmp = ring.combine(start,start);
			ring.add(tmp);
			T tmp2 = ring.combine2(start,tmp);
			ring.add(tmp2);
			
			while (ring.getSet().size()<29){
				tmp = ring.combine(tmp, tmp2);
				ring.add(tmp);
				tmp2 = ring.combine2(tmp, tmp2);
				ring.add(tmp2);
			}
			
			return ring;
		}
}
