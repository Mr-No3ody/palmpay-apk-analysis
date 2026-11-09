package p176lg;

import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p133ig.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39387a;

    public m(Function0 function0) {
        this.f39387a = C2131j.b(function0);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.f39387a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return z.f38935a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        return a().getElementAnnotations(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return a().getElementDescriptor(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a().getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        return a().getElementName(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return a().getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return a().getSerialName();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        return a().isElementOptional(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return false;
    }
}
