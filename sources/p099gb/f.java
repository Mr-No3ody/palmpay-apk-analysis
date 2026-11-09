package p099gb;

import Ya.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.credit.view.DashLine;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewBinding {

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final DashLine divideLine;

    @NonNull
    public final ImageView ivAmountIcon;

    @NonNull
    public final ImageView ivArrowRight;

    @NonNull
    public final ImageView ivTitleIcon;

    @NonNull
    public final ImageView ivWaiverAmountIcon;

    @NonNull
    public final LinearLayout layoutWaiver;

    @NonNull
    public final LinearLayout layoutWaiverAmountRow;

    @NonNull
    public final LinearLayout llCountdownHms;

    @NonNull
    public final TextView repayBtn;

    @NonNull
    public final TextView repayBtn2;

    @NonNull
    public final LinearLayout repayBtnContainer;

    @NonNull
    public final LinearLayout repayBtnContainer2;

    @NonNull
    public final ConstraintLayout rootOutstandingView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rvOutstandingDetail;

    @NonNull
    public final Space space;

    @NonNull
    public final View topLine;

    @NonNull
    public final TextView tvCountdownDayHour;

    @NonNull
    public final TextView tvCountdownHour;

    @NonNull
    public final TextView tvCountdownMinute;

    @NonNull
    public final TextView tvCountdownSecond;

    @NonNull
    public final TextView tvCouponAmount;

    @NonNull
    public final TextView tvOutstandingAmount;

    @NonNull
    public final TextView tvRepaymentDate;

    @NonNull
    public final ImageView tvRepaymentIcon;

    @NonNull
    public final TextView tvSubtitle;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvWaiverAmountLabel;

    @NonNull
    public final TextView tvWaiverBadge;

    @NonNull
    public final TextView tvWaiverCurrentAmount;

    @NonNull
    public final TextView tvWaiverSummary;

    private f(@NonNull LinearLayout linearLayout, @NonNull Barrier barrier, @NonNull DashLine dashLine, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout7, @NonNull RecyclerView recyclerView, @NonNull Space space, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull ImageView imageView5, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15) {
        this.rootView_ = linearLayout;
        this.bottomBarrier = barrier;
        this.divideLine = dashLine;
        this.ivAmountIcon = imageView;
        this.ivArrowRight = imageView2;
        this.ivTitleIcon = imageView3;
        this.ivWaiverAmountIcon = imageView4;
        this.layoutWaiver = linearLayout2;
        this.layoutWaiverAmountRow = linearLayout3;
        this.llCountdownHms = linearLayout4;
        this.repayBtn = textView;
        this.repayBtn2 = textView2;
        this.repayBtnContainer = linearLayout5;
        this.repayBtnContainer2 = linearLayout6;
        this.rootOutstandingView = constraintLayout;
        this.rootView = linearLayout7;
        this.rvOutstandingDetail = recyclerView;
        this.space = space;
        this.topLine = view;
        this.tvCountdownDayHour = textView3;
        this.tvCountdownHour = textView4;
        this.tvCountdownMinute = textView5;
        this.tvCountdownSecond = textView6;
        this.tvCouponAmount = textView7;
        this.tvOutstandingAmount = textView8;
        this.tvRepaymentDate = textView9;
        this.tvRepaymentIcon = imageView5;
        this.tvSubtitle = textView10;
        this.tvTitle = textView11;
        this.tvWaiverAmountLabel = textView12;
        this.tvWaiverBadge = textView13;
        this.tvWaiverCurrentAmount = textView14;
        this.tvWaiverSummary = textView15;
    }

    @NonNull
    public static f bind(@NonNull View view) {
        View viewM;
        int i7 = e.bottomBarrier;
        Barrier barrier = (Barrier) a.m(i7, view);
        if (barrier != null) {
            i7 = e.divideLine;
            DashLine dashLine = (DashLine) a.m(i7, view);
            if (dashLine != null) {
                i7 = e.ivAmountIcon;
                ImageView imageView = (ImageView) a.m(i7, view);
                if (imageView != null) {
                    i7 = e.ivArrowRight;
                    ImageView imageView2 = (ImageView) a.m(i7, view);
                    if (imageView2 != null) {
                        i7 = e.ivTitleIcon;
                        ImageView imageView3 = (ImageView) a.m(i7, view);
                        if (imageView3 != null) {
                            i7 = e.ivWaiverAmountIcon;
                            ImageView imageView4 = (ImageView) a.m(i7, view);
                            if (imageView4 != null) {
                                i7 = e.layoutWaiver;
                                LinearLayout linearLayout = (LinearLayout) a.m(i7, view);
                                if (linearLayout != null) {
                                    i7 = e.layoutWaiverAmountRow;
                                    LinearLayout linearLayout2 = (LinearLayout) a.m(i7, view);
                                    if (linearLayout2 != null) {
                                        i7 = e.llCountdownHms;
                                        LinearLayout linearLayout3 = (LinearLayout) a.m(i7, view);
                                        if (linearLayout3 != null) {
                                            i7 = e.repayBtn;
                                            TextView textView = (TextView) a.m(i7, view);
                                            if (textView != null) {
                                                i7 = e.repayBtn2;
                                                TextView textView2 = (TextView) a.m(i7, view);
                                                if (textView2 != null) {
                                                    i7 = e.repayBtnContainer;
                                                    LinearLayout linearLayout4 = (LinearLayout) a.m(i7, view);
                                                    if (linearLayout4 != null) {
                                                        i7 = e.repayBtnContainer2;
                                                        LinearLayout linearLayout5 = (LinearLayout) a.m(i7, view);
                                                        if (linearLayout5 != null) {
                                                            i7 = e.rootOutstandingView;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, view);
                                                            if (constraintLayout != null) {
                                                                LinearLayout linearLayout6 = (LinearLayout) view;
                                                                i7 = e.rvOutstandingDetail;
                                                                RecyclerView recyclerView = (RecyclerView) a.m(i7, view);
                                                                if (recyclerView != null) {
                                                                    i7 = e.space;
                                                                    Space space = (Space) a.m(i7, view);
                                                                    if (space != null && (viewM = a.m((i7 = e.topLine), view)) != null) {
                                                                        i7 = e.tvCountdownDayHour;
                                                                        TextView textView3 = (TextView) a.m(i7, view);
                                                                        if (textView3 != null) {
                                                                            i7 = e.tvCountdownHour;
                                                                            TextView textView4 = (TextView) a.m(i7, view);
                                                                            if (textView4 != null) {
                                                                                i7 = e.tvCountdownMinute;
                                                                                TextView textView5 = (TextView) a.m(i7, view);
                                                                                if (textView5 != null) {
                                                                                    i7 = e.tvCountdownSecond;
                                                                                    TextView textView6 = (TextView) a.m(i7, view);
                                                                                    if (textView6 != null) {
                                                                                        i7 = e.tvCouponAmount;
                                                                                        TextView textView7 = (TextView) a.m(i7, view);
                                                                                        if (textView7 != null) {
                                                                                            i7 = e.tvOutstandingAmount;
                                                                                            TextView textView8 = (TextView) a.m(i7, view);
                                                                                            if (textView8 != null) {
                                                                                                i7 = e.tvRepaymentDate;
                                                                                                TextView textView9 = (TextView) a.m(i7, view);
                                                                                                if (textView9 != null) {
                                                                                                    i7 = e.tvRepaymentIcon;
                                                                                                    ImageView imageView5 = (ImageView) a.m(i7, view);
                                                                                                    if (imageView5 != null) {
                                                                                                        i7 = e.tvSubtitle;
                                                                                                        TextView textView10 = (TextView) a.m(i7, view);
                                                                                                        if (textView10 != null) {
                                                                                                            i7 = e.tvTitle;
                                                                                                            TextView textView11 = (TextView) a.m(i7, view);
                                                                                                            if (textView11 != null) {
                                                                                                                i7 = e.tvWaiverAmountLabel;
                                                                                                                TextView textView12 = (TextView) a.m(i7, view);
                                                                                                                if (textView12 != null) {
                                                                                                                    i7 = e.tvWaiverBadge;
                                                                                                                    TextView textView13 = (TextView) a.m(i7, view);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i7 = e.tvWaiverCurrentAmount;
                                                                                                                        TextView textView14 = (TextView) a.m(i7, view);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i7 = e.tvWaiverSummary;
                                                                                                                            TextView textView15 = (TextView) a.m(i7, view);
                                                                                                                            if (textView15 != null) {
                                                                                                                                return new f(linearLayout6, barrier, dashLine, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, textView, textView2, linearLayout4, linearLayout5, constraintLayout, linearLayout6, recyclerView, space, viewM, textView3, textView4, textView5, textView6, textView7, textView8, textView9, imageView5, textView10, textView11, textView12, textView13, textView14, textView15);
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
    public static f inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static f inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(Ya.f.cs_cl_total_outstanding_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
