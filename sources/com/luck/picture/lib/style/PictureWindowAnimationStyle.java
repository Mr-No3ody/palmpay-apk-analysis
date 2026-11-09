package com.luck.picture.lib.style;

import androidx.annotation.AnimRes;
import com.luck.picture.lib.R;

/* JADX INFO: loaded from: classes3.dex */
public class PictureWindowAnimationStyle {

    @AnimRes
    public int activityEnterAnimation;

    @AnimRes
    public int activityExitAnimation;

    @AnimRes
    public int activityPreviewEnterAnimation;

    @AnimRes
    public int activityPreviewExitAnimation;

    public PictureWindowAnimationStyle() {
    }

    public static PictureWindowAnimationStyle ofDefaultWindowAnimationStyle() {
        return new PictureWindowAnimationStyle(R.anim.ps_anim_enter, R.anim.ps_anim_exit);
    }

    public int getActivityEnterAnimation() {
        return this.activityEnterAnimation;
    }

    public int getActivityExitAnimation() {
        return this.activityExitAnimation;
    }

    public int getActivityPreviewEnterAnimation() {
        return this.activityPreviewEnterAnimation;
    }

    public int getActivityPreviewExitAnimation() {
        return this.activityPreviewExitAnimation;
    }

    public void setActivityEnterAnimation(int i7) {
        this.activityEnterAnimation = i7;
    }

    public void setActivityExitAnimation(int i7) {
        this.activityExitAnimation = i7;
    }

    public void setActivityPreviewEnterAnimation(int i7) {
        this.activityPreviewEnterAnimation = i7;
    }

    public void setActivityPreviewExitAnimation(int i7) {
        this.activityPreviewExitAnimation = i7;
    }

    public PictureWindowAnimationStyle(@AnimRes int i7, @AnimRes int i10) {
        this.activityEnterAnimation = i7;
        this.activityExitAnimation = i10;
        this.activityPreviewEnterAnimation = i7;
        this.activityPreviewExitAnimation = i10;
    }
}
