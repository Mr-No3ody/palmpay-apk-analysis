package com.facebook.react.views.switchview;

import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21836a;

    public /* synthetic */ a(int i7) {
        this.f21836a = i7;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        switch (this.f21836a) {
            case 0:
                ReactSwitchManager.ON_CHECKED_CHANGE_LISTENER$lambda$2(compoundButton, z3);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                break;
        }
    }
}
