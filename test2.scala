object Test{
	def main(args:Array[String]){
		printInfo("zjx","I","love","you")
	}

	def printInfo(strs:String* ) = {
		var i: Int  = 0
		for ( str <- strs ){
			println("str["+i+"]="+str)
			i += 1
		}
	}
}
