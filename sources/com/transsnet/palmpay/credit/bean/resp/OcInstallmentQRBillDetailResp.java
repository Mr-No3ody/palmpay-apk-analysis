package com.transsnet.palmpay.credit.bean.resp;

import C0.G;
import N8.q0;
import Pa.r0;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp$OcInstallmentQRBillDetailData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp$OcInstallmentQRBillDetailData;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp$OcInstallmentQRBillDetailData;", "setData", "OcInstallmentQRBillDetailData", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInstallmentQRBillDetailResp extends CommonResult {

    @Nullable
    private OcInstallmentQRBillDetailData data;

    public OcInstallmentQRBillDetailResp(@Nullable OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData) {
        this.data = ocInstallmentQRBillDetailData;
    }

    @Nullable
    public final OcInstallmentQRBillDetailData getData() {
        return this.data;
    }

    public final void setData(@Nullable OcInstallmentQRBillDetailData ocInstallmentQRBillDetailData) {
        this.data = ocInstallmentQRBillDetailData;
    }

    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0003\b\u008d\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bû\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00105\u001a\u00020\b\u0012\b\b\u0002\u00106\u001a\u00020\b¢\u0006\u0004\b7\u00108J\u0007\u0010§\u0001\u001a\u00020\u0003J\b\u0010¨\u0001\u001a\u00030©\u0001J\b\u0010ª\u0001\u001a\u00030©\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010:\"\u0004\bQ\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010:\"\u0004\bS\u0010<R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bV\u0010D\"\u0004\bW\u0010FR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010:\"\u0004\bY\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010:\"\u0004\b]\u0010<R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010:\"\u0004\b_\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010:\"\u0004\ba\u0010<R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010:\"\u0004\bc\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010:\"\u0004\be\u0010<R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bf\u0010D\"\u0004\bg\u0010FR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010:\"\u0004\bi\u0010<R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010n\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010:\"\u0004\bp\u0010<R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010n\u001a\u0004\bq\u0010k\"\u0004\br\u0010mR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bs\u0010D\"\u0004\bt\u0010FR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bu\u0010D\"\u0004\bv\u0010FR\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010:\"\u0004\bx\u0010<R\u001e\u0010!\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010n\u001a\u0004\by\u0010k\"\u0004\bz\u0010mR\u001e\u0010\"\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010n\u001a\u0004\b{\u0010k\"\u0004\b|\u0010mR\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010:\"\u0004\b~\u0010<R\u001f\u0010$\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0011\n\u0002\u0010n\u001a\u0004\b\u007f\u0010k\"\u0005\b\u0080\u0001\u0010mR\u001e\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010:\"\u0005\b\u0082\u0001\u0010<R\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010:\"\u0005\b\u0084\u0001\u0010<R \u0010'\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010n\u001a\u0005\b\u0085\u0001\u0010k\"\u0005\b\u0086\u0001\u0010mR\u001e\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010:\"\u0005\b\u0088\u0001\u0010<R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010:\"\u0005\b\u008a\u0001\u0010<R\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010:\"\u0005\b\u008c\u0001\u0010<R \u0010+\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010n\u001a\u0005\b\u008d\u0001\u0010k\"\u0005\b\u008e\u0001\u0010mR\u001e\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010:\"\u0005\b\u0090\u0001\u0010<R \u0010-\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u0091\u0001\u0010D\"\u0005\b\u0092\u0001\u0010FR\u001e\u0010.\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010:\"\u0005\b\u0094\u0001\u0010<R\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010:\"\u0005\b\u0096\u0001\u0010<R\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010:\"\u0005\b\u0098\u0001\u0010<R\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010:\"\u0005\b\u009a\u0001\u0010<R \u00102\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u009b\u0001\u0010D\"\u0005\b\u009c\u0001\u0010FR\u001e\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010:\"\u0005\b\u009e\u0001\u0010<R \u00104\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u009f\u0001\u0010D\"\u0005\b \u0001\u0010FR\u001e\u00105\u001a\u00020\bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R\u001e\u00106\u001a\u00020\bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¢\u0001\"\u0006\b¦\u0001\u0010¤\u0001¨\u0006«\u0001"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcInstallmentQRBillDetailResp$OcInstallmentQRBillDetailData;", "", "bankName", "", "bankUrl", "channelErrorCode", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "couponAmount", "", "couponId", "createTime", "discountAmount", "errorMsg", "id", "installmentsNumber", "loyaltyAmount", "loyaltyPoint", "memberAvatar", "memberId", "memberName", "memberPhone", "merchantMemberId", "merchantName", "merchantNo", "orderAmount", "orderNo", "orderStatus", "", "orderStatusDesc", "orderType", "payAmount", "payFee", "payId", "payStatus", "payType", "payeeAccountId", "payeeAccountType", "payeeMemberId", "payerAccountId", "payerAccountType", "payerBankCode", "payerBankName", "payerCardNo", "payerCardType", "remark", "returnPoint", "riskTips", "faqLink", "riskType", "subPayId", "taxFee", "transType", "updateTime", "grantAwardValue", "businessDiscountAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;JJ)V", "getBankName", "()Ljava/lang/String;", "setBankName", "(Ljava/lang/String;)V", "getBankUrl", "setBankUrl", "getChannelErrorCode", "setChannelErrorCode", "getCountryCode", "setCountryCode", "getCouponAmount", "()Ljava/lang/Long;", "setCouponAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCouponId", "setCouponId", "getCreateTime", "setCreateTime", "getDiscountAmount", "setDiscountAmount", "getErrorMsg", "setErrorMsg", "getId", "setId", "getInstallmentsNumber", "setInstallmentsNumber", "getLoyaltyAmount", "setLoyaltyAmount", "getLoyaltyPoint", "setLoyaltyPoint", "getMemberAvatar", "setMemberAvatar", "getMemberId", "setMemberId", "getMemberName", "setMemberName", "getMemberPhone", "setMemberPhone", "getMerchantMemberId", "setMerchantMemberId", "getMerchantName", "setMerchantName", "getMerchantNo", "setMerchantNo", "getOrderAmount", "setOrderAmount", "getOrderNo", "setOrderNo", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderStatusDesc", "setOrderStatusDesc", "getOrderType", "setOrderType", "getPayAmount", "setPayAmount", "getPayFee", "setPayFee", "getPayId", "setPayId", "getPayStatus", "setPayStatus", "getPayType", "setPayType", "getPayeeAccountId", "setPayeeAccountId", "getPayeeAccountType", "setPayeeAccountType", "getPayeeMemberId", "setPayeeMemberId", "getPayerAccountId", "setPayerAccountId", "getPayerAccountType", "setPayerAccountType", "getPayerBankCode", "setPayerBankCode", "getPayerBankName", "setPayerBankName", "getPayerCardNo", "setPayerCardNo", "getPayerCardType", "setPayerCardType", "getRemark", "setRemark", "getReturnPoint", "setReturnPoint", "getRiskTips", "setRiskTips", "getFaqLink", "setFaqLink", "getRiskType", "setRiskType", "getSubPayId", "setSubPayId", "getTaxFee", "setTaxFee", "getTransType", "setTransType", "getUpdateTime", "setUpdateTime", "getGrantAwardValue", "()J", "setGrantAwardValue", "(J)V", "getBusinessDiscountAmount", "setBusinessDiscountAmount", "symbolAmount", "isMemberType", "", "isCustomerType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OcInstallmentQRBillDetailData {

        @Nullable
        private String bankName;

        @Nullable
        private String bankUrl;
        private long businessDiscountAmount;

        @Nullable
        private String channelErrorCode;

        @Nullable
        private String countryCode;

        @Nullable
        private Long couponAmount;

        @Nullable
        private String couponId;

        @Nullable
        private Long createTime;

        @Nullable
        private Long discountAmount;

        @Nullable
        private String errorMsg;

        @Nullable
        private String faqLink;
        private long grantAwardValue;

        @Nullable
        private String id;

        @Nullable
        private String installmentsNumber;

        @Nullable
        private Long loyaltyAmount;

        @Nullable
        private Long loyaltyPoint;

        @Nullable
        private String memberAvatar;

        @Nullable
        private String memberId;

        @Nullable
        private String memberName;

        @Nullable
        private String memberPhone;

        @Nullable
        private String merchantMemberId;

        @Nullable
        private String merchantName;

        @Nullable
        private String merchantNo;

        @Nullable
        private Long orderAmount;

        @Nullable
        private String orderNo;

        @Nullable
        private Integer orderStatus;

        @Nullable
        private String orderStatusDesc;

        @Nullable
        private Integer orderType;

        @Nullable
        private Long payAmount;

        @Nullable
        private Long payFee;

        @Nullable
        private String payId;

        @Nullable
        private Integer payStatus;

        @Nullable
        private Integer payType;

        @Nullable
        private String payeeAccountId;

        @Nullable
        private Integer payeeAccountType;

        @Nullable
        private String payeeMemberId;

        @Nullable
        private String payerAccountId;

        @Nullable
        private Integer payerAccountType;

        @Nullable
        private String payerBankCode;

        @Nullable
        private String payerBankName;

        @Nullable
        private String payerCardNo;

        @Nullable
        private Integer payerCardType;

        @Nullable
        private String remark;

        @Nullable
        private Long returnPoint;

        @Nullable
        private String riskTips;

        @Nullable
        private String riskType;

        @Nullable
        private String subPayId;

        @Nullable
        private Long taxFee;

        @Nullable
        private String transType;

        @Nullable
        private Long updateTime;

        public OcInstallmentQRBillDetailData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l5, @Nullable String str5, @Nullable Long l6, @Nullable Long l8, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l10, @Nullable Long l11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Long l12, @Nullable String str16, @Nullable Integer num, @Nullable String str17, @Nullable Integer num2, @Nullable Long l13, @Nullable Long l14, @Nullable String str18, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str19, @Nullable Integer num5, @Nullable String str20, @Nullable String str21, @Nullable Integer num6, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable Integer num7, @Nullable String str25, @Nullable Long l15, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable Long l16, @Nullable String str30, @Nullable Long l17, long j6, long j10) {
            this.bankName = str;
            this.bankUrl = str2;
            this.channelErrorCode = str3;
            this.countryCode = str4;
            this.couponAmount = l5;
            this.couponId = str5;
            this.createTime = l6;
            this.discountAmount = l8;
            this.errorMsg = str6;
            this.id = str7;
            this.installmentsNumber = str8;
            this.loyaltyAmount = l10;
            this.loyaltyPoint = l11;
            this.memberAvatar = str9;
            this.memberId = str10;
            this.memberName = str11;
            this.memberPhone = str12;
            this.merchantMemberId = str13;
            this.merchantName = str14;
            this.merchantNo = str15;
            this.orderAmount = l12;
            this.orderNo = str16;
            this.orderStatus = num;
            this.orderStatusDesc = str17;
            this.orderType = num2;
            this.payAmount = l13;
            this.payFee = l14;
            this.payId = str18;
            this.payStatus = num3;
            this.payType = num4;
            this.payeeAccountId = str19;
            this.payeeAccountType = num5;
            this.payeeMemberId = str20;
            this.payerAccountId = str21;
            this.payerAccountType = num6;
            this.payerBankCode = str22;
            this.payerBankName = str23;
            this.payerCardNo = str24;
            this.payerCardType = num7;
            this.remark = str25;
            this.returnPoint = l15;
            this.riskTips = str26;
            this.faqLink = str27;
            this.riskType = str28;
            this.subPayId = str29;
            this.taxFee = l16;
            this.transType = str30;
            this.updateTime = l17;
            this.grantAwardValue = j6;
            this.businessDiscountAmount = j10;
        }

        @Nullable
        public final String getBankName() {
            return this.bankName;
        }

        @Nullable
        public final String getBankUrl() {
            return this.bankUrl;
        }

        public final long getBusinessDiscountAmount() {
            return this.businessDiscountAmount;
        }

        @Nullable
        public final String getChannelErrorCode() {
            return this.channelErrorCode;
        }

        @Nullable
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @Nullable
        public final String getCouponId() {
            return this.couponId;
        }

        @Nullable
        public final Long getCreateTime() {
            return this.createTime;
        }

        @Nullable
        public final Long getDiscountAmount() {
            return this.discountAmount;
        }

        @Nullable
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        @Nullable
        public final String getFaqLink() {
            return this.faqLink;
        }

        public final long getGrantAwardValue() {
            return this.grantAwardValue;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getInstallmentsNumber() {
            return this.installmentsNumber;
        }

        @Nullable
        public final Long getLoyaltyAmount() {
            return this.loyaltyAmount;
        }

        @Nullable
        public final Long getLoyaltyPoint() {
            return this.loyaltyPoint;
        }

        @Nullable
        public final String getMemberAvatar() {
            return this.memberAvatar;
        }

        @Nullable
        public final String getMemberId() {
            return this.memberId;
        }

        @Nullable
        public final String getMemberName() {
            return this.memberName;
        }

        @Nullable
        public final String getMemberPhone() {
            return this.memberPhone;
        }

        @Nullable
        public final String getMerchantMemberId() {
            return this.merchantMemberId;
        }

        @Nullable
        public final String getMerchantName() {
            return this.merchantName;
        }

        @Nullable
        public final String getMerchantNo() {
            return this.merchantNo;
        }

        @Nullable
        public final Long getOrderAmount() {
            return this.orderAmount;
        }

        @Nullable
        public final String getOrderNo() {
            return this.orderNo;
        }

        @Nullable
        public final Integer getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        public final String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        @Nullable
        public final Integer getOrderType() {
            return this.orderType;
        }

        @Nullable
        public final Long getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        public final Long getPayFee() {
            return this.payFee;
        }

        @Nullable
        public final String getPayId() {
            return this.payId;
        }

        @Nullable
        public final Integer getPayStatus() {
            return this.payStatus;
        }

        @Nullable
        public final Integer getPayType() {
            return this.payType;
        }

        @Nullable
        public final String getPayeeAccountId() {
            return this.payeeAccountId;
        }

        @Nullable
        public final Integer getPayeeAccountType() {
            return this.payeeAccountType;
        }

        @Nullable
        public final String getPayeeMemberId() {
            return this.payeeMemberId;
        }

        @Nullable
        public final String getPayerAccountId() {
            return this.payerAccountId;
        }

        @Nullable
        public final Integer getPayerAccountType() {
            return this.payerAccountType;
        }

        @Nullable
        public final String getPayerBankCode() {
            return this.payerBankCode;
        }

        @Nullable
        public final String getPayerBankName() {
            return this.payerBankName;
        }

        @Nullable
        public final String getPayerCardNo() {
            return this.payerCardNo;
        }

        @Nullable
        public final Integer getPayerCardType() {
            return this.payerCardType;
        }

        @Nullable
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        public final Long getReturnPoint() {
            return this.returnPoint;
        }

        @Nullable
        public final String getRiskTips() {
            return this.riskTips;
        }

        @Nullable
        public final String getRiskType() {
            return this.riskType;
        }

        @Nullable
        public final String getSubPayId() {
            return this.subPayId;
        }

        @Nullable
        public final Long getTaxFee() {
            return this.taxFee;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        public final Long getUpdateTime() {
            return this.updateTime;
        }

        public final boolean isCustomerType() {
            return Intrinsics.c(G.k(), this.memberId);
        }

        public final boolean isMemberType() {
            return Intrinsics.c(G.k(), this.merchantMemberId);
        }

        public final void setBankName(@Nullable String str) {
            this.bankName = str;
        }

        public final void setBankUrl(@Nullable String str) {
            this.bankUrl = str;
        }

        public final void setBusinessDiscountAmount(long j6) {
            this.businessDiscountAmount = j6;
        }

        public final void setChannelErrorCode(@Nullable String str) {
            this.channelErrorCode = str;
        }

        public final void setCountryCode(@Nullable String str) {
            this.countryCode = str;
        }

        public final void setCouponAmount(@Nullable Long l5) {
            this.couponAmount = l5;
        }

        public final void setCouponId(@Nullable String str) {
            this.couponId = str;
        }

        public final void setCreateTime(@Nullable Long l5) {
            this.createTime = l5;
        }

        public final void setDiscountAmount(@Nullable Long l5) {
            this.discountAmount = l5;
        }

        public final void setErrorMsg(@Nullable String str) {
            this.errorMsg = str;
        }

        public final void setFaqLink(@Nullable String str) {
            this.faqLink = str;
        }

        public final void setGrantAwardValue(long j6) {
            this.grantAwardValue = j6;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setInstallmentsNumber(@Nullable String str) {
            this.installmentsNumber = str;
        }

        public final void setLoyaltyAmount(@Nullable Long l5) {
            this.loyaltyAmount = l5;
        }

        public final void setLoyaltyPoint(@Nullable Long l5) {
            this.loyaltyPoint = l5;
        }

        public final void setMemberAvatar(@Nullable String str) {
            this.memberAvatar = str;
        }

        public final void setMemberId(@Nullable String str) {
            this.memberId = str;
        }

        public final void setMemberName(@Nullable String str) {
            this.memberName = str;
        }

        public final void setMemberPhone(@Nullable String str) {
            this.memberPhone = str;
        }

        public final void setMerchantMemberId(@Nullable String str) {
            this.merchantMemberId = str;
        }

        public final void setMerchantName(@Nullable String str) {
            this.merchantName = str;
        }

        public final void setMerchantNo(@Nullable String str) {
            this.merchantNo = str;
        }

        public final void setOrderAmount(@Nullable Long l5) {
            this.orderAmount = l5;
        }

        public final void setOrderNo(@Nullable String str) {
            this.orderNo = str;
        }

        public final void setOrderStatus(@Nullable Integer num) {
            this.orderStatus = num;
        }

        public final void setOrderStatusDesc(@Nullable String str) {
            this.orderStatusDesc = str;
        }

        public final void setOrderType(@Nullable Integer num) {
            this.orderType = num;
        }

        public final void setPayAmount(@Nullable Long l5) {
            this.payAmount = l5;
        }

        public final void setPayFee(@Nullable Long l5) {
            this.payFee = l5;
        }

        public final void setPayId(@Nullable String str) {
            this.payId = str;
        }

        public final void setPayStatus(@Nullable Integer num) {
            this.payStatus = num;
        }

        public final void setPayType(@Nullable Integer num) {
            this.payType = num;
        }

        public final void setPayeeAccountId(@Nullable String str) {
            this.payeeAccountId = str;
        }

        public final void setPayeeAccountType(@Nullable Integer num) {
            this.payeeAccountType = num;
        }

        public final void setPayeeMemberId(@Nullable String str) {
            this.payeeMemberId = str;
        }

        public final void setPayerAccountId(@Nullable String str) {
            this.payerAccountId = str;
        }

        public final void setPayerAccountType(@Nullable Integer num) {
            this.payerAccountType = num;
        }

        public final void setPayerBankCode(@Nullable String str) {
            this.payerBankCode = str;
        }

        public final void setPayerBankName(@Nullable String str) {
            this.payerBankName = str;
        }

        public final void setPayerCardNo(@Nullable String str) {
            this.payerCardNo = str;
        }

        public final void setPayerCardType(@Nullable Integer num) {
            this.payerCardType = num;
        }

        public final void setRemark(@Nullable String str) {
            this.remark = str;
        }

        public final void setReturnPoint(@Nullable Long l5) {
            this.returnPoint = l5;
        }

        public final void setRiskTips(@Nullable String str) {
            this.riskTips = str;
        }

        public final void setRiskType(@Nullable String str) {
            this.riskType = str;
        }

        public final void setSubPayId(@Nullable String str) {
            this.subPayId = str;
        }

        public final void setTaxFee(@Nullable Long l5) {
            this.taxFee = l5;
        }

        public final void setTransType(@Nullable String str) {
            this.transType = str;
        }

        public final void setUpdateTime(@Nullable Long l5) {
            this.updateTime = l5;
        }

        @NotNull
        public final String symbolAmount() {
            String str;
            if (isMemberType()) {
                str = "+";
            } else {
                str = isCustomerType() ? "-" : "";
            }
            Long l5 = this.orderAmount;
            return q0.j(str, r0.A(l5 != null ? l5.longValue() : 0L));
        }

        public /* synthetic */ OcInstallmentQRBillDetailData(String str, String str2, String str3, String str4, Long l5, String str5, Long l6, Long l8, String str6, String str7, String str8, Long l10, Long l11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l12, String str16, Integer num, String str17, Integer num2, Long l13, Long l14, String str18, Integer num3, Integer num4, String str19, Integer num5, String str20, String str21, Integer num6, String str22, String str23, String str24, Integer num7, String str25, Long l15, String str26, String str27, String str28, String str29, Long l16, String str30, Long l17, long j6, long j10, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, l5, str5, l6, l8, str6, str7, str8, l10, l11, str9, str10, str11, str12, str13, str14, str15, l12, str16, num, str17, num2, l13, l14, str18, num3, num4, str19, num5, str20, str21, num6, str22, str23, str24, num7, str25, l15, str26, str27, str28, str29, l16, str30, l17, (i10 & 65536) != 0 ? 0L : j6, (i10 & 131072) != 0 ? 0L : j10);
        }
    }
}
