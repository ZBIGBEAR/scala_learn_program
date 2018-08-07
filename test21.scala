import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Test{
	def main(args:Array[String])={
		var fileName:String = "1.txt"
		try{
			var fr = new FileReader(fileName)
		}catch{
			case ex:FileNotFoundException => {
				println("file "+fileName+" not exists")
			}
			 case ex:IOException => {
				println("open file"+fileName+" error")
			}
		}finally{
			println("finally......")
		}
	}
}
