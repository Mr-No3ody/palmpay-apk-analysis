package com.transsnet.palmpay.custom_view.input;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f31382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f31383c;

    public /* synthetic */ c(ArrayAdapter arrayAdapter, LinearLayout linearLayout, int i7) {
        this.f31381a = i7;
        this.f31382b = arrayAdapter;
        this.f31383c = linearLayout;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j6) {
        switch (this.f31381a) {
            case 0:
                ModelMobileWithIconInputLayout.initModelInputRegexData$lambda$23((ModelMobileInputAdapter) this.f31382b, (ModelMobileWithIconInputLayout) this.f31383c, adapterView, view, i7, j6);
                break;
            default:
                ModelNumberInputLayout.initModelInputRegexData$lambda$9((ModelNumberInputAdapter) this.f31382b, (ModelNumberInputLayout) this.f31383c, adapterView, view, i7, j6);
                break;
        }
    }
}
