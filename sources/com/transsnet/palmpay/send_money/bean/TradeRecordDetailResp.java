package com.transsnet.palmpay.send_money.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodComb;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;", "getData", "()Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;", "setData", "(Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;)V", "RecordDetail", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TradeRecordDetailResp extends CommonResult {

    @Nullable
    private RecordDetail data;

    @Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0003\b\u0085\u0001\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0006ó\u0001ô\u0001õ\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001e\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001e\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010,\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010=\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00102\"\u0004\b?\u00104R\u001c\u0010@\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0017\"\u0004\bB\u0010\u0019R\u001a\u0010C\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00102\"\u0004\bE\u00104R\u001a\u0010F\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00107\"\u0004\bH\u00109R\u001a\u0010I\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00107\"\u0004\bK\u00109R\u001a\u0010L\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00107\"\u0004\bN\u00109R\u001a\u0010O\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R\u001c\u0010R\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0017\"\u0004\bT\u0010\u0019R\u001a\u0010U\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00107\"\u0004\bW\u00109R\u001c\u0010X\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0017\"\u0004\bZ\u0010\u0019R\u001c\u0010[\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0017\"\u0004\b]\u0010\u0019R\u001c\u0010^\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0017\"\u0004\b`\u0010\u0019R\u001a\u0010a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u001c\u0010d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0017\"\u0004\bf\u0010\u0019R\u001c\u0010g\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0017\"\u0004\bi\u0010\u0019R\u001c\u0010j\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0017\"\u0004\bl\u0010\u0019R\u001c\u0010m\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0017\"\u0004\bo\u0010\u0019R\u001c\u0010p\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0017\"\u0004\br\u0010\u0019R\u001a\u0010s\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00107\"\u0004\bu\u00109R\u001a\u0010v\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00107\"\u0004\bx\u00109R\u001a\u0010y\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u00107\"\u0004\b{\u00109R\u001c\u0010|\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0017\"\u0004\b~\u0010\u0019R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0017\"\u0005\b\u0081\u0001\u0010\u0019R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0017\"\u0005\b\u0084\u0001\u0010\u0019R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0017\"\u0005\b\u0087\u0001\u0010\u0019R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0017\"\u0005\b\u008a\u0001\u0010\u0019R\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0017\"\u0005\b\u008d\u0001\u0010\u0019R\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0017\"\u0005\b\u0090\u0001\u0010\u0019R\u001d\u0010\u0091\u0001\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u00107\"\u0005\b\u0093\u0001\u00109R\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u0017\"\u0005\b\u0096\u0001\u0010\u0019R\u001f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u0017\"\u0005\b\u0099\u0001\u0010\u0019R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u0017\"\u0005\b\u009c\u0001\u0010\u0019R\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0017\"\u0005\b\u009f\u0001\u0010\u0019R\u001d\u0010 \u0001\u001a\u000200X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u00102\"\u0005\b¢\u0001\u00104R\u001d\u0010£\u0001\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u00107\"\u0005\b¥\u0001\u00109R\u001f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010\u0017\"\u0005\b¨\u0001\u0010\u0019R\u001f\u0010©\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010\u0017\"\u0005\b«\u0001\u0010\u0019R\u001f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u0017\"\u0005\b®\u0001\u0010\u0019R\u001f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010\u0017\"\u0005\b±\u0001\u0010\u0019R\u001f\u0010²\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010\u0017\"\u0005\b´\u0001\u0010\u0019R\"\u0010µ\u0001\u001a\u0005\u0018\u00010¶\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u001f\u0010»\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010\u0017\"\u0005\b½\u0001\u0010\u0019R\"\u0010¾\u0001\u001a\u0005\u0018\u00010¿\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u001f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010\u0017\"\u0005\bÆ\u0001\u0010\u0019R\u001f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010\u0017\"\u0005\bÉ\u0001\u0010\u0019R\u001f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010\u0017\"\u0005\bÌ\u0001\u0010\u0019R\"\u0010Í\u0001\u001a\u0005\u0018\u00010Î\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u001f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010\u0017\"\u0005\bÕ\u0001\u0010\u0019R\u001f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010\u0017\"\u0005\bØ\u0001\u0010\u0019R)\u0010Ù\u0001\u001a\f\u0012\u0005\u0012\u00030Û\u0001\u0018\u00010Ú\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\"\u0010à\u0001\u001a\u0005\u0018\u00010á\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R\u001f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bç\u0001\u0010\u0017\"\u0005\bè\u0001\u0010\u0019R\"\u0010é\u0001\u001a\u0005\u0018\u00010ê\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R)\u0010ï\u0001\u001a\f\u0012\u0005\u0012\u00030ð\u0001\u0018\u00010Ú\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bñ\u0001\u0010Ý\u0001\"\u0006\bò\u0001\u0010ß\u0001¨\u0006ö\u0001"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail;", "", "<init>", "()V", "payAmount", "", "getPayAmount", "()Ljava/lang/Long;", "setPayAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "payFee", "getPayFee", "setPayFee", "couponAmount", "getCouponAmount", "setCouponAmount", "discountAmount", "getDiscountAmount", "setDiscountAmount", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "transTypeName", "getTransTypeName", "setTransTypeName", "transType", "getTransType", "setTransType", "returnBonus", "getReturnBonus", "setReturnBonus", "createTime", "getCreateTime", "setCreateTime", "updateTime", "getUpdateTime", "setUpdateTime", "payeeQRAccountNo", "getPayeeQRAccountNo", "setPayeeQRAccountNo", "partnerAccountNo", "getPartnerAccountNo", "setPartnerAccountNo", "businessType", "", "getBusinessType", "()I", "setBusinessType", "(I)V", "amount", "getAmount", "()J", "setAmount", "(J)V", "deductPoint", "getDeductPoint", "setDeductPoint", "orderStatus", "getOrderStatus", "setOrderStatus", "orderStatusDesc", "getOrderStatusDesc", "setOrderStatusDesc", "payType", "getPayType", "setPayType", "platformFee", "getPlatformFee", "setPlatformFee", "platformVat", "getPlatformVat", "setPlatformVat", "csLevyFee", "getCsLevyFee", "setCsLevyFee", "platformCsLevyFee", "getPlatformCsLevyFee", "setPlatformCsLevyFee", "csLevyFeeJumpUrl", "getCsLevyFeeJumpUrl", "setCsLevyFeeJumpUrl", "recipientAmount", "getRecipientAmount", "setRecipientAmount", "recipientBankAccount", "getRecipientBankAccount", "setRecipientBankAccount", "recipientBankName", "getRecipientBankName", "setRecipientBankName", "recipientBankUrl", "getRecipientBankUrl", "setRecipientBankUrl", "recipientFee", "getRecipientFee", "setRecipientFee", "recipientFullName", "getRecipientFullName", "setRecipientFullName", "recipientHeadImage", "getRecipientHeadImage", "setRecipientHeadImage", "recipientPhone", "getRecipientPhone", "setRecipientPhone", "recipientRemark", "getRecipientRemark", "setRecipientRemark", "shopName", "getShopName", "setShopName", "recipientTaxFee", "getRecipientTaxFee", "setRecipientTaxFee", "redeemPoint", "getRedeemPoint", "setRedeemPoint", "cashEarned", "getCashEarned", "setCashEarned", "sendMemberId", "getSendMemberId", "setSendMemberId", "senderBankCard", "getSenderBankCard", "setSenderBankCard", "senderBankName", "getSenderBankName", "setSenderBankName", "senderHeadImage", "getSenderHeadImage", "setSenderHeadImage", "senderFullName", "getSenderFullName", "setSenderFullName", "senderPhone", "getSenderPhone", "setSenderPhone", "senderRemark", "getSenderRemark", "setSenderRemark", "taxFee", "getTaxFee", "setTaxFee", "errorMessage", "getErrorMessage", "setErrorMessage", "pendingMessage", "getPendingMessage", "setPendingMessage", "successfulDesc", "getSuccessfulDesc", "setSuccessfulDesc", "earlyRefundDesc", "getEarlyRefundDesc", "setEarlyRefundDesc", "earlyRefundGuarantee", "getEarlyRefundGuarantee", "setEarlyRefundGuarantee", "earlyRefundPayerFee", "getEarlyRefundPayerFee", "setEarlyRefundPayerFee", "partnerPhone", "getPartnerPhone", "setPartnerPhone", "transferApplication", "getTransferApplication", "setTransferApplication", "paymentTypeDesc", "getPaymentTypeDesc", "setPaymentTypeDesc", "payTypeDesc", "getPayTypeDesc", "setPayTypeDesc", "receiveTypeDesc", "getReceiveTypeDesc", "setReceiveTypeDesc", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "getOrderStatusInfo", "()Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "setOrderStatusInfo", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "channelTransactionId", "getChannelTransactionId", "setChannelTransactionId", "feeDetailList", "Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "getFeeDetailList", "()Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "setFeeDetailList", "(Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;)V", "customerServiceTips", "getCustomerServiceTips", "setCustomerServiceTips", "customerServiceHighlightText", "getCustomerServiceHighlightText", "setCustomerServiceHighlightText", "customerServicePhone", "getCustomerServicePhone", "setCustomerServicePhone", "orderCompensate", "Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;", "getOrderCompensate", "()Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;", "setOrderCompensate", "(Lcom/transsnet/palmpay/send_money/bean/OrderCompensateBean;)V", "detailBtnContent", "getDetailBtnContent", "setDetailBtnContent", "detailBtnJumpUrl", "getDetailBtnJumpUrl", "setDetailBtnJumpUrl", "paymentMethods", "", "Lcom/transsnet/palmpay/core/bean/rsp/PaymentMethodComb;", "getPaymentMethods", "()Ljava/util/List;", "setPaymentMethods", "(Ljava/util/List;)V", "compensation", "Lcom/transsnet/palmpay/send_money/bean/TransferDetailCompensation;", "getCompensation", "()Lcom/transsnet/palmpay/send_money/bean/TransferDetailCompensation;", "setCompensation", "(Lcom/transsnet/palmpay/send_money/bean/TransferDetailCompensation;)V", "receiptDesc", "getReceiptDesc", "setReceiptDesc", "cashOrderExtendDTO", "Lcom/transsnet/palmpay/core/bean/rsp/CashOrderExtendBean;", "getCashOrderExtendDTO", "()Lcom/transsnet/palmpay/core/bean/rsp/CashOrderExtendBean;", "setCashOrderExtendDTO", "(Lcom/transsnet/palmpay/core/bean/rsp/CashOrderExtendBean;)V", "transferTaxes", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$TransferTax;", "getTransferTaxes", "setTransferTaxes", "Tax", "TransferTax", "SubTax", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecordDetail {
        private long amount;
        private int businessType;
        private long cashEarned;

        @Nullable
        private CashOrderExtendBean cashOrderExtendDTO;

        @Nullable
        private String channelTransactionId;

        @Nullable
        private TransferDetailCompensation compensation;
        private long csLevyFee;

        @Nullable
        private String csLevyFeeJumpUrl;

        @Nullable
        private String customerServiceHighlightText;

        @Nullable
        private String customerServicePhone;

        @Nullable
        private String customerServiceTips;
        private long deductPoint;

        @Nullable
        private String detailBtnContent;

        @Nullable
        private String detailBtnJumpUrl;

        @Nullable
        private String earlyRefundDesc;
        private int earlyRefundGuarantee;
        private long earlyRefundPayerFee;

        @Nullable
        private String errorMessage;

        @Nullable
        private PaymentFeeDetail feeDetailList;

        @Nullable
        private OrderCompensateBean orderCompensate;
        private int orderStatus;

        @Nullable
        private String orderStatusDesc;

        @Nullable
        private BillProcessDetail orderStatusInfo;

        @Nullable
        private String partnerPhone;
        private int payType;

        @Nullable
        private String payTypeDesc;

        @Nullable
        private List<PaymentMethodComb> paymentMethods;

        @Nullable
        private String paymentTypeDesc;

        @Nullable
        private String pendingMessage;
        private long platformCsLevyFee;
        private long platformFee;
        private long platformVat;

        @Nullable
        private String receiptDesc;

        @Nullable
        private String receiveTypeDesc;
        private long recipientAmount;

        @Nullable
        private String recipientBankAccount;

        @Nullable
        private String recipientBankName;

        @Nullable
        private String recipientBankUrl;
        private long recipientFee;

        @Nullable
        private String recipientFullName;

        @Nullable
        private String recipientHeadImage;

        @Nullable
        private String recipientPhone;

        @Nullable
        private String recipientRemark;
        private long recipientTaxFee;
        private long redeemPoint;

        @Nullable
        private String sendMemberId;

        @Nullable
        private String senderBankCard;

        @Nullable
        private String senderBankName;

        @Nullable
        private String senderFullName;

        @Nullable
        private String senderHeadImage;

        @Nullable
        private String senderPhone;

        @Nullable
        private String senderRemark;

        @Nullable
        private String shopName;

        @Nullable
        private String successfulDesc;
        private long taxFee;

        @Nullable
        private String transferApplication;

        @Nullable
        private List<TransferTax> transferTaxes;

        @Nullable
        private Long payAmount = 0L;

        @Nullable
        private Long payFee = 0L;

        @Nullable
        private Long couponAmount = 0L;

        @Nullable
        private Long discountAmount = 0L;

        @Nullable
        private String orderNo = "";

        @Nullable
        private String transTypeName = "";

        @Nullable
        private String transType = "";

        @Nullable
        private Long returnBonus = 0L;

        @Nullable
        private Long createTime = 0L;

        @Nullable
        private Long updateTime = 0L;

        @Nullable
        private String payeeQRAccountNo = "";

        @Nullable
        private String partnerAccountNo = "";

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$SubTax;", "", "<init>", "()V", "taxName", "", "getTaxName", "()Ljava/lang/String;", FirebaseAnalytics.Param.TAX, "", "getTax", "()Ljava/lang/Long;", "Ljava/lang/Long;", "underlineTax", "getUnderlineTax", "taxDesc", "getTaxDesc", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SubTax {

            @Nullable
            private final Long tax;

            @Nullable
            private final String taxDesc;

            @Nullable
            private final String taxName;

            @Nullable
            private final Long underlineTax;

            @Nullable
            public final Long getTax() {
                return this.tax;
            }

            @Nullable
            public final String getTaxDesc() {
                return this.taxDesc;
            }

            @Nullable
            public final String getTaxName() {
                return this.taxName;
            }

            @Nullable
            public final Long getUnderlineTax() {
                return this.underlineTax;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$Tax;", "", "<init>", "()V", "taxName", "", "getTaxName", "()Ljava/lang/String;", "setTaxName", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.TAX, "", "getTax", "()J", "setTax", "(J)V", "platformTax", "getPlatformTax", "setPlatformTax", "taxJumpUrl", "getTaxJumpUrl", "setTaxJumpUrl", "taxDesc", "getTaxDesc", "setTaxDesc", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Tax {
            private long platformTax;
            private long tax;

            @Nullable
            private String taxDesc;

            @Nullable
            private String taxJumpUrl;

            @Nullable
            private String taxName;

            public final long getPlatformTax() {
                return this.platformTax;
            }

            public final long getTax() {
                return this.tax;
            }

            @Nullable
            public final String getTaxDesc() {
                return this.taxDesc;
            }

            @Nullable
            public final String getTaxJumpUrl() {
                return this.taxJumpUrl;
            }

            @Nullable
            public final String getTaxName() {
                return this.taxName;
            }

            public final void setPlatformTax(long j6) {
                this.platformTax = j6;
            }

            public final void setTax(long j6) {
                this.tax = j6;
            }

            public final void setTaxDesc(@Nullable String str) {
                this.taxDesc = str;
            }

            public final void setTaxJumpUrl(@Nullable String str) {
                this.taxJumpUrl = str;
            }

            public final void setTaxName(@Nullable String str) {
                this.taxName = str;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$TransferTax;", "", "<init>", "()V", FirebaseAnalytics.Param.TAX, "", "getTax", "()Ljava/lang/Long;", "setTax", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "underlineTax", "getUnderlineTax", "setUnderlineTax", "taxName", "", "getTaxName", "()Ljava/lang/String;", "setTaxName", "(Ljava/lang/String;)V", "subTaxTitle", "getSubTaxTitle", "setSubTaxTitle", "subTaxList", "", "Lcom/transsnet/palmpay/send_money/bean/TradeRecordDetailResp$RecordDetail$SubTax;", "getSubTaxList", "()Ljava/util/List;", "setSubTaxList", "(Ljava/util/List;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TransferTax {

            @Nullable
            private List<SubTax> subTaxList;

            @Nullable
            private String subTaxTitle;

            @Nullable
            private Long tax;

            @Nullable
            private String taxName;

            @Nullable
            private Long underlineTax;

            @Nullable
            public final List<SubTax> getSubTaxList() {
                return this.subTaxList;
            }

            @Nullable
            public final String getSubTaxTitle() {
                return this.subTaxTitle;
            }

            @Nullable
            public final Long getTax() {
                return this.tax;
            }

            @Nullable
            public final String getTaxName() {
                return this.taxName;
            }

            @Nullable
            public final Long getUnderlineTax() {
                return this.underlineTax;
            }

            public final void setSubTaxList(@Nullable List<SubTax> list) {
                this.subTaxList = list;
            }

            public final void setSubTaxTitle(@Nullable String str) {
                this.subTaxTitle = str;
            }

            public final void setTax(@Nullable Long l5) {
                this.tax = l5;
            }

            public final void setTaxName(@Nullable String str) {
                this.taxName = str;
            }

            public final void setUnderlineTax(@Nullable Long l5) {
                this.underlineTax = l5;
            }
        }

        public final long getAmount() {
            return this.amount;
        }

        public final int getBusinessType() {
            return this.businessType;
        }

        public final long getCashEarned() {
            return this.cashEarned;
        }

        @Nullable
        public final CashOrderExtendBean getCashOrderExtendDTO() {
            return this.cashOrderExtendDTO;
        }

        @Nullable
        public final String getChannelTransactionId() {
            return this.channelTransactionId;
        }

        @Nullable
        public final TransferDetailCompensation getCompensation() {
            return this.compensation;
        }

        @Nullable
        public final Long getCouponAmount() {
            return this.couponAmount;
        }

        @Nullable
        public final Long getCreateTime() {
            return this.createTime;
        }

        public final long getCsLevyFee() {
            return this.csLevyFee;
        }

        @Nullable
        public final String getCsLevyFeeJumpUrl() {
            return this.csLevyFeeJumpUrl;
        }

        @Nullable
        public final String getCustomerServiceHighlightText() {
            return this.customerServiceHighlightText;
        }

        @Nullable
        public final String getCustomerServicePhone() {
            return this.customerServicePhone;
        }

        @Nullable
        public final String getCustomerServiceTips() {
            return this.customerServiceTips;
        }

        public final long getDeductPoint() {
            return this.deductPoint;
        }

        @Nullable
        public final String getDetailBtnContent() {
            return this.detailBtnContent;
        }

        @Nullable
        public final String getDetailBtnJumpUrl() {
            return this.detailBtnJumpUrl;
        }

        @Nullable
        public final Long getDiscountAmount() {
            return this.discountAmount;
        }

        @Nullable
        public final String getEarlyRefundDesc() {
            return this.earlyRefundDesc;
        }

        public final int getEarlyRefundGuarantee() {
            return this.earlyRefundGuarantee;
        }

        public final long getEarlyRefundPayerFee() {
            return this.earlyRefundPayerFee;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Nullable
        public final PaymentFeeDetail getFeeDetailList() {
            return this.feeDetailList;
        }

        @Nullable
        public final OrderCompensateBean getOrderCompensate() {
            return this.orderCompensate;
        }

        @Nullable
        public final String getOrderNo() {
            return this.orderNo;
        }

        public final int getOrderStatus() {
            return this.orderStatus;
        }

        @Nullable
        public final String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        @Nullable
        public final BillProcessDetail getOrderStatusInfo() {
            return this.orderStatusInfo;
        }

        @Nullable
        public final String getPartnerAccountNo() {
            return this.partnerAccountNo;
        }

        @Nullable
        public final String getPartnerPhone() {
            return this.partnerPhone;
        }

        @Nullable
        public final Long getPayAmount() {
            return this.payAmount;
        }

        @Nullable
        public final Long getPayFee() {
            return this.payFee;
        }

        public final int getPayType() {
            return this.payType;
        }

        @Nullable
        public final String getPayTypeDesc() {
            return this.payTypeDesc;
        }

        @Nullable
        public final String getPayeeQRAccountNo() {
            return this.payeeQRAccountNo;
        }

        @Nullable
        public final List<PaymentMethodComb> getPaymentMethods() {
            return this.paymentMethods;
        }

        @Nullable
        public final String getPaymentTypeDesc() {
            return this.paymentTypeDesc;
        }

        @Nullable
        public final String getPendingMessage() {
            return this.pendingMessage;
        }

        public final long getPlatformCsLevyFee() {
            return this.platformCsLevyFee;
        }

        public final long getPlatformFee() {
            return this.platformFee;
        }

        public final long getPlatformVat() {
            return this.platformVat;
        }

        @Nullable
        public final String getReceiptDesc() {
            return this.receiptDesc;
        }

        @Nullable
        public final String getReceiveTypeDesc() {
            return this.receiveTypeDesc;
        }

        public final long getRecipientAmount() {
            return this.recipientAmount;
        }

        @Nullable
        public final String getRecipientBankAccount() {
            return this.recipientBankAccount;
        }

        @Nullable
        public final String getRecipientBankName() {
            return this.recipientBankName;
        }

        @Nullable
        public final String getRecipientBankUrl() {
            return this.recipientBankUrl;
        }

        public final long getRecipientFee() {
            return this.recipientFee;
        }

        @Nullable
        public final String getRecipientFullName() {
            return this.recipientFullName;
        }

        @Nullable
        public final String getRecipientHeadImage() {
            return this.recipientHeadImage;
        }

        @Nullable
        public final String getRecipientPhone() {
            return this.recipientPhone;
        }

        @Nullable
        public final String getRecipientRemark() {
            return this.recipientRemark;
        }

        public final long getRecipientTaxFee() {
            return this.recipientTaxFee;
        }

        public final long getRedeemPoint() {
            return this.redeemPoint;
        }

        @Nullable
        public final Long getReturnBonus() {
            return this.returnBonus;
        }

        @Nullable
        public final String getSendMemberId() {
            return this.sendMemberId;
        }

        @Nullable
        public final String getSenderBankCard() {
            return this.senderBankCard;
        }

        @Nullable
        public final String getSenderBankName() {
            return this.senderBankName;
        }

        @Nullable
        public final String getSenderFullName() {
            return this.senderFullName;
        }

        @Nullable
        public final String getSenderHeadImage() {
            return this.senderHeadImage;
        }

        @Nullable
        public final String getSenderPhone() {
            return this.senderPhone;
        }

        @Nullable
        public final String getSenderRemark() {
            return this.senderRemark;
        }

        @Nullable
        public final String getShopName() {
            return this.shopName;
        }

        @Nullable
        public final String getSuccessfulDesc() {
            return this.successfulDesc;
        }

        public final long getTaxFee() {
            return this.taxFee;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        public final String getTransTypeName() {
            return this.transTypeName;
        }

        @Nullable
        public final String getTransferApplication() {
            return this.transferApplication;
        }

        @Nullable
        public final List<TransferTax> getTransferTaxes() {
            return this.transferTaxes;
        }

        @Nullable
        public final Long getUpdateTime() {
            return this.updateTime;
        }

        public final void setAmount(long j6) {
            this.amount = j6;
        }

        public final void setBusinessType(int i7) {
            this.businessType = i7;
        }

        public final void setCashEarned(long j6) {
            this.cashEarned = j6;
        }

        public final void setCashOrderExtendDTO(@Nullable CashOrderExtendBean cashOrderExtendBean) {
            this.cashOrderExtendDTO = cashOrderExtendBean;
        }

        public final void setChannelTransactionId(@Nullable String str) {
            this.channelTransactionId = str;
        }

        public final void setCompensation(@Nullable TransferDetailCompensation transferDetailCompensation) {
            this.compensation = transferDetailCompensation;
        }

        public final void setCouponAmount(@Nullable Long l5) {
            this.couponAmount = l5;
        }

        public final void setCreateTime(@Nullable Long l5) {
            this.createTime = l5;
        }

        public final void setCsLevyFee(long j6) {
            this.csLevyFee = j6;
        }

        public final void setCsLevyFeeJumpUrl(@Nullable String str) {
            this.csLevyFeeJumpUrl = str;
        }

        public final void setCustomerServiceHighlightText(@Nullable String str) {
            this.customerServiceHighlightText = str;
        }

        public final void setCustomerServicePhone(@Nullable String str) {
            this.customerServicePhone = str;
        }

        public final void setCustomerServiceTips(@Nullable String str) {
            this.customerServiceTips = str;
        }

        public final void setDeductPoint(long j6) {
            this.deductPoint = j6;
        }

        public final void setDetailBtnContent(@Nullable String str) {
            this.detailBtnContent = str;
        }

        public final void setDetailBtnJumpUrl(@Nullable String str) {
            this.detailBtnJumpUrl = str;
        }

        public final void setDiscountAmount(@Nullable Long l5) {
            this.discountAmount = l5;
        }

        public final void setEarlyRefundDesc(@Nullable String str) {
            this.earlyRefundDesc = str;
        }

        public final void setEarlyRefundGuarantee(int i7) {
            this.earlyRefundGuarantee = i7;
        }

        public final void setEarlyRefundPayerFee(long j6) {
            this.earlyRefundPayerFee = j6;
        }

        public final void setErrorMessage(@Nullable String str) {
            this.errorMessage = str;
        }

        public final void setFeeDetailList(@Nullable PaymentFeeDetail paymentFeeDetail) {
            this.feeDetailList = paymentFeeDetail;
        }

        public final void setOrderCompensate(@Nullable OrderCompensateBean orderCompensateBean) {
            this.orderCompensate = orderCompensateBean;
        }

        public final void setOrderNo(@Nullable String str) {
            this.orderNo = str;
        }

        public final void setOrderStatus(int i7) {
            this.orderStatus = i7;
        }

        public final void setOrderStatusDesc(@Nullable String str) {
            this.orderStatusDesc = str;
        }

        public final void setOrderStatusInfo(@Nullable BillProcessDetail billProcessDetail) {
            this.orderStatusInfo = billProcessDetail;
        }

        public final void setPartnerAccountNo(@Nullable String str) {
            this.partnerAccountNo = str;
        }

        public final void setPartnerPhone(@Nullable String str) {
            this.partnerPhone = str;
        }

        public final void setPayAmount(@Nullable Long l5) {
            this.payAmount = l5;
        }

        public final void setPayFee(@Nullable Long l5) {
            this.payFee = l5;
        }

        public final void setPayType(int i7) {
            this.payType = i7;
        }

        public final void setPayTypeDesc(@Nullable String str) {
            this.payTypeDesc = str;
        }

        public final void setPayeeQRAccountNo(@Nullable String str) {
            this.payeeQRAccountNo = str;
        }

        public final void setPaymentMethods(@Nullable List<PaymentMethodComb> list) {
            this.paymentMethods = list;
        }

        public final void setPaymentTypeDesc(@Nullable String str) {
            this.paymentTypeDesc = str;
        }

        public final void setPendingMessage(@Nullable String str) {
            this.pendingMessage = str;
        }

        public final void setPlatformCsLevyFee(long j6) {
            this.platformCsLevyFee = j6;
        }

        public final void setPlatformFee(long j6) {
            this.platformFee = j6;
        }

        public final void setPlatformVat(long j6) {
            this.platformVat = j6;
        }

        public final void setReceiptDesc(@Nullable String str) {
            this.receiptDesc = str;
        }

        public final void setReceiveTypeDesc(@Nullable String str) {
            this.receiveTypeDesc = str;
        }

        public final void setRecipientAmount(long j6) {
            this.recipientAmount = j6;
        }

        public final void setRecipientBankAccount(@Nullable String str) {
            this.recipientBankAccount = str;
        }

        public final void setRecipientBankName(@Nullable String str) {
            this.recipientBankName = str;
        }

        public final void setRecipientBankUrl(@Nullable String str) {
            this.recipientBankUrl = str;
        }

        public final void setRecipientFee(long j6) {
            this.recipientFee = j6;
        }

        public final void setRecipientFullName(@Nullable String str) {
            this.recipientFullName = str;
        }

        public final void setRecipientHeadImage(@Nullable String str) {
            this.recipientHeadImage = str;
        }

        public final void setRecipientPhone(@Nullable String str) {
            this.recipientPhone = str;
        }

        public final void setRecipientRemark(@Nullable String str) {
            this.recipientRemark = str;
        }

        public final void setRecipientTaxFee(long j6) {
            this.recipientTaxFee = j6;
        }

        public final void setRedeemPoint(long j6) {
            this.redeemPoint = j6;
        }

        public final void setReturnBonus(@Nullable Long l5) {
            this.returnBonus = l5;
        }

        public final void setSendMemberId(@Nullable String str) {
            this.sendMemberId = str;
        }

        public final void setSenderBankCard(@Nullable String str) {
            this.senderBankCard = str;
        }

        public final void setSenderBankName(@Nullable String str) {
            this.senderBankName = str;
        }

        public final void setSenderFullName(@Nullable String str) {
            this.senderFullName = str;
        }

        public final void setSenderHeadImage(@Nullable String str) {
            this.senderHeadImage = str;
        }

        public final void setSenderPhone(@Nullable String str) {
            this.senderPhone = str;
        }

        public final void setSenderRemark(@Nullable String str) {
            this.senderRemark = str;
        }

        public final void setShopName(@Nullable String str) {
            this.shopName = str;
        }

        public final void setSuccessfulDesc(@Nullable String str) {
            this.successfulDesc = str;
        }

        public final void setTaxFee(long j6) {
            this.taxFee = j6;
        }

        public final void setTransType(@Nullable String str) {
            this.transType = str;
        }

        public final void setTransTypeName(@Nullable String str) {
            this.transTypeName = str;
        }

        public final void setTransferApplication(@Nullable String str) {
            this.transferApplication = str;
        }

        public final void setTransferTaxes(@Nullable List<TransferTax> list) {
            this.transferTaxes = list;
        }

        public final void setUpdateTime(@Nullable Long l5) {
            this.updateTime = l5;
        }
    }

    @Nullable
    public final RecordDetail getData() {
        return this.data;
    }

    public final void setData(@Nullable RecordDetail recordDetail) {
        this.data = recordDetail;
    }
}
