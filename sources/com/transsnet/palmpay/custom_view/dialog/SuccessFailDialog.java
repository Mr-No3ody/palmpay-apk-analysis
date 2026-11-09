package com.transsnet.palmpay.custom_view.dialog;

import Pa.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SuccessFailDialog extends b {
    public static final int DIALOG_STYLE_1 = 101;
    public static final int DIALOG_STYLE_2 = 102;
    private int countdownInSec;
    private int mAnimationId;
    private LottieAnimationView mAnimationView;
    private CharSequence mButtonText;
    private View.OnClickListener mClickNextListener;
    private u mCountDownRunnable;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mImageViewClose;
    private ImageView mImageViewIcon;
    private String mMessage;
    private CircleProgressView mProgressBar;
    private TextView mTextViewMessage;
    private PpButton mTextViewNext;
    private TextView mTextViewTitle;
    private String mTitle;
    private TextView mTvCountDown;

    public SuccessFailDialog(Context context, int i7) {
        super(context, i7);
        this.countdownInSec = 0;
        this.mCountDownRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        View.OnClickListener onClickListener = this.mClickNextListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCountDown(long j6) {
        if (this.mCountDownRunnable == null) {
            int i7 = this.countdownInSec;
            u uVar = new u();
            uVar.f31313a = new WeakReference(this);
            uVar.f31314b = 0;
            uVar.f31315c = i7;
            this.mCountDownRunnable = uVar;
        }
        CircleProgressView circleProgressView = this.mProgressBar;
        if (circleProgressView != null) {
            circleProgressView.postDelayed(this.mCountDownRunnable, j6);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        CircleProgressView circleProgressView = this.mProgressBar;
        if (circleProgressView != null) {
            circleProgressView.removeCallbacks(this.mCountDownRunnable);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        this.mImageViewIcon = (ImageView) findViewById(com.transsnet.palmpay.custom_view.s.imageViewIcon);
        this.mAnimationView = (LottieAnimationView) findViewById(com.transsnet.palmpay.custom_view.s.animationView);
        this.mTextViewTitle = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.textViewTitle);
        this.mTextViewMessage = (TextView) findViewById(com.transsnet.palmpay.custom_view.s.textViewMessage);
        this.mTextViewNext = (PpButton) findViewById(com.transsnet.palmpay.custom_view.s.textViewNext);
        ImageView imageView = (ImageView) findViewById(com.transsnet.palmpay.custom_view.s.imageViewClose);
        this.mImageViewClose = imageView;
        final int i7 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuccessFailDialog f31298b;

            {
                this.f31298b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f31298b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f31298b.lambda$initViews$1(view);
                        break;
                }
            }
        });
        if (this.countdownInSec > 0) {
            ViewStub viewStub = (ViewStub) findViewById(com.transsnet.palmpay.custom_view.s.countdownStub);
            if (viewStub != null) {
                View viewInflate = viewStub.inflate();
                TextView textView = (TextView) viewInflate.findViewById(com.transsnet.palmpay.custom_view.s.tvCountDown);
                this.mTvCountDown = textView;
                r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                this.mProgressBar = (CircleProgressView) viewInflate.findViewById(com.transsnet.palmpay.custom_view.s.progressBar);
            }
            this.mImageViewClose.setVisibility(8);
        }
        if (TextUtils.isEmpty(this.mMessage)) {
            this.mTextViewMessage.setVisibility(8);
        } else {
            this.mTextViewMessage.setVisibility(0);
            this.mTextViewMessage.setText(this.mMessage);
        }
        if (TextUtils.isEmpty(this.mTitle)) {
            this.mTextViewTitle.setVisibility(8);
        } else {
            this.mTextViewTitle.setText(this.mTitle);
        }
        ImageView imageView2 = this.mImageViewIcon;
        if (imageView2 != null) {
            if (this.mIcon != null) {
                imageView2.setVisibility(0);
                this.mImageViewIcon.setImageDrawable(this.mIcon);
            } else if (this.mIconId > 0) {
                imageView2.setVisibility(0);
                this.mImageViewIcon.setImageResource(this.mIconId);
            }
        }
        LottieAnimationView lottieAnimationView = this.mAnimationView;
        if (lottieAnimationView != null) {
            int i10 = this.mAnimationId;
            if (i10 > 0) {
                lottieAnimationView.setAnimation(i10);
            } else {
                lottieAnimationView.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.mButtonText)) {
            this.mTextViewNext.setVisibility(8);
            return;
        }
        this.mTextViewNext.setVisibility(0);
        this.mTextViewNext.setText(this.mButtonText);
        final int i11 = 1;
        this.mTextViewNext.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuccessFailDialog f31298b;

            {
                this.f31298b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f31298b.lambda$initViews$0(view);
                        break;
                    default:
                        this.f31298b.lambda$initViews$1(view);
                        break;
                }
            }
        });
    }

    public void setAnimationId(int i7) {
        this.mAnimationId = i7;
    }

    public void setButtonText(CharSequence charSequence) {
        this.mButtonText = charSequence;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (z3) {
            return;
        }
        this.mImageViewClose.setVisibility(4);
    }

    public void setCountdownTimeMillis(long j6) {
        this.countdownInSec = (int) (j6 / 1000);
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setIconId(int i7) {
        this.mIconId = i7;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setNextListener(View.OnClickListener onClickListener) {
        this.mClickNextListener = onClickListener;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        HashMap map = new HashMap();
        map.put("element_title", this.mTitle);
        map.put("element_message", this.mMessage);
        addTrackProperty(map);
        super.show();
        if (this.countdownInSec <= 0 || this.mProgressBar == null || this.mTvCountDown == null) {
            return;
        }
        startCountDown(10L);
    }
}
