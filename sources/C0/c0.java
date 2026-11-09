package C0;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f1017n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        if (!type.isEnum()) {
            this.f1017n = type;
            return;
        }
        throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // C0.d0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // C0.d0
    public String b() {
        String name = this.f1017n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // C0.d0
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1017n.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return Intrinsics.c(this.f1017n, ((c0) obj).f1017n);
    }

    @Override // C0.d0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f1017n.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Class type, int i7) {
        super(false);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            this.f1017n = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }
}
