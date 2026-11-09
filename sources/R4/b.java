package R4;

import com.horcrux.svg.d0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f7928M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f7929Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f7930X;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        f7928M = aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"), 37);
        f7929Q = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"), 42);
        f7930X = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"), 53);
    }

    public final boolean equals(Object obj) {
        d0.s(org.aspectj.runtime.reflect.a.c(f7929Q, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f7927B;
        ByteBuffer byteBuffer2 = ((b) obj).f7927B;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        return byteBuffer2 == null;
    }

    public final int hashCode() {
        d0.s(org.aspectj.runtime.reflect.a.b(f7930X, this, this));
        ByteBuffer byteBuffer = this.f7927B;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
