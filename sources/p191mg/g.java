package p191mg;

import androidx.camera.core.impl.utils.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.G;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p176lg.c;
import p185ma.t;
import p209ng.a;
import p209ng.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f39727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f39728p;

    public g(t lexer, c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f39727o = lexer;
        this.f39728p = json.f39371b;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        t tVar = this.f39727o;
        String strK = tVar.k();
        try {
            return G.b(strK);
        } catch (IllegalArgumentException unused) {
            t.n(tVar, C0.G.l('\'', "Failed to parse type 'UByte' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        t tVar = this.f39727o;
        String strK = tVar.k();
        try {
            return G.c(strK);
        } catch (IllegalArgumentException unused) {
            t.n(tVar, C0.G.l('\'', "Failed to parse type 'UInt' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        t tVar = this.f39727o;
        String strK = tVar.k();
        try {
            return G.e(strK);
        } catch (IllegalArgumentException unused) {
            t.n(tVar, C0.G.l('\'', "Failed to parse type 'ULong' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        t tVar = this.f39727o;
        String strK = tVar.k();
        try {
            return G.g(strK);
        } catch (IllegalArgumentException unused) {
            t.n(tVar, C0.G.l('\'', "Failed to parse type 'UShort' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final b getSerializersModule() {
        return this.f39728p;
    }
}
