import Constants._

class Bird(
          val id: Double,
          private var centerX: Double,
          private var centerY: Double,
          private var velocityX: Double,
          private var velocityY: Double
          ) {

  def getCenterX: Double = centerX
  def getCenterY: Double = centerY
  def getVelocityX: Double = velocityX
  def getVelocityY: Double = velocityY

  def setCenterX(newVal: Double): Either[String, Boolean]= {
    if (newVal < 0 || newVal >= sceneWidth) {
      return Left(s"centerX $newVal out of bounds (0, $sceneWidth)")
    }
    centerX = newVal
    Right(true)
  }

  def setCenterY(newVal: Double): Either[String, Boolean] = {
    if (newVal < 0 || newVal >= sceneHeight) {
      return Left(s"centerY $newVal out of bounds (0, $sceneHeight)")
    }
    centerY = newVal
    Right(true)
  }

  def setVelocityX(newVal: Double): Either[String, Boolean] = {
    velocityY = newVal
    Right(true)
  }

  def setVelocityY(newVal: Double): Either[String, Boolean] = {
    velocityX = newVal
    Right(true)
  }
}
