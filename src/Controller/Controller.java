package Controller;

import PageManage.*;

public class Controller {

    PageController pc = new PageController();
    Scan scan = new Scan();

    public void run() {

        boolean run = true;

        while(run) {
            switch (scan.sc.next()) {
                case "VISIT":
                    pc.visit();
                    break;

                case "BACK":
                    pc.back();;
                    break;

                case "FORWARD":
                    pc.forward();
                    break;

                case "QUIT":
                    run = false;
                    break;
            }
        }
    }
}
