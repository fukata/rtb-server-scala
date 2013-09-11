import com.ad_stir.rtb._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new RTBServerServlet, "/*")
  }
}
