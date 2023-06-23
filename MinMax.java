class MinMax {
    public static void main(String[] args) {
        int[] a = {1,2,1,4,5};
        int min = 0; 
        int max = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                min = a[i];
            }else{
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        
    }
}