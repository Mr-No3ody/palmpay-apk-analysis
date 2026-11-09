package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import Sc.c;
import Uc.C0657g;
import Uc.I0;
import V9.q;
import Wc.a;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.ScreenUtils;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
public class AboutDialog extends b {
    private TextView mAgreementTx;
    private ImageView mCloseBtn;
    private Context mContext;
    private TextView mContextTx;
    private Listener mListener;
    private P2PButton mNextBtn;
    private a mW;

    public interface Listener {
        void onClick();
    }

    public AboutDialog(Context context) {
        super(context);
        this.mW = new a();
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1() {
        dismiss();
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onClick();
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

    private void setAgreementUI() {
        SpannableString spannableString = new SpannableString("By clicking \"Next\", you are agreeing to PalmPay\nTerms and Conditions");
        spannableString.setSpan(new C0657g(this, 1), 48, 68, 33);
        this.mAgreementTx.setText(spannableString);
        this.mAgreementTx.setMovementMethod(LinkMovementMethod.getInstance());
        this.mAgreementTx.setHighlightColor(0);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.p2p_about_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(Sc.b.p2p_close);
        this.mContextTx = (TextView) findViewById(Sc.b.p2p_content);
        this.mAgreementTx = (TextView) findViewById(Sc.b.p2p_agreement);
        this.mNextBtn = (P2PButton) findViewById(Sc.b.p2p_next);
        this.mCloseBtn.setOnClickListener(new I0(this, 12));
        this.mNextBtn.setOnP2PButtonClickListener(new q(this, 10));
        setAgreementUI();
    }

    public void setBtnText(String str) {
        this.mNextBtn.setText(str);
    }

    public void setContent(CharSequence charSequence) {
        this.mContextTx.setText(charSequence);
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public AboutDialog(Context context, int i7) {
        super(context, i7);
        this.mW = new a();
        this.mContext = context;
    }

    public AboutDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mW = new a();
        this.mContext = context;
    }
}
