package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public abstract class OnSelectionChangedListener<S> {
    public void onIncompleteSelectionChanged() {
    }

    public abstract void onSelectionChanged(@NonNull S s3);
}
