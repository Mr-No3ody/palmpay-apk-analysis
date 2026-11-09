package com.transsnet.palmpay.send_money.bean.req;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/req/TransactionHistoryLinkReq;", "", "transType", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getTransType", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransactionHistoryLinkReq {

    @NotNull
    private final ArrayList<String> transType;

    public TransactionHistoryLinkReq(@NotNull ArrayList<String> transType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        this.transType = transType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionHistoryLinkReq copy$default(TransactionHistoryLinkReq transactionHistoryLinkReq, ArrayList arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            arrayList = transactionHistoryLinkReq.transType;
        }
        return transactionHistoryLinkReq.copy(arrayList);
    }

    @NotNull
    public final ArrayList<String> component1() {
        return this.transType;
    }

    @NotNull
    public final TransactionHistoryLinkReq copy(@NotNull ArrayList<String> transType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        return new TransactionHistoryLinkReq(transType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionHistoryLinkReq) && Intrinsics.c(this.transType, ((TransactionHistoryLinkReq) other).transType);
    }

    @NotNull
    public final ArrayList<String> getTransType() {
        return this.transType;
    }

    public int hashCode() {
        return this.transType.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransactionHistoryLinkReq(transType=" + this.transType + ")";
    }
}
