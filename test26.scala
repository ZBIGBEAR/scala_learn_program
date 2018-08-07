import scala.io.Source
object Test{
	def main(args:Array[String])={
		var fileName = "data/2.txt"
		Source.fromFile(fileName).foreach{
			print
		}
	}
}
