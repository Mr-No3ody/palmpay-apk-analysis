package com.transsnet.palmpay.core.bean.cashier;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalResp$DataBean;", "DataBean", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultCalcOfWithdrawalResp extends CommonResult {

    @JvmField
    @Nullable
    public DataBean data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/DefaultCalcOfWithdrawalResp$DataBean;", "", "<init>", "()V", "calculationDto", "Lcom/transsnet/palmpay/core/bean/cashier/CalcOfPaymentMethodResultBean;", "receiveMethodDtoList", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierReceiveMethodBean;", "detainmentContent", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataBean {

        @JvmField
        @Nullable
        public CalcOfPaymentMethodResultBean calculationDto;

        @JvmField
        @Nullable
        public String detainmentContent;

        @JvmField
        @Nullable
        public List<CashierReceiveMethodBean> receiveMethodDtoList;
    }
}
