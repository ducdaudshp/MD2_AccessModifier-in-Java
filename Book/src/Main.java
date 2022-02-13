import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Dế mèn phiêu lưu ký", "Tô hoài", 50, 5, 0.3 );
        listBook[1] = new Book("Cho tôi xin 1 vé đi tuổi thơ", "Nguyễn Nhật Ánh", 70, 10, 0.5 );
        listBook[2] = new Book("Truyện kiều", "Nguyễn Du", 40 , 3, 0.4 );
        listBook[3] = new Book("Yêu là đủ", "Tizi - Đích lép", 90 , 12, 0.4 );
        listBook[4] = new Book("Thần đồng đất Việt", "Kim Đồng", 20 , 20, 0.2 );

        int sum = getSumQuantity(listBook);
        System.out.println(sum);
        int sum1=getSumPrice(listBook);
        System.out.println(sum1);
        double sum2=getSumWeight(listBook);
        System.out.println(sum2);

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
//        long n;
        String n= input.nextLine();
        for (int i=0;i< listBook.length;i++){
            if (listBook[i].getName().equals(n)){
                System.out.println("Sách cần tìm của bạn đây!!!");
                System.out.print("Tên sách: ");
                System.out.println(listBook[i].getName());
                System.out.print("Tác giả: ");
                System.out.println(listBook[i].getAuthor());
                System.out.print("Giá thành: ");
                System.out.println(listBook[i].getPrice());
                System.out.print("Số lượng: ");
                System.out.println(listBook[i].getQuantity());
                System.out.print("Cân nặng: ");
                System.out.println(listBook[i].getWeight());
            }
        }
    }

    public static int getSumQuantity(Book[] books){
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getQuantity();
        }
        System.out.print("Tổng số cuốn là: ");
        return sum;
    }
    public static int getSumPrice(Book[] books){
        int sum1=0;
        for (int i = 0; i < books.length ; i++) {
            sum1+=books[i].getTotalPrice();
        }
        System.out.print("Tổng tiền của 5 tựa sách là: ");
        return sum1;
    }
    public static double getSumWeight(Book[] books){
        double sum2=0;
        for (int i = 0; i < books.length ; i++) {
            sum2+=books[i].getTotalWeight();
        }
        System.out.print("Tổng khối lượng 5 tựa sách là: ");
        return sum2;
    }
}
