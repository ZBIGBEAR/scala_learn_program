object Test{
	def main(args:Array[String]){
		println(inc(3))
		println(mul(4,5))
		println(printTime())
	}

	var inc = (x:Int) => x+1;
	var mul = (x:Int, y:Int) => x*y;
	var printTime = () => System.nanoTime;
}
