public class SapXep {
    public static void main(String[] args) {
        int [] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random()*10);
        }
        StopWatch stopWatch = new StopWatch();
        System.out.println("thời gian bắt đầu là:"+stopWatch.start());
        int [] newArray = Sapxep(arr);
        System.out.println("thời gian kết thúc là:"+stopWatch.stop());
        System.out.println("tổng số thời gian thực hiện là:"+stopWatch.getElapsedTime());
        for (int number:newArray
             ) {
            System.out.println(number);
        }
    }
    public static int [] Sapxep(int [] a){
       int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    return a;
    }
}
