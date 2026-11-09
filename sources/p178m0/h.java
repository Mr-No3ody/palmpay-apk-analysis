package p178m0;

import androidx.camera.camera2.internal.F;
import androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder;
import androidx.datastore.preferences.protobuf.AbstractC1078b;
import androidx.datastore.preferences.protobuf.AbstractC1123n;
import androidx.datastore.preferences.protobuf.AbstractC1134q1;
import androidx.datastore.preferences.protobuf.AbstractC1145u1;
import androidx.datastore.preferences.protobuf.C1081b2;
import androidx.datastore.preferences.protobuf.C1085c2;
import androidx.datastore.preferences.protobuf.C1136r1;
import androidx.datastore.preferences.protobuf.Internal$ProtobufList;
import androidx.datastore.preferences.protobuf.Parser;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1145u1 implements PreferencesProto$StringSetOrBuilder {
    private static final h DEFAULT_INSTANCE;
    private static volatile Parser<h> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private Internal$ProtobufList<String> strings_ = C1081b2.f16587d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1145u1.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        Internal$ProtobufList<String> internal$ProtobufList = hVar.strings_;
        if (!internal$ProtobufList.isModifiable()) {
            int size = internal$ProtobufList.size();
            hVar.strings_ = internal$ProtobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        }
        AbstractC1078b.a(hVar.strings_, set);
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g p() {
        return (g) ((AbstractC1134q1) DEFAULT_INSTANCE.d(5, null));
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
                return new C1085c2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<h> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (h.class) {
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

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final String getStrings(int i7) {
        return this.strings_.get(i7);
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final AbstractC1123n getStringsBytes(int i7) {
        return AbstractC1123n.d(this.strings_.get(i7));
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final int getStringsCount() {
        return this.strings_.size();
    }

    @Override // androidx.datastore.preferences.PreferencesProto$StringSetOrBuilder
    public final List getStringsList() {
        return this.strings_;
    }
}
