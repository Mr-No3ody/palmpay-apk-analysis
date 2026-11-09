package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.Formatter;

/* JADX INFO: loaded from: classes3.dex */
final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    public DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
        this.barcodeMetadata = barcodeMetadata;
        int columnCount = barcodeMetadata.getColumnCount();
        this.barcodeColumnCount = columnCount;
        this.boundingBox = boundingBox;
        this.detectionResultColumns = new DetectionResultColumn[columnCount + 2];
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            ((DetectionResultRowIndicatorColumn) detectionResultColumn).adjustCompleteIndicatorColumnRowNumbers(this.barcodeMetadata);
        }
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
        if (codeword2 == null || !codeword2.hasValidRowNumber() || codeword2.getBucket() != codeword.getBucket()) {
            return false;
        }
        codeword.setRowNumber(codeword2.getRowNumber());
        return true;
    }

    private static int adjustRowNumberIfValid(int i7, int i10, Codeword codeword) {
        if (codeword == null || codeword.hasValidRowNumber()) {
            return i10;
        }
        if (!codeword.isValidRowNumber(i7)) {
            return i10 + 1;
        }
        codeword.setRowNumber(i7);
        return 0;
    }

    private int adjustRowNumbers() {
        int iAdjustRowNumbersByRow = adjustRowNumbersByRow();
        if (iAdjustRowNumbersByRow == 0) {
            return 0;
        }
        for (int i7 = 1; i7 < this.barcodeColumnCount + 1; i7++) {
            Codeword[] codewords = this.detectionResultColumns[i7].getCodewords();
            for (int i10 = 0; i10 < codewords.length; i10++) {
                Codeword codeword = codewords[i10];
                if (codeword != null && !codeword.hasValidRowNumber()) {
                    adjustRowNumbers(i7, i10, codewords);
                }
            }
        }
        return iAdjustRowNumbersByRow;
    }

    private int adjustRowNumbersByRow() {
        adjustRowNumbersFromBothRI();
        return adjustRowNumbersFromLRI() + adjustRowNumbersFromRRI();
    }

    private void adjustRowNumbersFromBothRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null || detectionResultColumnArr[this.barcodeColumnCount + 1] == null) {
            return;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        Codeword[] codewords2 = this.detectionResultColumns[this.barcodeColumnCount + 1].getCodewords();
        for (int i7 = 0; i7 < codewords.length; i7++) {
            Codeword codeword = codewords[i7];
            if (codeword != null && codewords2[i7] != null && codeword.getRowNumber() == codewords2[i7].getRowNumber()) {
                for (int i10 = 1; i10 <= this.barcodeColumnCount; i10++) {
                    Codeword codeword2 = this.detectionResultColumns[i10].getCodewords()[i7];
                    if (codeword2 != null) {
                        codeword2.setRowNumber(codewords[i7].getRowNumber());
                        if (!codeword2.hasValidRowNumber()) {
                            this.detectionResultColumns[i10].getCodewords()[i7] = null;
                        }
                    }
                }
            }
        }
    }

    private int adjustRowNumbersFromLRI() {
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[0];
        if (detectionResultColumn == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumn.getCodewords();
        int i7 = 0;
        for (int i10 = 0; i10 < codewords.length; i10++) {
            Codeword codeword = codewords[i10];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int iAdjustRowNumberIfValid = 0;
                for (int i11 = 1; i11 < this.barcodeColumnCount + 1 && iAdjustRowNumberIfValid < 2; i11++) {
                    Codeword codeword2 = this.detectionResultColumns[i11].getCodewords()[i10];
                    if (codeword2 != null) {
                        iAdjustRowNumberIfValid = adjustRowNumberIfValid(rowNumber, iAdjustRowNumberIfValid, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i7++;
                        }
                    }
                }
            }
        }
        return i7;
    }

    private int adjustRowNumbersFromRRI() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        int i7 = this.barcodeColumnCount;
        if (detectionResultColumnArr[i7 + 1] == null) {
            return 0;
        }
        Codeword[] codewords = detectionResultColumnArr[i7 + 1].getCodewords();
        int i10 = 0;
        for (int i11 = 0; i11 < codewords.length; i11++) {
            Codeword codeword = codewords[i11];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int iAdjustRowNumberIfValid = 0;
                for (int i12 = this.barcodeColumnCount + 1; i12 > 0 && iAdjustRowNumberIfValid < 2; i12--) {
                    Codeword codeword2 = this.detectionResultColumns[i12].getCodewords()[i11];
                    if (codeword2 != null) {
                        iAdjustRowNumberIfValid = adjustRowNumberIfValid(rowNumber, iAdjustRowNumberIfValid, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    public int getBarcodeColumnCount() {
        return this.barcodeColumnCount;
    }

    public int getBarcodeECLevel() {
        return this.barcodeMetadata.getErrorCorrectionLevel();
    }

    public int getBarcodeRowCount() {
        return this.barcodeMetadata.getRowCount();
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public DetectionResultColumn getDetectionResultColumn(int i7) {
        return this.detectionResultColumns[i7];
    }

    public DetectionResultColumn[] getDetectionResultColumns() {
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[0]);
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[this.barcodeColumnCount + 1]);
        int i7 = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int iAdjustRowNumbers = adjustRowNumbers();
            if (iAdjustRowNumbers <= 0 || iAdjustRowNumbers >= i7) {
                break;
            }
            i7 = iAdjustRowNumbers;
        }
        return this.detectionResultColumns;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setDetectionResultColumn(int i7, DetectionResultColumn detectionResultColumn) {
        this.detectionResultColumns[i7] = detectionResultColumn;
    }

    public String toString() {
        DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.barcodeColumnCount + 1];
        }
        Formatter formatter = new Formatter();
        for (int i7 = 0; i7 < detectionResultColumn.getCodewords().length; i7++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i7));
                for (int i10 = 0; i10 < this.barcodeColumnCount + 2; i10++) {
                    DetectionResultColumn detectionResultColumn2 = this.detectionResultColumns[i10];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        Codeword codeword = detectionResultColumn2.getCodewords()[i7];
                        if (codeword == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(codeword.getRowNumber()), Integer.valueOf(codeword.getValue()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
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
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private void adjustRowNumbers(int i7, int i10, Codeword[] codewordArr) {
        Codeword codeword = codewordArr[i10];
        Codeword[] codewords = this.detectionResultColumns[i7 - 1].getCodewords();
        DetectionResultColumn detectionResultColumn = this.detectionResultColumns[i7 + 1];
        Codeword[] codewords2 = detectionResultColumn != null ? detectionResultColumn.getCodewords() : codewords;
        Codeword[] codewordArr2 = new Codeword[14];
        codewordArr2[2] = codewords[i10];
        codewordArr2[3] = codewords2[i10];
        if (i10 > 0) {
            int i11 = i10 - 1;
            codewordArr2[0] = codewordArr[i11];
            codewordArr2[4] = codewords[i11];
            codewordArr2[5] = codewords2[i11];
        }
        if (i10 > 1) {
            int i12 = i10 - 2;
            codewordArr2[8] = codewordArr[i12];
            codewordArr2[10] = codewords[i12];
            codewordArr2[11] = codewords2[i12];
        }
        if (i10 < codewordArr.length - 1) {
            int i13 = i10 + 1;
            codewordArr2[1] = codewordArr[i13];
            codewordArr2[6] = codewords[i13];
            codewordArr2[7] = codewords2[i13];
        }
        if (i10 < codewordArr.length - 2) {
            int i14 = i10 + 2;
            codewordArr2[9] = codewordArr[i14];
            codewordArr2[12] = codewords[i14];
            codewordArr2[13] = codewords2[i14];
        }
        for (int i15 = 0; i15 < 14 && !adjustRowNumber(codeword, codewordArr2[i15]); i15++) {
        }
    }
}
