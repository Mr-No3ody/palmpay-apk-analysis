package p315ug;

import Ag.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43016b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f43017a = new int[3];

    static {
        for (int i7 = 0; i7 < 256; i7++) {
            int i10 = i7;
            for (int i11 = 0; i11 < 8; i11++) {
                i10 = (i10 & 1) == 1 ? (i10 >>> 1) ^ (-306674912) : i10 >>> 1;
            }
            f43016b[i7] = i10;
        }
    }

    public final void a(char[] cArr) {
        int[] iArr = this.f43017a;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b7 : a.a(cArr)) {
            b((byte) (b7 & UnsignedBytes.MAX_VALUE));
        }
    }

    public final void b(byte b7) {
        int[] iArr = this.f43017a;
        int i7 = iArr[0];
        int[] iArr2 = f43016b;
        int i10 = iArr2[(b7 ^ i7) & 255] ^ (i7 >>> 8);
        iArr[0] = i10;
        int i11 = iArr[1] + (i10 & 255);
        iArr[1] = i11;
        int i12 = (i11 * 134775813) + 1;
        iArr[1] = i12;
        int i13 = iArr[2];
        iArr[2] = iArr2[(i13 ^ ((byte) (i12 >> 24))) & 255] ^ (i13 >>> 8);
    }
}
