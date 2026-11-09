package Va;

import Pa.i0;
import com.transsnet.palmpay.core.web.PWebActivity;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PWebActivity f10238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PWebActivity pWebActivity, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f10238a = pWebActivity;
        this.f10239b = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f10238a, this.f10239b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PWebActivity pWebActivity = this.f10238a;
        if (!i0.W(pWebActivity)) {
            return Unit.f38893a;
        }
        if (this.f10239b) {
            LoadingDialog loadingDialog3 = pWebActivity.f28602f;
            if (loadingDialog3 != null && !loadingDialog3.isShowing() && (loadingDialog2 = pWebActivity.f28602f) != null) {
                loadingDialog2.show();
            }
        } else {
            LoadingDialog loadingDialog4 = pWebActivity.f28602f;
            if (loadingDialog4 != null && loadingDialog4.isShowing() && (loadingDialog = pWebActivity.f28602f) != null) {
                loadingDialog.dismiss();
            }
        }
        return Unit.f38893a;
    }
}
