package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedInformation extends DecodedObject {
    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    public DecodedInformation(int i7, String str) {
        super(i7);
        this.newString = str;
        this.remaining = false;
        this.remainingValue = 0;
    }

    public String getNewString() {
        return this.newString;
    }

    public int getRemainingValue() {
        return this.remainingValue;
    }

    public boolean isRemaining() {
        return this.remaining;
    }

    public DecodedInformation(int i7, String str, int i10) {
        super(i7);
        this.remaining = true;
        this.remainingValue = i10;
        this.newString = str;
    }
}
