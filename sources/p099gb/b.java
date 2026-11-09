package p099gb;

import Ya.e;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final IconicsCheckBox checkAgreement;

    @NonNull
    public final k clBusinessLoanLayout;

    @NonNull
    public final Group groupConfinementPeriod;

    @NonNull
    public final AppCompatImageView ivBg;

    @NonNull
    public final AppCompatImageView ivCalendar;

    @NonNull
    public final ImageView ivCoin;

    @NonNull
    public final ImageView ivFinger;

    @NonNull
    public final ImageView ivGift;

    @NonNull
    public final Group layoutGetMoneyNow;

    @NonNull
    public final LinearLayout layoutNormal;

    @NonNull
    public final LinearLayout layoutReview;

    @NonNull
    public final TextView openFlexiTv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvAmount;

    @NonNull
    public final TextView tvApplicationAgreement;

    @NonNull
    public final TextView tvBusinessLoanTitle;

    @NonNull
    public final TextView tvConfinementPeriodContent;

    @NonNull
    public final TextView tvConfinementPeriodSubContent;

    @NonNull
    public final TextView tvReapplyDate;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final LoanHomeBottomInfoView viewLoanHomeBottomInfo;

    @NonNull
    public final LoanHomeBottomInfoView viewLoanHomeBottomInfo2;

    private b(@NonNull FrameLayout frameLayout, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull IconicsCheckBox iconicsCheckBox, @NonNull k kVar, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull Group group2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull LoanHomeBottomInfoView loanHomeBottomInfoView, @NonNull LoanHomeBottomInfoView loanHomeBottomInfoView2) {
        this.rootView = frameLayout;
        this.barrier = barrier;
        this.bottomBarrier = barrier2;
        this.checkAgreement = iconicsCheckBox;
        this.clBusinessLoanLayout = kVar;
        this.groupConfinementPeriod = group;
        this.ivBg = appCompatImageView;
        this.ivCalendar = appCompatImageView2;
        this.ivCoin = imageView;
        this.ivFinger = imageView2;
        this.ivGift = imageView3;
        this.layoutGetMoneyNow = group2;
        this.layoutNormal = linearLayout;
        this.layoutReview = linearLayout2;
        this.openFlexiTv = textView;
        this.tvAmount = textView2;
        this.tvApplicationAgreement = textView3;
        this.tvBusinessLoanTitle = textView4;
        this.tvConfinementPeriodContent = textView5;
        this.tvConfinementPeriodSubContent = textView6;
        this.tvReapplyDate = textView7;
        this.tvTitle = textView8;
        this.viewLoanHomeBottomInfo = loanHomeBottomInfoView;
        this.viewLoanHomeBottomInfo2 = loanHomeBottomInfoView2;
    }

    @NonNull
    public static b bind(@NonNull View view) {
        View viewM;
        int i7 = e.barrier;
        Barrier barrier = (Barrier) a.m(i7, view);
        if (barrier != null) {
            i7 = e.bottomBarrier;
            Barrier barrier2 = (Barrier) a.m(i7, view);
            if (barrier2 != null) {
                i7 = e.checkAgreement;
                IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) a.m(i7, view);
                if (iconicsCheckBox != null && (viewM = a.m((i7 = e.clBusinessLoanLayout), view)) != null) {
                    k kVarBind = k.bind(viewM);
                    i7 = e.groupConfinementPeriod;
                    Group group = (Group) a.m(i7, view);
                    if (group != null) {
                        i7 = e.ivBg;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i7, view);
                        if (appCompatImageView != null) {
                            i7 = e.ivCalendar;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.m(i7, view);
                            if (appCompatImageView2 != null) {
                                i7 = e.ivCoin;
                                ImageView imageView = (ImageView) a.m(i7, view);
                                if (imageView != null) {
                                    i7 = e.ivFinger;
                                    ImageView imageView2 = (ImageView) a.m(i7, view);
                                    if (imageView2 != null) {
                                        i7 = e.ivGift;
                                        ImageView imageView3 = (ImageView) a.m(i7, view);
                                        if (imageView3 != null) {
                                            i7 = e.layoutGetMoneyNow;
                                            Group group2 = (Group) a.m(i7, view);
                                            if (group2 != null) {
                                                i7 = e.layoutNormal;
                                                LinearLayout linearLayout = (LinearLayout) a.m(i7, view);
                                                if (linearLayout != null) {
                                                    i7 = e.layoutReview;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.m(i7, view);
                                                    if (linearLayout2 != null) {
                                                        i7 = e.open_flexi_tv;
                                                        TextView textView = (TextView) a.m(i7, view);
                                                        if (textView != null) {
                                                            i7 = e.tvAmount;
                                                            TextView textView2 = (TextView) a.m(i7, view);
                                                            if (textView2 != null) {
                                                                i7 = e.tvApplicationAgreement;
                                                                TextView textView3 = (TextView) a.m(i7, view);
                                                                if (textView3 != null) {
                                                                    i7 = e.tvBusinessLoanTitle;
                                                                    TextView textView4 = (TextView) a.m(i7, view);
                                                                    if (textView4 != null) {
                                                                        i7 = e.tvConfinementPeriodContent;
                                                                        TextView textView5 = (TextView) a.m(i7, view);
                                                                        if (textView5 != null) {
                                                                            i7 = e.tvConfinementPeriodSubContent;
                                                                            TextView textView6 = (TextView) a.m(i7, view);
                                                                            if (textView6 != null) {
                                                                                i7 = e.tvReapplyDate;
                                                                                TextView textView7 = (TextView) a.m(i7, view);
                                                                                if (textView7 != null) {
                                                                                    i7 = e.tvTitle;
                                                                                    TextView textView8 = (TextView) a.m(i7, view);
                                                                                    if (textView8 != null) {
                                                                                        i7 = e.viewLoanHomeBottomInfo;
                                                                                        LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) a.m(i7, view);
                                                                                        if (loanHomeBottomInfoView != null) {
                                                                                            i7 = e.viewLoanHomeBottomInfo2;
                                                                                            LoanHomeBottomInfoView loanHomeBottomInfoView2 = (LoanHomeBottomInfoView) a.m(i7, view);
                                                                                            if (loanHomeBottomInfoView2 != null) {
                                                                                                return new b((FrameLayout) view, barrier, barrier2, iconicsCheckBox, kVarBind, group, appCompatImageView, appCompatImageView2, imageView, imageView2, imageView3, group2, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, loanHomeBottomInfoView, loanHomeBottomInfoView2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static b inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static b inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(f.cs_cl_open_double_guide_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
