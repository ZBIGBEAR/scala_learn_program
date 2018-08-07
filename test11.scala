/**
处理数组
*/
object Test{
	def main(args:Array[String])={
		var arrFloat = Array[Float](2.5f,3.7f,5.4f,3.5f,2.1f,9.8f,3.2f,4.2f,2f,6.1f,4.4f,2.2f,6.9f,2.2f,5.3f,7.1f,3.3f)
		//遍历
		println("原始数组：")
		printArr(arrFloat)
		
		//求和
		var sum = sumArr(arrFloat)
		println("数组的和："+sum)

		//求平均值
		var avg = avgArr(arrFloat)
		println("数组的平均值："+avg)
	
		//最大值、最小值
		var arrMaxMin = maxMinArr(arrFloat)
		println("最大值是："+arrMaxMin(0)+"，最小值是"+arrMaxMin(1))
		
		//二分法排序
		binarySort(arrFloat)
		println("二分法排序：")
		printArr(arrFloat)
	}
	
	/**
	数组遍历
	*/
	def printArr(arr:Array[Float])={
		for(a <- arr){
			print(a+"\t")
		}
		println()
	}

	/*
	数组求和
	*/
	def sumArr(arr:Array[Float]): Float = {
		var sum:Float = 0.0f
		for(i <- 0 to (arr.length-1) ){
			sum += arr(i)
		}
		return sum
	}

	/*
	数组求平均值
	*/
	def avgArr(arr:Array[Float]): Double = {
		var sum:Float = 0.0f
		for(a <- arr){
			sum += a
		}
		return sum*1.0/arr.length
	}

	/*
	求数组最大值、最小值
	*/
	def maxMinArr(arr:Array[Float]):Array[Float] = {
		var max:Float = arr(0)
		var min:Float = arr(0)
		for(a<- arr){
			if(a>max){
				max=a
			}
			if(a<min){
				min=a
			}
		}
		return Array(max,min)
	}
	
	/*
	使用二分法对数组进行排序
	*/
	def binarySort(arr:Array[Float]):Array[Float] = {
		mySort(arr,0,arr.length-1)
		return arr
	}

	def mySort(arr:Array[Float],begin:Int,end:Int):Unit = {
		//print("begin="+begin+",end="+end)
		if(begin<end){
			var i:Int = begin+1
			var j:Int = end
			var mid = begin
			while(i<j){
				while(i<j && arr(j)>=arr(mid)){
					j -=1
				}
				//println("1111111111,i="+i+",j="+j+",mid="+mid)
				//printArr(arr)
				//交换arr(j)与arr(mid)
				if(i<j){
					var tmp = arr(j)
					arr(j)=arr(mid)
					arr(mid)=tmp
					mid=j
				}
				while(i<j && arr(i)<=arr(mid)){
					i +=1
				}
				//println("2222222222,i="+i+",j="+j+",mid="+mid)
				//printArr(arr)
				if(i<j){
					var tmp = arr(i)
					arr(i)=arr(mid)
					arr(mid)=tmp
					mid=i
				}
			}
			mySort(arr,begin,mid-1)
			mySort(arr,mid+1,end)
		}
	}
}
