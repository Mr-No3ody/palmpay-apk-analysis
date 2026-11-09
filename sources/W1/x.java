package W1;

import C0.G;
import com.horcrux.svg.d0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x extends a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10506H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10507L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f10508M;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10509B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f10510C;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(x.class, "VideoMediaHeaderBox.java");
        f10506H = aVar.e(aVar.d("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "int"), 39);
        f10507L = aVar.e(aVar.d("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "[I"), 43);
        f10508M = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "java.lang.String"), 71);
        aVar.e(aVar.d("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "void"), 75);
        aVar.e(aVar.d("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "void"), 79);
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
        this.f10509B = V1.a.h(byteBuffer);
        this.f10510C = new int[3];
        for (int i7 = 0; i7 < 3; i7++) {
            this.f10510C[i7] = V1.a.h(byteBuffer);
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        V1.a.q(this.f10509B, byteBuffer);
        for (int i7 : this.f10510C) {
            V1.a.q(i7, byteBuffer);
        }
    }

    @Override // P4.a
    public final long c() {
        return 12L;
    }

    public final String toString() {
        org.aspectj.runtime.reflect.c cVarB = org.aspectj.runtime.reflect.a.b(f10508M, this, this);
        P4.f.a().getClass();
        P4.f.b(cVarB);
        StringBuilder sb2 = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        d0.s(org.aspectj.runtime.reflect.a.b(f10506H, this, this));
        sb2.append(this.f10509B);
        sb2.append(";opcolor0=");
        org.aspectj.runtime.reflect.b bVar = f10507L;
        d0.s(org.aspectj.runtime.reflect.a.b(bVar, this, this));
        sb2.append(this.f10510C[0]);
        sb2.append(";opcolor1=");
        d0.s(org.aspectj.runtime.reflect.a.b(bVar, this, this));
        sb2.append(this.f10510C[1]);
        sb2.append(";opcolor2=");
        d0.s(org.aspectj.runtime.reflect.a.b(bVar, this, this));
        return G.n(this.f10510C[2], "]", sb2);
    }
}
