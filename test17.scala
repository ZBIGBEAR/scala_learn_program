import java.io._

object Test{
	def main(args:Array[String])={
		//使用new关键字创安金类的对象
		var p1:Point = new Point(3,4)
		//调用对象的public方法
		p1.move(10,20)
		p1.move(4,3)

		//定义一个子类
		var loc:Location = new Location(7,8,9)
		loc.move(4,5)
		loc.move(1,2,3)
		println(loc.toString())
	}
}
//注意，这里类的参数，如果写成var则表示不能被子类继承；如果写成val表示可以被子类继承

class Point(val xc:Int,val yc:Int){
	var x : Int = xc
	var y : Int = yc
	def move(tx:Int,ty:Int)={
		x += tx
		y += ty
		println("移动到（"+x+"，"+y+"）")
	}
	override def toString = "x="+x+",y="+y
}

//继承.应为x1,y1字段为父类的字段，属于重写，所以要加上override关键字.继承会继承父类的所有属性和方法，Scala 只允许继承一个父类
class Location(override val xc:Int,override val yc:Int,var z1:Int) extends Point(xc,yc){
	var z:Int = z1
	
	def move(xc:Int,yc:Int,zc:Int){
		x += xc
		y += yc
		z == zc
		println("移动到（"+x+"，"+y+"，"+z+"）")
	}
	
	//Scala重写一个非抽象方法，必须用override修饰符
	//override def toString = "横坐标是："+super.x+"，纵坐标是："+super.y+"，z轴坐标是："+z
	override def toString = "x="+x+",y="+y+",z="+z
}
