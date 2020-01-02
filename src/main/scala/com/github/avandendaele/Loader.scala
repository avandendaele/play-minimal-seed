package com.github.avandendaele

import play.api.{Application, ApplicationLoader}

class Loader extends ApplicationLoader {
  override def load(context: ApplicationLoader.Context): Application =
    new Components(context).application
}