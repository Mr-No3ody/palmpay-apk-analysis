package com.transsnet.palmpay.send_money.bean.resp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class TransferOrderCreateResp extends CommonResult {
    public Data data;

    public static class Data implements Serializable {
        public String accountNo;
        public long amount;
        public int businessType;
        public String calculationExtInfo;
        public TransferCashierExtend cashierExtendFiled;
        public long createTime;
        public String orderNo;
        public String payeeAccountType;
        public String recipientFullName;
        public String recipientPhone;
        public String remark;
        public String status;
    }
}
