package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.pm.PackageManager;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class qqggggg9g9q99q9gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final String[] f19113q999ggg99999qqggqqg9qg;

    static {
        q999ggg99999qqggqqg9qg("3d777938377873766a2038626c362c716d6c68", 109);
        q999ggg99999qqggqqg9qg("3d636d2c236c67627e342c7678222f647d475d6d6e6a617338357e7968", 121);
        q999ggg99999qqggqqg9qg("3d707e3f307f74716d273f656b31336d7c607f74727b3c266d6a7b", 106);
        q999ggg99999qqggqqg9qg("3d121c5d521d16130f455d070953510f1e021d161019", 8);
        q999ggg99999qqggqqg9qg("3d4a44050a454e4b571d0b575b5e55565750411c05444b4d434f4a414e4f", 80);
        f19113q999ggg99999qqggqqg9qg = new String[]{q999ggg99999qqggqqg9qg("3d666829266962677b3129737d273d607c7d79", 124), q999ggg99999qqggqqg9qg("3d353b7a753a313428627a202e74762839253a31373e7963282f3e", 47), q999ggg99999qqggqqg9qg("3d3e30717e313a3f2369712b257f7239201a003033373c2e6568232435", 36), q999ggg99999qqggqqg9qg("3d09074649060d08145e4814181d16151413025f4607080e000c09020d0c", 19), q999ggg99999qqggqqg9qg("3d1f11505f101b1e0248500a045e5c02130f101b1d14", 5)};
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 22);
            byte b10 = (byte) (bArr[0] ^ 94);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean q999ggg99999qqggqqg9qg(PackageManager packageManager) {
        int length = f19113q999ggg99999qqggqqg9qg.length;
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, f19113q999ggg99999qqggqqg9qg[i10]) != null) {
                i7++;
            }
        }
        return i7 >= 3;
    }
}
