package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Bc.C0106c;
import C0.G;
import G7.j;
import J1.g;
import N8.q0;
import Pa.C0522t;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.bean.CoinRainConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.CoinRainNewView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p183m6.n;
import p189me.jessyan.autosize.internal.CancelAdapt;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/coin_rain_page")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/CoinRainActivity;", "Lcom/transsnet/palmpay/core/base/h;", "Landroid/view/View$OnClickListener;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "msg", "onCoinRainFinishMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoinRainActivity extends h implements View.OnClickListener, CancelAdapt {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f34450i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatorSet f34452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f34453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34454d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CoinRainConfig f34456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0106c f34457g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(a aVar, Context context, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            if ((i7 & 8) != 0) {
                str3 = null;
            }
            aVar.start(context, str, str2, str3);
        }

        @NotNull
        public final String getCoinRainSpKey() {
            return BaseApplication.hasLogin() ? q0.j(G.k(), "main_sp_keyRainPageLastShowTime") : "main_sp_keyRainPageLastShowTime";
        }

        @JvmStatic
        public final void start(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intent intentPutExtra = new Intent(context, (Class<?>) CoinRainActivity.class).putExtra("extra_data", str).putExtra("extra_id", str2).putExtra("extra_data_1", str3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            if (context != null) {
                context.startActivity(intentPutExtra);
            }
        }

        private a() {
        }
    }

    public static File m(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(Od.h.f6817c.getUnZipDir(str), str2);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_coin_rain, (ViewGroup) null, false);
        int i7 = e.acr_countDownArea;
        Group group = (Group) p059e1.a.m(i7, viewInflate);
        if (group != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i7 = e.acr_time_remain;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = e.ivBg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                if (appCompatImageView != null) {
                    i7 = e.ivFinger;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = e.ivPreview;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView2 != null) {
                            i7 = e.ivTitle;
                            ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView3 != null) {
                                i7 = e.tvCount;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = e.tvCountDown;
                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView3 != null) {
                                        i7 = e.tvSkip;
                                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView4 != null) {
                                            i7 = e.viewCoinRain;
                                            CoinRainNewView coinRainNewView = (CoinRainNewView) p059e1.a.m(i7, viewInflate);
                                            if (coinRainNewView != null) {
                                                C0106c c0106c = new C0106c(constraintLayout, group, textView, appCompatImageView, imageView, imageView2, imageView3, textView2, textView3, textView4, coinRainNewView);
                                                this.f34457g = c0106c;
                                                return c0106c;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n() {
        CoinRainConfig coinRainConfig = this.f34456f;
        if (TextUtils.isEmpty(coinRainConfig != null ? coinRainConfig.androidSkipLink : null)) {
            i0.H(null);
            finish();
            return;
        }
        CoinRainConfig coinRainConfig2 = this.f34456f;
        if (TextUtils.isEmpty(coinRainConfig2 != null ? coinRainConfig2.skipLinkTo : null)) {
            CoinRainConfig coinRainConfig3 = this.f34456f;
            ActivityUtils.startActivity(F.a(this, coinRainConfig3 != null ? coinRainConfig3.androidSkipLink : null));
        } else {
            CoinRainConfig coinRainConfig4 = this.f34456f;
            F.f(coinRainConfig4 != null ? coinRainConfig4.androidSkipLink : null, coinRainConfig4 != null ? coinRainConfig4.skipLinkTo : null, null);
        }
        finish();
    }

    public final void o() {
        ImageView imageView;
        AnimatorSet animatorSet = this.f34453c;
        if (animatorSet != null) {
            animatorSet.cancel();
            animatorSet.removeAllListeners();
            C0106c c0106c = this.f34457g;
            if (c0106c != null && (imageView = (ImageView) c0106c.f670c) != null) {
                imageView.setTranslationX(0.0f);
                imageView.setTranslationY(0.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            }
        }
        this.f34453c = null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("PalmPay_GiftRain_Close");
        CoinRainConfig coinRainConfig = this.f34456f;
        n0VarG.k(clickEvent.add("activity_code", coinRainConfig != null ? coinRainConfig.multiActivityCode : null));
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        if (v3.getId() == e.tvSkip) {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("PalmPay_GiftRain_Close");
            CoinRainConfig coinRainConfig = this.f34456f;
            n0VarG.k(clickEvent.add("activity_code", coinRainConfig != null ? coinRainConfig.multiActivityCode : null));
            if (r0.U0()) {
                return;
            }
            n();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoinRainFinishMessage(@Nullable MessageEvent msg) {
        if (msg != null && msg.getEventType() == 393) {
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        C0106c c0106c;
        ValueAnimator valueAnimator;
        super.onDestroy();
        o();
        C0106c c0106c2 = this.f34457g;
        if (c0106c2 == null) {
            c0106c = this.f34457g;
            if (c0106c != null && (valueAnimator = ((CoinRainNewView) c0106c.t).t) != null) {
                valueAnimator.cancel();
            }
        } else {
            ValueAnimator valueAnimator2 = ((CoinRainNewView) c0106c2.t).t;
            if (!(valueAnimator2 == null ? false : valueAnimator2.isRunning())) {
                c0106c = this.f34457g;
                if (c0106c != null) {
                    valueAnimator.cancel();
                }
            }
        }
        AnimatorSet animatorSet = this.f34452b;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34452b = null;
        }
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        C0106c c0106c = this.f34457g;
        if (c0106c != null) {
            ValueAnimator valueAnimator = ((CoinRainNewView) c0106c.t).t;
            if (valueAnimator == null ? false : valueAnimator.isRunning()) {
                return;
            }
        }
        if (!this.f34455e) {
            this.f34455e = true;
            C0106c c0106c2 = this.f34457g;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0106c2 != null ? (TextView) c0106c2.f673f : null, ViewProps.SCALE_X, 1.0f, 0.6f);
            C0106c c0106c3 = this.f34457g;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0106c3 != null ? (TextView) c0106c3.f673f : null, ViewProps.SCALE_Y, 1.0f, 0.6f);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(2);
            objectAnimatorOfFloat2.setRepeatCount(2);
            objectAnimatorOfFloat.addListener(new j(this, 10));
            AnimatorSet animatorSet = new AnimatorSet();
            this.f34452b = animatorSet;
            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
            if (builderPlay != null) {
                builderPlay.with(objectAnimatorOfFloat2);
            }
            AnimatorSet animatorSet2 = this.f34452b;
            if (animatorSet2 != null) {
                animatorSet2.setStartDelay(1000L);
            }
            AnimatorSet animatorSet3 = this.f34452b;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
        C0106c c0106c4 = this.f34457g;
        if (c0106c4 != null) {
            ImageView imageView = (ImageView) c0106c4.f670c;
            o();
            float fApplyDimension = TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
            float fApplyDimension2 = TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
            imageView.getX();
            imageView.getY();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "translationX", fApplyDimension, 0.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "translationY", fApplyDimension2, 0.0f);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, ViewProps.SCALE_X, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView, ViewProps.SCALE_Y, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.9f);
            objectAnimatorOfFloat3.setDuration(500L);
            objectAnimatorOfFloat4.setDuration(500L);
            objectAnimatorOfFloat5.setDuration(500L);
            objectAnimatorOfFloat6.setDuration(500L);
            objectAnimatorOfFloat7.setDuration(500L);
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
            objectAnimatorOfFloat4.setInterpolator(accelerateDecelerateInterpolator);
            objectAnimatorOfFloat5.setInterpolator(accelerateDecelerateInterpolator);
            objectAnimatorOfFloat6.setInterpolator(accelerateDecelerateInterpolator);
            objectAnimatorOfFloat7.setInterpolator(accelerateDecelerateInterpolator);
            objectAnimatorOfFloat3.setRepeatMode(2);
            objectAnimatorOfFloat3.setRepeatCount(-1);
            objectAnimatorOfFloat4.setRepeatMode(2);
            objectAnimatorOfFloat4.setRepeatCount(-1);
            objectAnimatorOfFloat5.setRepeatMode(2);
            objectAnimatorOfFloat5.setRepeatCount(-1);
            objectAnimatorOfFloat6.setRepeatMode(2);
            objectAnimatorOfFloat6.setRepeatCount(-1);
            objectAnimatorOfFloat7.setRepeatMode(2);
            objectAnimatorOfFloat7.setRepeatCount(-1);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
            this.f34453c = animatorSet4;
            animatorSet4.start();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n0 n0VarG = n0.g();
        ViewEvent viewEvent = new ViewEvent("PalmPay_GiftRain_Exposure");
        CoinRainConfig coinRainConfig = this.f34456f;
        n0VarG.u(viewEvent.add("activity_code", coinRainConfig != null ? coinRainConfig.multiActivityCode : null));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        List<String> list;
        C0106c c0106c;
        C0106c c0106c2;
        C0106c c0106c3;
        String stringExtra;
        Uri uriFromFile;
        Uri uriFromFile2;
        Uri uriFromFile3;
        Uri uriFromFile4;
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("extra_id")) != null) {
            C0525w c0525wF = C0525w.f();
            Intent intent2 = getIntent();
            String stringExtra2 = intent2 != null ? intent2.getStringExtra("extra_data_1") : null;
            c0525wF.getClass();
            CoinRainConfig coinRainConfig = (CoinRainConfig) C0525w.d(stringExtra2, CoinRainConfig.class);
            this.f34456f = coinRainConfig;
            if (!TextUtils.isEmpty(coinRainConfig != null ? coinRainConfig.background : null)) {
                C0106c c0106c4 = this.f34457g;
                if (c0106c4 != null) {
                    p220oa.h.s((TextView) c0106c4.f672e, false);
                }
                C0106c c0106c5 = this.f34457g;
                if (c0106c5 != null) {
                    p220oa.h.s((TextView) c0106c5.f674g, false);
                }
                C0106c c0106c6 = this.f34457g;
                if (c0106c6 != null) {
                    p220oa.h.s((ImageView) c0106c6.f671d, false);
                }
                C0106c c0106c7 = this.f34457g;
                if (c0106c7 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) c0106c7.f677o;
                    CoinRainConfig coinRainConfig2 = this.f34456f;
                    try {
                        uriFromFile4 = Uri.fromFile(m(stringExtra, coinRainConfig2 != null ? coinRainConfig2.background : null));
                    } catch (Exception unused) {
                        uriFromFile4 = null;
                    }
                    if (uriFromFile4 != null) {
                        m mVarJ = b.f(appCompatImageView).load(uriFromFile4);
                        mVarJ.T(new C0522t(this, 2), null, mVarJ, g.f4461a);
                    }
                }
            }
            CoinRainConfig coinRainConfig3 = this.f34456f;
            if (!TextUtils.isEmpty(coinRainConfig3 != null ? coinRainConfig3.preview : null)) {
                C0106c c0106c8 = this.f34457g;
                ImageView imageView = c0106c8 != null ? (ImageView) c0106c8.f671d : null;
                CoinRainConfig coinRainConfig4 = this.f34456f;
                try {
                    uriFromFile3 = Uri.fromFile(m(stringExtra, coinRainConfig4 != null ? coinRainConfig4.preview : null));
                } catch (Exception unused2) {
                    uriFromFile3 = null;
                }
                r0.f1(imageView, uriFromFile3);
            }
            CoinRainConfig coinRainConfig5 = this.f34456f;
            if (!TextUtils.isEmpty(coinRainConfig5 != null ? coinRainConfig5.header : null)) {
                C0106c c0106c9 = this.f34457g;
                ImageView imageView2 = c0106c9 != null ? (ImageView) c0106c9.f678p : null;
                CoinRainConfig coinRainConfig6 = this.f34456f;
                try {
                    uriFromFile2 = Uri.fromFile(m(stringExtra, coinRainConfig6 != null ? coinRainConfig6.header : null));
                } catch (Exception unused3) {
                    uriFromFile2 = null;
                }
                r0.f1(imageView2, uriFromFile2);
            }
            CoinRainConfig coinRainConfig7 = this.f34456f;
            if (!TextUtils.isEmpty(coinRainConfig7 != null ? coinRainConfig7.topBgUrl : null)) {
                CoinRainConfig coinRainConfig8 = this.f34456f;
                try {
                    uriFromFile = Uri.fromFile(m(stringExtra, coinRainConfig8 != null ? coinRainConfig8.topBgUrl : null));
                } catch (Exception unused4) {
                    uriFromFile = null;
                }
                f10.f38951a = uriFromFile;
            }
            CoinRainConfig coinRainConfig9 = this.f34456f;
            if (coinRainConfig9 != null) {
                int size = coinRainConfig9.icons.size();
                for (int i7 = 0; i7 < size; i7++) {
                    List<String> list2 = coinRainConfig9.icons;
                    File fileM = m(stringExtra, list2.get(i7));
                    list2.set(i7, fileM != null ? fileM.getPath() : null);
                }
            }
        }
        boolean zB = true;
        if (ScreenUtils.getScreenHeight() <= 1280 && (c0106c3 = this.f34457g) != null) {
            ((TextView) c0106c3.f673f).setTextSize(1, 210.0f);
        }
        if ("Infinix X603".equals(Build.MODEL) && "Infinix".equals(Build.BRAND) && (c0106c2 = this.f34457g) != null) {
            ((TextView) c0106c2.f673f).setTextSize(0, ScreenUtils.getScreenHeight() / 3);
        }
        try {
            zB = n.f39523a.instance().b("featureCoinRainClickAnimation", true);
        } catch (Exception unused5) {
        }
        C0106c c0106c10 = this.f34457g;
        if (c0106c10 != null) {
            ((CoinRainNewView) c0106c10.t).setEnableClickFeedback(zB);
        }
        CoinRainConfig coinRainConfig10 = this.f34456f;
        if (coinRainConfig10 != null && (list = coinRainConfig10.icons) != null && (c0106c = this.f34457g) != null) {
            ((CoinRainNewView) c0106c.t).setCoinIcons(list);
        }
        C0106c c0106c11 = this.f34457g;
        if (c0106c11 != null) {
            ((CoinRainNewView) c0106c11.t).setCallback(new com.transsnet.palmpay.ui.activity.a(this, f10));
        }
        C0106c c0106c12 = this.f34457g;
        if (c0106c12 != null) {
            ((TextView) c0106c12.f674g).setOnClickListener(this);
        }
        c.b().j(this);
        Intent intent3 = getIntent();
        String stringExtra3 = intent3 != null ? intent3.getStringExtra("extra_data") : null;
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = f34450i.getCoinRainSpKey();
        }
        if (stringExtra3 == null || TextUtils.isEmpty(stringExtra3)) {
            return;
        }
        p059e1.a.V(System.currentTimeMillis(), stringExtra3);
    }
}
