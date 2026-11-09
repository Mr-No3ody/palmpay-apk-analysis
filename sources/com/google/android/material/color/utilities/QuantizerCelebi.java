package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i7) {
        Set<Integer> setKeySet = new QuantizerWu().quantize(iArr, i7).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = it.next().intValue();
            i10++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i7);
    }
}
