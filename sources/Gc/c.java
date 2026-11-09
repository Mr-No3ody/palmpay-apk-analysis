package Gc;

import com.transsnet.palmpay.mall.api.MallApiService;
import kotlin.jvm.internal.Intrinsics;
import p324va.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3323b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallApiService f3324a;

    public c() {
        Object objB = e.a().f43145a.b(MallApiService.class);
        Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
        this.f3324a = (MallApiService) objB;
    }
}
