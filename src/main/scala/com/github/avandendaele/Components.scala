package com.github.avandendaele

import com.github.avandendaele.admin.HealthController
import controllers.Default
import play.api.routing.Router
import play.api.{ApplicationLoader, BuiltInComponentsFromContext}
import play.filters.HttpFiltersComponents

final class Components(context: ApplicationLoader.Context) extends BuiltInComponentsFromContext(context)
  with HttpFiltersComponents {

  override def router: Router = new _root_.router.Routes(
    httpErrorHandler,
    new Default(),
    new HealthController(controllerComponents)
  )
}
