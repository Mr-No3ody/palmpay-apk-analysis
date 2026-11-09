package V1;

import P4.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e {
    static {
        p264r5.a.t(b.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i7 = 0; i7 < Math.min(4, str.length()); i7++) {
                bArr[i7] = (byte) str.charAt(i7);
            }
        }
        return bArr;
    }
}
