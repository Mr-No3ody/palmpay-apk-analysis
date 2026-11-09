package p382zb;

import C0.G;
import Ef.a;
import F6.d;
import Ff.h;
import Oc.C;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: renamed from: zb.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2181y extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanHomeFragment f44626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f44627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f44629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f44630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181y(LoanHomeFragment loanHomeFragment, ViewGroup viewGroup, ArrayList arrayList, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f44626b = loanHomeFragment;
        this.f44627c = viewGroup;
        this.f44628d = arrayList;
        this.f44629e = context;
        this.f44630f = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Context context = this.f44629e;
        return new C2181y(this.f44626b, this.f44627c, this.f44628d, context, this.f44630f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2181y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f44625a;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            C2180x c2180x = new C2180x(this.f44629e, this.f44630f, null);
            this.f44625a = 1;
            obj = AbstractC0780y.s(eVar, c2180x, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        Drawable drawable = (Drawable) obj;
        LoanHomeFragment loanHomeFragment = this.f44626b;
        if (!loanHomeFragment.isAdded() || loanHomeFragment.f30352w || loanHomeFragment.f30339A) {
            return Unit.f38893a;
        }
        if (drawable == null) {
            d.h("LoanHomeLoggedFragment", 3, "tryShowPendingOnboarding >>> first image not cached, skip");
            return Unit.f38893a;
        }
        loanHomeFragment.f30339A = true;
        loanHomeFragment.f30352w = true;
        C2177u onCompleted = new C2177u(loanHomeFragment, 4);
        ViewGroup rootView = this.f44627c;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ArrayList urls = this.f44628d;
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Intrinsics.checkNotNullParameter("cs_loan_home_onboarding_overlay", "tag");
        View viewFindViewWithTag = rootView.findViewWithTag("cs_loan_home_onboarding_overlay");
        if (viewFindViewWithTag != null) {
            rootView.removeView(viewFindViewWithTag);
        }
        D d2 = new D();
        FrameLayout frameLayout = new FrameLayout(rootView.getContext());
        frameLayout.setTag("cs_loan_home_onboarding_overlay");
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setElevation(100.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(rootView.getContext());
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(appCompatImageView);
        frameLayout.setOnClickListener(new C(d2, urls, rootView, onCompleted, appCompatImageView, 3));
        rootView.addView(frameLayout);
        r0.r1((String) urls.get(0), appCompatImageView);
        d.h("LoanHomeOnboardingHelper", 3, G.m(urls.size(), "showOverlay >>> count="));
        return Unit.f38893a;
    }
}
