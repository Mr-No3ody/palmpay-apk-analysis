package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import Pa.r0;
import Sc.e;
import V9.q;
import Wc.c;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayBalancePaymentDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.ScreenUtils;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
public class PayBalancePaymentDialog extends b {
    private TextView mAgentNameTx;
    private TextView mBookedAmountTx;
    private TextView mBookingDepositTx;
    private ImageView mCloseBtn;
    private PayByNoticeDialog.CloseListener mCloseListener;
    private final Context mContext;
    private View mFreeV;
    private CardView mFundBtn;
    private Listener mListener;
    private P2PButton mPayBtn;
    private TextView mPaymentMethodNameTx;
    private final c mW;

    public interface CloseListener {
        void onClose();
    }

    public interface Listener {
        void onClick();
    }

    public PayBalancePaymentDialog(Context context) {
        super(context);
        this.mW = new c();
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
        setContentView(Sc.c.p2p_pay_balance_payment_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(Sc.b.p2p_close);
        this.mAgentNameTx = (TextView) findViewById(Sc.b.p2p_agent_name);
        this.mBookedAmountTx = (TextView) findViewById(Sc.b.p2p_booked_amount);
        this.mBookingDepositTx = (TextView) findViewById(Sc.b.p2p_booking_deposit);
        this.mPaymentMethodNameTx = (TextView) findViewById(Sc.b.p2p_payment_name);
        this.mFreeV = findViewById(Sc.b.p2p_free);
        this.mPayBtn = (P2PButton) findViewById(Sc.b.p2p_pay);
        this.mFundBtn = (CardView) findViewById(Sc.b.p2p_fund);
        final int i7 = 0;
        this.mCloseBtn.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBalancePaymentDialog f10671b;

            {
                this.f10671b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f10671b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f10671b.lambda$initViews$2(view);
                        break;
                }
            }
        });
        this.mPayBtn.setOnP2PButtonClickListener(new q(this, 11));
        final int i10 = 1;
        this.mFundBtn.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBalancePaymentDialog f10671b;

            {
                this.f10671b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f10671b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f10671b.lambda$initViews$2(view);
                        break;
                }
            }
        });
    }

    public void setAgentName(String str) {
        this.mAgentNameTx.setText(str);
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

    public void setBookedAmount(long j6) {
        this.mBookedAmountTx.setText(r0.B(j6, false));
    }

    public void setCloseListener(PayByNoticeDialog.CloseListener closeListener) {
        this.mCloseListener = closeListener;
    }

    public void setDepositAmount(long j6) {
        this.mBookingDepositTx.setText(r0.B(j6, false));
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void setPayBtnTxT(long j6, long j10) {
        this.mPayBtn.setText("Pay " + r0.B(j10, false));
        if (j10 > j6) {
            this.mPayBtn.setStatus(2);
        } else {
            this.mPayBtn.setStatus(1);
        }
    }

    public PayBalancePaymentDialog(Context context, int i7) {
        super(context, i7);
        this.mW = new c();
        this.mContext = context;
    }

    public PayBalancePaymentDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mW = new c();
        this.mContext = context;
    }
}
