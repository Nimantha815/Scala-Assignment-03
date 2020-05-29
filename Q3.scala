object Q3{
	def main(args:Array[String]){
		println("Enter a Number:");
		var n = scala.io.StdIn.readInt();
		var x = sum(n);
		println("SUM: "+x);
		
		
		

}
	def sum(a:Int):Int={
		if(a==1){
		return 1;
}
		else{
		return a + sum(a-1);
	
}
	
}

}
