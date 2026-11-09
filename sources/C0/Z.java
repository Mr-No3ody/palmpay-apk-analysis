package C0;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Parcelable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }
        try {
            this.f999n = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // C0.d0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // C0.d0
    public final String b() {
        String name = this.f999n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // C0.d0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // C0.d0
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f999n.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Z.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.c(this.f999n, ((Z) obj).f999n);
    }

    public final int hashCode() {
        return this.f999n.hashCode();
    }
}
