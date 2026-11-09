package p191mg;

import java.util.Set;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p162kg.c0;
import p162kg.f0;
import p162kg.i0;
import p162kg.l0;
import p355xf.A;
import p355xf.D;
import p355xf.H;
import p355xf.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f39757a;

    static {
        Intrinsics.checkNotNullParameter(A.f43945b, "<this>");
        Intrinsics.checkNotNullParameter(D.f43948b, "<this>");
        Intrinsics.checkNotNullParameter(x.f43988b, "<this>");
        Intrinsics.checkNotNullParameter(H.f43952b, "<this>");
        SerialDescriptor[] elements = {f0.f38841b, i0.f38851b, c0.f38831b, l0.f38861b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f39757a = C1847n.A(elements);
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f39757a.contains(serialDescriptor);
    }
}
