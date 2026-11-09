package com.transsnet.palmpay.custom_view.smarttablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements SmartTabLayout.TabProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f31701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31703c;

    public c(Context context, int i7, int i10) {
        this.f31701a = LayoutInflater.from(context);
        this.f31702b = i7;
        this.f31703c = i10;
    }

    @Override // com.transsnet.palmpay.custom_view.smarttablayout.SmartTabLayout.TabProvider
    public final View createTabView(ViewGroup viewGroup, int i7, androidx.viewpager.widget.a aVar) {
        TextView textView = null;
        int i10 = this.f31702b;
        View viewInflate = i10 != -1 ? this.f31701a.inflate(i10, viewGroup, false) : null;
        int i11 = this.f31703c;
        if (i11 != -1 && viewInflate != null) {
            textView = (TextView) viewInflate.findViewById(i11);
        }
        if (textView == null && TextView.class.isInstance(viewInflate)) {
            textView = (TextView) viewInflate;
        }
        if (textView != null) {
            textView.setText(aVar.e(i7));
        }
        return viewInflate;
    }
}
