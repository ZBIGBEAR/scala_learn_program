import scala.util.matching.Regex

object Test{
	def main(args:Array[String])={
		//使用 String 类的 r() 方法构造了一个Regex对象
		var pattern = "Scala".r
		var str = "Scala is Scalable and cool. i like Scala"
		//使用 findFirstIn 方法找到首个匹配项
		//println(pattern findFirstIn str)
		//使用findAllIn方法找出所有的匹配项,该方法返回的是iterator
		/*var iter = pattern findAllIn str
		while(iter.hasNext){
			println(iter.next())  //输出三个Scala
		}*/
		//使用mkString()方法连接正则表达式是匹配结果的字符串并可以使用管道(|)来设置不同的模式
		println((pattern findAllIn str).mkString(","))   //使用逗号连接返回结果
	}
}
