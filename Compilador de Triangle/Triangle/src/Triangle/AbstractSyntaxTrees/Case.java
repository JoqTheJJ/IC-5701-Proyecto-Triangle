
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class Case extends AST {
  public Case(ConstantList cAST, Expression eAST, SourcePosition pos) {
    super(pos);
    C = cAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitCase(this, o);
  }

  public ConstantList C;
  public Expression E;
}