package assignment09;

import java.util.function.BinaryOperator;

public class Ring<T> extends Group<T>{
	private BinaryOperator<T> mult;

	public Ring(BinaryOperator<T> binop1, BinaryOperator<T> binop2) {
		super(binop1);
		this.mult = binop2;
	}
	
	public T combine2(T a, T b)throws NotInException {
        if(!this.contains(a) || !this.contains(b)) {
            throw new NotInException();
        }
        return this.mult.apply(a, b);
    }
	
	
}
