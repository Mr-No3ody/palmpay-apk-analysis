package C0;

import kotlin.Unit;
import kotlin.collections.C1843j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124p extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0130w f1076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1843j f1078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124p(kotlin.jvm.internal.B b7, kotlin.jvm.internal.B b10, AbstractC0130w abstractC0130w, boolean z3, C1843j c1843j) {
        super(1);
        this.f1074a = b7;
        this.f1075b = b10;
        this.f1076c = abstractC0130w;
        this.f1077d = z3;
        this.f1078e = c1843j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0119k entry = (C0119k) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f1074a.f38947a = true;
        this.f1075b.f38947a = true;
        this.f1076c.m(entry, this.f1077d, this.f1078e);
        return Unit.f38893a;
    }
}
