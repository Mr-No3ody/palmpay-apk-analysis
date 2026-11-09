package com.horcrux.svg;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VirtualViewManager f23463a;

    public f0(VirtualViewManager virtualViewManager) {
        this.f23463a = virtualViewManager;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f23463a.invalidateSvgView((VirtualView) view);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f23463a.invalidateSvgView((VirtualView) view);
        }
    }
}
