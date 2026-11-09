package p176lg;

import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p133ig.g;
import p133ig.h;
import p162kg.B;
import p162kg.Z;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f39395b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39396c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f39397a;

    public t() {
        Intrinsics.checkNotNullParameter(J.f38955a, "<this>");
        Z z3 = Z.f38824a;
        l lVar = l.f39385a;
        Z keySerializer = Z.f38824a;
        l vSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "valueSerializer");
        Z kSerializer = Z.f38824a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f39397a = new B(Z.f38825b, vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f39397a.getClass();
        return z.f38935a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i7) {
        return this.f39397a.getElementAnnotations(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i7) {
        return this.f39397a.getElementDescriptor(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f39397a.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i7) {
        this.f39397a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        this.f39397a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final g getKind() {
        this.f39397a.getClass();
        return h.f37624c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return f39396c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i7) {
        this.f39397a.isElementOptional(i7);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f39397a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        this.f39397a.getClass();
        return false;
    }
}
