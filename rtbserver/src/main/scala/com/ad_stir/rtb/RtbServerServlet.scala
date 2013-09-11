package com.ad_stir.rtb

import org.scalatra._
import scalate.ScalateSupport

class RtbServerServlet extends RtbserverStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
