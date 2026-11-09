package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import Pa.r0;
import Sc.c;
import Sc.e;
import V9.q;
import Wc.g;
import Wc.h;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.ScreenUtils;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
public class PayDepositDialog extends b {
    private TextView mAmountTx;
    private ImageView mCloseBtn;
    private PayByNoticeDialog.CloseListener mCloseListener;
    private Context mContext;
    private TextView mDepositTx;
    private View mFreeV;
    private CardView mFundBtn;
    private ImageView mI;
    private Listener mListener;
    private P2PButton mPayBtn;
    private TextView mPaymentMethodNameTx;
    private final h mW;

    public interface CloseListener {
        void onClose();
    }

    public interface Listener {
        void onClick();
    }

    public PayDepositDialog(Context context) {
        super(context);
        this.mW = new h();
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$2(View view) {
        this.mW.getClass();
        ARouter.getInstance().build("/cashin_out/add_money").navigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setNotice$3(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setNotice$4(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }

    private void renderWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
        window.setDimAmount(0.4f);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        PayByNoticeDialog.CloseListener closeListener = this.mCloseListener;
        if (closeListener != null) {
            closeListener.onClose();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.p2p_pay_deposit_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(Sc.b.p2p_close);
        this.mAmountTx = (TextView) findViewById(Sc.b.p2p_deposit_amount);
        this.mPaymentMethodNameTx = (TextView) findViewById(Sc.b.p2p_payment_name);
        this.mFreeV = findViewById(Sc.b.p2p_free);
        this.mPayBtn = (P2PButton) findViewById(Sc.b.p2p_pay);
        this.mFundBtn = (CardView) findViewById(Sc.b.p2p_fund);
        this.mDepositTx = (TextView) findViewById(Sc.b.p2p_booking_deposit);
        this.mI = (ImageView) findViewById(Sc.b.p2p_i);
        final int i7 = 0;
        this.mCloseBtn.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayDepositDialog f10676b;

            {
                this.f10676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f10676b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f10676b.lambda$initViews$2(view);
                        break;
                }
            }
        });
        this.mPayBtn.setOnP2PButtonClickListener(new q(this, 12));
        final int i10 = 1;
        this.mFundBtn.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayDepositDialog f10676b;

            {
                this.f10676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f10676b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f10676b.lambda$initViews$2(view);
                        break;
                }
            }
        });
    }

    public void setAmount(long j6) {
        this.mAmountTx.setText(r0.B(j6, false));
    }

    public void setBalance(long j6, long j10) {
        this.mPaymentMethodNameTx.setText(this.mContext.getString(e.p2p_str_balance_________, r0.B(j6, false)));
        if (j6 < j10) {
            this.mFundBtn.setVisibility(0);
            this.mFreeV.setVisibility(0);
        } else {
            this.mFundBtn.setVisibility(8);
            this.mFreeV.setVisibility(8);
        }
    }

    public void setCloseListener(PayByNoticeDialog.CloseListener closeListener) {
        this.mCloseListener = closeListener;
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setNotice(Runnable runnable) {
        this.mDepositTx.setOnClickListener(new g(runnable, 0));
        this.mI.setOnClickListener(new g(runnable, 1));
    }

    public void setPayBtnTxT(long j6, long j10) {
        this.mPayBtn.setText("Pay " + r0.B(j10, false));
        if (j10 > j6) {
            this.mPayBtn.setStatus(2);
        } else {
            this.mPayBtn.setStatus(1);
        }
    }

    public PayDepositDialog(Context context, int i7) {
        super(context, i7);
        this.mW = new h();
        this.mContext = context;
    }

    public PayDepositDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mW = new h();
        this.mContext = context;
    }
}
