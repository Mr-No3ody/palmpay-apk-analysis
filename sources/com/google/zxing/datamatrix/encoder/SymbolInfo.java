package com.google.zxing.datamatrix.encoder;

import C0.G;
import com.facebook.imageutils.JfifUtil;
import com.google.api.ClientProto;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.Dimension;
import com.luck.picture.lib.config.Crop;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public class SymbolInfo {
    static final SymbolInfo[] PROD_SYMBOLS;
    private static SymbolInfo[] symbols;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    static {
        SymbolInfo[] symbolInfoArr = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, 14, 14, 16, 140, 56), new SymbolInfo(false, MessageEvent.EVENT_CL_OPEN_PENDING, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, JfifUtil.MARKER_SOFn, 18, 18, 16, 114, 48), new SymbolInfo(false, MessageEvent.EVENT_UPLOAD_APPSFLYER_CONVERSATION_DONE, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, Crop.REQUEST_EDIT_CROP, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, MessageEvent.EVENT_GRAB_ADD_ADDRESS_SUCCESS, 24, 24, 16, 136, 56), new SymbolInfo(false, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, MessageEvent.EVENT_SYNC_CONTACTS, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};
        PROD_SYMBOLS = symbolInfoArr;
        symbols = symbolInfoArr;
    }

    public SymbolInfo(boolean z3, int i7, int i10, int i11, int i12, int i13) {
        this(z3, i7, i10, i11, i12, i13, i7, i10);
    }

    private int getHorizontalDataRegions() {
        int i7 = this.dataRegions;
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2 && i7 != 4) {
                if (i7 == 16) {
                    return 4;
                }
                if (i7 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i10;
    }

    private int getVerticalDataRegions() {
        int i7 = this.dataRegions;
        if (i7 == 1 || i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static SymbolInfo lookup(int i7) {
        return lookup(i7, SymbolShapeHint.FORCE_NONE, true);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
        symbols = symbolInfoArr;
    }

    public int getCodewordCount() {
        return this.dataCapacity + this.errorCodewords;
    }

    public final int getDataCapacity() {
        return this.dataCapacity;
    }

    public int getDataLengthForInterleavedBlock(int i7) {
        return this.rsBlockData;
    }

    public final int getErrorCodewords() {
        return this.errorCodewords;
    }

    public final int getErrorLengthForInterleavedBlock(int i7) {
        return this.rsBlockError;
    }

    public int getInterleavedBlockCount() {
        return this.dataCapacity / this.rsBlockData;
    }

    public final int getSymbolDataHeight() {
        return getVerticalDataRegions() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return getHorizontalDataRegions() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return (getVerticalDataRegions() * 2) + getSymbolDataHeight();
    }

    public final int getSymbolWidth() {
        return (getHorizontalDataRegions() * 2) + getSymbolDataWidth();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.rectangular ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.matrixWidth);
        sb2.append('x');
        sb2.append(this.matrixHeight);
        sb2.append(", symbol size ");
        sb2.append(getSymbolWidth());
        sb2.append('x');
        sb2.append(getSymbolHeight());
        sb2.append(", symbol data size ");
        sb2.append(getSymbolDataWidth());
        sb2.append('x');
        sb2.append(getSymbolDataHeight());
        sb2.append(", codewords ");
        sb2.append(this.dataCapacity);
        sb2.append('+');
        sb2.append(this.errorCodewords);
        return sb2.toString();
    }

    public SymbolInfo(boolean z3, int i7, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.rectangular = z3;
        this.dataCapacity = i7;
        this.errorCodewords = i10;
        this.matrixWidth = i11;
        this.matrixHeight = i12;
        this.dataRegions = i13;
        this.rsBlockData = i14;
        this.rsBlockError = i15;
    }

    public static SymbolInfo lookup(int i7, SymbolShapeHint symbolShapeHint) {
        return lookup(i7, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int i7, boolean z3, boolean z8) {
        return lookup(i7, z3 ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, z8);
    }

    private static SymbolInfo lookup(int i7, SymbolShapeHint symbolShapeHint, boolean z3) {
        return lookup(i7, symbolShapeHint, null, null, z3);
    }

    public static SymbolInfo lookup(int i7, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z3) {
        for (SymbolInfo symbolInfo : symbols) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.rectangular) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.rectangular) && ((dimension == null || (symbolInfo.getSymbolWidth() >= dimension.getWidth() && symbolInfo.getSymbolHeight() >= dimension.getHeight())) && ((dimension2 == null || (symbolInfo.getSymbolWidth() <= dimension2.getWidth() && symbolInfo.getSymbolHeight() <= dimension2.getHeight())) && i7 <= symbolInfo.dataCapacity)))) {
                return symbolInfo;
            }
        }
        if (z3) {
            throw new IllegalArgumentException(G.m(i7, "Can't find a symbol arrangement that matches the message. Data codewords: "));
        }
        return null;
    }
}
