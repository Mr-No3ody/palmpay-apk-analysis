package p324va;

import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.network.api.MemberApiService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.camera.video.internal.c f43141a;

    static {
        androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(23, false);
        cVar.f14621b = (PayApiService) e.a().f43145a.b(PayApiService.class);
        cVar.f14623d = (AccountApiService) e.a().f43145a.b(AccountApiService.class);
        cVar.f14622c = (MemberApiService) e.a().f43145a.b(MemberApiService.class);
        f43141a = cVar;
    }
}
