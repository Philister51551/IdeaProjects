public class Queen{
//同栏是否有皇后，1表示有
private int[] column;
//右上至左下是否有皇后
private int[] rup;
//左上至右下是否有皇后
private int[] lup;
//解答
private int[] queen;
//解答编号
private int num;
public Queen(){
column=new int[6+1];
rup=new int[(2*6)+1];
lup=new int[(2*6)+1];
for(int i=1;i<=6;i++)
column[i]=0;
for(int i=1;i<=(2*6);i++)
rup[i]=lup[i]=0;  //初始定义全部无皇后
 
queen=new int[6+1];
}
 
public void backtrack(int i){
if(i>6){
showAnswer();
}else{
for(int j=1;j<=6;j++){
if((column[j]==0)&&(rup[i+j]==0)&&(lup[i-j+6]==0)){
//若无皇后
queen[i]=j;
//设定为占用
column[j]=rup[i+j]=lup[i-j+6]=1;
backtrack(i+1);  //循环调用
column[j]=rup[i+j]=lup[i-j+6]=0;
}
}
}
}
 
protected void showAnswer(){
num++;
System.out.println("\n解答"+num);
 
for(int y=1;y<=6;y++){
for(int x=1;x<=6;x++){
if(queen[y]==x){
System.out.print("Q");
}else{
System.out.print(" . ");
}
}
 
System.out.println();
}
}
 
public static void main(String[]args){
Queen queen=new Queen();
queen.backtrack(1);
}
}