package com.transsnet.palmpay.main.export.bean.rsp;

import android.content.Context;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.QueryRefund2BillDetailRsp;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public class OrderRefundDataBean {
    public long amount;
    public long complateTime;
    public long createTime;
    public String jumpUrl;
    public int loyaltyPoint;
    public String orderNo;
    public BillProcessDetail orderStatusInfo;
    public String paymentType;
    public String preOrderNo;
    public String preTransType;
    public String recieveMethod;
    public String statusDesc;

    public static OrderRefundDataBean createDataBean(QueryRefund2BillDetailRsp queryRefund2BillDetailRsp) {
        OrderRefundDataBean orderRefundDataBean = new OrderRefundDataBean();
        orderRefundDataBean.amount = queryRefund2BillDetailRsp.amount;
        orderRefundDataBean.complateTime = queryRefund2BillDetailRsp.complateTime;
        orderRefundDataBean.createTime = queryRefund2BillDetailRsp.createTime;
        orderRefundDataBean.loyaltyPoint = queryRefund2BillDetailRsp.loyaltyPoint;
        orderRefundDataBean.orderNo = queryRefund2BillDetailRsp.orderNo;
        orderRefundDataBean.paymentType = queryRefund2BillDetailRsp.paymentType;
        orderRefundDataBean.preOrderNo = queryRefund2BillDetailRsp.preOrderNo;
        orderRefundDataBean.jumpUrl = queryRefund2BillDetailRsp.jumpUrl;
        orderRefundDataBean.preTransType = queryRefund2BillDetailRsp.preTransType;
        orderRefundDataBean.recieveMethod = queryRefund2BillDetailRsp.recieveMethod;
        orderRefundDataBean.statusDesc = queryRefund2BillDetailRsp.statusDesc;
        orderRefundDataBean.orderStatusInfo = queryRefund2BillDetailRsp.orderStatusInfo;
        return orderRefundDataBean;
    }

    public static OrderRefundDataBean createDataBean(QueryRefundBillDetailRsp queryRefundBillDetailRsp) {
        OrderRefundDataBean orderRefundDataBean = new OrderRefundDataBean();
        orderRefundDataBean.amount = queryRefundBillDetailRsp.getAmount();
        orderRefundDataBean.complateTime = queryRefundBillDetailRsp.getComplateTime();
        orderRefundDataBean.createTime = queryRefundBillDetailRsp.getCreateTime();
        orderRefundDataBean.loyaltyPoint = 0;
        orderRefundDataBean.orderNo = queryRefundBillDetailRsp.getOrderNo();
        orderRefundDataBean.paymentType = queryRefundBillDetailRsp.getPaymentType();
        orderRefundDataBean.preOrderNo = queryRefundBillDetailRsp.getPreOrderNo();
        orderRefundDataBean.jumpUrl = queryRefundBillDetailRsp.getJumpUrl();
        orderRefundDataBean.preTransType = queryRefundBillDetailRsp.getPreTransType();
        orderRefundDataBean.recieveMethod = queryRefundBillDetailRsp.getRecieveMethod();
        orderRefundDataBean.statusDesc = queryRefundBillDetailRsp.getStatusDesc();
        orderRefundDataBean.orderStatusInfo = queryRefundBillDetailRsp.getOrderStatusInfo();
        return orderRefundDataBean;
    }

    public static OrderRefundDataBean createDataBean(Context context, ChargeBackOrderRsp chargeBackOrderRsp, String str) {
        OrderRefundDataBean orderRefundDataBean = new OrderRefundDataBean();
        orderRefundDataBean.amount = chargeBackOrderRsp.businessAmount;
        orderRefundDataBean.complateTime = chargeBackOrderRsp.updateTime;
        orderRefundDataBean.createTime = chargeBackOrderRsp.createTime;
        orderRefundDataBean.jumpUrl = chargeBackOrderRsp.jumpUrl;
        orderRefundDataBean.loyaltyPoint = 0;
        orderRefundDataBean.orderNo = chargeBackOrderRsp.orderNo;
        if (TransType.TRANS_TYPE_NIBSS_CHARGE_BACK.equals(str)) {
            orderRefundDataBean.paymentType = context.getString(k.core_palmpay_transfer);
        } else {
            orderRefundDataBean.paymentType = context.getString(k.core_charge_back);
        }
        orderRefundDataBean.preOrderNo = "";
        orderRefundDataBean.preTransType = "";
        orderRefundDataBean.recieveMethod = "";
        orderRefundDataBean.statusDesc = "Completed";
        orderRefundDataBean.orderStatusInfo = chargeBackOrderRsp.orderStatusInfo;
        return orderRefundDataBean;
    }
}
