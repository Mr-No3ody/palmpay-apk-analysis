package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149w implements Writer, SchemaFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1131p1 f16791b = new C1131p1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16792a;

    public C1149w(AbstractC1146v abstractC1146v) {
        Charset charset = AbstractC1154x1.f16808a;
        this.f16792a = abstractC1146v;
        abstractC1146v.f16786a = this;
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public Schema createSchema(Class cls) {
        Class cls2 = AbstractC1089d2.f16600a;
        if (!AbstractC1145u1.class.isAssignableFrom(cls)) {
            C1077a2 c1077a2 = C1077a2.f16579c;
            Class cls3 = AbstractC1089d2.f16600a;
            if (cls3 != null && !cls3.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        MessageInfo messageInfoMessageInfoFor = ((H1) this.f16792a).messageInfoFor(cls);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            C1077a2 c1077a3 = C1077a2.f16579c;
            if (AbstractC1145u1.class.isAssignableFrom(cls)) {
                return new P1(AbstractC1089d2.f16602c, AbstractC1104h1.f16646a, messageInfoMessageInfoFor.getDefaultInstance());
            }
            r2 r2Var = AbstractC1089d2.f16601b;
            AbstractC1096f1 abstractC1096f1 = AbstractC1104h1.f16647b;
            if (abstractC1096f1 != null) {
                return new P1(r2Var, abstractC1096f1, messageInfoMessageInfoFor.getDefaultInstance());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        C1077a2 c1077a4 = C1077a2.f16579c;
        if (AbstractC1145u1.class.isAssignableFrom(cls)) {
            U1 u6 = V1.f16544b;
            C1 c6 = D1.f16469b;
            r2 r2Var2 = AbstractC1089d2.f16602c;
            C1100g1 c1100g1 = messageInfoMessageInfoFor.getSyntax().ordinal() != 1 ? AbstractC1104h1.f16646a : null;
            L1 l5 = M1.f16516b;
            int[] iArr = O1.f16518p;
            if (messageInfoMessageInfoFor instanceof C1085c2) {
                return O1.s((C1085c2) messageInfoMessageInfoFor, u6, c6, r2Var2, c1100g1, l5);
            }
            throw new ClassCastException();
        }
        NewInstanceSchema newInstanceSchema = V1.f16543a;
        AbstractC1096f1 abstractC1096f2 = null;
        ListFieldSchema listFieldSchema = D1.f16468a;
        r2 r2Var3 = AbstractC1089d2.f16601b;
        if (messageInfoMessageInfoFor.getSyntax().ordinal() != 1) {
            AbstractC1096f1 abstractC1096f3 = AbstractC1104h1.f16647b;
            if (abstractC1096f3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            abstractC1096f2 = abstractC1096f3;
        }
        MapFieldSchema mapFieldSchema = M1.f16515a;
        int[] iArr2 = O1.f16518p;
        if (messageInfoMessageInfoFor instanceof C1085c2) {
            return O1.s((C1085c2) messageInfoMessageInfoFor, newInstanceSchema, listFieldSchema, r2Var3, abstractC1096f2, mapFieldSchema);
        }
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public J2 fieldOrder() {
        return J2.f16510a;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i7, boolean z3) {
        ((AbstractC1146v) this.f16792a).H(i7, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i7, List list, boolean z3) {
        boolean z8 = list instanceof AbstractC1106i;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.H(i7, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11++;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.G(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        AbstractC1106i abstractC1106i = (AbstractC1106i) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                abstractC1106i.getClass();
                if (i13 >= 0) {
                    break;
                }
                abstractC1106i.getBoolean(i13);
                Logger logger2 = AbstractC1146v.f16784b;
                i14++;
                i13++;
            }
            abstractC1146v.a0(i14);
            while (i10 < 0) {
                abstractC1146v.G(abstractC1106i.getBoolean(i10) ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        while (true) {
            abstractC1106i.getClass();
            if (i10 >= 0) {
                return;
            }
            abstractC1146v.H(i7, abstractC1106i.getBoolean(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int i7, AbstractC1123n abstractC1123n) {
        ((AbstractC1146v) this.f16792a).J(i7, abstractC1123n);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((AbstractC1146v) this.f16792a).J(i7, (AbstractC1123n) list.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i7, double d2) {
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        abstractC1146v.getClass();
        abstractC1146v.N(i7, Double.doubleToRawLongBits(d2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i7, List list, boolean z3) {
        boolean z8 = list instanceof Y0;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                    abstractC1146v.getClass();
                    abstractC1146v.N(i7, Double.doubleToRawLongBits(dDoubleValue));
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 8;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.O(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        Y0 y8 = (Y0) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                y8.getClass();
                if (i13 >= 0) {
                    break;
                }
                y8.getDouble(i13);
                Logger logger2 = AbstractC1146v.f16784b;
                i14 += 8;
                i13++;
            }
            abstractC1146v.a0(i14);
            while (i10 < 0) {
                abstractC1146v.O(Double.doubleToRawLongBits(y8.getDouble(i10)));
                i10++;
            }
            return;
        }
        while (true) {
            y8.getClass();
            if (i10 >= 0) {
                return;
            }
            double d2 = y8.getDouble(i10);
            abstractC1146v.getClass();
            abstractC1146v.N(i7, Double.doubleToRawLongBits(d2));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEndGroup(int i7) {
        ((AbstractC1146v) this.f16792a).Y(i7, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).P(i7, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.P(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE += AbstractC1146v.E(((Integer) list.get(i11)).intValue());
            }
            abstractC1146v.a0(iE);
            while (i10 < list.size()) {
                abstractC1146v.Q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                abstractC1146v.P(i7, c1148v1.getInt(i10));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int iE2 = 0;
        for (int i12 = 0; i12 < c1148v1.f16789c; i12++) {
            iE2 += AbstractC1146v.E(c1148v1.getInt(i12));
        }
        abstractC1146v.a0(iE2);
        while (i10 < c1148v1.f16789c) {
            abstractC1146v.Q(c1148v1.getInt(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).L(i7, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.L(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 4;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.M(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                abstractC1146v.L(i7, c1148v1.getInt(i10));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c1148v1.f16789c; i14++) {
            c1148v1.getInt(i14);
            Logger logger2 = AbstractC1146v.f16784b;
            i13 += 4;
        }
        abstractC1146v.a0(i13);
        while (i10 < c1148v1.f16789c) {
            abstractC1146v.M(c1148v1.getInt(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i7, long j6) {
        ((AbstractC1146v) this.f16792a).N(i7, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof G1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.N(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 8;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.O(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        G1 g7 = (G1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                g7.getClass();
                if (i13 >= 0) {
                    break;
                }
                g7.getLong(i13);
                Logger logger2 = AbstractC1146v.f16784b;
                i14 += 8;
                i13++;
            }
            abstractC1146v.a0(i14);
            while (i10 < 0) {
                abstractC1146v.O(g7.getLong(i10));
                i10++;
            }
            return;
        }
        while (true) {
            g7.getClass();
            if (i10 >= 0) {
                return;
            }
            abstractC1146v.N(i7, g7.getLong(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i7, float f10) {
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        abstractC1146v.getClass();
        abstractC1146v.L(i7, Float.floatToRawIntBits(f10));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i7, List list, boolean z3) {
        boolean z8 = list instanceof AbstractC1128o1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    float fFloatValue = ((Float) list.get(i10)).floatValue();
                    abstractC1146v.getClass();
                    abstractC1146v.L(i7, Float.floatToRawIntBits(fFloatValue));
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 4;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.M(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        AbstractC1128o1 abstractC1128o1 = (AbstractC1128o1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                abstractC1128o1.getClass();
                if (i13 >= 0) {
                    break;
                }
                abstractC1128o1.getFloat(i13);
                Logger logger2 = AbstractC1146v.f16784b;
                i14 += 4;
                i13++;
            }
            abstractC1146v.a0(i14);
            while (i10 < 0) {
                abstractC1146v.M(Float.floatToRawIntBits(abstractC1128o1.getFloat(i10)));
                i10++;
            }
            return;
        }
        while (true) {
            abstractC1128o1.getClass();
            if (i10 >= 0) {
                return;
            }
            float f10 = abstractC1128o1.getFloat(i10);
            abstractC1146v.getClass();
            abstractC1146v.L(i7, Float.floatToRawIntBits(f10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i7, Object obj) throws IOException {
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        abstractC1146v.Y(i7, 3);
        ((MessageLite) obj).writeTo(abstractC1146v);
        abstractC1146v.Y(i7, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i7, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i7, list.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).P(i7, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.P(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE += AbstractC1146v.E(((Integer) list.get(i11)).intValue());
            }
            abstractC1146v.a0(iE);
            while (i10 < list.size()) {
                abstractC1146v.Q(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                abstractC1146v.P(i7, c1148v1.getInt(i10));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int iE2 = 0;
        for (int i12 = 0; i12 < c1148v1.f16789c; i12++) {
            iE2 += AbstractC1146v.E(c1148v1.getInt(i12));
        }
        abstractC1146v.a0(iE2);
        while (i10 < c1148v1.f16789c) {
            abstractC1146v.Q(c1148v1.getInt(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i7, long j6) {
        ((AbstractC1146v) this.f16792a).b0(i7, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof G1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.b0(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE += AbstractC1146v.E(((Long) list.get(i11)).longValue());
            }
            abstractC1146v.a0(iE);
            while (i10 < list.size()) {
                abstractC1146v.c0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        G1 g7 = (G1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i12 = 0;
            int iE2 = 0;
            while (true) {
                g7.getClass();
                if (i12 >= 0) {
                    break;
                }
                iE2 += AbstractC1146v.E(g7.getLong(i12));
                i12++;
            }
            abstractC1146v.a0(iE2);
            while (i10 < 0) {
                abstractC1146v.c0(g7.getLong(i10));
                i10++;
            }
            return;
        }
        while (true) {
            g7.getClass();
            if (i10 >= 0) {
                return;
            }
            abstractC1146v.b0(i7, g7.getLong(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMap(int i7, I1 i10, Map map) {
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        abstractC1146v.getClass();
        for (Map.Entry entry : map.entrySet()) {
            abstractC1146v.Y(i7, 2);
            abstractC1146v.a0(J1.a(i10, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            C1122m1.m(abstractC1146v, i10.f16495a, 1, key);
            C1122m1.m(abstractC1146v, i10.f16496b, 2, value);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i7, Object obj) {
        ((AbstractC1146v) this.f16792a).R(i7, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i7, list.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageSetItem(int i7, Object obj) {
        boolean z3 = obj instanceof AbstractC1123n;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        if (z3) {
            abstractC1146v.V(i7, (AbstractC1123n) obj);
        } else {
            abstractC1146v.U(i7, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).L(i7, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.L(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 4;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.M(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                abstractC1146v.L(i7, c1148v1.getInt(i10));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < c1148v1.f16789c; i14++) {
            c1148v1.getInt(i14);
            Logger logger2 = AbstractC1146v.f16784b;
            i13 += 4;
        }
        abstractC1146v.a0(i13);
        while (i10 < c1148v1.f16789c) {
            abstractC1146v.M(c1148v1.getInt(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i7, long j6) {
        ((AbstractC1146v) this.f16792a).N(i7, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof G1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.N(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                Logger logger = AbstractC1146v.f16784b;
                i11 += 8;
            }
            abstractC1146v.a0(i11);
            while (i10 < list.size()) {
                abstractC1146v.O(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        G1 g7 = (G1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i13 = 0;
            int i14 = 0;
            while (true) {
                g7.getClass();
                if (i13 >= 0) {
                    break;
                }
                g7.getLong(i13);
                Logger logger2 = AbstractC1146v.f16784b;
                i14 += 8;
                i13++;
            }
            abstractC1146v.a0(i14);
            while (i10 < 0) {
                abstractC1146v.O(g7.getLong(i10));
                i10++;
            }
            return;
        }
        while (true) {
            g7.getClass();
            if (i10 >= 0) {
                return;
            }
            abstractC1146v.N(i7, g7.getLong(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).Z(i7, (i10 >> 31) ^ (i10 << 1));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    abstractC1146v.Z(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iZ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZ += AbstractC1146v.z(((Integer) list.get(i11)).intValue());
            }
            abstractC1146v.a0(iZ);
            while (i10 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i10)).intValue();
                abstractC1146v.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                int i12 = c1148v1.getInt(i10);
                abstractC1146v.Z(i7, (i12 >> 31) ^ (i12 << 1));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int iZ2 = 0;
        for (int i13 = 0; i13 < c1148v1.f16789c; i13++) {
            iZ2 += AbstractC1146v.z(c1148v1.getInt(i13));
        }
        abstractC1146v.a0(iZ2);
        while (i10 < c1148v1.f16789c) {
            int i14 = c1148v1.getInt(i10);
            abstractC1146v.a0((i14 >> 31) ^ (i14 << 1));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i7, long j6) {
        ((AbstractC1146v) this.f16792a).b0(i7, (j6 >> 63) ^ (j6 << 1));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof G1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    abstractC1146v.b0(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iA = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iA += AbstractC1146v.A(((Long) list.get(i11)).longValue());
            }
            abstractC1146v.a0(iA);
            while (i10 < list.size()) {
                long jLongValue2 = ((Long) list.get(i10)).longValue();
                abstractC1146v.c0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i10++;
            }
            return;
        }
        G1 g7 = (G1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i12 = 0;
            int iA2 = 0;
            while (true) {
                g7.getClass();
                if (i12 >= 0) {
                    break;
                }
                iA2 += AbstractC1146v.A(g7.getLong(i12));
                i12++;
            }
            abstractC1146v.a0(iA2);
            while (i10 < 0) {
                long j6 = g7.getLong(i10);
                abstractC1146v.c0((j6 >> 63) ^ (j6 << 1));
                i10++;
            }
            return;
        }
        while (true) {
            g7.getClass();
            if (i10 >= 0) {
                return;
            }
            long j10 = g7.getLong(i10);
            abstractC1146v.b0(i7, (j10 >> 63) ^ (j10 << 1));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStartGroup(int i7) {
        ((AbstractC1146v) this.f16792a).Y(i7, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i7, String str) {
        ((AbstractC1146v) this.f16792a).W(i7, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i7, List list) {
        boolean z3 = list instanceof LazyStringList;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                abstractC1146v.W(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i10 < list.size()) {
            Object raw = lazyStringList.getRaw(i10);
            if (raw instanceof String) {
                abstractC1146v.W(i7, (String) raw);
            } else {
                abstractC1146v.J(i7, (AbstractC1123n) raw);
            }
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i7, int i10) {
        ((AbstractC1146v) this.f16792a).Z(i7, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof C1148v1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.Z(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iD += AbstractC1146v.D(((Integer) list.get(i11)).intValue());
            }
            abstractC1146v.a0(iD);
            while (i10 < list.size()) {
                abstractC1146v.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        C1148v1 c1148v1 = (C1148v1) list;
        if (!z3) {
            while (i10 < c1148v1.f16789c) {
                abstractC1146v.Z(i7, c1148v1.getInt(i10));
                i10++;
            }
            return;
        }
        abstractC1146v.Y(i7, 2);
        int iD2 = 0;
        for (int i12 = 0; i12 < c1148v1.f16789c; i12++) {
            iD2 += AbstractC1146v.D(c1148v1.getInt(i12));
        }
        abstractC1146v.a0(iD2);
        while (i10 < c1148v1.f16789c) {
            abstractC1146v.a0(c1148v1.getInt(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i7, long j6) {
        ((AbstractC1146v) this.f16792a).b0(i7, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i7, List list, boolean z3) {
        boolean z8 = list instanceof G1;
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        int i10 = 0;
        if (!z8) {
            if (!z3) {
                while (i10 < list.size()) {
                    abstractC1146v.b0(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            abstractC1146v.Y(i7, 2);
            int iE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iE += AbstractC1146v.E(((Long) list.get(i11)).longValue());
            }
            abstractC1146v.a0(iE);
            while (i10 < list.size()) {
                abstractC1146v.c0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        G1 g7 = (G1) list;
        if (z3) {
            abstractC1146v.Y(i7, 2);
            int i12 = 0;
            int iE2 = 0;
            while (true) {
                g7.getClass();
                if (i12 >= 0) {
                    break;
                }
                iE2 += AbstractC1146v.E(g7.getLong(i12));
                i12++;
            }
            abstractC1146v.a0(iE2);
            while (i10 < 0) {
                abstractC1146v.c0(g7.getLong(i10));
                i10++;
            }
            return;
        }
        while (true) {
            g7.getClass();
            if (i10 >= 0) {
                return;
            }
            abstractC1146v.b0(i7, g7.getLong(i10));
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i7, Object obj, Schema schema) {
        ((AbstractC1146v) this.f16792a).S(i7, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i7, List list, Schema schema) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i7, list.get(i10), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i7, List list, Schema schema) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i7, list.get(i10), schema);
        }
    }

    public C1149w() {
        C1077a2 c1077a2 = C1077a2.f16579c;
        MessageInfoFactory messageInfoFactory = f16791b;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        MessageInfoFactory[] messageInfoFactoryArr = {C1131p1.f16734b, messageInfoFactory};
        H1 h7 = new H1();
        h7.f16488a = messageInfoFactoryArr;
        Charset charset = AbstractC1154x1.f16808a;
        this.f16792a = h7;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i7, Object obj, Schema schema) throws IOException {
        AbstractC1146v abstractC1146v = (AbstractC1146v) this.f16792a;
        abstractC1146v.Y(i7, 3);
        schema.writeTo((MessageLite) obj, abstractC1146v.f16786a);
        abstractC1146v.Y(i7, 4);
    }
}
