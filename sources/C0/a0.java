package C0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f1002n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
            this.f1002n = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // C0.d0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.get(key);
    }

    @Override // C0.d0
    public final String b() {
        String name = this.f1002n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // C0.d0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // C0.d0
    public final void e(Bundle bundle, String key, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f1002n.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.f1002n, ((a0) obj).f1002n);
    }

    public final int hashCode() {
        return this.f1002n.hashCode();
    }
}
