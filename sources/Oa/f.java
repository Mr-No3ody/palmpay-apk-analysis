package Oa;

import C0.G;
import N8.C0463g;
import Nc.x;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrowseCountdownView f6692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BrowseCountdownView browseCountdownView, Continuation continuation) {
        super(2, continuation);
        this.f6692a = browseCountdownView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f6692a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((f) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        BrowseCountdownView browseCountdownView = this.f6692a;
        if (!browseCountdownView.f28109e) {
            TextView tv_browse_second = browseCountdownView.getTv_browse_second();
            SpanUtils foregroundColor = G.i("Finished").setForegroundColor(browseCountdownView.getContext().getColor(L6.b.ppColorPrimary));
            Context context = browseCountdownView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_ArrowRight);
            iconicsDrawable.a(new C0463g(browseCountdownView, 8));
            tv_browse_second.setText(foregroundColor.appendImage(iconicsDrawable).create());
            browseCountdownView.setOnClickListener(new x(browseCountdownView, 3));
            if (BaseApplication.hasLogin() || TextUtils.isEmpty(browseCountdownView.f28111g)) {
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(browseCountdownView);
                p042cg.f fVar = I.f10809a;
                browseCountdownView.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new e(browseCountdownView, null), 2));
            }
        }
        return Unit.f38893a;
    }
}
