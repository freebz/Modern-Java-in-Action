// 패턴 매칭

if (op instanceof BinOp) {
    Expr e = ((BinOp) op).getLeft();
}


switch (someExpr) {
    case (op instanceof BinOp):
	doSomething(op.getOpName(), op.getLeft(), op.getRight());
    case (n instanceof Number):
	dealWithLeafNode(n.getValue());
    default:
	defaultAction(someExpr);
}
