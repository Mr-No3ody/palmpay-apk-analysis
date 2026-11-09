package com.transsnet.palmpay.custom_view.dialog;

import android.content.DialogInterface;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final h wrap(@NotNull DialogInterface.OnDismissListener delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        h hVar = new h();
        hVar.f31271a = delegate;
        return hVar;
    }

    private f() {
    }
}
