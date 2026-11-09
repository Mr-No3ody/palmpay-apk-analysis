package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class QuantizerMap implements Quantizer {
    Map<Integer, Integer> colorToCount;

    public Map<Integer, Integer> getColorToCount() {
        return this.colorToCount;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i10));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i10), Integer.valueOf(iIntValue));
        }
        this.colorToCount = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
