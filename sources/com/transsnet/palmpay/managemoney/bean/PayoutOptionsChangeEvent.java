package com.transsnet.palmpay.managemoney.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayoutOptionsChangeEvent;", "", "changeType", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getChangeType", "()I", "setChangeType", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PayoutOptionsChangeEvent {
    private int changeType;

    @Nullable
    private String name;

    public PayoutOptionsChangeEvent(int i7, @Nullable String str) {
        this.changeType = i7;
        this.name = str;
    }

    public static /* synthetic */ PayoutOptionsChangeEvent copy$default(PayoutOptionsChangeEvent payoutOptionsChangeEvent, int i7, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = payoutOptionsChangeEvent.changeType;
        }
        if ((i10 & 2) != 0) {
            str = payoutOptionsChangeEvent.name;
        }
        return payoutOptionsChangeEvent.copy(i7, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChangeType() {
        return this.changeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PayoutOptionsChangeEvent copy(int changeType, @Nullable String name) {
        return new PayoutOptionsChangeEvent(changeType, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayoutOptionsChangeEvent)) {
            return false;
        }
        PayoutOptionsChangeEvent payoutOptionsChangeEvent = (PayoutOptionsChangeEvent) other;
        return this.changeType == payoutOptionsChangeEvent.changeType && Intrinsics.c(this.name, payoutOptionsChangeEvent.name);
    }

    public final int getChangeType() {
        return this.changeType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.changeType) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setChangeType(int i7) {
        this.changeType = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "PayoutOptionsChangeEvent(changeType=" + this.changeType + ", name=" + this.name + ")";
    }
}
