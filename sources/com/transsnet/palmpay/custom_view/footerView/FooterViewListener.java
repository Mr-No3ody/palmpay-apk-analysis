package com.transsnet.palmpay.custom_view.footerView;

/* JADX INFO: loaded from: classes4.dex */
public interface FooterViewListener {
    void onError(CharSequence charSequence);

    void onLoadingMore();

    void onNetChange(boolean z3);

    void onNoMore(CharSequence charSequence);

    void onStopLoadingMore();
}
