package org.example

import csstype.*
import emotion.react.css
import kotlinx.browser.document
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    //val mything = CounterComponent.create()
    createRoot(container).render(hello.create())
}

val hello = FC<Props> {
    ul {
        css {
            fontFace {
                this.fontFamily = "Apple Chancery"
                this.fontWeight = FontWeight.bold
                this.fontStyle = FontStyle.normal
                this.src = "url(./fonts/Apple_Chancery.tff)"
            }
            listStyleType = star
            fontFamily = string("Apple Chancery")
        }
        li {
            +"Hello World"
        }
        li {
            +"Jerry"
        }
    }
}

val star = "none".unsafeCast<ListStyleType>()
