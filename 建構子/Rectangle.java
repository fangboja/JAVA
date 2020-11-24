
public class Rectangle {
  int width=25,height=10;
  public  Rectangle(){
      System.out.println("25*10 的長方形");
  }
  public Rectangle(int length){
      width=length;
      height=length;
      if(length>0){
         System.out.println("邊長="+length+"正方形");
     }
     else{
         System.out.println("請從新輸入");
     }
  }
  public Rectangle(int width, int height){
      this.width=width;
      this.height=height;
      if(width<0){
          System.out.println("請從新輸入");
      }
      if(height<0){
        System.out.println("請從新輸入");  
      }
      System.out.println("邊長="+width+"邊長="+height);
  }
  public int getArea(){
      return width*height;
  }
  public void draw(){
      for(int i=1;i<=width;i++){
          for(int j=1;j<=height;j++){
              System.out.print("*");
          }
          System.out.println("");
      }
  }
}
