package p176lg;

import Pa.C0525w;
import kotlin.collections.C1843j;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import p185ma.t;
import p191mg.b;
import p191mg.k;
import p191mg.o;
import p191mg.s;
import p209ng.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements StringFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f39369d = new b(new h(), p209ng.c.f39974a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f39370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0525w f39372c = new C0525w(25);

    public c(h hVar, a aVar) {
        this.f39370a = hVar;
        this.f39371b = aVar;
    }

    @Override // kotlinx.serialization.StringFormat
    public final Object decodeFromString(DeserializationStrategy deserializer, String source) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "string");
        Intrinsics.checkNotNullParameter(this, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        t tVar = new t(source);
        Object objDecodeSerializableValue = new o(this, s.OBJ, tVar, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
        if (tVar.f() == 10) {
            return objDecodeSerializableValue;
        }
        t.n(tVar, "Expected EOF after parsing, but had " + ((String) tVar.f39628d).charAt(tVar.f39626b - 1) + " instead", 0, 6);
        throw null;
    }

    @Override // kotlinx.serialization.StringFormat
    public final String encodeToString(SerializationStrategy serializer, Object obj) {
        char[] cArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        C4.a aVar = new C4.a(9, false);
        b bVar = b.f39720c;
        synchronized (bVar) {
            C1843j c1843j = bVar.f39721a;
            cArr = null;
            char[] cArr2 = (char[]) (c1843j.isEmpty() ? null : c1843j.removeLast());
            if (cArr2 != null) {
                bVar.f39722b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.f1156c = cArr;
        try {
            k.e(this, aVar, serializer, obj);
            return aVar.toString();
        } finally {
            aVar.release();
        }
    }

    @Override // kotlinx.serialization.SerialFormat
    public final p209ng.b getSerializersModule() {
        return this.f39371b;
    }
}
