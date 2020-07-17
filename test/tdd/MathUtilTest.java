/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import  org.junit.Test;
import static org.junit.Assert.*;
import static phi.util.MathUtil.computeFactorial;

/**
 *
 * @author Dell
 */
public class MathUtilTest {
    @Test //báo ho jvm biết đây là hàm main()
    //trong hàm này chứa các lệnh để test code chính của mình
    //ở bên MathUtil
    //ta test các tính huống thành công ở đây
    //thành công: cF(5) -> ói về 120 gọi là thành công
    public void testSuccessfulCases(){
        //assertEquals(30, 50);
        //tao kì vọng có 30, xem mày đưa vào thực tế là bao nhiêu
        //                                      50
        //2 thứ khớp nhau, mày xử lí như dự kiến, đèn xanh, thông đường
        //                        ko như dự kiến, đèn đỏ, toang code mày
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));
        //muốn xanh, thì tất cả phải xanh, đúng hết mọi case
        //nếu tất cả xanh, có 1 thằng đỏ, coi như cả đám đỏ
        //vì hàm ý: code phải chạy đúng cho mọi tình huống
        //ta chỉ cần nhìn xanh đỏ, khỏi cần dò từng cháu = mắt
    }
    
    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu để báo cho jvm và thư viện jar liên quan
    //biết cần phải làm gì
    //hàm này chứa các tình huống cà chớn, ví dụ cF(-5), cF(16)
    public void testFailedCases(){
        //tao kì vọng mày ném ra ngoại lệ thì coi như code của
        //mày mới ngon, vì -5 éo tính ! đc, phải chửi hoy
        //ngoại lệ k phải là 1 value để có thể so sánh đc
        //nên mình k có xài hàm assertEquals() đc
        //vì hàm này cần 2 value expected và actual
        //trong khi đó ném ra ngoại lệ k phải là actual value để so
        //ta phải xài chiêu khác khi bắt ngoại lệ có đúng k
        computeFactorial(-5);
    }
    
    //code có thể còn tiềm ẩn lỗi nhưng Clean & Build luôn ra file.jar
    //nếu code k sai cú pháp
    //vậy mình phải disable cái nút clean & build nếu code còn màu đỏ
    //tức là còn error logic
    //nhớ 2 con số: 1005 Netbeans 8, 1204 Netbeans từ 10 trở lên
    //khi chơi với Ant project
    
}
