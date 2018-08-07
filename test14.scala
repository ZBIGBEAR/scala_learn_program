import Array._

object Test{
	def main(args:Array[String]){
		var arr1 = range(10,20,2)
		var arr2 = range(10,20)
		var arr3 = concat(arr1,arr2)
		
		printArr(arr1)
		printArr(arr2)
		printArr(arr3)
	}

	def printArr(arr:Array[Int]) = {
		for(a <- arr){
			print(a+"\t")
		}
		println()
	}
}
