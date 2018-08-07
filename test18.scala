trait testTrain{
	def isEqual(obj :Any):Boolean;
	def isNotEqual(obj:Any):Boolean ={
		return !isEqual(obj)
	}
}

class Point(xc:Int,yc: Int) extends testTrain{
	var x: Int = xc ;
	var y: Int = yc ;
	def isEqual(obj:Any):Boolean={
		return obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
	}
}

object Test{
	def main(args:Array[String]){
		var p1:Point = new Point(2,3)
		var p2:Point = new Point(2,4)
		var p3:Point = new Point(3,3)
		println(p1.isNotEqual(p2))
		println(p1.isNotEqual(p3))
		println(p1.isNotEqual(2))
	}
}
