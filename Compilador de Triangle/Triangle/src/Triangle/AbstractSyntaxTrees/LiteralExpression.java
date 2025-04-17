
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class LiteralExpression extends Expression {
  
  public LiteralExpression(String spelling, SourcePosition position) {
    super(position);
    this.spelling = spelling;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitLiteralExpression(this, o);
  }
  
  public final String spelling;
}