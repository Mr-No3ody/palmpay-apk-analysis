package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078b implements MessageLite {
    protected int memoizedHashCode;

    public static void a(List list, Set set) {
        Charset charset = AbstractC1154x1.f16808a;
        set.getClass();
        if (!(set instanceof LazyStringList)) {
            if (set instanceof PrimitiveNonBoxingCollection) {
                list.addAll(set);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List<?> underlyingElements = ((LazyStringList) set).getUnderlyingElements();
        LazyStringList lazyStringList = (LazyStringList) list;
        int size3 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (lazyStringList.size() - size3) + " is null.";
                for (int size4 = lazyStringList.size() - 1; size4 >= size3; size4--) {
                    lazyStringList.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof AbstractC1123n) {
                lazyStringList.add((AbstractC1123n) obj2);
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                lazyStringList.add((AbstractC1123n) AbstractC1123n.c(0, bArr.length, bArr));
            } else {
                lazyStringList.add((String) obj2);
            }
        }
    }

    public abstract int b(Schema schema);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            int iB = ((AbstractC1145u1) this).b(null);
            byte[] bArr = new byte[iB];
            Logger logger = AbstractC1146v.f16784b;
            C1140t c1140t = new C1140t(bArr, iB);
            ((AbstractC1145u1) this).writeTo(c1140t);
            if (c1140t.d0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c("byte array"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final AbstractC1123n toByteString() {
        try {
            int iB = ((AbstractC1145u1) this).b(null);
            C1120m c1120m = AbstractC1123n.f16699b;
            byte[] bArr = new byte[iB];
            Logger logger = AbstractC1146v.f16784b;
            C1140t c1140t = new C1140t(bArr, iB);
            ((AbstractC1145u1) this).writeTo(c1140t);
            if (c1140t.d0() == 0) {
                return new C1120m(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c("ByteString"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void writeDelimitedTo(OutputStream outputStream) throws IOException {
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) this;
        int iB = abstractC1145u1.b(null);
        int iD = AbstractC1146v.D(iB) + iB;
        if (iD > 4096) {
            iD = 4096;
        }
        C1143u c1143u = new C1143u(outputStream, iD);
        c1143u.a0(iB);
        abstractC1145u1.writeTo(c1143u);
        if (c1143u.f16782f > 0) {
            c1143u.i0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void writeTo(OutputStream outputStream) throws IOException {
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) this;
        int iB = abstractC1145u1.b(null);
        Logger logger = AbstractC1146v.f16784b;
        if (iB > 4096) {
            iB = 4096;
        }
        C1143u c1143u = new C1143u(outputStream, iB);
        abstractC1145u1.writeTo(c1143u);
        if (c1143u.f16782f > 0) {
            c1143u.i0();
        }
    }
}
