package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P1 implements Schema {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f16535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f16536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1096f1 f16538d;

    public P1(r2 r2Var, AbstractC1096f1 abstractC1096f1, MessageLite messageLite) {
        this.f16536b = r2Var;
        ((C1100g1) abstractC1096f1).getClass();
        this.f16537c = messageLite instanceof AbstractC1142t1;
        this.f16538d = abstractC1096f1;
        this.f16535a = messageLite;
    }

    public final boolean a(Reader reader, C1092e1 c1092e1, AbstractC1096f1 abstractC1096f1, r2 r2Var, q2 q2Var) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        MessageLite messageLite = this.f16535a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return reader.skipField();
            }
            ((C1100g1) abstractC1096f1).getClass();
            c1092e1.a(tag >>> 3, messageLite);
            r2Var.getClass();
            return r2.b(0, reader, q2Var);
        }
        AbstractC1123n bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == 16) {
                uInt32 = reader.readUInt32();
                ((C1100g1) abstractC1096f1).getClass();
                c1092e1.a(uInt32, messageLite);
            } else if (tag2 == 26) {
                bytes = reader.readBytes();
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != 12) {
            throw new C1160z1("Protocol message end-group tag did not match expected tag.");
        }
        if (bytes == null) {
            return true;
        }
        r2Var.getClass();
        q2Var.d((uInt32 << 3) | 2, bytes);
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean equals(Object obj, Object obj2) {
        r2 r2Var = this.f16536b;
        r2Var.getClass();
        q2 q2Var = ((AbstractC1145u1) obj).unknownFields;
        r2Var.getClass();
        if (!q2Var.equals(((AbstractC1145u1) obj2).unknownFields)) {
            return false;
        }
        if (!this.f16537c) {
            return true;
        }
        AbstractC1096f1 abstractC1096f1 = this.f16538d;
        ((C1100g1) abstractC1096f1).getClass();
        C1122m1 c1122m1 = ((AbstractC1142t1) obj).extensions;
        ((C1100g1) abstractC1096f1).getClass();
        return c1122m1.equals(((AbstractC1142t1) obj2).extensions);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int getSerializedSize(Object obj) {
        this.f16536b.getClass();
        q2 q2Var = ((AbstractC1145u1) obj).unknownFields;
        int iX = q2Var.f16755d;
        if (iX == -1) {
            iX = 0;
            for (int i7 = 0; i7 < q2Var.f16752a; i7++) {
                int i10 = q2Var.f16753b[i7] >>> 3;
                iX += AbstractC1146v.x(3, (AbstractC1123n) q2Var.f16754c[i7]) + AbstractC1146v.D(i10) + AbstractC1146v.C(2) + (AbstractC1146v.C(1) * 2);
            }
            q2Var.f16755d = iX;
        }
        if (!this.f16537c) {
            return iX;
        }
        ((C1100g1) this.f16538d).getClass();
        C1093e2 c1093e2 = ((AbstractC1142t1) obj).extensions.f16696a;
        int size = c1093e2.f16607a.size();
        int iE = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iE += C1122m1.e(c1093e2.c(i11));
        }
        Iterator it = c1093e2.d().iterator();
        while (it.hasNext()) {
            iE += C1122m1.e((Map.Entry) it.next());
        }
        return iX + iE;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int hashCode(Object obj) {
        this.f16536b.getClass();
        int iHashCode = ((AbstractC1145u1) obj).unknownFields.hashCode();
        if (!this.f16537c) {
            return iHashCode;
        }
        ((C1100g1) this.f16538d).getClass();
        return ((AbstractC1142t1) obj).extensions.f16696a.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        ((C1100g1) this.f16538d).getClass();
        return ((AbstractC1142t1) obj).extensions.f();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object obj) {
        this.f16536b.getClass();
        q2 q2Var = ((AbstractC1145u1) obj).unknownFields;
        if (q2Var.f16756e) {
            q2Var.f16756e = false;
        }
        ((C1100g1) this.f16538d).getClass();
        ((AbstractC1142t1) obj).extensions.i();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        AbstractC1089d2.l(this.f16536b, obj, obj2);
        if (this.f16537c) {
            AbstractC1089d2.k(this.f16538d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        MessageLite messageLite = this.f16535a;
        return messageLite instanceof AbstractC1145u1 ? ((AbstractC1145u1) messageLite).j() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void writeTo(Object obj, Writer writer) throws IOException {
        ((C1100g1) this.f16538d).getClass();
        Iterator itH = ((AbstractC1142t1) obj).extensions.h();
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() != I2.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            writer.writeMessageSetItem(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
        }
        this.f16536b.getClass();
        q2 q2Var = ((AbstractC1145u1) obj).unknownFields;
        q2Var.getClass();
        if (writer.fieldOrder() == J2.f16511b) {
            for (int i7 = q2Var.f16752a - 1; i7 >= 0; i7--) {
                writer.writeMessageSetItem(q2Var.f16753b[i7] >>> 3, q2Var.f16754c[i7]);
            }
            return;
        }
        for (int i10 = 0; i10 < q2Var.f16752a; i10++) {
            writer.writeMessageSetItem(q2Var.f16753b[i10] >>> 3, q2Var.f16754c[i10]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, byte[] bArr, int i7, int i10, C1098g c1098g) throws C1160z1 {
        int i11;
        C1098g c1098g2;
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) obj;
        q2 q2VarC = abstractC1145u1.unknownFields;
        if (q2VarC == q2.f16751f) {
            q2VarC = q2.c();
            abstractC1145u1.unknownFields = q2VarC;
        }
        q2 q2Var = q2VarC;
        ((AbstractC1142t1) obj).n();
        while (i7 < i10) {
            int iM = AbstractC1102h.m(bArr, i7, c1098g);
            int i12 = c1098g.f16616a;
            MessageLite messageLite = this.f16535a;
            AbstractC1096f1 abstractC1096f1 = this.f16538d;
            C1092e1 c1092e1 = c1098g.f16619d;
            if (i12 == 11) {
                byte[] bArr2 = bArr;
                i11 = i10;
                c1098g2 = c1098g;
                int i13 = 0;
                AbstractC1123n abstractC1123n = null;
                while (true) {
                    if (iM >= i11) {
                        i7 = iM;
                        break;
                    }
                    int iM2 = AbstractC1102h.m(bArr2, iM, c1098g2);
                    int i14 = c1098g2.f16616a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3 && i16 == 2) {
                            iM = AbstractC1102h.d(bArr2, iM2, c1098g2);
                            abstractC1123n = (AbstractC1123n) c1098g2.f16618c;
                        } else {
                            if (i14 == 12) {
                                i7 = iM2;
                                break;
                            }
                            iM = AbstractC1102h.v(i14, bArr2, iM2, i11, c1098g2);
                        }
                    } else if (i16 == 0) {
                        iM = AbstractC1102h.m(bArr2, iM2, c1098g2);
                        i13 = c1098g2.f16616a;
                        ((C1100g1) abstractC1096f1).getClass();
                        c1092e1.a(i13, messageLite);
                    } else {
                        if (i14 == 12) {
                            i7 = iM2;
                            break;
                        }
                        iM = AbstractC1102h.v(i14, bArr2, iM2, i11, c1098g2);
                    }
                }
                if (abstractC1123n != null) {
                    q2Var.d((i13 << 3) | 2, abstractC1123n);
                }
                bArr = bArr2;
            } else if ((i12 & 7) == 2) {
                ((C1100g1) abstractC1096f1).getClass();
                c1092e1.a(i12 >>> 3, messageLite);
                byte[] bArr3 = bArr;
                i11 = i10;
                c1098g2 = c1098g;
                i7 = AbstractC1102h.h(i12, bArr3, iM, i11, q2Var, c1098g2);
                bArr = bArr3;
            } else {
                i7 = AbstractC1102h.v(i12, bArr, iM, i10, c1098g);
            }
            i10 = i11;
            c1098g = c1098g2;
        }
        if (i7 != i10) {
            throw C1160z1.f();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Reader reader, C1092e1 c1092e1) {
        r2 r2Var = this.f16536b;
        r2Var.getClass();
        q2 q2VarA = r2.a(obj);
        AbstractC1096f1 abstractC1096f1 = this.f16538d;
        ((C1100g1) abstractC1096f1).getClass();
        ((AbstractC1142t1) obj).n();
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                Reader reader2 = reader;
                C1092e1 c1092e2 = c1092e1;
                if (!a(reader2, c1092e2, abstractC1096f1, r2Var, q2VarA)) {
                    break;
                }
                reader = reader2;
                c1092e1 = c1092e2;
            } finally {
                ((AbstractC1145u1) obj).unknownFields = q2VarA;
            }
        }
    }
}
