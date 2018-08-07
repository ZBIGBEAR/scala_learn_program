object Test{
	def main(args:Array[String])={
		var fVar = 12.345
		var dVar = 11
		var sVar = "Hello,Scala" 
		var str1 = printf("浮点型:%f,整型:%d,字符串:%s",fVar,dVar,sVar)
		print("str1="+str1.toString())

		//var str2 = "".format("浮点型:%f,整型:%d,字符串:%s",fVar,dVar,sVar)
		//print("str2="+str2)
	}
}
