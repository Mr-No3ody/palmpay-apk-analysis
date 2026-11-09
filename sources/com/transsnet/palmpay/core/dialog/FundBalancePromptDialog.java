package com.transsnet.palmpay.core.dialog;

import N8.q0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.dialog.FundBalancePromptDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import java.lang.ref.WeakReference;
import p025ba.l;

/* JADX INFO: loaded from: classes3.dex */
public class FundBalancePromptDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private WeakReference<Activity> mActivity;
    private View mIvClose;
    private TextView mTvAmount;
    private TextView mTvFund;

    public FundBalancePromptDialog(Context context) {
        super(context);
        if (context instanceof Activity) {
            this.mActivity = new WeakReference<>((Activity) context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        if (BaseApplication.isNG()) {
            q0.u("/cashin_out/add_money");
        } else {
            q0.u("/cashin/recharge");
        }
        dismiss();
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_fund_balance);
        this.mIvClose = findViewById(p025ba.e.ivClose);
        this.mTvAmount = (TextView) findViewById(p025ba.e.tvAmount);
        this.mTvFund = (TextView) findViewById(p025ba.e.tvFund);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        final int i7 = 0;
        this.mIvClose.setOnClickListener(new View.OnClickListener(this) { // from class: ma.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundBalancePromptDialog f39601b;

            {
                this.f39601b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f39601b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f39601b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.mTvFund.setOnClickListener(new View.OnClickListener(this) { // from class: ma.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundBalancePromptDialog f39601b;

            {
                this.f39601b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f39601b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f39601b.lambda$initViews$1(view);
                        break;
                }
            }
        });
    }

    public void setAmount(long amount) {
        TextView textView = this.mTvAmount;
        if (textView != null) {
            textView.setText(r0.B(amount, false));
        }
    }

    public FundBalancePromptDialog(Context context, int layoutId) {
        super(context, layoutId);
        if (context instanceof Activity) {
            this.mActivity = new WeakReference<>((Activity) context);
        }
    }

    public FundBalancePromptDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        if (context instanceof Activity) {
            this.mActivity = new WeakReference<>((Activity) context);
        }
    }
}
