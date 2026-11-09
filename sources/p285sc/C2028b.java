package p285sc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: sc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2028b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f42205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnCommentListActivity f42206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2028b(Throwable th, Continuation continuation, ReferEarnCommentListActivity referEarnCommentListActivity) {
        super(2, continuation);
        this.f42205a = th;
        this.f42206b = referEarnCommentListActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2028b(this.f42205a, continuation, this.f42206b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2028b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        String strW = b.W(this.f42205a);
        int i7 = ReferEarnCommentListActivity.f31856i;
        ReferEarnCommentListActivity referEarnCommentListActivity = this.f42206b;
        referEarnCommentListActivity.l().c();
        referEarnCommentListActivity.l().setRefreshing(false);
        ToastUtils.showLong(strW, new Object[0]);
        return Unit.f38893a;
    }
}
