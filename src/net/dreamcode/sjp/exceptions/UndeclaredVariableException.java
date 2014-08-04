package net.dreamcode.sjp.exceptions;

import org.antlr.v4.runtime.Token;

/**
 * Copyright
 */
public class UndeclaredVariableException extends RuntimeException {

    private int lineNumber;
    private int columnNumber;
    private String varName;

    public UndeclaredVariableException(Token token) {
        lineNumber = token.getLine();
        columnNumber = token.getCharPositionInLine();
        varName = token.getText();
    }

    @Override
    public String getMessage() {
        return lineNumber + ":" + columnNumber + " undeclared variable <" + varName + ">";
    }
}
