bool checkArmstrong(int n){
	//Write your code here
	 int temp, digits=0, last=0, sum=0;   
        temp = n; 
        for(; temp > 0; temp = temp/10)
        {
            digits++;
        }
        temp = n;   
        for(; temp > 0; temp = temp/10) 
        {   
            last = temp % 10;   
            sum +=  (pow(last, digits));   
        }  
        if(n == sum)   
            return true;      
        else 
            return false;
}
