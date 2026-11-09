package com.transsnet.palmpay.custom_view.footerView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleFooterView extends BaseFooterView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f31341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f31342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f31343c;

    public SimpleFooterView(Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onError(CharSequence charSequence) {
        this.f31343c.setVisibility(8);
        this.f31341a.setVisibility(0);
        this.f31341a.setText(charSequence);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onLoadingMore() {
        this.f31343c.setVisibility(0);
        this.f31341a.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNetChange(boolean z3) {
        this.f31343c.setVisibility(8);
        this.f31341a.setVisibility(0);
        this.f31341a.setText("Network Error");
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNoMore(CharSequence charSequence) {
        this.f31343c.setVisibility(8);
        this.f31341a.setVisibility(0);
        this.f31341a.setText(charSequence);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onStopLoadingMore() {
        this.f31343c.setVisibility(8);
    }

    public SimpleFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleFooterView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View viewInflate = LayoutInflater.from(getContext()).inflate(t.cv_layout_footer_view, this);
        this.f31343c = viewInflate.findViewById(s.footer_view_loading);
        this.f31341a = (TextView) viewInflate.findViewById(s.footer_view_tv);
        this.f31342b = (TextView) viewInflate.findViewById(s.footer_view_loading_tv);
    }
}
