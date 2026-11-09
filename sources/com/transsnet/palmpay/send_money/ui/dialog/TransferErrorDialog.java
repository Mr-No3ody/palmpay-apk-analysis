package com.transsnet.palmpay.send_money.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import p025ba.l;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public class TransferErrorDialog extends b {
    private ImageView mCloseBtn;
    private TextView mContentTx;
    private Context mContext;

    public TransferErrorDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    private void renderWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_transfer_error_dialog_layout);
        renderWindow();
        this.mCloseBtn = (ImageView) findViewById(e.sm_close);
        this.mContentTx = (TextView) findViewById(e.cs_error_content);
        this.mCloseBtn.setOnClickListener(new A8.b(this, 7));
    }

    public void setContent(String str) {
        this.mContentTx.setText(str);
    }

    public TransferErrorDialog(Context context, int i7) {
        super(context, i7);
        this.mContext = context;
    }

    public TransferErrorDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mContext = context;
    }
}
