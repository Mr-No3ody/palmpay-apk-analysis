package p162kg;

import N8.q0;
import androidx.camera.camera2.internal.F;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p133ig.g;
import p133ig.h;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f38778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f38779b;

    public B(SerialDescriptor keyDesc, SerialDescriptor valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f38778a = keyDesc;
        this.f38779b = valueDesc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        b7.getClass();
        return Intrinsics.c(this.f38778a, b7.f38778a) && Intrinsics.c(this.f38779b, b7.f38779b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return z.f38935a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        if (i7 >= 0) {
            return z.f38935a;
        }
        throw new IllegalArgumentException(F.c(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(F.c(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i7 % 2;
        if (i10 == 0) {
            return this.f38778a;
        }
        if (i10 == 1) {
            return this.f38779b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(q0.j(name, " is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return h.f37624c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final int hashCode() {
        return this.f38779b.hashCode() + ((this.f38778a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(F.c(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f38778a + ", " + this.f38779b + ')';
    }
}
