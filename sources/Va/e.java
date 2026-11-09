package Va;

import Pa.i0;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.webview.container.PPWebView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.web.PWebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PWebActivity f10235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PWebActivity pWebActivity, Continuation continuation) {
        super(2, continuation);
        this.f10235a = pWebActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f10235a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PWebActivity pWebActivity = this.f10235a;
        if (i0.W(pWebActivity) && !NQEManager.INSTANCE.isNetworkOffline()) {
            NetworkNotConnectView networkNotConnectView = pWebActivity.f28606o;
            if (networkNotConnectView != null) {
                networkNotConnectView.setVisibility(8);
            }
            PPWebView pPWebView = pWebActivity.f28607p;
            if (pPWebView != null) {
                pPWebView.reload();
            }
        }
        return Unit.f38893a;
    }
}
