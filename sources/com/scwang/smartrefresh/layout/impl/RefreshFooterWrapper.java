package com.scwang.smartrefresh.layout.impl;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.View;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class RefreshFooterWrapper extends InternalAbstract implements RefreshFooter {
    public RefreshFooterWrapper(View view) {
        super(view);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean z3) {
        KeyEvent.Callback callback = this.f25171a;
        return (callback instanceof RefreshFooter) && ((RefreshFooter) callback).setNoMoreData(z3);
    }
}
