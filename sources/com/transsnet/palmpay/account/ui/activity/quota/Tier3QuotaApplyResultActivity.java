package com.transsnet.palmpay.account.ui.activity.quota;

import Bc.f;
import C0.G;
import F8.d;
import F8.e;
import L6.b;
import Nc.x;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/quota/Tier3QuotaApplyResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Tier3QuotaApplyResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26089b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f26090a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(a aVar, Context context, boolean z3, long j6, String str, int i7, Object obj) {
            if ((i7 & 8) != 0) {
                str = null;
            }
            aVar.start(context, z3, j6, str);
        }

        @JvmStatic
        public final void start(@NotNull Context context, boolean z3, long j6, @Nullable String str) {
            Intent intentPutExtra = G.e(context, "context", context, Tier3QuotaApplyResultActivity.class).putExtra("extra_result", z3).putExtra("extra_amount", j6).putExtra("extra_message", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            context.startActivity(intentPutExtra);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_tier3_quota_apply_result, (ViewGroup) null, false);
        int i7 = d.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.ivIcon;
            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = d.tvAmount;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.tvMsg;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = d.tvMsg2;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null) {
                            i7 = d.tvState;
                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView4 != null) {
                                i7 = d.viewLimit;
                                CardView cardView = (CardView) p059e1.a.m(i7, viewInflate);
                                if (cardView != null) {
                                    f fVar = new f((LinearLayout) viewInflate, ppButton, imageView, textView, textView2, textView3, textView4, cardView, 4);
                                    this.f26090a = fVar;
                                    return fVar;
                                }
                            }
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("extra_result", false);
            f fVar = this.f26090a;
            if (fVar != null) {
                h.s((CardView) fVar.f696b, booleanExtra);
            }
            if (booleanExtra) {
                f fVar2 = this.f26090a;
                if (fVar2 != null) {
                    ((TextView) fVar2.f703j).setText("Successful");
                }
                f fVar3 = this.f26090a;
                if (fVar3 != null) {
                    ((TextView) fVar3.f701g).setText("The new transaction limit has been set successfully.");
                }
                f fVar4 = this.f26090a;
                if (fVar4 != null) {
                    ((ImageView) fVar4.f699e).setImageResource(r.cv_result_success);
                }
                f fVar5 = this.f26090a;
                if (fVar5 != null) {
                    ((TextView) fVar5.f700f).setText(r0.F(getIntent().getLongExtra("extra_amount", 0L)));
                }
                f fVar6 = this.f26090a;
                r0.R1(fVar6 != null ? (TextView) fVar6.f700f : null, "fonts/PalmPayNum-Bold.ttf");
            } else {
                f fVar7 = this.f26090a;
                if (fVar7 != null) {
                    ((TextView) fVar7.f703j).setText("Failed");
                }
                f fVar8 = this.f26090a;
                if (fVar8 != null) {
                    ((TextView) fVar8.f701g).setText(intent.getStringExtra("extra_message"));
                }
                f fVar9 = this.f26090a;
                if (fVar9 != null) {
                    ((ImageView) fVar9.f699e).setImageResource(r.cv_result_fail);
                }
            }
            f fVar10 = this.f26090a;
            if (fVar10 != null) {
                ((PpButton) fVar10.f698d).setOnClickListener(new x(this, 1));
            }
        }
    }
}
