package com.transsnet.palmpay.core.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/core/bean/CorePaymentExtra;", "Ljava/io/Serializable;", "key", "", "value", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getKey", "()Ljava/lang/CharSequence;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CorePaymentExtra implements Serializable {

    @NotNull
    private final CharSequence key;

    @NotNull
    private final CharSequence value;

    public CorePaymentExtra(@NotNull CharSequence key, @NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ CorePaymentExtra copy$default(CorePaymentExtra corePaymentExtra, CharSequence charSequence, CharSequence charSequence2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charSequence = corePaymentExtra.key;
        }
        if ((i7 & 2) != 0) {
            charSequence2 = corePaymentExtra.value;
        }
        return corePaymentExtra.copy(charSequence, charSequence2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getValue() {
        return this.value;
    }

    @NotNull
    public final CorePaymentExtra copy(@NotNull CharSequence key, @NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CorePaymentExtra(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CorePaymentExtra)) {
            return false;
        }
        CorePaymentExtra corePaymentExtra = (CorePaymentExtra) other;
        return Intrinsics.c(this.key, corePaymentExtra.key) && Intrinsics.c(this.value, corePaymentExtra.value);
    }

    @NotNull
    public final CharSequence getKey() {
        return this.key;
    }

    @NotNull
    public final CharSequence getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CorePaymentExtra(key=" + ((Object) this.key) + ", value=" + ((Object) this.value) + ")";
    }
}
