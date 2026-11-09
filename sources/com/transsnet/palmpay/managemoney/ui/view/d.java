package com.transsnet.palmpay.managemoney.ui.view;

import android.graphics.drawable.Drawable;
import com.transsnet.palmpay.core.ui.activity.T;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f32715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f32717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f32719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f32721h;

    public d(String str, float f10, int i7, Drawable drawable, Function0 onRightClick, boolean z3, Function0 onClick, int i10) {
        f10 = (i10 & 2) != 0 ? 14.0f : f10;
        i7 = (i10 & 4) != 0 ? L6.b.ppColorTextPrimary : i7;
        drawable = (i10 & 8) != 0 ? null : drawable;
        boolean z8 = (i10 & 16) == 0;
        onRightClick = (i10 & 32) != 0 ? new T(29) : onRightClick;
        z3 = (i10 & 64) != 0 ? false : z3;
        onClick = (i10 & 128) != 0 ? new c(0) : onClick;
        Intrinsics.checkNotNullParameter(onRightClick, "onRightClick");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f32714a = str;
        this.f32715b = f10;
        this.f32716c = i7;
        this.f32717d = drawable;
        this.f32718e = z8;
        this.f32719f = onRightClick;
        this.f32720g = z3;
        this.f32721h = onClick;
    }
}
