package io.fastkv;

import Pa.C0505b;
import io.fastkv.interfaces.FastEncoder;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements FastEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f37676a = new q();

    @Override // io.fastkv.interfaces.FastEncoder
    public final Object decode(byte[] bArr, int i7, int i10) {
        int i11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i10 > 0) {
            C0505b c0505b = new C0505b(bArr, i7);
            int i12 = i7 + i10;
            while (true) {
                i11 = c0505b.f7072b;
                if (i11 >= i12) {
                    break;
                }
                byte[] bArr2 = (byte[]) c0505b.f7074d;
                int i13 = i11 + 1;
                c0505b.f7072b = i13;
                int i14 = bArr2[i11];
                if ((i14 >> 7) != 0) {
                    int i15 = i11 + 2;
                    c0505b.f7072b = i15;
                    i14 = (i14 & 127) | (bArr2[i13] << 7);
                    if ((i14 >> 14) != 0) {
                        int i16 = i14 & 16383;
                        int i17 = i11 + 3;
                        c0505b.f7072b = i17;
                        int i18 = i16 | (bArr2[i15] << 14);
                        if ((i18 >> 21) == 0) {
                            i14 = i18;
                        } else {
                            int i19 = i11 + 4;
                            c0505b.f7072b = i19;
                            i14 = (bArr2[i17] << 21) | (i18 & 2097151);
                            if ((i14 >> 28) != 0) {
                                c0505b.f7072b = i11 + 5;
                                i14 = (268435455 & i14) | (bArr2[i19] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(c0505b.k(i14));
            }
            if (i11 != i12) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public final byte[] encode(Object obj) {
        int i7;
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (String str : set) {
            if (str == null) {
                i10 += 5;
                iArr[i11] = -1;
            } else {
                int iL = C0505b.l(str);
                strArr[i11] = str;
                iArr[i11] = iL;
                if ((iL >> 7) == 0) {
                    i7 = 1;
                } else if ((iL >> 14) == 0) {
                    i7 = 2;
                } else if ((iL >> 21) == 0) {
                    i7 = 3;
                } else {
                    i7 = (iL >> 28) == 0 ? 4 : 5;
                }
                i10 = i7 + iL + i10;
            }
            i11++;
        }
        C0505b c0505b = new C0505b(i10);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            int i14 = c0505b.f7072b;
            int i15 = i13;
            while ((i15 & (-128)) != 0) {
                ((byte[]) c0505b.f7074d)[i14] = (byte) ((i15 & 127) | 128);
                i15 >>>= 7;
                i14++;
            }
            ((byte[]) c0505b.f7074d)[i14] = (byte) i15;
            c0505b.f7072b = i14 + 1;
            if (i13 >= 0) {
                c0505b.s(strArr[i12]);
            }
        }
        return (byte[]) c0505b.f7074d;
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public final String tag() {
        return "StringSet";
    }
}
