package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1122m1 f16695c = new C1122m1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1093e2 f16696a = C1093e2.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16697b;

    public C1122m1() {
    }

    public static int b(H2 h7, int i7, Object obj) {
        int iC = AbstractC1146v.C(i7);
        if (h7 == H2.f16490d) {
            iC *= 2;
        }
        return c(h7, obj) + iC;
    }

    public static int c(H2 h7, Object obj) {
        int serializedSize;
        int iD;
        switch (h7.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC1146v.f16784b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC1146v.f16784b;
                return 4;
            case 2:
                return AbstractC1146v.E(((Long) obj).longValue());
            case 3:
                return AbstractC1146v.E(((Long) obj).longValue());
            case 4:
                return AbstractC1146v.E(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC1146v.f16784b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC1146v.f16784b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC1146v.f16784b;
                return 1;
            case 8:
                return obj instanceof AbstractC1123n ? AbstractC1146v.y((AbstractC1123n) obj) : AbstractC1146v.B((String) obj);
            case 9:
                Logger logger6 = AbstractC1146v.f16784b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                Logger logger7 = AbstractC1146v.f16784b;
                serializedSize = ((MessageLite) obj).getSerializedSize();
                iD = AbstractC1146v.D(serializedSize);
                break;
            case 11:
                if (obj instanceof AbstractC1123n) {
                    return AbstractC1146v.y((AbstractC1123n) obj);
                }
                Logger logger8 = AbstractC1146v.f16784b;
                serializedSize = ((byte[]) obj).length;
                iD = AbstractC1146v.D(serializedSize);
                break;
            case 12:
                return AbstractC1146v.D(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal$EnumLite ? AbstractC1146v.E(((Internal$EnumLite) obj).getNumber()) : AbstractC1146v.E(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC1146v.f16784b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC1146v.f16784b;
                return 8;
            case 16:
                return AbstractC1146v.z(((Integer) obj).intValue());
            case 17:
                return AbstractC1146v.A(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iD + serializedSize;
    }

    public static int d(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        H2 liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            int iB = 0;
            while (i7 < size) {
                iB += b(liteType, number, list.get(i7));
                i7++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i7 < size) {
            iC += c(liteType, list.get(i7));
            i7++;
        }
        return AbstractC1146v.D(iC) + AbstractC1146v.C(number) + iC;
    }

    public static int e(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != I2.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
            return d(fieldSet$FieldDescriptorLite, value);
        }
        int number = ((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber();
        int iD = AbstractC1146v.D(number) + AbstractC1146v.C(2) + (AbstractC1146v.C(1) * 2);
        int iC = AbstractC1146v.C(3);
        int serializedSize = ((MessageLite) value).getSerializedSize();
        return AbstractC1146v.D(serializedSize) + serializedSize + iC + iD;
    }

    public static boolean g(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != I2.MESSAGE) {
            return true;
        }
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            Object value = entry.getValue();
            if (value instanceof MessageLiteOrBuilder) {
                return ((MessageLiteOrBuilder) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            if (!(obj instanceof MessageLiteOrBuilder)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((MessageLiteOrBuilder) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static void l(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        fieldSet$FieldDescriptorLite.getLiteType();
        Charset charset = AbstractC1154x1.f16808a;
        obj.getClass();
        boolean z3 = true;
        switch (r0.f16493a) {
            case INT:
                z3 = obj instanceof Integer;
                break;
            case LONG:
                z3 = obj instanceof Long;
                break;
            case FLOAT:
                z3 = obj instanceof Float;
                break;
            case DOUBLE:
                z3 = obj instanceof Double;
                break;
            case BOOLEAN:
                z3 = obj instanceof Boolean;
                break;
            case STRING:
                z3 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC1123n) && !(obj instanceof byte[])) {
                    z3 = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal$EnumLite)) {
                    z3 = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite)) {
                    z3 = false;
                }
                break;
            default:
                z3 = false;
                break;
        }
        if (!z3) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldSet$FieldDescriptorLite.getNumber()), fieldSet$FieldDescriptorLite.getLiteType().f16493a, obj.getClass().getName()));
        }
    }

    public static void m(AbstractC1146v abstractC1146v, H2 h7, int i7, Object obj) {
        if (h7 == H2.f16490d) {
            abstractC1146v.Y(i7, 3);
            ((MessageLite) obj).writeTo(abstractC1146v);
            abstractC1146v.Y(i7, 4);
        }
        abstractC1146v.Y(i7, h7.f16494b);
        switch (h7.ordinal()) {
            case 0:
                abstractC1146v.O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC1146v.M(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC1146v.c0(((Long) obj).longValue());
                break;
            case 3:
                abstractC1146v.c0(((Long) obj).longValue());
                break;
            case 4:
                abstractC1146v.Q(((Integer) obj).intValue());
                break;
            case 5:
                abstractC1146v.O(((Long) obj).longValue());
                break;
            case 6:
                abstractC1146v.M(((Integer) obj).intValue());
                break;
            case 7:
                abstractC1146v.G(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC1123n)) {
                    abstractC1146v.X((String) obj);
                } else {
                    abstractC1146v.K((AbstractC1123n) obj);
                }
                break;
            case 9:
                ((MessageLite) obj).writeTo(abstractC1146v);
                break;
            case 10:
                abstractC1146v.T((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1123n)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC1146v.I(bArr.length, bArr);
                } else {
                    abstractC1146v.K((AbstractC1123n) obj);
                }
                break;
            case 12:
                abstractC1146v.a0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal$EnumLite)) {
                    abstractC1146v.Q(((Integer) obj).intValue());
                } else {
                    abstractC1146v.Q(((Internal$EnumLite) obj).getNumber());
                }
                break;
            case 14:
                abstractC1146v.M(((Integer) obj).intValue());
                break;
            case 15:
                abstractC1146v.O(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC1146v.a0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC1146v.c0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1122m1 clone() {
        C1122m1 c1122m1 = new C1122m1();
        C1093e2 c1093e2 = this.f16696a;
        int size = c1093e2.f16607a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry entryC = c1093e2.c(i7);
            c1122m1.k((FieldSet$FieldDescriptorLite) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : c1093e2.d()) {
            c1122m1.k((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return c1122m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1122m1) {
            return this.f16696a.equals(((C1122m1) obj).f16696a);
        }
        return false;
    }

    public final boolean f() {
        C1093e2 c1093e2 = this.f16696a;
        int size = c1093e2.f16607a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!g(c1093e2.c(i7))) {
                return false;
            }
        }
        Iterator it = c1093e2.d().iterator();
        while (it.hasNext()) {
            if (!g((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator h() {
        C1093e2 c1093e2 = this.f16696a;
        return c1093e2.isEmpty() ? Collections.emptyIterator() : ((M.a) c1093e2.entrySet()).iterator();
    }

    public final int hashCode() {
        return this.f16696a.hashCode();
    }

    public final void i() {
        if (this.f16697b) {
            return;
        }
        C1093e2 c1093e2 = this.f16696a;
        int size = c1093e2.f16607a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry entryC = c1093e2.c(i7);
            if (entryC.getValue() instanceof AbstractC1145u1) {
                AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) entryC.getValue();
                abstractC1145u1.getClass();
                C1077a2 c1077a2 = C1077a2.f16579c;
                c1077a2.getClass();
                c1077a2.a(abstractC1145u1.getClass()).makeImmutable(abstractC1145u1);
                abstractC1145u1.i();
            }
        }
        if (!c1093e2.f16609c) {
            for (int i10 = 0; i10 < c1093e2.f16607a.size(); i10++) {
                Map.Entry entryC2 = c1093e2.c(i10);
                if (((FieldSet$FieldDescriptorLite) entryC2.getKey()).isRepeated()) {
                    entryC2.setValue(Collections.unmodifiableList((List) entryC2.getValue()));
                }
            }
            for (Map.Entry entry : c1093e2.d()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c1093e2.f16609c) {
            c1093e2.f16608b = c1093e2.f16608b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1093e2.f16608b);
            c1093e2.f16611e = c1093e2.f16611e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1093e2.f16611e);
            c1093e2.f16609c = true;
        }
        this.f16697b = true;
    }

    public final void j(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        C1093e2 c1093e2 = this.f16696a;
        if (zIsRepeated) {
            Object arrayList = c1093e2.get(fieldSet$FieldDescriptorLite);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c1093e2.put(fieldSet$FieldDescriptorLite, arrayList);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != I2.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c1093e2.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object obj2 = c1093e2.get(fieldSet$FieldDescriptorLite);
        if (obj2 != null) {
            c1093e2.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) obj2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c1093e2.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void k(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            l(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l(fieldSet$FieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        this.f16696a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public C1122m1(int i7) {
        i();
        i();
    }
}
