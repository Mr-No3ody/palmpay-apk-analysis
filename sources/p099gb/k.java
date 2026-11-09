package p099gb;

import Ya.e;
import Ya.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ViewBinding {

    @NonNull
    public final Barrier endBarrier;

    @NonNull
    public final ConstraintLayout layoutApply;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvBusinessLoanDesc0;

    @NonNull
    public final TextView tvBusinessLoanDesc1;

    @NonNull
    public final TextView tvBusinessLoanDesc2;

    @NonNull
    public final TextView tvLoanAmountTitle;

    @NonNull
    public final TextView tvLoanAmountValue;

    @NonNull
    public final TextView tvLoanApply;

    @NonNull
    public final TextView tvLoanCardTitle;

    private k(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = constraintLayout;
        this.endBarrier = barrier;
        this.layoutApply = constraintLayout2;
        this.tvBusinessLoanDesc0 = textView;
        this.tvBusinessLoanDesc1 = textView2;
        this.tvBusinessLoanDesc2 = textView3;
        this.tvLoanAmountTitle = textView4;
        this.tvLoanAmountValue = textView5;
        this.tvLoanApply = textView6;
        this.tvLoanCardTitle = textView7;
    }

    @NonNull
    public static k bind(@NonNull View view) {
        int i7 = e.endBarrier;
        Barrier barrier = (Barrier) a.m(i7, view);
        if (barrier != null) {
            i7 = e.layoutApply;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, view);
            if (constraintLayout != null) {
                i7 = e.tvBusinessLoanDesc0;
                TextView textView = (TextView) a.m(i7, view);
                if (textView != null) {
                    i7 = e.tvBusinessLoanDesc1;
                    TextView textView2 = (TextView) a.m(i7, view);
                    if (textView2 != null) {
                        i7 = e.tvBusinessLoanDesc2;
                        TextView textView3 = (TextView) a.m(i7, view);
                        if (textView3 != null) {
                            i7 = e.tvLoanAmountTitle;
                            TextView textView4 = (TextView) a.m(i7, view);
                            if (textView4 != null) {
                                i7 = e.tvLoanAmountValue;
                                TextView textView5 = (TextView) a.m(i7, view);
                                if (textView5 != null) {
                                    i7 = e.tvLoanApply;
                                    TextView textView6 = (TextView) a.m(i7, view);
                                    if (textView6 != null) {
                                        i7 = e.tvLoanCardTitle;
                                        TextView textView7 = (TextView) a.m(i7, view);
                                        if (textView7 != null) {
                                            return new k((ConstraintLayout) view, barrier, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static k inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static k inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z3) {
        View viewInflate = layoutInflater.inflate(f.cs_layout_open_business_loan_guide_view, viewGroup, false);
        if (z3) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
