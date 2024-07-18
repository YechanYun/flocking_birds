import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.shape.Circle
import javafx.animation.AnimationTimer

object Main extends JFXApp3 {
  // defining constants

  // ball
  private final val ballX = 50
  private final val ballY = 200
  private final val ballRad = 20
  private final val ballCol = Color.White
  private final val ballSpeed = 400 // pixels per second

  //
  
  override def start(): Unit = {
    val circle = new Circle {
      centerX = ballX
      centerY = ballY
      radius = ballRad
      fill = ballCol
    }

    val scene_obj = new Scene(800, 400) {
      fill = Color.Black
      content = circle
    }

    stage = new JFXApp3.PrimaryStage {
      title = "Circle Animation"
      scene = scene_obj
    }

    // Animation logic
    val animationTimer = new AnimationTimer() {
      private var lastUpdateTime = 0L

      override def handle(now: Long): Unit = {
        if (lastUpdateTime > 0) {
          val deltaTime = (now - lastUpdateTime) / 1e9 // Convert nanoseconds to seconds
          val speed = ballSpeed
          circle.centerX.value += speed * deltaTime

          // Reset circle position when it goes off-screen
          if (circle.centerX.value > scene_obj.width.value) {
            circle.centerX.value = 0
          }
        }
        lastUpdateTime = now
      }
    }

    animationTimer.start()
  }
}
