package com.transsnet.palmpay.airtime.bean.rsp;

import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R2COrderDetailResp {
    public String biller;
    public String channelErrorCode;
    public String channelErrorMsg;
    public long convenienceFee;
    public long createTime;
    public String currency;
    public String errorButton;
    public String errorMsg;
    public String icon;
    public String memberId;
    public String memberName;
    public String orderNo;
    public int orderStatus;
    public BillProcessDetail orderStatusInfo;
    public String orderType;
    public String payId;
    public long payeeVat;
    public int payerAccountType;
    public String paymentMethod;
    public long receivedAmount;
    public String remark;
    public String senderPhoneNo;
    public long sharedAmount;
    public String transType;
    public long updateTime;
    public List<OrderDetailItemBean> extendFields = null;
    public List<OrderDetailItemBean> ticketExtendFields = null;
}
