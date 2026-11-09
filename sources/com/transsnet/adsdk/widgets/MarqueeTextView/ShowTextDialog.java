package com.transsnet.adsdk.widgets.MarqueeTextView;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.transsnet.adsdk.utils.AppUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ShowTextDialog extends Dialog {
    private CharSequence mMessage;

    public ShowTextDialog(@NonNull Context context, CharSequence message) {
        super(context);
        this.mMessage = message;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.transsnet.adsdk.R.layout.lib_ad_show_text_layout, (ViewGroup) null);
        setContentView(viewInflate);
        viewInflate.findViewById(com.transsnet.adsdk.R.id.tvConfirm).setOnClickListener(new Yd.i(this, 19));
        ((TextView) viewInflate.findViewById(com.transsnet.adsdk.R.id.tvMessage)).setText(this.mMessage);
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (AppUtils.getScreenWidth() * 0.8f);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }
}
