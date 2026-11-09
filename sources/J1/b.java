package J1;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4453c;

    public b(byte[] bArr, int i7, int i10) {
        this.f4453c = bArr;
        this.f4451a = i7;
        this.f4452b = i10;
    }

    public b() {
        this.f4453c = new b[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        this.f4451a = 0;
        this.f4452b = 0;
    }

    public b(int i7, int i10) {
        this.f4453c = null;
        this.f4451a = i7;
        int i11 = i10 & 7;
        this.f4452b = i11 == 0 ? 8 : i11;
    }
}
