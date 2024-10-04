public class HinhChuNhat {
    // Thuộc tính chiều dài và chiều rộng
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    public static void main(String[] args) {
        // Tạo đối tượng HinhChuNhat
        HinhChuNhat hcn = new HinhChuNhat(5, 3);

        // In kết quả ra màn hình
        System.out.println("Chiều dài: " + hcn.chieuDai);
        System.out.println("Chiều rộng: " + hcn.chieuRong);
        System.out.println("Diện tích: " + hcn.tinhDienTich());
        System.out.println("Chu vi: " + hcn.tinhChuVi());
    }
}