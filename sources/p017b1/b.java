package p017b1;

import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18757g;

    static {
        a("1b0e1c0e", 9);
        a("1869786a", 109);
    }

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 21);
            byte b10 = (byte) (bArr[0] ^ 104);
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
}
