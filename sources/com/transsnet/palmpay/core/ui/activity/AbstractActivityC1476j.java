package com.transsnet.palmpay.core.ui.activity;

import android.view.Window;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1476j extends AbstractActivityC1479m {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
