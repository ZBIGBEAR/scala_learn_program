object Test{
	def main(args:Array[String])={
		var x = Test(5)
		x match {
			case Test(num) => println(x+"是"+num+"的两倍")
			case _ => println("无法计算")
		}
	}

	def apply(x:Int):Int = x*2

	def unapply(x:Int):Option[Int]={
		if(x%2==0){
			return Some(x/2)
		}else{
			return None
		}
	}
}
