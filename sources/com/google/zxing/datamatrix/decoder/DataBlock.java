package com.google.zxing.datamatrix.decoder;

/* JADX INFO: loaded from: classes3.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int i7, byte[] bArr) {
        this.numDataCodewords = i7;
        this.codewords = bArr;
    }

    public static DataBlock[] getDataBlocks(byte[] bArr, Version version) {
        Version.ECBlocks eCBlocks = version.getECBlocks();
        Version.ECB[] eCBlocks2 = eCBlocks.getECBlocks();
        int count = 0;
        for (Version.ECB ecb : eCBlocks2) {
            count += ecb.getCount();
        }
        DataBlock[] dataBlockArr = new DataBlock[count];
        int i7 = 0;
        for (Version.ECB ecb2 : eCBlocks2) {
            int i10 = 0;
            while (i10 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i7] = new DataBlock(dataCodewords, new byte[eCBlocks.getECCodewords() + dataCodewords]);
                i10++;
                i7++;
            }
        }
        int length = dataBlockArr[0].codewords.length - eCBlocks.getECCodewords();
        int i11 = length - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (i14 < i7) {
                dataBlockArr[i14].codewords[i13] = bArr[i12];
                i14++;
                i12++;
            }
        }
        boolean z3 = version.getVersionNumber() == 24;
        int i15 = z3 ? 8 : i7;
        int i16 = 0;
        while (i16 < i15) {
            dataBlockArr[i16].codewords[i11] = bArr[i12];
            i16++;
            i12++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (length < length2) {
            int i17 = 0;
            while (i17 < i7) {
                int i18 = z3 ? (i17 + 8) % i7 : i17;
                dataBlockArr[i18].codewords[(!z3 || i18 <= 7) ? length : length - 1] = bArr[i12];
                i17++;
                i12++;
            }
            length++;
        }
        if (i12 == bArr.length) {
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}
