package S4;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f8742a = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f8743b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(e.class);
        hashSet.add(l.class);
        hashSet.add(b.class);
        hashSet.add(g.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(a.class);
        hashSet.add(h.class);
        hashSet.add(f.class);
        hashSet.add(d.class);
        for (Class cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] iArrTags = descriptor.tags();
            int iObjectTypeIndication = descriptor.objectTypeIndication();
            Map map = (Map) f8743b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i7 : iArrTags) {
                map.put(Integer.valueOf(i7), cls);
            }
            f8743b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    public static b a(int i7, ByteBuffer byteBuffer) {
        b mVar;
        int iL = V1.a.l(byteBuffer);
        HashMap map = f8743b;
        Map map2 = (Map) map.get(Integer.valueOf(i7));
        if (map2 == null) {
            map2 = (Map) map.get(-1);
        }
        Class cls = (Class) map2.get(Integer.valueOf(iL));
        Logger logger = f8742a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i7) + " and tag " + Integer.toHexString(iL) + " found: " + cls);
            mVar = new m();
        } else {
            try {
                mVar = (b) cls.newInstance();
            } catch (Exception e10) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i7 + " and tag " + iL, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        }
        mVar.f8713a = iL;
        int iA = V1.a.a(byteBuffer.get());
        mVar.f8714b = iA & 127;
        int i10 = 1;
        while ((iA >>> 7) == 1) {
            iA = V1.a.a(byteBuffer.get());
            i10++;
            mVar.f8714b = (mVar.f8714b << 7) | (iA & 127);
        }
        mVar.f8715c = i10;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(mVar.f8714b);
        mVar.b(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + mVar.f8714b);
        return mVar;
    }
}
