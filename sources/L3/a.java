package L3;

import K3.j;
import K3.k;
import K3.l;
import K3.m;
import K3.n;
import com.flexibank.sdk.base.FlexiBankLoadingDialogHost;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankLoadingDialogHost f5539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f5541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f5542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f5543f;

    public /* synthetic */ a(boolean z3, G9.j jVar, FlexiBankLoadingDialogHost flexiBankLoadingDialogHost, boolean z8, Function2 function2, j jVar2, Function1 function1) {
        this.f5538a = z3;
        this.f5539b = flexiBankLoadingDialogHost;
        this.f5540c = z8;
        this.f5541d = function2;
        this.f5542e = jVar2;
        this.f5543f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n it = (n) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof l;
        boolean z8 = this.f5538a;
        FlexiBankLoadingDialogHost flexiBankLoadingDialogHost = this.f5539b;
        boolean z10 = this.f5540c;
        if (z3) {
            if (z8 && Boolean.TRUE.booleanValue()) {
                flexiBankLoadingDialogHost.showLoadingDialog(true, z10);
            }
        } else if (it instanceof m) {
            if (z8 && Boolean.TRUE.booleanValue()) {
                flexiBankLoadingDialogHost.showLoadingDialog(false, z10);
            }
            this.f5541d.invoke(this.f5542e.f4932m, ((m) it).f4935a);
        } else {
            if (!(it instanceof k)) {
                throw new p355xf.l();
            }
            if (z8 && Boolean.TRUE.booleanValue()) {
                flexiBankLoadingDialogHost.showLoadingDialog(false, z10);
            }
            this.f5543f.invoke(((k) it).f4933a);
        }
        return Unit.f38893a;
    }
}
