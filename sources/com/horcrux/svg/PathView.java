package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class PathView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f23349a;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return this.f23349a;
    }
}
