package C0;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f1004n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        try {
            this.f1004n = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // C0.d0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // C0.d0
    public final String b() {
        String name = this.f1004n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // C0.d0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // C0.d0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r10 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f1004n.cast(r10);
        bundle.putSerializable(key, r10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.f1004n, ((b0) obj).f1004n);
    }

    public final int hashCode() {
        return this.f1004n.hashCode();
    }
}
