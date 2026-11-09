package com.facebook.common.lifecycle;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface AttachDetachListener {
    void onAttachToView(View view);

    void onDetachFromView(View view);
}
