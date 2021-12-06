package fop.w10pass;

@SuppressWarnings("serial")
public class IllegalCharException extends Exception{
    private char used;
    public IllegalCharException(char used)
    {
        this.used = used;
    }

    private String escapeSpecial(char used) {
        switch (used) {
        case '\n':
            return "line break (\\n)";
        case '\t':
            return "tab (\\t)";
        case '\r':
            return "carriage return (\\r)";
        case ' ':
            return "whitespace";
        case '\b':
            return "backspace (\\b)";
        case '\f':
            return "formfeed (\\f)";
        default:
            return Character.toString(used);
        }
    }
}
