package com.transsnet.palmpay.send_money.bean.resp;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0003JD\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/Data;", "", "isMerchant", "", "merchantServiceUrl", "", "accountDetailList", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/send_money/bean/resp/PosterAccountBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/ArrayList;)V", "()Ljava/lang/Boolean;", "setMerchant", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMerchantServiceUrl", "()Ljava/lang/String;", "setMerchantServiceUrl", "(Ljava/lang/String;)V", "getAccountDetailList", "()Ljava/util/ArrayList;", "setAccountDetailList", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/transsnet/palmpay/send_money/bean/resp/Data;", "equals", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Data {

    @Nullable
    private ArrayList<PosterAccountBean> accountDetailList;

    @Nullable
    private Boolean isMerchant;

    @Nullable
    private String merchantServiceUrl;

    public Data(@Nullable Boolean bool, @Nullable String str, @Nullable ArrayList<PosterAccountBean> arrayList) {
        this.isMerchant = bool;
        this.merchantServiceUrl = str;
        this.accountDetailList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, Boolean bool, String str, ArrayList arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = data.isMerchant;
        }
        if ((i7 & 2) != 0) {
            str = data.merchantServiceUrl;
        }
        if ((i7 & 4) != 0) {
            arrayList = data.accountDetailList;
        }
        return data.copy(bool, str, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsMerchant() {
        return this.isMerchant;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerchantServiceUrl() {
        return this.merchantServiceUrl;
    }

    @Nullable
    public final ArrayList<PosterAccountBean> component3() {
        return this.accountDetailList;
    }

    @NotNull
    public final Data copy(@Nullable Boolean isMerchant, @Nullable String merchantServiceUrl, @Nullable ArrayList<PosterAccountBean> accountDetailList) {
        return new Data(isMerchant, merchantServiceUrl, accountDetailList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.c(this.isMerchant, data.isMerchant) && Intrinsics.c(this.merchantServiceUrl, data.merchantServiceUrl) && Intrinsics.c(this.accountDetailList, data.accountDetailList);
    }

    @Nullable
    public final ArrayList<PosterAccountBean> getAccountDetailList() {
        return this.accountDetailList;
    }

    @Nullable
    public final String getMerchantServiceUrl() {
        return this.merchantServiceUrl;
    }

    public int hashCode() {
        Boolean bool = this.isMerchant;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.merchantServiceUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList<PosterAccountBean> arrayList = this.accountDetailList;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Nullable
    public final Boolean isMerchant() {
        return this.isMerchant;
    }

    public final void setAccountDetailList(@Nullable ArrayList<PosterAccountBean> arrayList) {
        this.accountDetailList = arrayList;
    }

    public final void setMerchant(@Nullable Boolean bool) {
        this.isMerchant = bool;
    }

    public final void setMerchantServiceUrl(@Nullable String str) {
        this.merchantServiceUrl = str;
    }

    @NotNull
    public String toString() {
        return "Data(isMerchant=" + this.isMerchant + ", merchantServiceUrl=" + this.merchantServiceUrl + ", accountDetailList=" + this.accountDetailList + ")";
    }

    public /* synthetic */ Data(Boolean bool, String str, ArrayList arrayList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, str, (i7 & 4) != 0 ? null : arrayList);
    }
}
