package com.google.zxing.pdf417.encoder;

/* JADX INFO: loaded from: classes3.dex */
final class BarcodeRow {
    private int currentLocation = 0;
    private final byte[] row;

    public BarcodeRow(int i7) {
        this.row = new byte[i7];
    }

    public void addBar(boolean z3, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.currentLocation;
            this.currentLocation = i11 + 1;
            set(i11, z3);
        }
    }

    public byte[] getScaledRow(int i7) {
        int length = this.row.length * i7;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = this.row[i10 / i7];
        }
        return bArr;
    }

    public void set(int i7, byte b7) {
        this.row[i7] = b7;
    }

    private void set(int i7, boolean z3) {
        this.row[i7] = z3 ? (byte) 1 : (byte) 0;
    }
}
