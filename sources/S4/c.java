package S4;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f8716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8718c;

    public c(ByteBuffer byteBuffer, int i7) {
        switch (i7) {
            case 1:
                this.f8718c = 0;
                this.f8716a = byteBuffer;
                this.f8717b = byteBuffer.position();
                break;
            default:
                this.f8716a = byteBuffer;
                this.f8717b = byteBuffer.position();
                break;
        }
    }

    public int a(int i7) {
        int iA;
        int i10 = this.f8718c / 8;
        int i11 = this.f8717b;
        ByteBuffer byteBuffer = this.f8716a;
        int i12 = byteBuffer.get(i10 + i11);
        if (i12 < 0) {
            i12 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        int i13 = this.f8718c;
        int i14 = 8 - (i13 % 8);
        if (i7 <= i14) {
            iA = ((i12 << (i13 % 8)) & 255) >> ((i14 - i7) + (i13 % 8));
            this.f8718c = i13 + i7;
        } else {
            int i15 = i7 - i14;
            iA = (a(i14) << i15) + a(i15);
        }
        byteBuffer.position(i11 + ((int) Math.ceil(((double) this.f8718c) / 8.0d)));
        return iA;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i7, int i10) {
        int i11 = this.f8718c;
        int i12 = 8 - (i11 % 8);
        int i13 = this.f8717b;
        ByteBuffer byteBuffer = this.f8716a;
        if (i10 <= i12) {
            int i14 = byteBuffer.get((i11 / 8) + i13);
            if (i14 < 0) {
                i14 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            int i15 = i14 + (i7 << (i12 - i10));
            int i16 = (this.f8718c / 8) + i13;
            if (i15 > 127) {
                i15 -= 256;
            }
            byteBuffer.put(i16, (byte) i15);
            this.f8718c += i10;
        } else {
            int i17 = i10 - i12;
            c(i7 >> i17, i12);
            c(i7 & ((1 << i17) - 1), i17);
        }
        int i18 = this.f8718c;
        byteBuffer.position((i18 / 8) + i13 + (i18 % 8 <= 0 ? 0 : 1));
    }
}
