package com.transsnet.palmpay.managemoney.ui.fragment;

import android.content.res.Resources;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.custom_view.RoundedTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewUserIntroductionFragment f32573a;

    public U(NewUserIntroductionFragment newUserIntroductionFragment) {
        this.f32573a = newUserIntroductionFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        Resources resources;
        int i10;
        NewUserIntroductionFragment.a aVar = NewUserIntroductionFragment.f32487L;
        NewUserIntroductionFragment newUserIntroductionFragment = this.f32573a;
        RadioGroup radioGroup = (RadioGroup) newUserIntroductionFragment.f32490C.getValue();
        if (radioGroup != null) {
            radioGroup.check(i7);
        }
        ViewPager viewPager = (ViewPager) newUserIntroductionFragment.f32491H.getValue();
        if (viewPager != null) {
            TextView textView = (TextView) newUserIntroductionFragment.f32489B.getValue();
            if (textView != null) {
                textView.setVisibility(i7 < viewPager.getChildCount() + (-1) ? 0 : 8);
            }
            RoundedTextView roundedTextView = (RoundedTextView) newUserIntroductionFragment.t.getValue();
            if (roundedTextView != null) {
                if (i7 < viewPager.getChildCount() - 1) {
                    resources = newUserIntroductionFragment.getResources();
                    i10 = p025ba.k.core_next;
                } else {
                    resources = newUserIntroductionFragment.getResources();
                    i10 = Jc.f.mm_get_started;
                }
                roundedTextView.setText(resources.getString(i10));
            }
        }
    }
}
