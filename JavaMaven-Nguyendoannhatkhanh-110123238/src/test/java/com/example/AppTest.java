package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    // 1. Kiểm thử trường hợp Có Nghiệm (CN)
    @Test
    public void testCoNghiem() {
        String result = App.giaiPhuongTrinhBac1(2, -4); // 2x - 4 = 0
        assertEquals("CN", result);
    }

    // 2. Kiểm thử trường hợp Vô Số Nghiệm (VSN)
    @Test
    public void testVoSoNghiem() {
        String result = App.giaiPhuongTrinhBac1(0, 0);  // 0x + 0 = 0
        assertEquals("VSN", result);
    }

    // 3. Kiểm thử trường hợp Vô Nghiệm (VN)
    @Test
    public void testVoNghiem() {
        String result = App.giaiPhuongTrinhBac1(0, 5);  // 0x + 5 = 0
        assertEquals("VN", result);
    }
}