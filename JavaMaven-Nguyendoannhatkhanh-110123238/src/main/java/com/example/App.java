package com.example;

public class App {
    
    // Biện luận logic theo yêu cầu đề bài:
    // CN: Có Nghiệm (a != 0)
    // VSN: Vô Số Nghiệm (a == 0 và b == 0)
    // VN: Vô Nghiệm (a == 0 và b != 0)
    public static String giaiPhuongTrinhBac1(double a, double b) {
        if (a != 0) {
            return "CN"; 
        } else {
            if (b == 0) {
                return "VSN"; 
            } else {
                return "VN"; 
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Ket qua test mau: " + giaiPhuongTrinhBac1(2, -4));
    }
}