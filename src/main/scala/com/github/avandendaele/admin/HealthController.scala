package com.github.avandendaele.admin

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

final class HealthController(cc: ControllerComponents) extends AbstractController(cc) {

  def health = Action {
    Ok(Json.obj("status" -> "up"))
  }

}
