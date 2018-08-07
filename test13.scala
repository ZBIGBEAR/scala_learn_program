import Array._
object Test{
	def main(args:Array[String]){
		//创建一个四行三列的二维数组
		var arr = ofDim[Int](4,3)
		var num = 0
		//初始化二维数组
		for(i <- 0 to (arr.length-1)){
			for( j <- 0 to (arr(0).length-1) ){
				arr(i)(j) = num
				num +=1
			}
		}

		//输出二维数组
		for(i <- 0 to (arr.length-1)){
                        for( j <- 0 to (arr(0).length-1) ){
                                print(arr(i)(j)+"\t")
                        }
			println()
                }
	}
}
