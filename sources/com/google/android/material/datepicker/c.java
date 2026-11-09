package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f22525b;

    public /* synthetic */ c(MaterialDatePicker materialDatePicker, int i7) {
        this.f22524a = i7;
        this.f22525b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22524a) {
            case 0:
                this.f22525b.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                this.f22525b.onPositiveButtonClick(view);
                break;
            default:
                this.f22525b.onNegativeButtonClick(view);
                break;
        }
    }
}
