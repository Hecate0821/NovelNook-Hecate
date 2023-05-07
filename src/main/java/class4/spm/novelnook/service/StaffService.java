package class4.spm.novelnook.service;

import class4.spm.novelnook.pojo.Book;
import class4.spm.novelnook.pojo.FineInfo;
import class4.spm.novelnook.pojo.Patron;
import class4.spm.novelnook.pojo.Staff;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface StaffService {

    // 获取所有patron信息
    List<Patron> getAllPatrons();

    //根据userid 找patron
    Patron getPatronById(int userid);

    //根据Id 找staff
    Staff getStaffById(int userid);

    //还书
    int returnBook(String borrowid, Date returntime);

    //书剩余量
    int getBookRemain();

    //书总量
    int getBookTotal();

    //patron 所有
    int getPatronNum();

    //未交罚款总额
    int getUnpayAmount();

    //本人信息
    Staff getSelf(int userid);

    //所有未交罚款信息
    List<FineInfo> getUnpayInfoAll();

}
