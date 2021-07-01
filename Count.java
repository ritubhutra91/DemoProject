import java.util.*;
class Count{
static String arr[] = {"Ritu","Ritu","Ritu","Rohit","Rohit","Ritu","Rohit","Rg"};

public static void main(String...args){
HashMap<String,Integer> nameCount = new HashMap<>();
for(int i=0;i<arr.length;i++){
int count = 1; //initial count
if(nameCount.containsKey(arr[i])){
count = nameCount.get(arr[i])+1;
}
nameCount.put(arr[i],count);
}

System.out.println(nameCount);
}
}