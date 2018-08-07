object TestFor1{
	def main(args:Array[String]){
		var a=0;var b=0
		for(a <- 1 to 2;b <- 3 until 5){
			println("a="+a+",b="+b)
		}
	}
}
