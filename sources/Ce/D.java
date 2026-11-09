package Ce;

import Wf.AbstractC0780y;
import android.content.Context;
import android.content.DialogInterface;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.dialog.HomepageClipboardTransferDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f1412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f1413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ClipboardMatchInfoResp f1414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(HomeFragmentHomeTab homeFragmentHomeTab, HomeActivity homeActivity, Context context, ClipboardMatchInfoResp clipboardMatchInfoResp, String str, Context context2, Continuation continuation) {
        super(2, continuation);
        this.f1411b = homeFragmentHomeTab;
        this.f1412c = homeActivity;
        this.f1413d = context;
        this.f1414e = clipboardMatchInfoResp;
        this.f1415f = str;
        this.f1416g = context2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new D(this.f1411b, this.f1412c, this.f1413d, this.f1414e, this.f1415f, this.f1416g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1410a;
        final String str = this.f1415f;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            C c6 = new C(this.f1416g, str, null);
            this.f1410a = 1;
            obj = AbstractC0780y.s(eVar, c6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int i10 = HomeFragmentHomeTab.f35093A0;
            final HomeFragmentHomeTab homeFragmentHomeTab = this.f1411b;
            final HomeActivity homeActivity = this.f1412c;
            if (homeFragmentHomeTab.A(homeActivity)) {
                final HomepageClipboardTransferDialog homepageClipboardTransferDialog = new HomepageClipboardTransferDialog(this.f1413d, this.f1414e, str, new C0181x(homeFragmentHomeTab, str));
                final Context context = this.f1416g;
                homepageClipboardTransferDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Ce.y
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        HomeFragmentHomeTab homeFragmentHomeTab2 = homeFragmentHomeTab;
                        AbstractC0780y.m(androidx.lifecycle.V.f(homeFragmentHomeTab2), null, null, new B(homepageClipboardTransferDialog, homeFragmentHomeTab2, homeActivity, context, str, null), 3);
                    }
                });
                homeActivity.p().showDialog(homepageClipboardTransferDialog, HomeDialogState.PRIORITY_HIGHEST_111);
                return Unit.f38893a;
            }
        }
        return Unit.f38893a;
    }
}
