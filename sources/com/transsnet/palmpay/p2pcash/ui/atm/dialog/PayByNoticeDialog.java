package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import Oc.j;
import Pa.r0;
import Sc.c;
import U8.a;
import Uc.I0;
import Wc.d;
import Wc.e;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.ScreenUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PayByNoticeDialog extends b {
    private TextView mAmountTx;
    private View mChangeLabel;
    private ImageView mCloseBtn;
    private CloseListener mCloseListener;
    private Context mContext;
    private long mEndTickTime;
    private ImageView mI;
    private TextView mNameTx;
    private String mOrderId;
    private P2PButton mPayBtn;
    private d mTick;
    private TextView mViewDetail;
    private e mW;

    public interface CloseListener {
        void onClose();
    }

    public interface Listener {
        void onHandle(String str);
    }

    public PayByNoticeDialog(Context context) {
        super(context);
        this.mW = new e();
        this.mTick = new d(this);
        this.mEndTickTime = 0L;
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDetail$2(Listener listener, View view) {
        dismiss();
        if (listener != null) {
            listener.onHandle(this.mOrderId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPay$1(Listener listener) {
        super.dismiss();
        if (listener != null) {
            listener.onHandle(this.mOrderId);
        }
    }

    private void renderWindow() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = (ScreenUtils.getScreenWidth() * 28) / 36;
        getWindow().setAttributes(attributes);
        getWindow().setDimAmount(0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i7, int i10, int i11) {
        this.mPayBtn.setText(String.format("PAY %1$02d:%2$02d:%3$02d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d dVar = this.mTick;
        dVar.f10673b.removeCallbacksAndMessages(null);
        dVar.f10672a = false;
        CloseListener closeListener = this.mCloseListener;
        if (closeListener != null) {
            closeListener.onClose();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.p2p_pay_by_notice_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(Sc.b.p2p_close);
        this.mNameTx = (TextView) findViewById(Sc.b.p2p_name);
        this.mAmountTx = (TextView) findViewById(Sc.b.p2p_amount);
        this.mChangeLabel = findViewById(Sc.b.p2p_amount_change_label);
        this.mI = (ImageView) findViewById(Sc.b.p2p_i);
        this.mPayBtn = (P2PButton) findViewById(Sc.b.p2p_pay);
        this.mViewDetail = (TextView) findViewById(Sc.b.p2p_detail);
        this.mCloseBtn.setOnClickListener(new I0(this, 13));
    }

    public void setAgentName(String str) {
        this.mNameTx.setText(str);
    }

    public void setAmount(long j6) {
        this.mAmountTx.setText(r0.B(j6, true));
    }

    public void setCloseListener(CloseListener closeListener) {
        this.mCloseListener = closeListener;
    }

    public void setDetail(Listener listener) {
        this.mViewDetail.setOnClickListener(new j(22, this, listener));
    }

    public void setOrderId(String str) {
        this.mOrderId = str;
    }

    public void setPay(Listener listener) {
        this.mPayBtn.setOnP2PButtonClickListener(new a(8, this, listener));
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        this.mEndTickTime = System.currentTimeMillis() + 600000;
        d dVar = this.mTick;
        if (dVar.f10672a) {
            return;
        }
        dVar.f10672a = true;
        dVar.f10673b.post(new B5.c(dVar, 23));
    }

    public void showChangeLabel(boolean z3) {
        this.mChangeLabel.setVisibility(z3 ? 0 : 8);
    }

    public PayByNoticeDialog(Context context, int i7) {
        super(context, i7);
        this.mW = new e();
        this.mTick = new d(this);
        this.mEndTickTime = 0L;
        this.mContext = context;
    }

    public PayByNoticeDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mW = new e();
        this.mTick = new d(this);
        this.mEndTickTime = 0L;
        this.mContext = context;
    }
}
