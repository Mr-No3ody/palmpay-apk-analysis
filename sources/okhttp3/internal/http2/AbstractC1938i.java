package okhttp3.internal.http2;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1938i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pg.m f40838a = Pg.m.f7359d.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f40839b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f40840c = new String[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f40841d;

    static {
        String[] strArr = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i7] = kotlin.text.y.j(Dg.c.i("%8s", binaryString), ' ', '0');
        }
        f40841d = strArr;
        String[] strArr2 = f40840c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = C0.G.r(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f40840c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = C0.G.r(sb2, strArr3[i12], "|PADDED");
        }
        int length = f40840c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f40840c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f40841d[i15];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(boolean z3, int i7, int i10, int i11, int i12) {
        String strK;
        String str;
        String[] strArr = f40839b;
        String strI = i11 < strArr.length ? strArr[i11] : Dg.c.i("0x%02x", Integer.valueOf(i11));
        if (i12 == 0) {
            strK = "";
        } else {
            String[] strArr2 = f40841d;
            if (i11 == 2 || i11 == 3) {
                strK = strArr2[i12];
            } else if (i11 == 4 || i11 == 6) {
                strK = i12 == 1 ? "ACK" : strArr2[i12];
            } else if (i11 == 7 || i11 == 8) {
                strK = strArr2[i12];
            } else {
                String[] strArr3 = f40840c;
                if (i12 < strArr3.length) {
                    str = strArr3[i12];
                    Intrinsics.e(str);
                } else {
                    str = strArr2[i12];
                }
                if (i11 != 5 || (i12 & 4) == 0) {
                    strK = (i11 != 0 || (i12 & 32) == 0) ? str : kotlin.text.y.k(str, "PRIORITY", "COMPRESSED");
                } else {
                    strK = kotlin.text.y.k(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return Dg.c.i("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i10), strI, strK);
    }
}
