object test{
	def main(args:Array[String]){
		showTime();
		delay(showTime);
	}

	def delay(t : => Long ) = {
		println("delay内部调用")
		println("t="+t)
	}
	def showTime(): Long ={
		print("test调用")
		return System.nanoTime
	}
}
