package com.transsnet.palmpay.teller.bean.resp;

import N8.q0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.core.bean.rsp.LimitAmountResp;
import com.transsnet.palmpay.teller.bean.BettingAcmountItemData;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\u008c\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001b¨\u0006D"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingHomePageData;", "", "defaultBiller", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "outBillerList", "", "defaultItem", "Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "customerId", "", "businessAmount", "", "itemCount", "amountList", "Lcom/transsnet/palmpay/teller/bean/BettingAcmountItemData;", "amtLimit", "Lcom/transsnet/palmpay/core/bean/rsp/LimitAmountResp;", "moduleSort", "<init>", "(Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;Ljava/util/List;Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/transsnet/palmpay/core/bean/rsp/LimitAmountResp;Ljava/util/List;)V", "getDefaultBiller", "()Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "setDefaultBiller", "(Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;)V", "getOutBillerList", "()Ljava/util/List;", "setOutBillerList", "(Ljava/util/List;)V", "getDefaultItem", "()Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", "setDefaultItem", "(Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;)V", "getCustomerId", "()Ljava/lang/String;", "setCustomerId", "(Ljava/lang/String;)V", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getItemCount", "setItemCount", "getAmountList", "setAmountList", "getAmtLimit", "()Lcom/transsnet/palmpay/core/bean/rsp/LimitAmountResp;", "setAmtLimit", "(Lcom/transsnet/palmpay/core/bean/rsp/LimitAmountResp;)V", "getModuleSort", "setModuleSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;Ljava/util/List;Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/transsnet/palmpay/core/bean/rsp/LimitAmountResp;Ljava/util/List;)Lcom/transsnet/palmpay/teller/bean/resp/BettingHomePageData;", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingHomePageData {

    @Nullable
    private List<BettingAcmountItemData> amountList;

    @Nullable
    private LimitAmountResp amtLimit;

    @Nullable
    private Long businessAmount;

    @Nullable
    private String customerId;

    @Nullable
    private BettingBillerListItemBean defaultBiller;

    @Nullable
    private PaymentItemBean defaultItem;

    @Nullable
    private Long itemCount;

    @Nullable
    private List<String> moduleSort;

    @Nullable
    private List<BettingBillerListItemBean> outBillerList;

    public BettingHomePageData(@Nullable BettingBillerListItemBean bettingBillerListItemBean, @Nullable List<BettingBillerListItemBean> list, @Nullable PaymentItemBean paymentItemBean, @Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable List<BettingAcmountItemData> list2, @Nullable LimitAmountResp limitAmountResp, @Nullable List<String> list3) {
        this.defaultBiller = bettingBillerListItemBean;
        this.outBillerList = list;
        this.defaultItem = paymentItemBean;
        this.customerId = str;
        this.businessAmount = l5;
        this.itemCount = l6;
        this.amountList = list2;
        this.amtLimit = limitAmountResp;
        this.moduleSort = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BettingHomePageData copy$default(BettingHomePageData bettingHomePageData, BettingBillerListItemBean bettingBillerListItemBean, List list, PaymentItemBean paymentItemBean, String str, Long l5, Long l6, List list2, LimitAmountResp limitAmountResp, List list3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bettingBillerListItemBean = bettingHomePageData.defaultBiller;
        }
        if ((i7 & 2) != 0) {
            list = bettingHomePageData.outBillerList;
        }
        if ((i7 & 4) != 0) {
            paymentItemBean = bettingHomePageData.defaultItem;
        }
        if ((i7 & 8) != 0) {
            str = bettingHomePageData.customerId;
        }
        if ((i7 & 16) != 0) {
            l5 = bettingHomePageData.businessAmount;
        }
        if ((i7 & 32) != 0) {
            l6 = bettingHomePageData.itemCount;
        }
        if ((i7 & 64) != 0) {
            list2 = bettingHomePageData.amountList;
        }
        if ((i7 & 128) != 0) {
            limitAmountResp = bettingHomePageData.amtLimit;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            list3 = bettingHomePageData.moduleSort;
        }
        LimitAmountResp limitAmountResp2 = limitAmountResp;
        List list4 = list3;
        Long l8 = l6;
        List list5 = list2;
        Long l10 = l5;
        PaymentItemBean paymentItemBean2 = paymentItemBean;
        return bettingHomePageData.copy(bettingBillerListItemBean, list, paymentItemBean2, str, l10, l8, list5, limitAmountResp2, list4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BettingBillerListItemBean getDefaultBiller() {
        return this.defaultBiller;
    }

    @Nullable
    public final List<BettingBillerListItemBean> component2() {
        return this.outBillerList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentItemBean getDefaultItem() {
        return this.defaultItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getItemCount() {
        return this.itemCount;
    }

    @Nullable
    public final List<BettingAcmountItemData> component7() {
        return this.amountList;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LimitAmountResp getAmtLimit() {
        return this.amtLimit;
    }

    @Nullable
    public final List<String> component9() {
        return this.moduleSort;
    }

    @NotNull
    public final BettingHomePageData copy(@Nullable BettingBillerListItemBean defaultBiller, @Nullable List<BettingBillerListItemBean> outBillerList, @Nullable PaymentItemBean defaultItem, @Nullable String customerId, @Nullable Long businessAmount, @Nullable Long itemCount, @Nullable List<BettingAcmountItemData> amountList, @Nullable LimitAmountResp amtLimit, @Nullable List<String> moduleSort) {
        return new BettingHomePageData(defaultBiller, outBillerList, defaultItem, customerId, businessAmount, itemCount, amountList, amtLimit, moduleSort);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingHomePageData)) {
            return false;
        }
        BettingHomePageData bettingHomePageData = (BettingHomePageData) other;
        return Intrinsics.c(this.defaultBiller, bettingHomePageData.defaultBiller) && Intrinsics.c(this.outBillerList, bettingHomePageData.outBillerList) && Intrinsics.c(this.defaultItem, bettingHomePageData.defaultItem) && Intrinsics.c(this.customerId, bettingHomePageData.customerId) && Intrinsics.c(this.businessAmount, bettingHomePageData.businessAmount) && Intrinsics.c(this.itemCount, bettingHomePageData.itemCount) && Intrinsics.c(this.amountList, bettingHomePageData.amountList) && Intrinsics.c(this.amtLimit, bettingHomePageData.amtLimit) && Intrinsics.c(this.moduleSort, bettingHomePageData.moduleSort);
    }

    @Nullable
    public final List<BettingAcmountItemData> getAmountList() {
        return this.amountList;
    }

    @Nullable
    public final LimitAmountResp getAmtLimit() {
        return this.amtLimit;
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final BettingBillerListItemBean getDefaultBiller() {
        return this.defaultBiller;
    }

    @Nullable
    public final PaymentItemBean getDefaultItem() {
        return this.defaultItem;
    }

    @Nullable
    public final Long getItemCount() {
        return this.itemCount;
    }

    @Nullable
    public final List<String> getModuleSort() {
        return this.moduleSort;
    }

    @Nullable
    public final List<BettingBillerListItemBean> getOutBillerList() {
        return this.outBillerList;
    }

    public int hashCode() {
        BettingBillerListItemBean bettingBillerListItemBean = this.defaultBiller;
        int iHashCode = (bettingBillerListItemBean == null ? 0 : bettingBillerListItemBean.hashCode()) * 31;
        List<BettingBillerListItemBean> list = this.outBillerList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        PaymentItemBean paymentItemBean = this.defaultItem;
        int iHashCode3 = (iHashCode2 + (paymentItemBean == null ? 0 : paymentItemBean.hashCode())) * 31;
        String str = this.customerId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l5 = this.businessAmount;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.itemCount;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List<BettingAcmountItemData> list2 = this.amountList;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        LimitAmountResp limitAmountResp = this.amtLimit;
        int iHashCode8 = (iHashCode7 + (limitAmountResp == null ? 0 : limitAmountResp.hashCode())) * 31;
        List<String> list3 = this.moduleSort;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setAmountList(@Nullable List<BettingAcmountItemData> list) {
        this.amountList = list;
    }

    public final void setAmtLimit(@Nullable LimitAmountResp limitAmountResp) {
        this.amtLimit = limitAmountResp;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setDefaultBiller(@Nullable BettingBillerListItemBean bettingBillerListItemBean) {
        this.defaultBiller = bettingBillerListItemBean;
    }

    public final void setDefaultItem(@Nullable PaymentItemBean paymentItemBean) {
        this.defaultItem = paymentItemBean;
    }

    public final void setItemCount(@Nullable Long l5) {
        this.itemCount = l5;
    }

    public final void setModuleSort(@Nullable List<String> list) {
        this.moduleSort = list;
    }

    public final void setOutBillerList(@Nullable List<BettingBillerListItemBean> list) {
        this.outBillerList = list;
    }

    @NotNull
    public String toString() {
        BettingBillerListItemBean bettingBillerListItemBean = this.defaultBiller;
        List<BettingBillerListItemBean> list = this.outBillerList;
        PaymentItemBean paymentItemBean = this.defaultItem;
        String str = this.customerId;
        Long l5 = this.businessAmount;
        Long l6 = this.itemCount;
        List<BettingAcmountItemData> list2 = this.amountList;
        LimitAmountResp limitAmountResp = this.amtLimit;
        List<String> list3 = this.moduleSort;
        StringBuilder sb2 = new StringBuilder("BettingHomePageData(defaultBiller=");
        sb2.append(bettingBillerListItemBean);
        sb2.append(", outBillerList=");
        sb2.append(list);
        sb2.append(", defaultItem=");
        sb2.append(paymentItemBean);
        sb2.append(", customerId=");
        sb2.append(str);
        sb2.append(", businessAmount=");
        q0.w(sb2, l5, ", itemCount=", l6, ", amountList=");
        sb2.append(list2);
        sb2.append(", amtLimit=");
        sb2.append(limitAmountResp);
        sb2.append(", moduleSort=");
        return q0.o(sb2, list3, ")");
    }
}
