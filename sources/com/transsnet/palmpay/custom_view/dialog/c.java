package com.transsnet.palmpay.custom_view.dialog;

import com.transsnet.palmpay.core.ui.activity.T;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f31261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f31262b;

    public /* synthetic */ c(CharSequence charSequence) {
        this(charSequence, new T(10));
    }

    public c(CharSequence charSequence, Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f31261a = charSequence;
        this.f31262b = onClick;
    }
}
