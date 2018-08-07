object Test{
	def main(args:Array[String])={
		val result = add2(2)(4);
		//val result1 = add2(4);
		//val sum = result(3);
		println("result="+result);
		//println("sum="+sum);
	}
	
	def add2(x:Int)(y:Int) = x+y
}
