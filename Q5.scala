object Q5{
	def main(args:Array[String]){
		println("Enter a Number:");
		var n = scala.io.StdIn.readInt();
		var x = sumEven(n);
		println("SUM: "+x);
		
		
		

}
	def sumEven(a:Int):Int={
		if(a==1 || a==0){
		return 0;
}
		else{
		if(a%2==0){
		return a + sumEven(a-1);
}
		else{
		return sumEven(a-1);
}	
}
	
}

}
