package com.google.zxing.common;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ECIEncoderSet {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<CharsetEncoder> ENCODERS = new ArrayList();
    private final CharsetEncoder[] encoders;
    private final int priorityEncoderIndex;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i7 = 0; i7 < 20; i7++) {
            String str = strArr[i7];
            if (CharacterSetECI.getCharacterSetECIByName(str) != null) {
                try {
                    ENCODERS.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public ECIEncoderSet(String str, Charset charset, int i7) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i10 = 0;
        boolean z8 = charset != null && charset.name().startsWith("UTF");
        for (int i11 = 0; i11 < str.length(); i11++) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i11);
                if (cCharAt == i7 || charsetEncoder.canEncode(cCharAt)) {
                    z3 = true;
                    break;
                }
            }
            if (!z3) {
                for (CharsetEncoder charsetEncoder2 : ENCODERS) {
                    if (charsetEncoder2.canEncode(str.charAt(i11))) {
                        arrayList.add(charsetEncoder2);
                        z3 = true;
                        break;
                    }
                }
            }
            if (!z3) {
                z8 = true;
            }
        }
        if (arrayList.size() != 1 || z8) {
            this.encoders = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                this.encoders[i12] = (CharsetEncoder) it2.next();
                i12++;
            }
            this.encoders[i12] = StandardCharsets.UTF_8.newEncoder();
            this.encoders[i12 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.encoders = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.encoders;
                if (i10 >= charsetEncoderArr.length) {
                    break;
                } else if (charsetEncoderArr[i10] == null || !charset.name().equals(this.encoders[i10].charset().name())) {
                    i10++;
                }
            }
            i10 = -1;
        } else {
            i10 = -1;
        }
        this.priorityEncoderIndex = i10;
    }

    public boolean canEncode(char c6, int i7) {
        return this.encoders[i7].canEncode("" + c6);
    }

    public byte[] encode(char c6, int i7) {
        return ("" + c6).getBytes(this.encoders[i7].charset());
    }

    public Charset getCharset(int i7) {
        return this.encoders[i7].charset();
    }

    public String getCharsetName(int i7) {
        return this.encoders[i7].charset().name();
    }

    public int getECIValue(int i7) {
        return CharacterSetECI.getCharacterSetECI(this.encoders[i7].charset()).getValue();
    }

    public int getPriorityEncoderIndex() {
        return this.priorityEncoderIndex;
    }

    public int length() {
        return this.encoders.length;
    }

    public byte[] encode(String str, int i7) {
        return str.getBytes(this.encoders[i7].charset());
    }
}
