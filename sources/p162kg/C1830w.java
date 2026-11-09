package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: kg.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1830w extends N {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f38884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830w(String name, C1831x generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f38884l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p162kg.N
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1830w) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f38800a.equals(serialDescriptor.getSerialName())) {
                C1830w c1830w = (C1830w) obj;
                if (c1830w.f38884l && Arrays.equals((SerialDescriptor[]) this.f38809j.getValue(), (SerialDescriptor[]) c1830w.f38809j.getValue())) {
                    int elementsCount = serialDescriptor.getElementsCount();
                    int i7 = this.f38802c;
                    if (i7 == elementsCount) {
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (Intrinsics.c(getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) && Intrinsics.c(getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p162kg.N
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p162kg.N, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f38884l;
    }
}
