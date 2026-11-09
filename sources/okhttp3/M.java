package okhttp3;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.m f40596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f40597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f40598c;

    public M() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.f40596a = Pg.m.f7359d.encodeUtf8(boundary);
        this.f40597b = Q.f40603f;
        this.f40598c = new ArrayList();
    }

    public final void a(L type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.c(type.f40593b, "multipart")) {
            this.f40597b = type;
        } else {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }
}
