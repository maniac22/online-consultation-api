package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import javax.inject.Inject

class SignUpController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def pong(): Action[AnyContent] = Action {
    Ok(Json.toJson("pong"))
  }
}