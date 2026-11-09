package p176lg;

import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p133ig.e;
import p133ig.g;
import p133ig.h;
import p162kg.C1810b;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f39374b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39375c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1810b f39376a;

    public f() {
        l elementSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        l element = l.f39385a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        e elementDesc = l.f39386b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f39376a = new C1810b(elementDesc);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f39376a.getClass();
        return z.f38935a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        return this.f39376a.getElementAnnotations(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return this.f39376a.getElementDescriptor(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f39376a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        this.f39376a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        this.f39376a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        this.f39376a.getClass();
        return h.f37623b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return f39375c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        this.f39376a.isElementOptional(i7);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f39376a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        this.f39376a.getClass();
        return false;
    }
}
