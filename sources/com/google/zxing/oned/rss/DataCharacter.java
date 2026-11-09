package com.google.zxing.oned.rss;

import N8.q0;

/* JADX INFO: loaded from: classes3.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i7, int i10) {
        this.value = i7;
        this.checksumPortion = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.value == dataCharacter.value && this.checksumPortion == dataCharacter.checksumPortion;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.value);
        sb2.append("(");
        return q0.m(sb2, this.checksumPortion, ')');
    }
}
