object Test{
	def main(args:Array[String]){
		//字符串列表
		var strList:List[String] = List("C++","C","Java","Python","Go","php","Scala")
		for(s <- strList){
			print(s+"\t")
		}
		println()
		
		//整型列表
		var intList: List[Int] = List(1,3,5,3,6,4)
		for(i <- intList){
			print(i+"\t")
		}
		println()

		var empty: List[Nothing] = List()
		println("empty.size="+empty.length)

		//二维列表
		var vecList: List[List[Int]] = List(List(1,2,3),List(4,5,6,7),List(8))
		for(i <- 0 to (vecList.length-1)){
			for(j <- 0 to (vecList(i).length-1)){
				print(vecList(i)(j)+"\t")
			}
			println()
		}

		var vecList1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
                for(i <- 0 to (vecList1.length-1)){
                        for(j <- 0 to (vecList1(i).length-1)){
                                print(vecList1(i)(j)+"\t")
                        }
                        println()
                }
	}
}
