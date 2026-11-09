package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.ui.dialog.RefundInAdvanceDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import p159kd.d;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public class RefundInAdvanceDialog extends b {
    private ImageView mBg;
    private ImageView mCloseBtn;
    private Context mContext;
    private Listener mListener;

    public interface Listener {
        void click();
    }

    public RefundInAdvanceDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
        Listener listener = this.mListener;
        if (listener != null) {
            listener.click();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        dismiss();
    }

    private void renderWindow() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_refund_in_advance_dialog_layout);
        renderWindow();
        this.mBg = (ImageView) findViewById(e.sm_bg);
        this.mCloseBtn = (ImageView) findViewById(e.sm_close);
        r0.h1(this.mBg, r0.y0("/sm_refund_ia_dialog.png"), d.sm_refund_ia_dialog);
        final int i7 = 0;
        this.mBg.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefundInAdvanceDialog f190b;

            {
                this.f190b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f190b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f190b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.mCloseBtn.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefundInAdvanceDialog f190b;

            {
                this.f190b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f190b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f190b.lambda$initViews$1(view);
                        break;
                }
            }
        });
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public RefundInAdvanceDialog(Context context, int i7) {
        super(context, i7);
        this.mContext = context;
    }

    public RefundInAdvanceDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mContext = context;
    }
}
