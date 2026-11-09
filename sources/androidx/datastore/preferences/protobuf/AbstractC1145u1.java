package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145u1 extends AbstractC1078b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1145u1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected q2 unknownFields;

    public AbstractC1145u1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = q2.f16751f;
    }

    public static AbstractC1145u1 e(Class cls) {
        AbstractC1145u1 abstractC1145u1 = defaultInstanceMap.get(cls);
        if (abstractC1145u1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1145u1 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1145u1 != null) {
            return abstractC1145u1;
        }
        AbstractC1145u1 abstractC1145u2 = (AbstractC1145u1) ((AbstractC1145u1) w2.b(cls)).d(6, null);
        if (abstractC1145u2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1145u2);
        return abstractC1145u2;
    }

    public static Object f(Method method, MessageLite messageLite, Object... objArr) {
        try {
            return method.invoke(messageLite, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean g(AbstractC1145u1 abstractC1145u1, boolean z3) {
        byte bByteValue = ((Byte) abstractC1145u1.d(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C1077a2 c1077a2 = C1077a2.f16579c;
        c1077a2.getClass();
        boolean zIsInitialized = c1077a2.a(abstractC1145u1.getClass()).isInitialized(abstractC1145u1);
        if (z3) {
            abstractC1145u1.d(2, zIsInitialized ? abstractC1145u1 : null);
        }
        return zIsInitialized;
    }

    public static AbstractC1145u1 k(AbstractC1145u1 abstractC1145u1, r rVar, C1092e1 c1092e1) throws C1160z1 {
        AbstractC1145u1 abstractC1145u1J = abstractC1145u1.j();
        try {
            C1077a2 c1077a2 = C1077a2.f16579c;
            c1077a2.getClass();
            Schema schemaA = c1077a2.a(abstractC1145u1J.getClass());
            C1137s c1137s = rVar.f16758b;
            if (c1137s == null) {
                c1137s = new C1137s(rVar);
            }
            schemaA.mergeFrom(abstractC1145u1J, c1137s, c1092e1);
            schemaA.makeImmutable(abstractC1145u1J);
            return abstractC1145u1J;
        } catch (p2 e10) {
            throw new C1160z1(e10.getMessage());
        } catch (C1160z1 e11) {
            if (e11.f16816a) {
                throw new C1160z1(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1160z1) {
                throw ((C1160z1) e12.getCause());
            }
            throw new C1160z1(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1160z1) {
                throw ((C1160z1) e13.getCause());
            }
            throw e13;
        }
    }

    public static void l(Class cls, AbstractC1145u1 abstractC1145u1) {
        abstractC1145u1.i();
        defaultInstanceMap.put(cls, abstractC1145u1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1078b
    public final int b(Schema schema) {
        int serializedSize;
        int serializedSize2;
        if (h()) {
            if (schema == null) {
                C1077a2 c1077a2 = C1077a2.f16579c;
                c1077a2.getClass();
                serializedSize2 = c1077a2.a(getClass()).getSerializedSize(this);
            } else {
                serializedSize2 = schema.getSerializedSize(this);
            }
            if (serializedSize2 >= 0) {
                return serializedSize2;
            }
            throw new IllegalStateException(C0.G.m(serializedSize2, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i7 & Integer.MAX_VALUE;
        }
        if (schema == null) {
            C1077a2 c1077a3 = C1077a2.f16579c;
            c1077a3.getClass();
            serializedSize = c1077a3.a(getClass()).getSerializedSize(this);
        } else {
            serializedSize = schema.getSerializedSize(this);
        }
        m(serializedSize);
        return serializedSize;
    }

    public abstract Object d(int i7, AbstractC1145u1 abstractC1145u1);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1077a2 c1077a2 = C1077a2.f16579c;
        c1077a2.getClass();
        return c1077a2.a(getClass()).equals(this, (AbstractC1145u1) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public MessageLite getDefaultInstanceForType() {
        return (AbstractC1145u1) d(6, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final Parser getParserForType() {
        return (Parser) d(7, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int getSerializedSize() {
        return b(null);
    }

    public final boolean h() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            C1077a2 c1077a2 = C1077a2.f16579c;
            c1077a2.getClass();
            return c1077a2.a(getClass()).hashCode(this);
        }
        if (this.memoizedHashCode == 0) {
            C1077a2 c1077a3 = C1077a2.f16579c;
            c1077a3.getClass();
            this.memoizedHashCode = c1077a3.a(getClass()).hashCode(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return g(this, true);
    }

    public final AbstractC1145u1 j() {
        return (AbstractC1145u1) d(4, null);
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(C0.G.m(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public MessageLite.Builder newBuilderForType() {
        return (AbstractC1134q1) d(5, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public MessageLite.Builder toBuilder() {
        AbstractC1134q1 abstractC1134q1 = (AbstractC1134q1) d(5, null);
        if (abstractC1134q1.f16749a.equals(this)) {
            return abstractC1134q1;
        }
        abstractC1134q1.d();
        AbstractC1134q1.h(abstractC1134q1.f16750b, this);
        return abstractC1134q1;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = N1.f16517a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        N1.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void writeTo(AbstractC1146v abstractC1146v) throws IOException {
        C1077a2 c1077a2 = C1077a2.f16579c;
        c1077a2.getClass();
        Schema schemaA = c1077a2.a(getClass());
        C1149w c1149w = abstractC1146v.f16786a;
        if (c1149w == null) {
            c1149w = new C1149w(abstractC1146v);
        }
        schemaA.writeTo(this, c1149w);
    }
}
