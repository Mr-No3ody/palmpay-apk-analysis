package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes3.dex */
final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height < 8 || height > 144 || (height & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.version = readVersion(bitMatrix);
        BitMatrix bitMatrixExtractDataRegion = extractDataRegion(bitMatrix);
        this.mappingBitMatrix = bitMatrixExtractDataRegion;
        this.readMappingMatrix = new BitMatrix(bitMatrixExtractDataRegion.getWidth(), bitMatrixExtractDataRegion.getHeight());
    }

    private BitMatrix extractDataRegion(BitMatrix bitMatrix) {
        int symbolSizeRows = this.version.getSymbolSizeRows();
        int symbolSizeColumns = this.version.getSymbolSizeColumns();
        if (bitMatrix.getHeight() != symbolSizeRows) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int dataRegionSizeRows = this.version.getDataRegionSizeRows();
        int dataRegionSizeColumns = this.version.getDataRegionSizeColumns();
        int i7 = symbolSizeRows / dataRegionSizeRows;
        int i10 = symbolSizeColumns / dataRegionSizeColumns;
        BitMatrix bitMatrix2 = new BitMatrix(i10 * dataRegionSizeColumns, i7 * dataRegionSizeRows);
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = i11 * dataRegionSizeRows;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * dataRegionSizeColumns;
                for (int i15 = 0; i15 < dataRegionSizeRows; i15++) {
                    int i16 = ((dataRegionSizeRows + 2) * i11) + 1 + i15;
                    int i17 = i12 + i15;
                    for (int i18 = 0; i18 < dataRegionSizeColumns; i18++) {
                        if (bitMatrix.get(((dataRegionSizeColumns + 2) * i13) + 1 + i18, i16)) {
                            bitMatrix2.set(i14 + i18, i17);
                        }
                    }
                }
            }
        }
        return bitMatrix2;
    }

    private int readCorner1(int i7, int i10) {
        int i11 = i7 - 1;
        int i12 = (readModule(i11, 0, i7, i10) ? 1 : 0) << 1;
        if (readModule(i11, 1, i7, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (readModule(i11, 2, i7, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (readModule(0, i10 - 2, i7, i10)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i10 - 1;
        if (readModule(0, i16, i7, i10)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (readModule(1, i16, i7, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (readModule(2, i16, i7, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return readModule(3, i16, i7, i10) ? i19 | 1 : i19;
    }

    private int readCorner2(int i7, int i10) {
        int i11 = (readModule(i7 + (-3), 0, i7, i10) ? 1 : 0) << 1;
        if (readModule(i7 - 2, 0, i7, i10)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (readModule(i7 - 1, 0, i7, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (readModule(0, i10 - 4, i7, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (readModule(0, i10 - 3, i7, i10)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (readModule(0, i10 - 2, i7, i10)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i10 - 1;
        if (readModule(0, i17, i7, i10)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        return readModule(1, i17, i7, i10) ? i18 | 1 : i18;
    }

    private int readCorner3(int i7, int i10) {
        int i11 = i7 - 1;
        int i12 = (readModule(i11, 0, i7, i10) ? 1 : 0) << 1;
        int i13 = i10 - 1;
        if (readModule(i11, i13, i7, i10)) {
            i12 |= 1;
        }
        int i14 = i12 << 1;
        int i15 = i10 - 3;
        if (readModule(0, i15, i7, i10)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i10 - 2;
        if (readModule(0, i17, i7, i10)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (readModule(0, i13, i7, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (readModule(1, i15, i7, i10)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (readModule(1, i17, i7, i10)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        return readModule(1, i13, i7, i10) ? i21 | 1 : i21;
    }

    private int readCorner4(int i7, int i10) {
        int i11 = (readModule(i7 + (-3), 0, i7, i10) ? 1 : 0) << 1;
        if (readModule(i7 - 2, 0, i7, i10)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (readModule(i7 - 1, 0, i7, i10)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (readModule(0, i10 - 2, i7, i10)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        int i15 = i10 - 1;
        if (readModule(0, i15, i7, i10)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        if (readModule(1, i15, i7, i10)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (readModule(2, i15, i7, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        return readModule(3, i15, i7, i10) ? i18 | 1 : i18;
    }

    private boolean readModule(int i7, int i10, int i11, int i12) {
        if (i7 < 0) {
            i7 += i11;
            i10 += 4 - ((i11 + 4) & 7);
        }
        if (i10 < 0) {
            i10 += i12;
            i7 += 4 - ((i12 + 4) & 7);
        }
        if (i7 >= i11) {
            i7 -= i11;
        }
        this.readMappingMatrix.set(i10, i7);
        return this.mappingBitMatrix.get(i10, i7);
    }

    private int readUtah(int i7, int i10, int i11, int i12) {
        int i13 = i7 - 2;
        int i14 = i10 - 2;
        int i15 = (readModule(i13, i14, i11, i12) ? 1 : 0) << 1;
        int i16 = i10 - 1;
        if (readModule(i13, i16, i11, i12)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i7 - 1;
        if (readModule(i18, i14, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (readModule(i18, i16, i11, i12)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (readModule(i18, i10, i11, i12)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (readModule(i7, i14, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (readModule(i7, i16, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        return readModule(i7, i10, i11, i12) ? i23 | 1 : i23;
    }

    private static Version readVersion(BitMatrix bitMatrix) throws FormatException {
        return Version.getVersionForDimensions(bitMatrix.getHeight(), bitMatrix.getWidth());
    }

    public Version getVersion() {
        return this.version;
    }

    public byte[] readCodewords() throws FormatException {
        byte[] bArr = new byte[this.version.getTotalCodewords()];
        int height = this.mappingBitMatrix.getHeight();
        int width = this.mappingBitMatrix.getWidth();
        int i7 = 0;
        boolean z3 = false;
        int i10 = 0;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 4;
        while (true) {
            if (i11 == height && i7 == 0 && !z3) {
                bArr[i10] = (byte) readCorner1(height, width);
                i11 -= 2;
                i7 += 2;
                i10++;
                z3 = true;
            } else {
                int i12 = height - 2;
                if (i11 == i12 && i7 == 0 && (width & 3) != 0 && !z8) {
                    bArr[i10] = (byte) readCorner2(height, width);
                    i11 -= 2;
                    i7 += 2;
                    i10++;
                    z8 = true;
                } else if (i11 == height + 4 && i7 == 2 && (width & 7) == 0 && !z10) {
                    bArr[i10] = (byte) readCorner3(height, width);
                    i11 -= 2;
                    i7 += 2;
                    i10++;
                    z10 = true;
                } else if (i11 == i12 && i7 == 0 && (width & 7) == 4 && !z11) {
                    bArr[i10] = (byte) readCorner4(height, width);
                    i11 -= 2;
                    i7 += 2;
                    i10++;
                    z11 = true;
                } else {
                    while (true) {
                        if (i11 < height && i7 >= 0 && !this.readMappingMatrix.get(i7, i11)) {
                            bArr[i10] = (byte) readUtah(i11, i7, height, width);
                            i10++;
                        }
                        int i13 = i11 - 2;
                        int i14 = i7 + 2;
                        if (i13 < 0 || i14 >= width) {
                            break;
                        }
                        i11 = i13;
                        i7 = i14;
                    }
                    int i15 = i11 - 1;
                    int i16 = i7 + 5;
                    while (true) {
                        if (i15 >= 0 && i16 < width && !this.readMappingMatrix.get(i16, i15)) {
                            bArr[i10] = (byte) readUtah(i15, i16, height, width);
                            i10++;
                        }
                        int i17 = i15 + 2;
                        int i18 = i16 - 2;
                        if (i17 >= height || i18 < 0) {
                            break;
                        }
                        i15 = i17;
                        i16 = i18;
                    }
                    i11 = i15 + 5;
                    i7 = i16 - 1;
                }
            }
            if (i11 >= height && i7 >= width) {
                break;
            }
        }
        if (i10 == this.version.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }
}
