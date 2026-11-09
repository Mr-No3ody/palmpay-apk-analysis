package P4;

import com.coremedia.iso.boxes.FullBox;
import com.horcrux.svg.d0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a implements FullBox {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6922A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f6923w;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6924v;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(c.class, "AbstractFullBox.java");
        f6923w = aVar.e(aVar.d("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "void"), 51);
        f6922A = aVar.e(aVar.d("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "void"), 64);
    }

    @Override // P4.a
    public void a(ByteBuffer byteBuffer) {
        h(byteBuffer);
    }

    @Override // P4.a
    public void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final int getFlags() {
        if (!this.f6911c) {
            f();
        }
        return this.f6924v;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final int getVersion() {
        if (!this.f6911c) {
            f();
        }
        return this.t;
    }

    public final void h(ByteBuffer byteBuffer) {
        this.t = V1.a.l(byteBuffer);
        this.f6924v = V1.a.i(byteBuffer);
    }

    public final void i(ByteBuffer byteBuffer) {
        V1.a.s(this.t, byteBuffer);
        V1.a.r(this.f6924v, byteBuffer);
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final void setFlags(int i7) {
        d0.s(org.aspectj.runtime.reflect.a.c(f6922A, this, this, new Integer(i7)));
        this.f6924v = i7;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public final void setVersion(int i7) {
        d0.s(org.aspectj.runtime.reflect.a.c(f6923w, this, this, new Integer(i7)));
        this.t = i7;
    }
}
