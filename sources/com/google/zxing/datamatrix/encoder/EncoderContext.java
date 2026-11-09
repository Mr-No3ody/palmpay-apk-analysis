package com.google.zxing.datamatrix.encoder;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
final class EncoderContext {
    private final StringBuilder codewords;
    private Dimension maxSize;
    private Dimension minSize;
    private final String msg;
    private int newEncoding;
    int pos;
    private SymbolShapeHint shape;
    private int skipAtEnd;
    private SymbolInfo symbolInfo;

    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i7 = 0; i7 < length; i7++) {
            char c6 = (char) (bytes[i7] & UnsignedBytes.MAX_VALUE);
            if (c6 == '?' && str.charAt(i7) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c6);
        }
        this.msg = sb2.toString();
        this.shape = SymbolShapeHint.FORCE_NONE;
        this.codewords = new StringBuilder(str.length());
        this.newEncoding = -1;
    }

    private int getTotalMessageCharCount() {
        return this.msg.length() - this.skipAtEnd;
    }

    public int getCodewordCount() {
        return this.codewords.length();
    }

    public StringBuilder getCodewords() {
        return this.codewords;
    }

    public char getCurrent() {
        return this.msg.charAt(this.pos);
    }

    public char getCurrentChar() {
        return this.msg.charAt(this.pos);
    }

    public String getMessage() {
        return this.msg;
    }

    public int getNewEncoding() {
        return this.newEncoding;
    }

    public int getRemainingCharacters() {
        return getTotalMessageCharCount() - this.pos;
    }

    public SymbolInfo getSymbolInfo() {
        return this.symbolInfo;
    }

    public boolean hasMoreCharacters() {
        return this.pos < getTotalMessageCharCount();
    }

    public void resetEncoderSignal() {
        this.newEncoding = -1;
    }

    public void resetSymbolInfo() {
        this.symbolInfo = null;
    }

    public void setSizeConstraints(Dimension dimension, Dimension dimension2) {
        this.minSize = dimension;
        this.maxSize = dimension2;
    }

    public void setSkipAtEnd(int i7) {
        this.skipAtEnd = i7;
    }

    public void setSymbolShape(SymbolShapeHint symbolShapeHint) {
        this.shape = symbolShapeHint;
    }

    public void signalEncoderChange(int i7) {
        this.newEncoding = i7;
    }

    public void updateSymbolInfo() {
        updateSymbolInfo(getCodewordCount());
    }

    public void writeCodeword(char c6) {
        this.codewords.append(c6);
    }

    public void writeCodewords(String str) {
        this.codewords.append(str);
    }

    public void updateSymbolInfo(int i7) {
        SymbolInfo symbolInfo = this.symbolInfo;
        if (symbolInfo == null || i7 > symbolInfo.getDataCapacity()) {
            this.symbolInfo = SymbolInfo.lookup(i7, this.shape, this.minSize, this.maxSize, true);
        }
    }
}
