package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class TextPathView extends TextView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f23391C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f23392H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f23393L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1420q f23394M;

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        b(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.GroupView
    public final void f() {
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView
    public final void g() {
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return i(canvas, paint);
    }

    @Override // com.horcrux.svg.TextView
    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (!str.equals("align") && !str.equals("stretch")) {
            throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMethod.".concat(str));
        }
        invalidate();
    }
}
