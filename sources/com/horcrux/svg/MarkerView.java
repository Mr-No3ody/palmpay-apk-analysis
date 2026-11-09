package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class MarkerView extends GroupView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f23331A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f23332B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f23333C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Matrix f23334H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1420q f23336g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1420q f23337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1420q f23338j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f23339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f23340p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f23341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f23342w;

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }
}
