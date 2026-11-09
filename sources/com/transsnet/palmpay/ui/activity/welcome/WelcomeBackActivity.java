package com.transsnet.palmpay.ui.activity.welcome;

import Ac.e;
import Ac.f;
import Bc.C0105b;
import Hb.w;
import Pa.n0;
import Pa.r0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p141j9.s;
import p220oa.h;
import p287se.d;
import p313ue.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/welcome_back")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/welcome/WelcomeBackActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/ui/activity/welcome/WelcomeBackViewModel;", "<init>", "()V", "a", "N2/a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWelcomeBackActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeBackActivity.kt\ncom/transsnet/palmpay/ui/activity/welcome/WelcomeBackActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,286:1\n115#2,8:287\n145#2:295\n*S KotlinDebug\n*F\n+ 1 WelcomeBackActivity.kt\ncom/transsnet/palmpay/ui/activity/welcome/WelcomeBackActivity\n*L\n84#1:287,8\n84#1:295\n*E\n"})
public final class WelcomeBackActivity extends BaseMvvmActivity<WelcomeBackViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f35031o = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f35032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f35033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p313ue.a f35034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p313ue.a f35035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P8.a f35036g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f35037i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0105b f35038j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) WelcomeBackActivity.class));
        }

        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ue.a] */
    public WelcomeBackActivity() {
        final int i7 = 0;
        this.f35034e = new Runnable(this) { // from class: ue.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeBackActivity f42990b;

            {
                this.f42990b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        AnimatorSet animatorSet = this.f42990b.f35032c;
                        if (animatorSet != null) {
                            animatorSet.start();
                        }
                        break;
                    default:
                        AnimatorSet animatorSet2 = this.f42990b.f35033d;
                        if (animatorSet2 != null) {
                            animatorSet2.start();
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f35035f = new Runnable(this) { // from class: ue.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeBackActivity f42990b;

            {
                this.f42990b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        AnimatorSet animatorSet = this.f42990b.f35032c;
                        if (animatorSet != null) {
                            animatorSet.start();
                        }
                        break;
                    default:
                        AnimatorSet animatorSet2 = this.f42990b.f35033d;
                        if (animatorSet2 != null) {
                            animatorSet2.start();
                        }
                        break;
                }
            }
        };
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_welcome_back, (ViewGroup) null, false);
        int i7 = e.barrier;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.couponView;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = e.ivBg;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = e.ivNote;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView2 != null) {
                        i7 = e.ll_rewards;
                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            i7 = e.offeringRv;
                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                            if (recyclerView != null) {
                                i7 = e.titleBar;
                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                    C0105b c0105b = new C0105b((NestedScrollView) viewInflate, linearLayout, imageView, imageView2, linearLayout2, recyclerView);
                                    this.f35038j = c0105b;
                                    return c0105b;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final AnimatorSet m(ImageView imageView, Runnable runnable) {
        if (imageView == null) {
            return null;
        }
        h.s(imageView, true);
        float translationX = imageView.getTranslationX();
        float translationY = imageView.getTranslationY();
        float fDp2px = SizeUtils.dp2px(5.0f);
        float f10 = translationX - fDp2px;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", translationX, f10, translationX, f10, translationX);
        float f11 = translationY - fDp2px;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "translationY", translationY, f11, translationY, f11, translationY);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
        if (builderPlay != null) {
            builderPlay.with(objectAnimatorOfFloat);
        }
        animatorSet.setDuration(1330L);
        animatorSet.start();
        animatorSet.addListener(new w(4, this, runnable));
        return animatorSet;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        n0.g().l("olduserPagebackClick");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        AnimatorSet animatorSet = this.f35032c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f35032c = null;
        AnimatorSet animatorSet2 = this.f35033d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f35033d = null;
        Handler handler = this.f35037i;
        handler.removeCallbacks(this.f35034e);
        handler.removeCallbacks(this.f35035f);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        WelcomeBackViewModel welcomeBackViewModel = (WelcomeBackViewModel) l();
        welcomeBackViewModel.getClass();
        p140j8.f.s(welcomeBackViewModel, new b(1, null), welcomeBackViewModel.f35039e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        l lVar = ((WelcomeBackViewModel) l()).f35039e;
        if (lVar != null) {
            lVar.e(this, new s(new V8.w(this, 27), (byte) 0, (byte) 0));
        }
        C0105b c0105b = this.f35038j;
        r0.l1(r0.y0("main_welcome_back_notice.webp"), c0105b != null ? (ImageView) c0105b.f665e : null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        requestLayoutFullScreen();
        P8.a aVar = new P8.a(7);
        this.f35036g = aVar;
        aVar.addChildClickViewIds(e.btnGo);
        P8.a aVar2 = this.f35036g;
        if (aVar2 != null) {
            aVar2.setOnItemChildClickListener(new d(this, 17));
        }
        C0105b c0105b = this.f35038j;
        if (c0105b != null) {
            ((RecyclerView) c0105b.f667g).setNestedScrollingEnabled(false);
        }
        C0105b c0105b2 = this.f35038j;
        if (c0105b2 != null) {
            ((RecyclerView) c0105b2.f667g).setLayoutManager(new LinearLayoutManager(this));
        }
        C0105b c0105b3 = this.f35038j;
        if (c0105b3 != null) {
            ((RecyclerView) c0105b3.f667g).setAdapter(this.f35036g);
        }
        C1548f c1548f = new C1548f(getColor(p.transparent), getResources().getDimensionPixelOffset(q.dp12), getResources().getDimensionPixelOffset(q.dp12), getResources().getDimensionPixelOffset(q.dp12));
        c1548f.f31336e = false;
        C0105b c0105b4 = this.f35038j;
        if (c0105b4 != null) {
            ((RecyclerView) c0105b4.f667g).addItemDecoration(c1548f);
        }
    }
}
