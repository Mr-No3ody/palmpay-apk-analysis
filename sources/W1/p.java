package W1;

import com.horcrux.svg.d0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10457C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10458H;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f10459B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(p.class, "SoundMediaHeaderBox.java");
        f10457C = aVar.e(aVar.d("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "float"), 36);
        f10458H = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "java.lang.String"), 58);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        this.f10459B = V1.a.g(byteBuffer);
        V1.a.h(byteBuffer);
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        V1.a.p(byteBuffer, this.f10459B);
        V1.a.q(0, byteBuffer);
    }

    @Override // P4.a
    public final long c() {
        return 8L;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10458H, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10457C, this, this));
        sb2.append(this.f10459B);
        sb2.append("]");
        return sb2.toString();
    }
}
