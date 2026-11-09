package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f38811b = primitive.getSerialName() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.f38811b;
    }
}
