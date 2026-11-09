package C0;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128u extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0130w f1092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f1093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f1094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128u(kotlin.jvm.internal.B b7, AbstractC0130w abstractC0130w, K k2, Bundle bundle) {
        super(1);
        this.f1091a = b7;
        this.f1092b = abstractC0130w;
        this.f1093c = k2;
        this.f1094d = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0119k it = (C0119k) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f1091a.f38947a = true;
        kotlin.collections.z zVar = kotlin.collections.z.f38935a;
        this.f1092b.a(this.f1093c, this.f1094d, it, zVar);
        return Unit.f38893a;
    }
}
