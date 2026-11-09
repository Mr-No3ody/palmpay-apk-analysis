package p178m0;

import androidx.camera.camera2.internal.F;
import androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractC1134q1;
import androidx.datastore.preferences.protobuf.AbstractC1145u1;
import androidx.datastore.preferences.protobuf.C1085c2;
import androidx.datastore.preferences.protobuf.C1092e1;
import androidx.datastore.preferences.protobuf.C1136r1;
import androidx.datastore.preferences.protobuf.C1160z1;
import androidx.datastore.preferences.protobuf.K1;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.p2;
import androidx.datastore.preferences.protobuf.r;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1145u1 implements PreferencesProto$PreferenceMapOrBuilder {
    private static final f DEFAULT_INSTANCE;
    private static volatile Parser<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private K1 preferences_ = K1.f16513b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1145u1.l(f.class, fVar);
    }

    public static K1 n(f fVar) {
        K1 k2 = fVar.preferences_;
        if (!k2.f16514a) {
            fVar.preferences_ = k2.c();
        }
        return fVar.preferences_;
    }

    public static d o() {
        return (d) ((AbstractC1134q1) DEFAULT_INSTANCE.d(5, null));
    }

    public static f p(InputStream inputStream) throws C1160z1 {
        AbstractC1145u1 abstractC1145u1K = AbstractC1145u1.k(DEFAULT_INSTANCE, r.g(inputStream), C1092e1.b());
        if (AbstractC1145u1.g(abstractC1145u1K, true)) {
            return (f) abstractC1145u1K;
        }
        throw new C1160z1(new p2().getMessage());
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final boolean containsPreferences(String str) {
        str.getClass();
        return this.preferences_.containsKey(str);
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f39417a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<f> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (f.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferences() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final int getPreferencesCount() {
        return this.preferences_.size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final Map getPreferencesMap() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final k getPreferencesOrDefault(String str, k kVar) {
        str.getClass();
        K1 k2 = this.preferences_;
        return k2.containsKey(str) ? (k) k2.get(str) : kVar;
    }

    @Override // androidx.datastore.preferences.PreferencesProto$PreferenceMapOrBuilder
    public final k getPreferencesOrThrow(String str) {
        str.getClass();
        K1 k2 = this.preferences_;
        if (k2.containsKey(str)) {
            return (k) k2.get(str);
        }
        throw new IllegalArgumentException();
    }
}
