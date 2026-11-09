package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* JADX INFO: loaded from: classes3.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    public DetectionResultColumn(BoundingBox boundingBox) {
        this.boundingBox = new BoundingBox(boundingBox);
        this.codewords = new Codeword[(boundingBox.getMaxY() - boundingBox.getMinY()) + 1];
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final Codeword getCodeword(int i7) {
        return this.codewords[imageRowToCodewordIndex(i7)];
    }

    public final Codeword getCodewordNearby(int i7) {
        Codeword codeword;
        Codeword codeword2;
        Codeword codeword3 = getCodeword(i7);
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int iImageRowToCodewordIndex = imageRowToCodewordIndex(i7) - i10;
            if (iImageRowToCodewordIndex >= 0 && (codeword2 = this.codewords[iImageRowToCodewordIndex]) != null) {
                return codeword2;
            }
            int iImageRowToCodewordIndex2 = imageRowToCodewordIndex(i7) + i10;
            Codeword[] codewordArr = this.codewords;
            if (iImageRowToCodewordIndex2 < codewordArr.length && (codeword = codewordArr[iImageRowToCodewordIndex2]) != null) {
                return codeword;
            }
        }
        return null;
    }

    public final Codeword[] getCodewords() {
        return this.codewords;
    }

    public final int imageRowToCodewordIndex(int i7) {
        return i7 - this.boundingBox.getMinY();
    }

    public final void setCodeword(int i7, Codeword codeword) {
        this.codewords[imageRowToCodewordIndex(i7)] = codeword;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i7 = 0;
            for (Codeword codeword : this.codewords) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i7));
                    i7++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i7), Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                    i7++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
