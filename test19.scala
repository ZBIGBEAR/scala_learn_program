object Test{
	def main(args:Array[String])={
		for(i <- 0 to 5){
			println(i+"="+myMatch(i))
		}
		println("one="+myMatch("one"))
	}

	def myMatch(x:Any):Any = x match {
		case 1 => "one"
		case 2 => "two"
		case 3 => "three"
		case "one" => 1
		case "two" => 2
		case _ => "many"
	}
}
