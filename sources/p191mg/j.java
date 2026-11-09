package p191mg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p162kg.C1826s;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1826s f39729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39730b;

    public j(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f39729a = new C1826s(descriptor, new i(2, this, j.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
