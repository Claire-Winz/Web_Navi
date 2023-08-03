package PageManage;

import Controller.Scan;

public class PageController {

    Page page = new Page();

    Scan scan = new Scan();

    public void visit() {
        page.backPage.push(page.getURL());
        page.pageURL = scan.sc.next();
        page.forwardPage.clear();
        System.out.println(page.getURL());
    }

    public void back() {
        if(page.backPage.empty()) {
            System.out.println("Ignored");
        } else {
            page.forwardPage.push(page.getURL());
            page.pageURL = page.backPage.pop();
            System.out.println(page.getURL());
        }
    }

    public void forward() {
        if(page.forwardPage.empty()) {
            System.out.println("Ignored");
        } else {
            page.backPage.push(page.getURL());
            page.pageURL = page.forwardPage.pop();
            System.out.println(page.getURL());
        }
    }
}
