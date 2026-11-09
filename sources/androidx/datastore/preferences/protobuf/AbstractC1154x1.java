package androidx.datastore.preferences.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1154x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f16808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f16809b;

    static {
        Charset.forName("US-ASCII");
        f16808a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16809b = bArr;
        ByteBuffer.wrap(bArr);
        r.f(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
