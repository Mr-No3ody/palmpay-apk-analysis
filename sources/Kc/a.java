package Kc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4995a;

    static {
        c cVar = new c();
        Object objB = p324va.e.a().f43145a.b(ManageApiService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        cVar.f4997a = (ManageApiService) objB;
        f4995a = cVar;
    }
}
