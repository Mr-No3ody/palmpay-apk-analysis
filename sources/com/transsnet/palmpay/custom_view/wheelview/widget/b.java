package com.transsnet.palmpay.custom_view.wheelview.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WheelView f31737a;

    public b(WheelView wheelView) {
        this.f31737a = wheelView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        WheelView wheelView = this.f31737a;
        WheelView.OnWheelItemClickListener onWheelItemClickListener = wheelView.f31717A;
        if (onWheelItemClickListener != null) {
            onWheelItemClickListener.onItemClick(wheelView.getCurrentPosition(), wheelView.getSelectionItem());
        }
    }
}
