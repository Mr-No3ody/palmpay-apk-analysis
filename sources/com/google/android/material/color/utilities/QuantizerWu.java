package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    public static final class Box {
        int b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        int f22501b1;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f22502g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        int f22503g1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f22504r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int f22505r1;
        int vol;

        private Box() {
            this.f22504r0 = 0;
            this.f22505r1 = 0;
            this.f22502g0 = 0;
            this.f22503g1 = 0;
            this.b0 = 0;
            this.f22501b1 = 0;
            this.vol = 0;
        }
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i7, int i10) {
            this.resultCount = i10;
        }
    }

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i7, double d2) {
            this.cutLocation = i7;
            this.maximum = d2;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i7;
        int i10;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i7 = (-iArr[getIndex(box.f22504r0, box.f22503g1, box.f22501b1)]) + iArr[getIndex(box.f22504r0, box.f22503g1, box.b0)] + iArr[getIndex(box.f22504r0, box.f22502g0, box.f22501b1)];
            i10 = iArr[getIndex(box.f22504r0, box.f22502g0, box.b0)];
        } else if (iOrdinal == 1) {
            i7 = (-iArr[getIndex(box.f22505r1, box.f22502g0, box.f22501b1)]) + iArr[getIndex(box.f22505r1, box.f22502g0, box.b0)] + iArr[getIndex(box.f22504r0, box.f22502g0, box.f22501b1)];
            i10 = iArr[getIndex(box.f22504r0, box.f22502g0, box.b0)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i7 = (-iArr[getIndex(box.f22505r1, box.f22503g1, box.b0)]) + iArr[getIndex(box.f22505r1, box.f22502g0, box.b0)] + iArr[getIndex(box.f22504r0, box.f22503g1, box.b0)];
            i10 = iArr[getIndex(box.f22504r0, box.f22502g0, box.b0)];
        }
        return i7 - i10;
    }

    public static int getIndex(int i7, int i10, int i11) {
        return (i7 << 10) + (i7 << 6) + i7 + (i10 << 5) + i10 + i11;
    }

    public static int top(Box box, Direction direction, int i7, int[] iArr) {
        int i10;
        int i11;
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            i10 = (iArr[getIndex(i7, box.f22503g1, box.f22501b1)] - iArr[getIndex(i7, box.f22503g1, box.b0)]) - iArr[getIndex(i7, box.f22502g0, box.f22501b1)];
            i11 = iArr[getIndex(i7, box.f22502g0, box.b0)];
        } else if (iOrdinal == 1) {
            i10 = (iArr[getIndex(box.f22505r1, i7, box.f22501b1)] - iArr[getIndex(box.f22505r1, i7, box.b0)]) - iArr[getIndex(box.f22504r0, i7, box.f22501b1)];
            i11 = iArr[getIndex(box.f22504r0, i7, box.b0)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i10 = (iArr[getIndex(box.f22505r1, box.f22503g1, i7)] - iArr[getIndex(box.f22505r1, box.f22502g0, i7)]) - iArr[getIndex(box.f22504r0, box.f22503g1, i7)];
            i11 = iArr[getIndex(box.f22504r0, box.f22502g0, i7)];
        }
        return i10 + i11;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f22505r1, box.f22503g1, box.f22501b1)] - iArr[getIndex(box.f22505r1, box.f22503g1, box.b0)]) - iArr[getIndex(box.f22505r1, box.f22502g0, box.f22501b1)]) + iArr[getIndex(box.f22505r1, box.f22502g0, box.b0)]) - iArr[getIndex(box.f22504r0, box.f22503g1, box.f22501b1)]) + iArr[getIndex(box.f22504r0, box.f22503g1, box.b0)]) + iArr[getIndex(box.f22504r0, box.f22502g0, box.f22501b1)]) - iArr[getIndex(box.f22504r0, box.f22502g0, box.b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i7 = iBlueFromArgb * iBlueFromArgb;
            dArr[index] = dArr[index] + ((double) ((i7 + (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb)) * iIntValue2));
        }
    }

    public CreateBoxesResult createBoxes(int i7) {
        int i10;
        this.cubes = new Box[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            this.cubes[i11] = new Box();
        }
        double[] dArr = new double[i7];
        Box box = this.cubes[0];
        box.f22505r1 = 32;
        box.f22503g1 = 32;
        box.f22501b1 = 32;
        int i12 = 0;
        int i13 = 1;
        while (i13 < i7) {
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i12], boxArr[i13]).booleanValue()) {
                Box box2 = this.cubes[i12];
                dArr[i12] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i13];
                dArr[i13] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i12] = 0.0d;
                i13--;
            }
            double d2 = dArr[0];
            int i14 = 0;
            for (int i15 = 1; i15 <= i13; i15++) {
                double d10 = dArr[i15];
                if (d10 > d2) {
                    i14 = i15;
                    d2 = d10;
                }
            }
            if (d2 <= 0.0d) {
                i10 = i13 + 1;
                return new CreateBoxesResult(i7, i10);
            }
            i13++;
            i12 = i14;
        }
        i10 = i7;
        return new CreateBoxesResult(i7, i10);
    }

    public void createMoments() {
        int i7 = 1;
        while (true) {
            int i10 = 33;
            if (i7 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i11 = 1;
            while (i11 < i10) {
                int i12 = 0;
                int i13 = 0;
                double d2 = 0.0d;
                int i14 = 1;
                int i15 = 0;
                int i16 = 0;
                while (i14 < i10) {
                    int index = getIndex(i7, i11, i14);
                    i12 += this.weights[index];
                    i15 += this.momentsR[index];
                    i16 += this.momentsG[index];
                    i13 += this.momentsB[index];
                    d2 += this.moments[index];
                    iArr[i14] = iArr[i14] + i12;
                    iArr2[i14] = iArr2[i14] + i15;
                    iArr3[i14] = iArr3[i14] + i16;
                    iArr4[i14] = iArr4[i14] + i13;
                    dArr[i14] = dArr[i14] + d2;
                    int index2 = getIndex(i7 - 1, i11, i14);
                    int i17 = i14;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i17];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i17];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i17];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i17];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i17];
                    i14 = i17 + 1;
                    i10 = 33;
                }
                i11++;
                i10 = 33;
            }
            i7++;
        }
    }

    public List<Integer> createResult(int i7) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i7; i10++) {
            Box box = this.cubes[i10];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | (-16777216) | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f22504r0 + 1, box.f22505r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f22502g0 + 1, box.f22503g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.b0 + 1, box.f22501b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d2 = maximizeResultMaximize.maximum;
        double d10 = maximizeResultMaximize2.maximum;
        double d11 = maximizeResultMaximize3.maximum;
        if (d2 < d10 || d2 < d11) {
            if (d10 >= d2 && d10 >= d11) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f22505r1 = box.f22505r1;
        box2.f22503g1 = box.f22503g1;
        box2.f22501b1 = box.f22501b1;
        int iOrdinal = direction3.ordinal();
        if (iOrdinal == 0) {
            int i7 = maximizeResultMaximize.cutLocation;
            box.f22505r1 = i7;
            box2.f22504r0 = i7;
            box2.f22502g0 = box.f22502g0;
            box2.b0 = box.b0;
        } else if (iOrdinal == 1) {
            int i10 = maximizeResultMaximize2.cutLocation;
            box.f22503g1 = i10;
            box2.f22504r0 = box.f22504r0;
            box2.f22502g0 = i10;
            box2.b0 = box.b0;
        } else if (iOrdinal == 2) {
            int i11 = maximizeResultMaximize3.cutLocation;
            box.f22501b1 = i11;
            box2.f22504r0 = box.f22504r0;
            box2.f22502g0 = box.f22502g0;
            box2.b0 = i11;
        }
        box.vol = (box.f22501b1 - box.b0) * (box.f22503g1 - box.f22502g0) * (box.f22505r1 - box.f22504r0);
        box2.vol = (box2.f22501b1 - box2.b0) * (box2.f22503g1 - box2.f22502g0) * (box2.f22505r1 - box2.f22504r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i7, int i10, int i11, int i12, int i13, int i14) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i15 = -1;
        double d2 = 0.0d;
        int i16 = i7;
        while (i16 < i10) {
            int pVar = top(box2, direction, i16, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i16, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i16, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i16, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d10 = ((double) ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar)))) / ((double) pVar4);
                int i17 = i11 - pVar;
                int i18 = i12 - pVar2;
                int i19 = i13 - pVar3;
                int i20 = i14 - pVar4;
                if (i20 != 0) {
                    double d11 = (((double) ((i19 * i19) + ((i18 * i18) + (i17 * i17)))) / ((double) i20)) + d10;
                    if (d11 > d2) {
                        i15 = i16;
                        d2 = d11;
                    }
                }
            }
            i16++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i15, d2);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i7) {
        constructHistogram(new QuantizerMap().quantize(iArr, i7).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i7).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int i7 = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f22505r1, box.f22503g1, box.f22501b1)] - this.moments[getIndex(box.f22505r1, box.f22503g1, box.b0)]) - this.moments[getIndex(box.f22505r1, box.f22502g0, box.f22501b1)]) + this.moments[getIndex(box.f22505r1, box.f22502g0, box.b0)]) - this.moments[getIndex(box.f22504r0, box.f22503g1, box.f22501b1)]) + this.moments[getIndex(box.f22504r0, box.f22503g1, box.b0)]) + this.moments[getIndex(box.f22504r0, box.f22502g0, box.f22501b1)]) - this.moments[getIndex(box.f22504r0, box.f22502g0, box.b0)]) - (((double) (i7 + ((iVolume2 * iVolume2) + (iVolume * iVolume)))) / ((double) volume(box, this.weights)));
    }
}
