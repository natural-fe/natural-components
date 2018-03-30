package space.qmen.lot.dao;

import org.apache.ibatis.annotations.Param;
import space.qmen.lot.model.entity.Bill;
import space.qmen.lot.model.param.GetWalletParam;

import java.util.List;

public interface BillDao {
    List<Bill> listBill();
    Bill getBillById(@Param("id") Long id);
    Long deleteBill(Long id);

    Long saveBill(Bill bill);
    Long updateBill(Bill bill);

    Double getWalletTotal(GetWalletParam getWalletParam);
}
