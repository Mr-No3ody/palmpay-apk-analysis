package p178m0;

import androidx.camera.camera2.internal.F;
import androidx.datastore.preferences.PreferencesProto$ValueOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractC1123n;
import androidx.datastore.preferences.protobuf.AbstractC1134q1;
import androidx.datastore.preferences.protobuf.AbstractC1145u1;
import androidx.datastore.preferences.protobuf.C1085c2;
import androidx.datastore.preferences.protobuf.C1120m;
import androidx.datastore.preferences.protobuf.C1136r1;
import androidx.datastore.preferences.protobuf.Parser;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1145u1 implements PreferencesProto$ValueOrBuilder {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Parser<k> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC1145u1.l(k.class, kVar);
    }

    public static void n(k kVar, long j6) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j6);
    }

    public static void o(String str, k kVar) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d2) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d2);
    }

    public static void r(k kVar, C1120m c1120m) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c1120m;
    }

    public static void s(k kVar, boolean z3) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z3);
    }

    public static void t(k kVar, float f10) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f10);
    }

    public static void u(k kVar, int i7) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i7);
    }

    public static k v() {
        return DEFAULT_INSTANCE;
    }

    public static i w() {
        return (i) ((AbstractC1134q1) DEFAULT_INSTANCE.d(5, null));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1145u1
    public final Object d(int i7, AbstractC1145u1 abstractC1145u1) {
        Parser c1136r1;
        switch (F.i(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case 3:
                return new k();
            case 4:
                return new i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<k> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (k.class) {
                    try {
                        c1136r1 = PARSER;
                        if (c1136r1 == null) {
                            c1136r1 = new C1136r1(DEFAULT_INSTANCE);
                            PARSER = c1136r1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1136r1;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean getBoolean() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final AbstractC1123n getBytes() {
        return this.valueCase_ == 8 ? (AbstractC1123n) this.value_ : AbstractC1123n.f16699b;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final double getDouble() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final float getFloat() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final int getInteger() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final long getLong() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final String getString() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final AbstractC1123n getStringBytes() {
        return AbstractC1123n.d(this.valueCase_ == 5 ? (String) this.value_ : "");
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final h getStringSet() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.o();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final j getValueCase() {
        switch (this.valueCase_) {
            case 0:
                return j.f39426j;
            case 1:
                return j.f39418a;
            case 2:
                return j.f39419b;
            case 3:
                return j.f39420c;
            case 4:
                return j.f39421d;
            case 5:
                return j.f39422e;
            case 6:
                return j.f39423f;
            case 7:
                return j.f39424g;
            case 8:
                return j.f39425i;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasBoolean() {
        return this.valueCase_ == 1;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasBytes() {
        return this.valueCase_ == 8;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasDouble() {
        return this.valueCase_ == 7;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasFloat() {
        return this.valueCase_ == 2;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasInteger() {
        return this.valueCase_ == 3;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasLong() {
        return this.valueCase_ == 4;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasString() {
        return this.valueCase_ == 5;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$ValueOrBuilder
    public final boolean hasStringSet() {
        return this.valueCase_ == 6;
    }
}
