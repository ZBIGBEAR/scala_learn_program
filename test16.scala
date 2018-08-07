object Test{
	def main(args:Array[String])={
		var it = Iterator("Alibaba","Google","Microsoft","Tencent","Baidu")
		while(it.hasNext){
			print(it.next()+"\t")
		}

		val itInt = Iterator(23,54,2,43,5,65,7,2)
		var itInt1 = Iterator(2,4,2,23,54,2,43,5,65,7,2)
		
		//查找最大值
		//println("max="+itInt.max)
		//查找最小值
		//println("min="+itInt1.min)
		//获取长度
		println(itInt.size)
		println(itInt1.length)
	}
}
