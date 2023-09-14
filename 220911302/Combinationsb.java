public class Combinationsb {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1;i<5;i++){
            for(int j = 1;j<5;j++){
                for(int k =1;k<5;k++){
                    for(int l = 1;l<5;l++){
                        if(i!=k && k!=l && j!=k && i!=j && i!=l && j!=l){
                        System.out.println(i+""+j+""+k+ ""+l); count++;}
                    }
                }
            }
        }
        System.out.println(count);
    }
}
