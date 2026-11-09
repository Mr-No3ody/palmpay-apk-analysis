package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d2) {
            this.hct = hct;
            this.score = d2;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i7) {
        return score(map, i7, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i7, int i10) {
        return score(map, i7, i10, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i7, int i10, boolean z3) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[MessageEvent.EVENT_CL_REPAYMENT_FAILED];
        double d2 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d2 += (double) iIntValue;
        }
        double[] dArr = new double[MessageEvent.EVENT_CL_REPAYMENT_FAILED];
        for (int i11 = 0; i11 < 360; i11++) {
            double d10 = ((double) iArr[i11]) / d2;
            for (int i12 = i11 - 14; i12 < i11 + 16; i12++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i12);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d10;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d11 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z3 || (hct.getChroma() >= CUTOFF_CHROMA && d11 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? 0.1d : WEIGHT_CHROMA_ABOVE)) + (d11 * 100.0d * 0.7d)));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 90; i13 >= 15; i13--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                } while (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) >= i13);
                if (arrayList3.size() >= i7) {
                    break;
                }
            }
            if (arrayList3.size() >= i7) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i10));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }
}
