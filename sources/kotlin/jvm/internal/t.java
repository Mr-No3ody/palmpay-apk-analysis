package kotlin.jvm.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38973a;

    public t(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.f38973a = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return Intrinsics.c(this.f38973a, ((t) obj).f38973a);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.f38973a;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        throw new Mf.a();
    }

    public final int hashCode() {
        return this.f38973a.hashCode();
    }

    public final String toString() {
        return androidx.camera.video.u.o(new StringBuilder(), this.f38973a, " (Kotlin reflection is not available)");
    }
}
