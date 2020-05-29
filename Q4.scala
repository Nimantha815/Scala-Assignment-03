object Q4{
	def main(args:Array[String]){
		println("Enter a Number:");
		var n = scala.io.StdIn.readInt();
		var a= evenodd(n);
		if(a==true){
		println("It is an Even");


}
		else{
		println("It is an Odd");
}		
		

}

		def evenodd(x:Int):Boolean={
			if(x==0){
			return true;
		
}
			else if(x==1){
			return false;
}
			else{
			return evenodd(x-2);
}


}
}
