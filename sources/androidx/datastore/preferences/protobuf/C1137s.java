package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1137s implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f16772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16775d = 0;

    public C1137s(r rVar) {
        AbstractC1154x1.a(rVar, "input");
        this.f16772a = rVar;
        rVar.f16758b = this;
    }

    public static void g(int i7) throws C1160z1 {
        if ((i7 & 3) != 0) {
            throw C1160z1.f();
        }
    }

    public static void h(int i7) throws C1160z1 {
        if ((i7 & 7) != 0) {
            throw C1160z1.f();
        }
    }

    public final void a(Object obj, Schema schema, C1092e1 c1092e1) {
        int i7 = this.f16774c;
        this.f16774c = ((this.f16773b >>> 3) << 3) | 4;
        try {
            schema.mergeFrom(obj, this, c1092e1);
            if (this.f16773b != this.f16774c) {
                throw C1160z1.f();
            }
            this.f16774c = i7;
        } catch (Throwable th) {
            this.f16774c = i7;
            throw th;
        }
    }

    public final void b(Object obj, Schema schema, C1092e1 c1092e1) throws IOException {
        r rVar = this.f16772a;
        int iB = rVar.B();
        if (rVar.f16757a >= 100) {
            throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = rVar.j(iB);
        rVar.f16757a++;
        schema.mergeFrom(obj, this, c1092e1);
        rVar.a(0);
        rVar.f16757a--;
        rVar.i(iJ);
    }

    public final Object c(H2 h7, Class cls, C1092e1 c1092e1) {
        switch (h7.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return readMessage(cls, c1092e1);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    public final void d(List list, boolean z3) throws C1157y1 {
        int iA;
        int iA2;
        if ((this.f16773b & 7) != 2) {
            throw C1160z1.c();
        }
        boolean z8 = list instanceof LazyStringList;
        r rVar = this.f16772a;
        if (!z8 || z3) {
            do {
                list.add(z3 ? readStringRequireUtf8() : readString());
                if (rVar.e()) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == this.f16773b);
            this.f16775d = iA;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(readBytes());
            if (rVar.e()) {
                return;
            } else {
                iA2 = rVar.A();
            }
        } while (iA2 == this.f16773b);
        this.f16775d = iA2;
    }

    public final void e(int i7) throws C1160z1 {
        if (this.f16772a.d() != i7) {
            throw C1160z1.g();
        }
    }

    public final void f(int i7) throws C1157y1 {
        if ((this.f16773b & 7) != i7) {
            throw C1160z1.c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getFieldNumber() {
        int i7 = this.f16775d;
        if (i7 != 0) {
            this.f16773b = i7;
            this.f16775d = 0;
        } else {
            this.f16773b = this.f16772a.A();
        }
        int i10 = this.f16773b;
        if (i10 == 0 || i10 == this.f16774c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getTag() {
        return this.f16773b;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void mergeGroupField(Object obj, Schema schema, C1092e1 c1092e1) throws C1157y1 {
        f(3);
        a(obj, schema, c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void mergeMessageField(Object obj, Schema schema, C1092e1 c1092e1) throws IOException {
        f(2);
        b(obj, schema, c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean readBool() throws C1157y1 {
        f(0);
        return this.f16772a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBoolList(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof AbstractC1106i;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Boolean.valueOf(rVar.k()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Boolean.valueOf(rVar.k()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        AbstractC1106i abstractC1106i = (AbstractC1106i) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                abstractC1106i.addBoolean(rVar.k());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            abstractC1106i.addBoolean(rVar.k());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final AbstractC1123n readBytes() throws C1157y1 {
        f(2);
        return this.f16772a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBytesList(List list) throws C1157y1 {
        int iA;
        if ((this.f16773b & 7) != 2) {
            throw C1160z1.c();
        }
        do {
            list.add(readBytes());
            r rVar = this.f16772a;
            if (rVar.e()) {
                return;
            } else {
                iA = rVar.A();
            }
        } while (iA == this.f16773b);
        this.f16775d = iA;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() throws C1157y1 {
        f(1);
        return this.f16772a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readDoubleList(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof Y0;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 1) {
                do {
                    list.add(Double.valueOf(rVar.m()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iB = rVar.B();
            h(iB);
            int iD = rVar.d() + iB;
            do {
                list.add(Double.valueOf(rVar.m()));
            } while (rVar.d() < iD);
            return;
        }
        Y0 y8 = (Y0) list;
        int i10 = this.f16773b & 7;
        if (i10 == 1) {
            do {
                y8.addDouble(rVar.m());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iB2 = rVar.B();
        h(iB2);
        int iD2 = rVar.d() + iB2;
        do {
            y8.addDouble(rVar.m());
        } while (rVar.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readEnum() throws C1157y1 {
        f(0);
        return this.f16772a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readEnumList(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(rVar.n()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Integer.valueOf(rVar.n()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                c1148v1.addInt(rVar.n());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            c1148v1.addInt(rVar.n());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readFixed32() throws C1157y1 {
        f(5);
        return this.f16772a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed32List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 2) {
                int iB = rVar.B();
                g(iB);
                int iD = rVar.d() + iB;
                do {
                    list.add(Integer.valueOf(rVar.o()));
                } while (rVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw C1160z1.c();
            }
            do {
                list.add(Integer.valueOf(rVar.o()));
                if (rVar.e()) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == this.f16773b);
            this.f16775d = iA;
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 2) {
            int iB2 = rVar.B();
            g(iB2);
            int iD2 = rVar.d() + iB2;
            do {
                c1148v1.addInt(rVar.o());
            } while (rVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw C1160z1.c();
        }
        do {
            c1148v1.addInt(rVar.o());
            if (rVar.e()) {
                return;
            } else {
                iA2 = rVar.A();
            }
        } while (iA2 == this.f16773b);
        this.f16775d = iA2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readFixed64() throws C1157y1 {
        f(1);
        return this.f16772a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed64List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof G1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(rVar.p()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iB = rVar.B();
            h(iB);
            int iD = rVar.d() + iB;
            do {
                list.add(Long.valueOf(rVar.p()));
            } while (rVar.d() < iD);
            return;
        }
        G1 g7 = (G1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 1) {
            do {
                g7.addLong(rVar.p());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iB2 = rVar.B();
        h(iB2);
        int iD2 = rVar.d() + iB2;
        do {
            g7.addLong(rVar.p());
        } while (rVar.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() throws C1157y1 {
        f(5);
        return this.f16772a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFloatList(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof AbstractC1128o1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 2) {
                int iB = rVar.B();
                g(iB);
                int iD = rVar.d() + iB;
                do {
                    list.add(Float.valueOf(rVar.q()));
                } while (rVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw C1160z1.c();
            }
            do {
                list.add(Float.valueOf(rVar.q()));
                if (rVar.e()) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == this.f16773b);
            this.f16775d = iA;
            return;
        }
        AbstractC1128o1 abstractC1128o1 = (AbstractC1128o1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 2) {
            int iB2 = rVar.B();
            g(iB2);
            int iD2 = rVar.d() + iB2;
            do {
                abstractC1128o1.addFloat(rVar.q());
            } while (rVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw C1160z1.c();
        }
        do {
            abstractC1128o1.addFloat(rVar.q());
            if (rVar.e()) {
                return;
            } else {
                iA2 = rVar.A();
            }
        } while (iA2 == this.f16773b);
        this.f16775d = iA2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object readGroup(Class cls, C1092e1 c1092e1) throws C1157y1 {
        f(3);
        Schema schemaA = C1077a2.f16579c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        a(objNewInstance, schemaA, c1092e1);
        schemaA.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object readGroupBySchemaWithCheck(Schema schema, C1092e1 c1092e1) throws C1157y1 {
        f(3);
        Object objNewInstance = schema.newInstance();
        a(objNewInstance, schema, c1092e1);
        schema.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readGroupList(List list, Class cls, C1092e1 c1092e1) throws C1157y1 {
        readGroupList(list, C1077a2.f16579c.a(cls), c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readInt32() throws C1157y1 {
        f(0);
        return this.f16772a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt32List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(rVar.r()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Integer.valueOf(rVar.r()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                c1148v1.addInt(rVar.r());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            c1148v1.addInt(rVar.r());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readInt64() throws C1157y1 {
        f(0);
        return this.f16772a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt64List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof G1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(rVar.s()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Long.valueOf(rVar.s()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        G1 g7 = (G1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                g7.addLong(rVar.s());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            g7.addLong(rVar.s());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readMap(Map map, I1 i7, C1092e1 c1092e1) throws C1157y1 {
        f(2);
        r rVar = this.f16772a;
        int iJ = rVar.j(rVar.B());
        i7.getClass();
        Object objC = "";
        AbstractC1145u1 abstractC1145u1 = i7.f16497c;
        Object objC2 = abstractC1145u1;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || rVar.e()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objC = c(i7.f16495a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new C1160z1("Unable to parse map entry.");
                        }
                    } catch (C1157y1 unused) {
                        if (!skipField()) {
                            throw new C1160z1("Unable to parse map entry.");
                        }
                    }
                } else {
                    objC2 = c(i7.f16496b, abstractC1145u1.getClass(), c1092e1);
                }
            } catch (Throwable th) {
                rVar.i(iJ);
                throw th;
            }
        }
        map.put(objC, objC2);
        rVar.i(iJ);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object readMessage(Class cls, C1092e1 c1092e1) throws IOException {
        f(2);
        Schema schemaA = C1077a2.f16579c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        b(objNewInstance, schemaA, c1092e1);
        schemaA.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object readMessageBySchemaWithCheck(Schema schema, C1092e1 c1092e1) throws IOException {
        f(2);
        Object objNewInstance = schema.newInstance();
        b(objNewInstance, schema, c1092e1);
        schema.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readMessageList(List list, Class cls, C1092e1 c1092e1) throws IOException {
        readMessageList(list, C1077a2.f16579c.a(cls), c1092e1);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSFixed32() throws C1157y1 {
        f(5);
        return this.f16772a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed32List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 2) {
                int iB = rVar.B();
                g(iB);
                int iD = rVar.d() + iB;
                do {
                    list.add(Integer.valueOf(rVar.u()));
                } while (rVar.d() < iD);
                return;
            }
            if (i7 != 5) {
                throw C1160z1.c();
            }
            do {
                list.add(Integer.valueOf(rVar.u()));
                if (rVar.e()) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == this.f16773b);
            this.f16775d = iA;
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 2) {
            int iB2 = rVar.B();
            g(iB2);
            int iD2 = rVar.d() + iB2;
            do {
                c1148v1.addInt(rVar.u());
            } while (rVar.d() < iD2);
            return;
        }
        if (i10 != 5) {
            throw C1160z1.c();
        }
        do {
            c1148v1.addInt(rVar.u());
            if (rVar.e()) {
                return;
            } else {
                iA2 = rVar.A();
            }
        } while (iA2 == this.f16773b);
        this.f16775d = iA2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSFixed64() throws C1157y1 {
        f(1);
        return this.f16772a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed64List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof G1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 1) {
                do {
                    list.add(Long.valueOf(rVar.v()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iB = rVar.B();
            h(iB);
            int iD = rVar.d() + iB;
            do {
                list.add(Long.valueOf(rVar.v()));
            } while (rVar.d() < iD);
            return;
        }
        G1 g7 = (G1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 1) {
            do {
                g7.addLong(rVar.v());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iB2 = rVar.B();
        h(iB2);
        int iD2 = rVar.d() + iB2;
        do {
            g7.addLong(rVar.v());
        } while (rVar.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSInt32() throws C1157y1 {
        f(0);
        return this.f16772a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt32List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(rVar.w()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Integer.valueOf(rVar.w()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                c1148v1.addInt(rVar.w());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            c1148v1.addInt(rVar.w());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSInt64() throws C1157y1 {
        f(0);
        return this.f16772a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt64List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof G1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(rVar.x()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Long.valueOf(rVar.x()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        G1 g7 = (G1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                g7.addLong(rVar.x());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            g7.addLong(rVar.x());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readString() throws C1157y1 {
        f(2);
        return this.f16772a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringList(List list) throws C1157y1 {
        d(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringListRequireUtf8(List list) throws C1157y1 {
        d(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readStringRequireUtf8() throws C1157y1 {
        f(2);
        return this.f16772a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readUInt32() throws C1157y1 {
        f(0);
        return this.f16772a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt32List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof C1148v1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Integer.valueOf(rVar.B()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Integer.valueOf(rVar.B()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                c1148v1.addInt(rVar.B());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            c1148v1.addInt(rVar.B());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readUInt64() throws C1157y1 {
        f(0);
        return this.f16772a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt64List(List list) throws C1160z1 {
        int iA;
        int iA2;
        boolean z3 = list instanceof G1;
        r rVar = this.f16772a;
        if (!z3) {
            int i7 = this.f16773b & 7;
            if (i7 == 0) {
                do {
                    list.add(Long.valueOf(rVar.C()));
                    if (rVar.e()) {
                        return;
                    } else {
                        iA = rVar.A();
                    }
                } while (iA == this.f16773b);
                this.f16775d = iA;
                return;
            }
            if (i7 != 2) {
                throw C1160z1.c();
            }
            int iD = rVar.d() + rVar.B();
            do {
                list.add(Long.valueOf(rVar.C()));
            } while (rVar.d() < iD);
            e(iD);
            return;
        }
        G1 g7 = (G1) list;
        int i10 = this.f16773b & 7;
        if (i10 == 0) {
            do {
                g7.addLong(rVar.C());
                if (rVar.e()) {
                    return;
                } else {
                    iA2 = rVar.A();
                }
            } while (iA2 == this.f16773b);
            this.f16775d = iA2;
            return;
        }
        if (i10 != 2) {
            throw C1160z1.c();
        }
        int iD2 = rVar.d() + rVar.B();
        do {
            g7.addLong(rVar.C());
        } while (rVar.d() < iD2);
        e(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean shouldDiscardUnknownFields() {
        this.f16772a.getClass();
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean skipField() {
        int i7;
        r rVar = this.f16772a;
        if (rVar.e() || (i7 = this.f16773b) == this.f16774c) {
            return false;
        }
        return rVar.D(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readGroupList(List list, Schema schema, C1092e1 c1092e1) throws C1157y1 {
        int iA;
        int i7 = this.f16773b;
        if ((i7 & 7) == 3) {
            do {
                Object objNewInstance = schema.newInstance();
                a(objNewInstance, schema, c1092e1);
                schema.makeImmutable(objNewInstance);
                list.add(objNewInstance);
                r rVar = this.f16772a;
                if (rVar.e() || this.f16775d != 0) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == i7);
            this.f16775d = iA;
            return;
        }
        throw C1160z1.c();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readMessageList(List list, Schema schema, C1092e1 c1092e1) throws IOException {
        int iA;
        int i7 = this.f16773b;
        if ((i7 & 7) == 2) {
            do {
                Object objNewInstance = schema.newInstance();
                b(objNewInstance, schema, c1092e1);
                schema.makeImmutable(objNewInstance);
                list.add(objNewInstance);
                r rVar = this.f16772a;
                if (rVar.e() || this.f16775d != 0) {
                    return;
                } else {
                    iA = rVar.A();
                }
            } while (iA == i7);
            this.f16775d = iA;
            return;
        }
        throw C1160z1.c();
    }
}
