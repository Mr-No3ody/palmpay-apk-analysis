package com.flexibank.sdk.customview.model;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexiBankTitleTextView1 f22273a;

    public a(FlexiBankTitleTextView1 flexiBankTitleTextView1) {
        this.f22273a = flexiBankTitleTextView1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FlexiBankTitleTextView1 flexiBankTitleTextView1 = this.f22273a;
        if (!flexiBankTitleTextView1.getMZoomOuted()) {
            TextView textView = flexiBankTitleTextView1.mTitleTv;
            Intrinsics.e(textView);
            float translationY = textView.getTranslationY();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(flexiBankTitleTextView1.mTitleTv, "translationY", translationY, translationY - SizeUtils.dp2px(15.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(flexiBankTitleTextView1.mTitleTv, ViewProps.SCALE_Y, 1.0f, 0.7f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(flexiBankTitleTextView1.mTitleTv, ViewProps.SCALE_X, 1.0f, 0.7f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat);
            animatorSet.setDuration(200L);
            animatorSet.start();
            flexiBankTitleTextView1.mZoomOuted = true;
        }
        FlexiBankTitleTextView1.Callback callback = flexiBankTitleTextView1.f22272e;
        if (callback != null) {
            Intrinsics.e(callback);
            callback.onTextTvClick();
        }
    }
}
