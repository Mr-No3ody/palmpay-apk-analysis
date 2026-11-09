package com.transsnet.palmpay.managemoney.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.SavingStatBean;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0018\u00010\u0003R\u00020\u0000HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp$Data;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp$Data;)V", "getData", "()Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp$Data;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Data", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetSavingHomeResp extends CommonResult {

    @Nullable
    private final Data data;

    public GetSavingHomeResp(@Nullable Data data) {
        this.data = data;
    }

    public static /* synthetic */ GetSavingHomeResp copy$default(GetSavingHomeResp getSavingHomeResp, Data data, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            data = getSavingHomeResp.data;
        }
        return getSavingHomeResp.copy(data);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final GetSavingHomeResp copy(@Nullable Data data) {
        return new GetSavingHomeResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSavingHomeResp) && Intrinsics.c(this.data, ((GetSavingHomeResp) other).data);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "GetSavingHomeResp(data=" + this.data + ")";
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp$Data;", "", "savingStat", "Lcom/transsnet/palmpay/managemoney/bean/SavingStatBean;", "popUp", "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "popupTodayCashCount", "", "planListContent", "", "payoutOptions", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "Lkotlin/collections/ArrayList;", "<init>", "(Lcom/transsnet/palmpay/managemoney/bean/resp/GetSavingHomeResp;Lcom/transsnet/palmpay/managemoney/bean/SavingStatBean;Lcom/transsnet/palmpay/managemoney/bean/ProductBean;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;)V", "getSavingStat", "()Lcom/transsnet/palmpay/managemoney/bean/SavingStatBean;", "getPopUp", "()Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "getPopupTodayCashCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlanListContent", "()Ljava/lang/String;", "getPayoutOptions", "()Ljava/util/ArrayList;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Data {

        @Nullable
        private final ArrayList<PayoutOption> payoutOptions;

        @Nullable
        private final String planListContent;

        @Nullable
        private final ProductBean popUp;

        @Nullable
        private final Long popupTodayCashCount;

        @Nullable
        private final SavingStatBean savingStat;

        public Data(@Nullable SavingStatBean savingStatBean, @Nullable ProductBean productBean, @Nullable Long l5, @Nullable String str, ArrayList<PayoutOption> arrayList) {
            this.savingStat = savingStatBean;
            this.popUp = productBean;
            this.popupTodayCashCount = l5;
            this.planListContent = str;
            this.payoutOptions = arrayList;
        }

        @Nullable
        public final ArrayList<PayoutOption> getPayoutOptions() {
            return this.payoutOptions;
        }

        @Nullable
        public final String getPlanListContent() {
            return this.planListContent;
        }

        @Nullable
        public final ProductBean getPopUp() {
            return this.popUp;
        }

        @Nullable
        public final Long getPopupTodayCashCount() {
            return this.popupTodayCashCount;
        }

        @Nullable
        public final SavingStatBean getSavingStat() {
            return this.savingStat;
        }

        public /* synthetic */ Data(GetSavingHomeResp getSavingHomeResp, SavingStatBean savingStatBean, ProductBean productBean, Long l5, String str, ArrayList arrayList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(savingStatBean, productBean, (i7 & 4) != 0 ? 0L : l5, str, arrayList);
        }
    }
}
