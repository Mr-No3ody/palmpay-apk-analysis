package R4;

import P4.c;
import S4.j;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Logger f7924C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f7925H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ org.aspectj.runtime.reflect.b f7926L;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ByteBuffer f7927B;

    static {
        org.aspectj.runtime.reflect.a aVar = new org.aspectj.runtime.reflect.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"), 42);
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"), 62);
        f7925H = aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"), 66);
        f7926L = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "void"), 70);
        f7924C = Logger.getLogger(a.class.getName());
    }

    @Override // P4.c, P4.a
    public final void a(ByteBuffer byteBuffer) {
        Logger logger = f7924C;
        h(byteBuffer);
        this.f7927B = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f7927B.rewind();
            j.a(-1, this.f7927B);
        } catch (IOException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        } catch (IndexOutOfBoundsException e11) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e11);
        }
    }

    @Override // P4.c, P4.a
    public final void b(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f7927B.rewind();
        byteBuffer.put(this.f7927B);
    }

    @Override // P4.a
    public final long c() {
        return this.f7927B.limit() + 4;
    }
}
