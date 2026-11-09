package com.transsnet.palmpay.send_money.util.kkcar;

import Pa.E;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.send_money.bean.kkcar.KkCarPayVerificationArgs;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/send_money/util/kkcar/KkCarPayResultMapper;", "", "<init>", "()V", "toPayVerificationArgs", "Lcom/transsnet/palmpay/send_money/bean/kkcar/KkCarPayVerificationArgs;", "rsp", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp;", "toCheckPayReq", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;", "other", "Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarQrCodeRsp$CheckPayOtherDTO;", "pay", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp$DataBean;", "parseVerifyMethod", "", "value", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "parseAmountString", "", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarPayResultMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarPayResultMapper.kt\ncom/transsnet/palmpay/send_money/util/kkcar/KkCarPayResultMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class KkCarPayResultMapper {

    @NotNull
    public static final KkCarPayResultMapper INSTANCE = new KkCarPayResultMapper();

    private KkCarPayResultMapper() {
    }

    private final long parseAmountString(String value) {
        String string;
        if (value == null || (string = StringsKt.V(value).toString()) == null) {
            return 0L;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return 0L;
        }
        Long lU = StringsKt.U(string);
        return lU != null ? lU.longValue() : E.c(string);
    }

    private final Integer parseVerifyMethod(String value) {
        String string;
        if (value != null && (string = StringsKt.V(value).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                Integer intOrNull = StringsKt.toIntOrNull(string);
                return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : (int) E.c(string));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0056  */
    /* JADX WARN: Code duplicated, block: B:51:0x0071  */
    /* JADX WARN: Code duplicated, block: B:63:0x008a  */
    @NotNull
    public final CheckPayReq toCheckPayReq(@Nullable KkCarQrCodeRsp.CheckPayOtherDTO other, @NotNull PayByOrderResp.DataBean pay) {
        String orderNo;
        String orderType;
        String payId;
        String subPayId;
        String transType;
        Intrinsics.checkNotNullParameter(pay, "pay");
        CheckPayReq checkPayReq = new CheckPayReq();
        if (other == null || (orderNo = other.getOrderNo()) == null) {
            orderNo = pay.orderNo;
        } else {
            if (!(orderNo.length() > 0)) {
                orderNo = null;
            }
            if (orderNo == null) {
                orderNo = pay.orderNo;
            }
        }
        checkPayReq.orderNo = orderNo;
        if (other == null || (orderType = other.getOrderType()) == null) {
            orderType = null;
        } else {
            if (!(orderType.length() > 0)) {
                orderType = null;
            }
        }
        checkPayReq.orderType = orderType;
        if (other == null || (payId = other.getPayId()) == null) {
            payId = pay.payId;
        } else {
            if (!(payId.length() > 0)) {
                payId = null;
            }
            if (payId == null) {
                payId = pay.payId;
            }
        }
        checkPayReq.payId = payId;
        if (other == null || (subPayId = other.getSubPayId()) == null) {
            subPayId = pay.subPayId;
        } else {
            if (!(subPayId.length() > 0)) {
                subPayId = null;
            }
            if (subPayId == null) {
                subPayId = pay.subPayId;
            }
        }
        checkPayReq.subPayId = subPayId;
        if (other == null || (transType = other.getTransType()) == null) {
            transType = pay.transType;
        } else {
            if (!(transType.length() > 0)) {
                transType = null;
            }
            if (transType == null) {
                transType = pay.transType;
            }
        }
        checkPayReq.transType = transType;
        KkCarPayResultMapper kkCarPayResultMapper = INSTANCE;
        Integer verifyMethod = kkCarPayResultMapper.parseVerifyMethod(other != null ? other.getVerifyMethod() : null);
        checkPayReq.verifyMethod = verifyMethod != null ? verifyMethod.intValue() : pay.verifyMethod;
        checkPayReq.orderAmount = kkCarPayResultMapper.parseAmountString(other != null ? other.getOrderAmount() : null);
        checkPayReq.payAmount = kkCarPayResultMapper.parseAmountString(other != null ? other.getPayAmount() : null);
        checkPayReq.feeAmount = kkCarPayResultMapper.parseAmountString(other != null ? other.getFeeAmount() : null);
        checkPayReq.url = pay.url;
        checkPayReq.payRouteId = pay.payRouteId;
        checkPayReq.queryMaxSec = pay.queryMaxSec;
        checkPayReq.token = pay.token;
        checkPayReq.otpReference = pay.otpReference;
        checkPayReq.channelTransactionId = pay.channelTransactionId;
        return checkPayReq;
    }

    @Nullable
    public final KkCarPayVerificationArgs toPayVerificationArgs(@NotNull KkCarQrCodeRsp rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        PayByOrderResp.DataBean payOrderResultDTO = rsp.getPayOrderResultDTO();
        if (payOrderResultDTO == null || !payOrderResultDTO.flag) {
            return null;
        }
        PayByOrderResp payByOrderResp = new PayByOrderResp();
        payByOrderResp.setData(payOrderResultDTO);
        return new KkCarPayVerificationArgs(payByOrderResp, toCheckPayReq(rsp.getCheckPayOtherDTO(), payOrderResultDTO));
    }
}
