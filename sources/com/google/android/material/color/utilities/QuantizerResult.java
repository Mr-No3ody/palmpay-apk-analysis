package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class QuantizerResult {
    public final Map<Integer, Integer> colorToCount;

    public QuantizerResult(Map<Integer, Integer> map) {
        this.colorToCount = map;
    }
}
