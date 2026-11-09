package com.palmpay.lib.webview.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.palmpay.lib.webview.cache.ICacheWebView;
import com.palmpay.lib.webview.container.widget.SwipeRefreshLayout;
import com.palmpay.lib.webview.dsbridge.DWebView;

/* JADX INFO: loaded from: classes3.dex */
public class PPWebView extends DWebView implements ICacheWebView {
    public PPWebView(Context context) {
        super(getFixedContext(context));
    }

    public static Context getFixedContext(Context context) {
        return context;
    }

    @Override // com.palmpay.lib.webview.cache.ICacheWebView
    @Nullable
    public View getView() {
        return this;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        super.onOverScrolled(i7, i10, z3, z8);
        if (z3 || z8) {
            ViewParent parent = getParent();
            if (parent instanceof SwipeRefreshLayout) {
                ((SwipeRefreshLayout) parent).setEnabled(true);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent instanceof SwipeRefreshLayout) {
                ((SwipeRefreshLayout) parent).setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public PPWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
    }

    public PPWebView(Context context, AttributeSet attributeSet, int i7) {
        super(getFixedContext(context), attributeSet, i7);
    }

    public PPWebView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(getFixedContext(context), attributeSet, i7, i10);
    }
}
