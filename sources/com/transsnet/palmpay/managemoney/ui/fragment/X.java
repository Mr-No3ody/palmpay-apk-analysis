package com.transsnet.palmpay.managemoney.ui.fragment;

import androidx.fragment.app.AbstractC1168d0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends AbstractC1168d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f32582h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(androidx.fragment.app.Z fragmentManager, ArrayList fragmentList) {
        super(fragmentManager, 0);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        this.f32582h = fragmentList;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f32582h.size();
    }

    @Override // androidx.fragment.app.AbstractC1168d0
    public final Fragment n(int i7) {
        return (Fragment) this.f32582h.get(i7);
    }
}
