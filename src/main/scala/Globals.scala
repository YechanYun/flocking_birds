import scala.collection.mutable

object Constants {
  // scene
  final val sceneWidth = 800
  final val sceneHeight = 400

  // bird
  final val maxAngle = 360

  // updating bird's position/velocity
  final val sepFactor = 1
  final val alignFactor = 1
  final val cohesionFactor = 1
}

object TypeAliases {
  type Birds = mutable.Set[Bird]
}

