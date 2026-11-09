package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes3.dex */
public final class AztecCode {
    private int codeWords;
    private boolean compact;
    private int layers;
    private BitMatrix matrix;
    private int size;

    public int getCodeWords() {
        return this.codeWords;
    }

    public int getLayers() {
        return this.layers;
    }

    public BitMatrix getMatrix() {
        return this.matrix;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isCompact() {
        return this.compact;
    }

    public void setCodeWords(int i7) {
        this.codeWords = i7;
    }

    public void setCompact(boolean z3) {
        this.compact = z3;
    }

    public void setLayers(int i7) {
        this.layers = i7;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.matrix = bitMatrix;
    }

    public void setSize(int i7) {
        this.size = i7;
    }
}
