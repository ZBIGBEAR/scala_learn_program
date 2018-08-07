object Test{
	def main(args:Array[String]){
		var a : Int = 4;
		var b : Int = 5;
		print("a="+a+",b="+b+",a+b="+addInt(a))
	}

	def addInt(a: Int, b: Int = 6): Int = {
		return a+b;
	}
}
