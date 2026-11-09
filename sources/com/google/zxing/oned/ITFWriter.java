package com.google.zxing.oned;

import C0.G;
import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class ITFWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f23121N = 1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final int f23122W = 3;
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[] END_PATTERN = {3, 1, 1};
    private static final int[][] PATTERNS = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException(G.m(length, "Requested contents should be less than 80 digits long, but got "));
        }
        OneDimensionalCodeWriter.checkNumeric(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, START_PATTERN, true);
        for (int i7 = 0; i7 < length; i7 += 2) {
            int iDigit = Character.digit(str.charAt(i7), 10);
            int iDigit2 = Character.digit(str.charAt(i7 + 1), 10);
            int[] iArr = new int[10];
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = i10 * 2;
                int[][] iArr2 = PATTERNS;
                iArr[i11] = iArr2[iDigit][i10];
                iArr[i11 + 1] = iArr2[iDigit2][i10];
            }
            iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr, true);
        }
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, END_PATTERN, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.ITF);
    }
}
