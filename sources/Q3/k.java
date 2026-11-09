package Q3;

import Nc.x;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.flexibank.sdk.s;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p215o4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f7618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f7619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f7620g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f7621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f7622j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f7623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Sd.b f7624p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FlexiBankPayVerificationActivity context) {
        super(context, 0, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.f7618e = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
        final int i10 = 1;
        this.f7619f = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
        final int i11 = 2;
        this.f7620g = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
        final int i12 = 3;
        this.f7621i = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
        final int i13 = 4;
        this.f7622j = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
        final int i14 = 5;
        this.f7623o = C2131j.b(new Function0(this) { // from class: Q3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f7617b;

            {
                this.f7617b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return (TextView) this.f7617b.findViewById(p.fb_tvReward);
                    case 1:
                        return (PpButton) this.f7617b.findViewById(p.fb_cdpr_confirm_tv);
                    case 2:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_cancel_tv);
                    case 3:
                        return (ImageView) this.f7617b.findViewById(p.fb_cdpr_iv);
                    case 4:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_content_tv);
                    default:
                        return (TextView) this.f7617b.findViewById(p.fb_cdpr_title_tv);
                }
            }
        });
    }

    @Override // p215o4.b
    public final void a() {
        setContentView(q.fb_dialog_payment_reward);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        if (window != null) {
            window.setWindowAnimations(s.fb_dialog_bottom_in_out);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(30.0f);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        x xVar = new x(this, 14);
        Object value = this.f7620g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setOnClickListener(xVar);
        Object value2 = this.f7619f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpButton) value2).setOnClickListener(xVar);
        Object value3 = this.f7623o.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(System.currentTimeMillis() % ((long) 2) == 0 ? r.fb_payment_not_complete : r.fb_dont_miss_out);
        setCanceledOnTouchOutside(false);
    }
}
