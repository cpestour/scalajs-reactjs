package io.github.shogowada.scalajs.reactjs.example.helloworld

import io.github.shogowada.scalajs.reactjs.VirtualDOM._
import io.github.shogowada.scalajs.reactjs.{React, ReactDOM}
import org.scalajs.dom

import scala.scalajs.js.JSApp

object Main extends JSApp {
  def main(): Unit = {
    case class WrappedProps(name: String)

    val reactClass = React.createClass[WrappedProps, Unit](
      (self) => <.div(^.id := "hello-world")(s"Hello, ${self.props.wrapped.name}!")
    )

    val mountNode = dom.document.getElementById("mount-node")
    ReactDOM.render(<(reactClass)(^.wrapped := WrappedProps("World"))(), mountNode)
  }
}
