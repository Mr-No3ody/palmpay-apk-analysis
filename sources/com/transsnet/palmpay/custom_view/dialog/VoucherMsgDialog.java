package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.util.ScreenUtils;

/* JADX INFO: loaded from: classes4.dex */
public class VoucherMsgDialog extends b {
    private ImageView mCloseIcon;
    private OnVoucherMsgClickLister mListener;
    private EditText mMsgInputEt;
    private TextView mMsgOperation;
    private String mOperation;
    private TextView mSkipTv;
    private TextView mTextViewTitle;
    private String mTitle;
    private View.OnClickListener onClickListener;
    private boolean showSkip;

    public interface OnVoucherMsgClickLister {
        void onClose();

        void onConfirm(String str);

        void onSkip();
    }

    public VoucherMsgDialog(Context context, int i7) {
        super(context, i7);
        this.onClickListener = new z(this);
    }

    public String getmOperation() {
        return this.mOperation;
    }

    public String getmTitle() {
        return this.mTitle;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.mCloseIcon = (ImageView) findViewById(com.transsnet.palmpay.custom_view.s.msg_close_iv);
        this.mTextViewTitle = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.msg_title_tv);
        this.mSkipTv = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.msg_skip_tv);
        this.mMsgInputEt = (EditText) findViewById(com.transsnet.palmpay.custom_view.s.msg_input_et);
        this.mMsgOperation = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.msg_operation);
        this.mCloseIcon.setOnClickListener(this.onClickListener);
        this.mSkipTv.setOnClickListener(this.onClickListener);
        this.mMsgOperation.setOnClickListener(this.onClickListener);
        this.mMsgOperation.setText(this.mOperation);
        this.mTextViewTitle.setText(this.mTitle);
        this.mSkipTv.setVisibility(this.showSkip ? 0 : 8);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public boolean isShowSkip() {
        return this.showSkip;
    }

    public void setOnVoucherMsgClickLister(OnVoucherMsgClickLister onVoucherMsgClickLister) {
        this.mListener = onVoucherMsgClickLister;
    }

    public void setShowSkip(boolean z3) {
        this.showSkip = z3;
    }

    public void setmOperation(String str) {
        this.mOperation = str;
    }

    public void setmTitle(String str) {
        this.mTitle = str;
    }
}
