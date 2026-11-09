package com.transsnet.palmpay.credit.bean;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp$Data;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp$Data;", "setData", "Data", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserDeduceDateResp extends CommonResult {

    @Nullable
    private Data data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/UserDeduceDateResp$Data;", "", "deduceDateStamp", "", "creditCardList", "", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainCreditCard;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getDeduceDateStamp", "()Ljava/lang/Long;", "setDeduceDateStamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCreditCardList", "()Ljava/util/List;", "setCreditCardList", "(Ljava/util/List;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data {

        @Nullable
        private List<CLMainCreditCard> creditCardList;

        @Nullable
        private Long deduceDateStamp;

        public Data(@Nullable Long l5, @Nullable List<CLMainCreditCard> list) {
            this.deduceDateStamp = l5;
            this.creditCardList = list;
        }

        @Nullable
        public final List<CLMainCreditCard> getCreditCardList() {
            return this.creditCardList;
        }

        @Nullable
        public final Long getDeduceDateStamp() {
            return this.deduceDateStamp;
        }

        public final void setCreditCardList(@Nullable List<CLMainCreditCard> list) {
            this.creditCardList = list;
        }

        public final void setDeduceDateStamp(@Nullable Long l5) {
            this.deduceDateStamp = l5;
        }
    }

    public UserDeduceDateResp(@Nullable Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }
}
