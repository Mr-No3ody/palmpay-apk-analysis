package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/core/bean/KeyValue;", "", "key", "", "value", "", "isEnable", "", "<init>", "(Ljava/lang/String;IZ)V", "getKey", "()Ljava/lang/String;", "getValue", "()I", "()Z", "setEnable", "(Z)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyValue {
    private boolean isEnable;

    @NotNull
    private final String key;
    private final int value;

    public KeyValue() {
        this(null, 0, false, 7, null);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isEnable, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z3) {
        this.isEnable = z3;
    }

    public KeyValue(@NotNull String key, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = i7;
        this.isEnable = z3;
    }

    public /* synthetic */ KeyValue(String str, int i7, boolean z3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? -1 : i7, (i10 & 4) != 0 ? true : z3);
    }
}
