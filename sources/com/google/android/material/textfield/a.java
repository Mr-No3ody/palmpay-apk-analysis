package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f22582b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i7) {
        this.f22581a = i7;
        this.f22582b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22581a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f22582b).lambda$new$0(view);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f22582b).lambda$new$0(view);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f22582b).lambda$new$0(view);
                break;
        }
    }
}
