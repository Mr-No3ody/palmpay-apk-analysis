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
public abstract class D implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f38782a;

    public D(SerialDescriptor serialDescriptor) {
        this.f38782a = serialDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        return Intrinsics.c(this.f38782a, d2.f38782a) && Intrinsics.c(getSerialName(), d2.getSerialName());
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
        StringBuilder sbE = F.e(i7, "Illegal index ", ", ");
        sbE.append(getSerialName());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        if (i7 >= 0) {
            return this.f38782a;
        }
        StringBuilder sbE = F.e(i7, "Illegal index ", ", ");
        sbE.append(getSerialName());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(q0.j(name, " is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return h.f37623b;
    }

    public final int hashCode() {
        return getSerialName().hashCode() + (this.f38782a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        if (i7 >= 0) {
            return false;
        }
        StringBuilder sbE = F.e(i7, "Illegal index ", ", ");
        sbE.append(getSerialName());
        sbE.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbE.toString().toString());
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
        return getSerialName() + '(' + this.f38782a + ')';
    }
}
