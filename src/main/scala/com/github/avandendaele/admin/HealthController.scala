package com.github.avandendaele.admin

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

final class HealthController(cc: ControllerComponents) extends AbstractController(cc) {

  def health = Action {
    Option("test-cr").get
    Ok(Json.obj(
      "status" -> "up",
      "cr" -> Option("test-cr").get
    ))
  }

}
