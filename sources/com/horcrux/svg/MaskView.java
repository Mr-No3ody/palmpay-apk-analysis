package com.horcrux.svg;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class MaskView extends GroupView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1420q f23344g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1420q f23345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1420q f23346j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23348p;

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }
}
