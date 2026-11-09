package com.transsnet.palmpay.teller.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BettingWithdrawRecentUserIDReq;", "", "billerId", "", "categoryId", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "getCategoryId", "setCategoryId", "getItemId", "setItemId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BettingWithdrawRecentUserIDReq {

    @Nullable
    private String billerId;

    @Nullable
    private String categoryId;

    @Nullable
    private String itemId;

    public BettingWithdrawRecentUserIDReq(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.billerId = str;
        this.categoryId = str2;
        this.itemId = str3;
    }

    public static /* synthetic */ BettingWithdrawRecentUserIDReq copy$default(BettingWithdrawRecentUserIDReq bettingWithdrawRecentUserIDReq, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bettingWithdrawRecentUserIDReq.billerId;
        }
        if ((i7 & 2) != 0) {
            str2 = bettingWithdrawRecentUserIDReq.categoryId;
        }
        if ((i7 & 4) != 0) {
            str3 = bettingWithdrawRecentUserIDReq.itemId;
        }
        return bettingWithdrawRecentUserIDReq.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final BettingWithdrawRecentUserIDReq copy(@Nullable String billerId, @Nullable String categoryId, @Nullable String itemId) {
        return new BettingWithdrawRecentUserIDReq(billerId, categoryId, itemId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingWithdrawRecentUserIDReq)) {
            return false;
        }
        BettingWithdrawRecentUserIDReq bettingWithdrawRecentUserIDReq = (BettingWithdrawRecentUserIDReq) other;
        return Intrinsics.c(this.billerId, bettingWithdrawRecentUserIDReq.billerId) && Intrinsics.c(this.categoryId, bettingWithdrawRecentUserIDReq.categoryId) && Intrinsics.c(this.itemId, bettingWithdrawRecentUserIDReq.itemId);
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        String str = this.billerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    @NotNull
    public String toString() {
        String str = this.billerId;
        String str2 = this.categoryId;
        return G.r(F.f("BettingWithdrawRecentUserIDReq(billerId=", str, ", categoryId=", str2, ", itemId="), this.itemId, ")");
    }
}
