public class Queen{
//ͬ���Ƿ��лʺ�1��ʾ��
private int[] column;
//�����������Ƿ��лʺ�
private int[] rup;
//�����������Ƿ��лʺ�
private int[] lup;
//���
private int[] queen;
//�����
private int num;
public Queen(){
column=new int[6+1];
rup=new int[(2*6)+1];
lup=new int[(2*6)+1];
for(int i=1;i<=6;i++)
column[i]=0;
for(int i=1;i<=(2*6);i++)
rup[i]=lup[i]=0;  //��ʼ����ȫ���޻ʺ�
 
queen=new int[6+1];
}
 
public void backtrack(int i){
if(i>6){
showAnswer();
}else{
for(int j=1;j<=6;j++){
if((column[j]==0)&&(rup[i+j]==0)&&(lup[i-j+6]==0)){
//���޻ʺ�
queen[i]=j;
//�趨Ϊռ��
column[j]=rup[i+j]=lup[i-j+6]=1;
backtrack(i+1);  //ѭ������
column[j]=rup[i+j]=lup[i-j+6]=0;
}
}
}
}
 
protected void showAnswer(){
num++;
System.out.println("\n���"+num);
 
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