object Test{
	def main(args:Array[String])={
		var arr = Array[Int](3,4)
		println(arr(0)+","+arr(1))
		var tmp = arr(0)
		arr(0)=arr(1)
		arr(1)=tmp
		println(arr(0)+","+arr(1))
	}
}
