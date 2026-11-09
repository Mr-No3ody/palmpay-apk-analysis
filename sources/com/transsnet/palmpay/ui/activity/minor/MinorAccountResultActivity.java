package com.transsnet.palmpay.ui.activity.minor;

import Ac.e;
import Ac.f;
import Bc.k;
import C0.G;
import Pa.i0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.AppsFlyerProperties;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountResultActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/minor/MinorAccountResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MinorViewModel;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MinorAccountResultActivity extends BaseMvvmActivity<MinorViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34771f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f34774e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startAct$default(a aVar, Context context, int i7, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                i7 = 0;
            }
            aVar.startAct(context, i7, str, str2);
        }

        public final void startAct(@NotNull Context context, int i7, @Nullable String str, @Nullable String str2) {
            context.startActivity(G.e(context, "context", context, MinorAccountResultActivity.class).putExtra("detail_type", i7).putExtra(AppsFlyerProperties.CHANNEL, str).putExtra("desc", str2));
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_minor_result, (ViewGroup) null, false);
        int i7 = e.complete_button;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = e.success_icon;
            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.success_text;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = e.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = e.valid_until;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null) {
                            k kVar = new k((LinearLayout) viewInflate, textView, textView2, ppTitleBar, textView3);
                            this.f34774e = kVar;
                            return kVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        if (this.f34772c != 0) {
            finish();
            return;
        }
        Activity activityS = i0.S("/main/settings");
        if (activityS != null) {
            ActivityUtils.finishToActivity(activityS, false);
        } else {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        if (this.f34774e == null) {
            Intrinsics.n("binding");
            throw null;
        }
        this.f34772c = getIntent().getIntExtra("detail_type", 0);
        k kVar = this.f34774e;
        if (kVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) kVar.f751e).setText(getIntent().getStringExtra(AppsFlyerProperties.CHANNEL));
        String stringExtra = getIntent().getStringExtra("desc");
        this.f34773d = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            k kVar2 = this.f34774e;
            if (kVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ((TextView) kVar2.f752f).setVisibility(0);
            k kVar3 = this.f34774e;
            if (kVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ((TextView) kVar3.f752f).setText(this.f34773d);
        }
        k kVar4 = this.f34774e;
        if (kVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ImageView backImageView = ((PpTitleBar) kVar4.f750d).getBackImageView();
        if (backImageView != null) {
            final int i7 = 0;
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ne.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MinorAccountResultActivity f39950b;

                {
                    this.f39950b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MinorAccountResultActivity minorAccountResultActivity = this.f39950b;
                    switch (i7) {
                        case 0:
                            MinorAccountResultActivity.a aVar = MinorAccountResultActivity.f34771f;
                            minorAccountResultActivity.m();
                            break;
                        default:
                            MinorAccountResultActivity.a aVar2 = MinorAccountResultActivity.f34771f;
                            minorAccountResultActivity.m();
                            break;
                    }
                }
            });
        }
        k kVar5 = this.f34774e;
        if (kVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        final int i10 = 1;
        ((TextView) kVar5.f749c).setOnClickListener(new View.OnClickListener(this) { // from class: ne.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MinorAccountResultActivity f39950b;

            {
                this.f39950b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinorAccountResultActivity minorAccountResultActivity = this.f39950b;
                switch (i10) {
                    case 0:
                        MinorAccountResultActivity.a aVar = MinorAccountResultActivity.f34771f;
                        minorAccountResultActivity.m();
                        break;
                    default:
                        MinorAccountResultActivity.a aVar2 = MinorAccountResultActivity.f34771f;
                        minorAccountResultActivity.m();
                        break;
                }
            }
        });
    }
}
