package com.transsnet.palmpay.jara_packet.ui.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.footerView.BaseFooterView;
import p236pc.d;
import p236pc.e;

/* JADX INFO: loaded from: classes4.dex */
public class ReferEarnFooterView extends BaseFooterView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f31966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f31967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f31968c;

    public ReferEarnFooterView(Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onError(CharSequence charSequence) {
        this.f31968c.setVisibility(8);
        this.f31966a.setVisibility(0);
        this.f31966a.setText(charSequence);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onLoadingMore() {
        this.f31968c.setVisibility(0);
        this.f31966a.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNetChange(boolean z3) {
        this.f31968c.setVisibility(8);
        this.f31966a.setVisibility(0);
        this.f31966a.setText("Network Error");
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNoMore(CharSequence charSequence) {
        this.f31968c.setVisibility(8);
        this.f31966a.setVisibility(0);
        this.f31966a.setText(charSequence);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onStopLoadingMore() {
        this.f31968c.setVisibility(8);
    }

    public ReferEarnFooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ReferEarnFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View viewInflate = LayoutInflater.from(getContext()).inflate(e.jp_layout_footer_view, this);
        this.f31968c = viewInflate.findViewById(d.footer_view_loading);
        this.f31966a = (TextView) viewInflate.findViewById(d.footer_view_tv);
        this.f31967b = (TextView) viewInflate.findViewById(d.footer_view_loading_tv);
    }
}
