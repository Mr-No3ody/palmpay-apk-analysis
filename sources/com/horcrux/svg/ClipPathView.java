package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class ClipPathView extends GroupView {
    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        p229p2.a.v("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    public final boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    public final void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView
    public final void resetProperties() {
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
