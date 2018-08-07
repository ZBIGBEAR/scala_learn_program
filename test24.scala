import java.io._
object Test{
	def main(args:Array[String])={
		var fileName:String = "data/1.txt"
		var write = new PrintWriter(new File(fileName))
		write.write("test file")
		write.close()
	}
}
