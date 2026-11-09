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
public class EmptyFooterView extends BaseFooterView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f31339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f31340b;

    public EmptyFooterView(Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onError(CharSequence charSequence) {
        this.f31340b.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onLoadingMore() {
        this.f31340b.setVisibility(0);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNetChange(boolean z3) {
        this.f31340b.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onNoMore(CharSequence charSequence) {
        this.f31340b.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.custom_view.footerView.FooterViewListener
    public final void onStopLoadingMore() {
        this.f31340b.setVisibility(8);
    }

    public EmptyFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyFooterView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View viewInflate = LayoutInflater.from(getContext()).inflate(t.cv_layout_empty_footer_view, this);
        this.f31340b = viewInflate.findViewById(s.footer_view_loading);
        this.f31339a = (TextView) viewInflate.findViewById(s.footer_view_loading_tv);
    }
}
