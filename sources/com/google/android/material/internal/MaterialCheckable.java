package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.MaterialCheckable;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c6, boolean z3);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener<T> onCheckedChangeListener);
}
