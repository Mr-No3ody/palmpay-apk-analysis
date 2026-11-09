package com.transsnet.palmpay.core.base;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.q0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initStatusBar() {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 35) {
            if (window.getInsetsController() != null) {
                l();
            }
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    public void l() {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            WeakHashMap weakHashMap = N.f16168a;
            E.n(viewGroup, this);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "updateNavigationBar: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 q0Var) {
        int i7 = q0Var.f16277a.g(2).f16061d;
        View contentView = getContentView();
        if (contentView != null) {
            p220oa.h.j(contentView, null, null, null, Integer.valueOf(Math.max(i7, 0)));
        }
        return q0Var;
    }
}
