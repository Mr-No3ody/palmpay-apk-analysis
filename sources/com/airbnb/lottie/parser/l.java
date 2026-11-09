package com.airbnb.lottie.parser;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ValueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20160a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object parse(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        int i7;
        int iArgb;
        float f11;
        int iArgb2;
        float f12;
        float f13;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        boolean z3 = aVar.j() == 1;
        if (z3) {
            aVar.a();
        }
        while (aVar.e()) {
            arrayList.add(Float.valueOf((float) aVar.g()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f20160a = 2;
        }
        if (z3) {
            aVar.c();
        }
        if (this.f20160a == -1) {
            this.f20160a = arrayList.size() / 4;
        }
        int i12 = this.f20160a;
        float[] fArr = new float[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i7 = this.f20160a * 4;
            if (i13 >= i7) {
                break;
            }
            int i16 = i13 / 4;
            double dFloatValue = ((Float) arrayList.get(i13)).floatValue();
            int i17 = i11;
            int i18 = i13 % 4;
            if (i18 != 0) {
                if (i18 == i10) {
                    i14 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 2) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 3) {
                    iArr[i16] = Color.argb(255, i14, i15, (int) (dFloatValue * 255.0d));
                }
            } else if (i16 > 0) {
                float f14 = (float) dFloatValue;
                if (fArr[i16 - 1] >= f14) {
                    fArr[i16] = f14 + 0.01f;
                } else {
                    fArr[i16] = (float) dFloatValue;
                }
            } else {
                fArr[i16] = (float) dFloatValue;
            }
            i13++;
            i11 = i17;
            i10 = 1;
        }
        int i19 = i11;
        com.airbnb.lottie.model.content.b bVar = new com.airbnb.lottie.model.content.b(iArr, fArr);
        if (arrayList.size() <= i7) {
            return bVar;
        }
        int size = (arrayList.size() - i7) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i20 = i19;
        while (i7 < arrayList.size()) {
            if (i7 % 2 == 0) {
                fArr2[i20] = ((Float) arrayList.get(i7)).floatValue();
            } else {
                fArr3[i20] = ((Float) arrayList.get(i7)).floatValue();
                i20++;
            }
            i7++;
        }
        float[] fArrCopyOf = bVar.f19922a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i21 = i19;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            while (i21 < length) {
                float f15 = i23 < fArrCopyOf.length ? fArrCopyOf[i23] : Float.NaN;
                float f16 = i24 < size ? fArr2[i24] : Float.NaN;
                if (Float.isNaN(f16) || f15 < f16) {
                    fArr4[i21] = f15;
                    i23++;
                } else if (Float.isNaN(f15) || f16 < f15) {
                    fArr4[i21] = f16;
                    i24++;
                } else {
                    fArr4[i21] = f15;
                    i23++;
                    i24++;
                    i22++;
                }
                i21++;
            }
            fArrCopyOf = i22 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i22);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        for (int i25 = i19; i25 < length2; i25++) {
            float f17 = fArrCopyOf[i25];
            int iBinarySearch = Arrays.binarySearch(fArr, f17);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f17);
            int[] iArr3 = bVar.f19923b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f18 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f17 == fArr[i19]) {
                    iArgb = iArr3[i19];
                } else {
                    int i26 = 1;
                    while (true) {
                        if (i26 >= i12) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f11 = fArr[i26];
                        if (f11 >= f17 || i26 == i12 - 1) {
                            break;
                        }
                        i26++;
                    }
                    if (i26 != i12 - 1 || f17 < f11) {
                        int i27 = i26 - 1;
                        float f19 = fArr[i27];
                        int iG = androidx.camera.core.impl.utils.n.g((f17 - f19) / (f11 - f19), iArr3[i27], iArr3[i26]);
                        iArgb = Color.argb((int) (f18 * 255.0f), Color.red(iG), Color.green(iG), Color.blue(iG));
                    } else {
                        iArgb = Color.argb((int) (f18 * 255.0f), Color.red(iArr3[i26]), Color.green(iArr3[i26]), Color.blue(iArr3[i26]));
                    }
                }
                iArr2[i25] = iArgb;
            } else {
                int i28 = iArr3[iBinarySearch];
                if (size < 2 || f17 <= fArr2[i19]) {
                    iArgb2 = Color.argb((int) (fArr3[i19] * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                } else {
                    int i29 = 1;
                    while (true) {
                        if (i29 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f12 = fArr2[i29];
                        if (f12 >= f17 || i29 == size - 1) {
                            break;
                        }
                        i29++;
                    }
                    if (f12 <= f17) {
                        f13 = fArr3[i29];
                    } else {
                        int i30 = i29 - 1;
                        float f20 = fArr2[i30];
                        f13 = com.airbnb.lottie.utils.g.f(fArr3[i30], fArr3[i29], (f17 - f20) / (f12 - f20));
                    }
                    iArgb2 = Color.argb((int) (f13 * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                }
                iArr2[i25] = iArgb2;
            }
        }
        return new com.airbnb.lottie.model.content.b(iArr2, fArrCopyOf);
    }
}
