package com.transsnet.palmpay.custom_view.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.cardview.widget.CardView;
import io.reactivex.internal.operators.observable.N;
import java.util.concurrent.TimeUnit;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public class ToastDialog extends b {
    public static final int STYLE_NORMAL = 1;
    public static final int STYLE_SNACK_BAR = 2;
    public static final int STYLE_SNACK_BAR_BOTTOM = 3;
    private int mBackground;
    private Drawable mIcon;
    private int mIconId;
    private String mMessage;
    private String mTitle;

    public ToastDialog(Context context, int i7) {
        super(context, i7);
        this.mIconId = 0;
        this.mBackground = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackground(@DrawableRes int i7) {
        this.mBackground = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(int i7) {
        this.mIconId = i7;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView textView = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.tips_msg);
        TextView textView2 = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.tips_title);
        ImageView imageView = (ImageView) findViewById(com.transsnet.palmpay.custom_view.s.tips_icon);
        CardView cardView = (CardView) findViewById(com.transsnet.palmpay.custom_view.s.toast_dialog_card_view);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.transsnet.palmpay.custom_view.s.ll_toast_dialog);
        View viewFindViewById = findViewById(com.transsnet.palmpay.custom_view.s.ivClose);
        if (TextUtils.isEmpty(this.mMessage)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.mMessage);
        }
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.mTitle)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(this.mTitle);
            }
        }
        if (this.mIconId == 0) {
            imageView.setVisibility(8);
            if (this.mIcon != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.mIcon);
            }
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(this.mIconId);
        }
        int i7 = this.mBackground;
        if (i7 != 0) {
            linearLayout.setBackgroundResource(i7);
        }
        final int i10 = 0;
        cardView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToastDialog f31322b;

            {
                this.f31322b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f31322b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f31322b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        if (viewFindViewById != null) {
            final int i11 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ToastDialog f31322b;

                {
                    this.f31322b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f31322b.lambda$initViews$0(view);
                            break;
                        default:
                            this.f31322b.lambda$initViews$1(view);
                            break;
                    }
                }
            });
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setDimAmount(0.0f);
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        show(2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void show(long j6) {
        show(j6, 1);
    }

    public void show(long j6, int i7) {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
        }
        if (i7 == 2) {
            showAtTop(getWindow());
        }
        if (i7 == 3) {
            showAtBottom(getWindow());
        }
        try {
            super.show();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            df.i iVar = p298tf.f.f42628a;
            p147jf.a.a(timeUnit, "unit is null");
            p147jf.a.a(iVar, "scheduler is null");
            new N(Math.max(j6, 0L), iVar).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2085k0(this, 20));
        } catch (Exception unused) {
        }
    }
}
