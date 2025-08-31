public class Final_id {
    int user_id; 
    Final_id(int user_id){
        this.user_id = user_id; 
    }

    public static void main(String[] args) {
        Final_id f1 = new Final_id(234);
        System.out.println("User ID: " + f1.user_id);
    }
}
