package com.transsnet.palmpay.teller.bean.resp;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BillOrderInfoConfirmData;", "", "accountName", "", "address", "billerName", "customerId", "itemId", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getAddress", "getBillerName", "getCustomerId", "getItemId", "getItemName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BillOrderInfoConfirmData {

    @Nullable
    private final String accountName;

    @Nullable
    private final String address;

    @Nullable
    private final String billerName;

    @Nullable
    private final String customerId;

    @Nullable
    private final String itemId;

    @Nullable
    private final String itemName;

    public BillOrderInfoConfirmData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.accountName = str;
        this.address = str2;
        this.billerName = str3;
        this.customerId = str4;
        this.itemId = str5;
        this.itemName = str6;
    }

    public static /* synthetic */ BillOrderInfoConfirmData copy$default(BillOrderInfoConfirmData billOrderInfoConfirmData, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = billOrderInfoConfirmData.accountName;
        }
        if ((i7 & 2) != 0) {
            str2 = billOrderInfoConfirmData.address;
        }
        if ((i7 & 4) != 0) {
            str3 = billOrderInfoConfirmData.billerName;
        }
        if ((i7 & 8) != 0) {
            str4 = billOrderInfoConfirmData.customerId;
        }
        if ((i7 & 16) != 0) {
            str5 = billOrderInfoConfirmData.itemId;
        }
        if ((i7 & 32) != 0) {
            str6 = billOrderInfoConfirmData.itemName;
        }
        String str7 = str5;
        String str8 = str6;
        return billOrderInfoConfirmData.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final BillOrderInfoConfirmData copy(@Nullable String accountName, @Nullable String address, @Nullable String billerName, @Nullable String customerId, @Nullable String itemId, @Nullable String itemName) {
        return new BillOrderInfoConfirmData(accountName, address, billerName, customerId, itemId, itemName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillOrderInfoConfirmData)) {
            return false;
        }
        BillOrderInfoConfirmData billOrderInfoConfirmData = (BillOrderInfoConfirmData) other;
        return Intrinsics.c(this.accountName, billOrderInfoConfirmData.accountName) && Intrinsics.c(this.address, billOrderInfoConfirmData.address) && Intrinsics.c(this.billerName, billOrderInfoConfirmData.billerName) && Intrinsics.c(this.customerId, billOrderInfoConfirmData.customerId) && Intrinsics.c(this.itemId, billOrderInfoConfirmData.itemId) && Intrinsics.c(this.itemName, billOrderInfoConfirmData.itemName);
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    public int hashCode() {
        String str = this.accountName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.itemName;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountName;
        String str2 = this.address;
        String str3 = this.billerName;
        String str4 = this.customerId;
        String str5 = this.itemId;
        String str6 = this.itemName;
        StringBuilder sbF = F.f("BillOrderInfoConfirmData(accountName=", str, ", address=", str2, ", billerName=");
        u.x(sbF, str3, ", customerId=", str4, ", itemId=");
        return G.s(sbF, str5, ", itemName=", str6, ")");
    }
}
