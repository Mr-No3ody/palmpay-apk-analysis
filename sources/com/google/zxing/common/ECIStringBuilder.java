package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class ECIStringBuilder {
    private StringBuilder currentBytes;
    private Charset currentCharset;
    private StringBuilder result;

    public ECIStringBuilder() {
        this.currentCharset = StandardCharsets.ISO_8859_1;
        this.currentBytes = new StringBuilder();
    }

    private void encodeCurrentBytesIfAny() {
        Charset charset = this.currentCharset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (charset.equals(charset2)) {
            if (this.currentBytes.length() > 0) {
                StringBuilder sb2 = this.result;
                if (sb2 == null) {
                    this.result = this.currentBytes;
                    this.currentBytes = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) this.currentBytes);
                    this.currentBytes = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (this.currentBytes.length() > 0) {
            byte[] bytes = this.currentBytes.toString().getBytes(charset2);
            this.currentBytes = new StringBuilder();
            StringBuilder sb3 = this.result;
            if (sb3 == null) {
                this.result = new StringBuilder(new String(bytes, this.currentCharset));
            } else {
                sb3.append(new String(bytes, this.currentCharset));
            }
        }
    }

    public void append(char c6) {
        this.currentBytes.append((char) (c6 & 255));
    }

    public void appendCharacters(StringBuilder sb2) {
        encodeCurrentBytesIfAny();
        this.result.append((CharSequence) sb2);
    }

    public void appendECI(int i7) throws FormatException {
        encodeCurrentBytesIfAny();
        CharacterSetECI characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(i7);
        if (characterSetECIByValue == null) {
            throw FormatException.getFormatInstance();
        }
        this.currentCharset = characterSetECIByValue.getCharset();
    }

    public boolean isEmpty() {
        if (this.currentBytes.length() != 0) {
            return false;
        }
        StringBuilder sb2 = this.result;
        return sb2 == null || sb2.length() == 0;
    }

    public int length() {
        return toString().length();
    }

    public String toString() {
        encodeCurrentBytesIfAny();
        StringBuilder sb2 = this.result;
        return sb2 == null ? "" : sb2.toString();
    }

    public void append(byte b7) {
        this.currentBytes.append((char) (b7 & UnsignedBytes.MAX_VALUE));
    }

    public void append(String str) {
        this.currentBytes.append(str);
    }

    public ECIStringBuilder(int i7) {
        this.currentCharset = StandardCharsets.ISO_8859_1;
        this.currentBytes = new StringBuilder(i7);
    }

    public void append(int i7) {
        append(String.valueOf(i7));
    }
}
