package com.transsnet.palmpay.ui.activity;

import Ac.e;
import F6.d;
import O6.f;
import Pa.n0;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.tencent.mmkv.MMKV;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.activity.J;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p102ge.K;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/rate_app_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/RateAppActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "RateFragment", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RateAppActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34559c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReviewManager f34560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReviewInfo f34561b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/RateAppActivity$RateFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RateFragment extends DialogFragment implements View.OnClickListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f34562d = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f34563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f34564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f34565c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final RateFragment newInstance() {
                RateFragment rateFragment = new RateFragment();
                rateFragment.setArguments(new Bundle());
                return rateFragment;
            }

            private a() {
            }
        }

        public final void g() {
            E activity;
            dismissAllowingStateLoss();
            if (getActivity() == null || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View v3) {
            Intrinsics.checkNotNullParameter(v3, "v");
            int id2 = v3.getId();
            if (e.rate_tv != id2) {
                if (e.rate_cancel_tv == id2) {
                    p367ya.a.d().f44149a.g(9223372036854775806L, "key_launch_home_count");
                    g();
                    return;
                } else {
                    if (e.ivClose == id2) {
                        g();
                        return;
                    }
                    return;
                }
            }
            n0.g().l("RateuspalmpayClick");
            if (getActivity() == null) {
                d.c("feedbackLog", "feedback: getActivity is null");
                g();
            } else {
                RateAppActivity rateAppActivity = (RateAppActivity) getActivity();
                Task<Void> taskLaunchReviewFlow = null;
                if ((rateAppActivity != null ? rateAppActivity.f34560a : null) == null) {
                    g();
                } else if (rateAppActivity.f34561b != null) {
                    d.c("feedbackLog", "feedback: mReviewInfo start---->");
                    ReviewManager reviewManager = rateAppActivity.f34560a;
                    if (reviewManager != null) {
                        ReviewInfo reviewInfo = rateAppActivity.f34561b;
                        Intrinsics.e(reviewInfo);
                        taskLaunchReviewFlow = reviewManager.launchReviewFlow(rateAppActivity, reviewInfo);
                    }
                    if (taskLaunchReviewFlow != null) {
                        taskLaunchReviewFlow.addOnCompleteListener(new K(this, 0));
                    }
                } else {
                    ReviewManager reviewManagerCreate = ReviewManagerFactory.create(requireContext());
                    Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, "create(...)");
                    Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
                    Intrinsics.checkNotNullExpressionValue(taskRequestReviewFlow, "requestReviewFlow(...)");
                    taskRequestReviewFlow.addOnCompleteListener(new b(8, this, reviewManagerCreate));
                }
            }
            p367ya.a.d().f44149a.f(1, "key_rate_dialog_show_status");
            p367ya.a.d().f44149a.g(9223372036854775806L, "key_launch_home_count");
        }

        @Override // androidx.fragment.app.DialogFragment
        public final Dialog onCreateDialog(Bundle bundle) {
            return new f(requireContext());
        }

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
            Window window;
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(Ac.f.main_fragment_rate_app, viewGroup, false);
            this.f34563a = (ImageView) viewInflate.findViewById(e.ivClose);
            this.f34564b = viewInflate.findViewById(e.rate_tv);
            this.f34565c = (TextView) viewInflate.findViewById(e.rate_cancel_tv);
            ImageView imageView = this.f34563a;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            View view = this.f34564b;
            if (view != null) {
                view.setOnClickListener(this);
            }
            TextView textView = this.f34565c;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.requestFeature(1);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setCanceledOnTouchOutside(false);
            }
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                dialog3.setOnKeyListener(new J(this, 1));
            }
            return viewInflate;
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final void onStart() {
            super.onStart();
            Dialog dialog = getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.width = (int) (ScreenUtils.getScreenWidth() * 0.916f);
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean launch(@Nullable Context context) {
            try {
                long j6 = p367ya.a.d().f44149a.getLong("key_launch_home_count", 0L);
                if (j6 != 44 && j6 != 29 && j6 != 14) {
                    return false;
                }
                p367ya.a aVarD = p367ya.a.d();
                MMKV mmkv = aVarD.f44149a;
                MMKV mmkv2 = aVarD.f44149a;
                if (mmkv.getLong("key_launch_home_count", 0L) < 50) {
                    long j10 = mmkv2.getLong("key_launch_home_count", 0L) + 1;
                    if (j10 < Long.MAX_VALUE) {
                        mmkv2.g(j10, "key_launch_home_count");
                    }
                }
                Intent intent = new Intent(context, (Class<?>) RateAppActivity.class);
                intent.addFlags(268435456);
                if (context == null) {
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        public final void launchRightNow(@Nullable Context context) {
            p367ya.a.d().j();
            try {
                Intent intent = new Intent(context, (Class<?>) RateAppActivity.class);
                intent.addFlags(268435456);
                if (context != null) {
                    context.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        try {
            ReviewManager reviewManagerCreate = ReviewManagerFactory.create(this);
            this.f34560a = reviewManagerCreate;
            Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate != null ? reviewManagerCreate.requestReviewFlow() : null;
            if (taskRequestReviewFlow != null) {
                taskRequestReviewFlow.addOnCompleteListener(new Z(this, 29));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        showDialogFragment(RateFragment.f34562d.newInstance());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public final void setRequestedOrientation(int i7) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(p.transparent_60)));
    }
}
