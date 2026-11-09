package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f22584b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i7) {
        this.f22583a = i7;
        this.f22584b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f22583a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f22584b).lambda$new$1(view, z3);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f22584b).lambda$new$1(view, z3);
                break;
        }
    }
}
