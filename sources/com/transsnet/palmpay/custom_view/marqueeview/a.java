package com.transsnet.palmpay.custom_view.marqueeview;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MarqueeView f31410a;

    public a(MarqueeView marqueeView) {
        this.f31410a = marqueeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MarqueeView marqueeView = this.f31410a;
        MarqueeView.OnItemClickListener onItemClickListener = marqueeView.f31393C;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(marqueeView.getPosition(), (TextView) view);
        }
    }
}
