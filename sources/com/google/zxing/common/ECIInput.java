package com.google.zxing.common;

/* JADX INFO: loaded from: classes3.dex */
public interface ECIInput {
    char charAt(int i7);

    int getECIValue(int i7);

    boolean haveNCharacters(int i7, int i10);

    boolean isECI(int i7);

    int length();

    CharSequence subSequence(int i7, int i10);
}
