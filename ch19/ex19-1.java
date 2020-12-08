// 예제 19-1 패턴 매칭을 구현해서 표현식을 단순화함

public static Expr simplify(Expr e) {
    TriFunction<String, Expr, Expr, Expr> binopcase =
	(opname, left, right) -> {
	    if ("+".equals(opname)) {
		if (left instanceof Number && ((Number) left).val == 0) {
		    return right;
		}
		if (right instanceof Number && ((Number) right).val == 0) {
		    return left;
		}
	    }
	    if ("*".equals(opname)) {
		if (left instanceof Number && ((Number) left).val == 1) {
		    return right;
		}
		if (right instanceof Number && ((Number) right).val == 1) {
		    return left;
		}
	    }
	    return new BinOp(opname, left, right);
        };
    Function<Integer, Expr> numcase = val -> new Number(val);
    Supplier<Expr> defaultcase = () -> new Number(0);

    return patternMatchExpr(e, binopcase, numcase, defaultcase);
}
