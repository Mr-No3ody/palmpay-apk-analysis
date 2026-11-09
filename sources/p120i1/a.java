package p120i1;

import com.transsnet.palmpay.bean.HomeDialogState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f37400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f37402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f37403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f37404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f37406m;

    static {
        byte b7 = (byte) 102;
        byte b10 = (byte) 101;
        f37394a = a(new byte[]{b7, (byte) 114, b10, b10});
        byte b11 = (byte) 117;
        byte b12 = (byte) HomeDialogState.PRIORITY_HIGHEST;
        byte b13 = (byte) 107;
        f37395b = a(new byte[]{(byte) 106, b11, b12, b13});
        byte b14 = (byte) 109;
        byte b15 = (byte) 100;
        byte b16 = (byte) 116;
        f37396c = a(new byte[]{b14, b15, (byte) 97, b16});
        byte b17 = (byte) HomeDialogState.PRIORITY_HIGHEST_111;
        byte b18 = (byte) 118;
        f37397d = a(new byte[]{b14, b17, b17, b18});
        byte b19 = (byte) HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        f37398e = a(new byte[]{b19, b12, b17, b16});
        byte b20 = (byte) 115;
        byte b21 = (byte) 105;
        f37399f = a(new byte[]{b20, b13, b21, b19});
        f37400g = a(new byte[]{(byte) 119, b21, b15, b10});
        f37401h = a(new byte[]{(byte) 80, (byte) 73, (byte) 67, (byte) 84});
        f37402i = a(new byte[]{b7, b16, (byte) 121, b19});
        f37403j = a(new byte[]{b11, b11, b21, b15});
        byte b22 = (byte) 99;
        f37404k = a(new byte[]{b22, b14, b17, b18});
        f37405l = a(new byte[]{b20, b16, b22, b17});
        f37406m = a(new byte[]{b22, b17, (byte) 54, (byte) 52});
    }

    public static final int a(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }
}
