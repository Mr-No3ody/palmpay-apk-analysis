package p162kg;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import p133ig.g;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f38816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f38818c;

    public U(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f38816a = original;
        this.f38817b = original.getSerialName() + '?';
        this.f38818c = L.b(original);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof U) {
            return Intrinsics.c(this.f38816a, ((U) obj).f38816a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f38816a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        return this.f38816a.getElementAnnotations(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return this.f38816a.getElementDescriptor(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f38816a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return this.f38816a.getElementName(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.f38816a.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return this.f38816a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.f38817b;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public final Set getSerialNames() {
        return this.f38818c;
    }

    public final int hashCode() {
        return this.f38816a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        return this.f38816a.isElementOptional(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f38816a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38816a);
        sb2.append('?');
        return sb2.toString();
    }
}
