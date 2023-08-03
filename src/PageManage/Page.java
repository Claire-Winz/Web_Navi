package PageManage;

import java.util.Stack;

public class Page {

    String pageURL = "http://www.acm.org/";

    Stack<String> forwardPage = new Stack<>();
    Stack<String> backPage = new Stack<>();

    public String getURL() { return pageURL; }
}
