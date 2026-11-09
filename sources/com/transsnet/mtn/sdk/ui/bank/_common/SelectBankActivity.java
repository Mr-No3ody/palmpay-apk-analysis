package com.transsnet.mtn.sdk.ui.bank._common;

import A8.e;
import android.graphics.Color;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import eh.a;
import p349x8.b;

/* JADX INFO: loaded from: classes3.dex */
public class SelectBankActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f25694b;

    @Override // eh.a
    public final void f() {
        this.f25694b = (RecyclerView) findViewById(p349x8.a.mtn_recycler_view);
    }

    @Override // eh.a
    public final int g() {
        return b.mtn_select_bank_activity_layout;
    }

    @Override // eh.a
    public final void h() {
    }

    @Override // eh.a
    public final void i() {
        int color = Color.parseColor("#F6F6FA");
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(color);
        new e(this);
    }
}
