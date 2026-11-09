package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* JADX INFO: loaded from: classes3.dex */
public final class AztecDetectorResult extends DetectorResult {
    private final boolean compact;
    private final int errorsCorrected;
    private final int nbDatablocks;
    private final int nbLayers;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z3, int i7, int i10) {
        this(bitMatrix, resultPointArr, z3, i7, i10, 0);
    }

    public int getErrorsCorrected() {
        return this.errorsCorrected;
    }

    public int getNbDatablocks() {
        return this.nbDatablocks;
    }

    public int getNbLayers() {
        return this.nbLayers;
    }

    public boolean isCompact() {
        return this.compact;
    }

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z3, int i7, int i10, int i11) {
        super(bitMatrix, resultPointArr);
        this.compact = z3;
        this.nbDatablocks = i7;
        this.nbLayers = i10;
        this.errorsCorrected = i11;
    }
}
