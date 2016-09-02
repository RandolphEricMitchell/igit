package controllers

import play.api._
import play.api.mvc._

class AppViewController extends Controller {

  def index = Action {
    Ok(views.html.app-view("Your new application is ready."))
  }

}
