package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public DecodedChar(int i7, char c6) {
        super(i7);
        this.value = c6;
    }

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        return this.value == '$';
    }
}
