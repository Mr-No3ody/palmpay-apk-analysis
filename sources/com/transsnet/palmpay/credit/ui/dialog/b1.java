package com.transsnet.palmpay.credit.ui.dialog;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 {
    public /* synthetic */ b1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isDailyUnit(@Nullable String str) {
        return "D".equalsIgnoreCase(str != null ? StringsKt.V(str).toString() : null);
    }

    private b1() {
    }
}
