package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class DashboardController extends Controller {
    
    public static Result index() {
        return ok(views.html.index.render("Hello from Java"));
    }
    
}
