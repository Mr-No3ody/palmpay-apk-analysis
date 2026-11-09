package com.transsnet.palmpay.core.ui.fragment;

import Pa.i0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.palmpay.custom_view.r;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class CoreCommonResultFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f27856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f27860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27862g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27864j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27866p;
    public OnNextActionListener t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OnButtonActionListener f27867v;

    public interface OnButtonActionListener {
        void onButtonAction(int btnId);
    }

    public interface OnNextActionListener {
        void onNext(int result);
    }

    public static CoreCommonResultFragment f(int i7, int i10, String str, String str2, String str3, String str4, boolean z3) {
        CoreCommonResultFragment coreCommonResultFragment = new CoreCommonResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", str2);
        bundle.putString("title", str);
        bundle.putInt("result", i7);
        bundle.putInt("title_icon", i10);
        bundle.putString("button1", str3);
        bundle.putString("button2", str4);
        bundle.putBoolean("showAdvertising", z3);
        coreCommonResultFragment.setArguments(bundle);
        return coreCommonResultFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnNextActionListener) {
            this.t = (OnNextActionListener) context;
        }
        if (context instanceof OnButtonActionListener) {
            this.f27867v = (OnButtonActionListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f27861f = getArguments().getString("message");
            this.f27862g = getArguments().getString("title");
            this.f27864j = getArguments().getInt("result", 3);
            this.f27863i = getArguments().getInt("title_icon", 0);
            this.f27865o = getArguments().getString("button1", "");
            this.f27866p = getArguments().getString("button2", "");
            getArguments().getBoolean("showAdvertising", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(p025ba.g.core_fragment_common_result, viewGroup, false);
        this.f27860e = (TextView) viewInflate.findViewById(p025ba.e.textViewButton1);
        this.f27859d = (TextView) viewInflate.findViewById(p025ba.e.textViewButton2);
        this.f27858c = (TextView) viewInflate.findViewById(p025ba.e.textViewMessage);
        this.f27857b = (TextView) viewInflate.findViewById(p025ba.e.textViewResult);
        this.f27856a = (LottieAnimationView) viewInflate.findViewById(p025ba.e.imageViewResult);
        final int i7 = 0;
        this.f27859d.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.fragment.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommonResultFragment f27921b;

            {
                this.f27921b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        CoreCommonResultFragment coreCommonResultFragment = this.f27921b;
                        CoreCommonResultFragment.OnButtonActionListener onButtonActionListener = coreCommonResultFragment.f27867v;
                        if (onButtonActionListener != null) {
                            onButtonActionListener.onButtonAction(2);
                        } else {
                            CoreCommonResultFragment.OnNextActionListener onNextActionListener = coreCommonResultFragment.t;
                            if (onNextActionListener == null) {
                                coreCommonResultFragment.getActivity().finish();
                            } else {
                                onNextActionListener.onNext(coreCommonResultFragment.f27864j);
                            }
                        }
                        break;
                    default:
                        CoreCommonResultFragment coreCommonResultFragment2 = this.f27921b;
                        CoreCommonResultFragment.OnButtonActionListener onButtonActionListener2 = coreCommonResultFragment2.f27867v;
                        if (onButtonActionListener2 != null) {
                            onButtonActionListener2.onButtonAction(1);
                        } else {
                            CoreCommonResultFragment.OnNextActionListener onNextActionListener2 = coreCommonResultFragment2.t;
                            if (onNextActionListener2 == null) {
                                i0.H(null);
                            } else {
                                onNextActionListener2.onNext(coreCommonResultFragment2.f27864j);
                            }
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f27860e.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.fragment.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommonResultFragment f27921b;

            {
                this.f27921b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        CoreCommonResultFragment coreCommonResultFragment = this.f27921b;
                        CoreCommonResultFragment.OnButtonActionListener onButtonActionListener = coreCommonResultFragment.f27867v;
                        if (onButtonActionListener != null) {
                            onButtonActionListener.onButtonAction(2);
                        } else {
                            CoreCommonResultFragment.OnNextActionListener onNextActionListener = coreCommonResultFragment.t;
                            if (onNextActionListener == null) {
                                coreCommonResultFragment.getActivity().finish();
                            } else {
                                onNextActionListener.onNext(coreCommonResultFragment.f27864j);
                            }
                        }
                        break;
                    default:
                        CoreCommonResultFragment coreCommonResultFragment2 = this.f27921b;
                        CoreCommonResultFragment.OnButtonActionListener onButtonActionListener2 = coreCommonResultFragment2.f27867v;
                        if (onButtonActionListener2 != null) {
                            onButtonActionListener2.onButtonAction(1);
                        } else {
                            CoreCommonResultFragment.OnNextActionListener onNextActionListener2 = coreCommonResultFragment2.t;
                            if (onNextActionListener2 == null) {
                                i0.H(null);
                            } else {
                                onNextActionListener2.onNext(coreCommonResultFragment2.f27864j);
                            }
                        }
                        break;
                }
            }
        });
        int i11 = this.f27864j;
        if (i11 == 1) {
            this.f27856a.setImageResource(r.cv_result_success);
            i0.k0();
            this.f27857b.setText(k.core_success_upper);
        } else if (i11 == 3) {
            this.f27856a.setImageResource(r.cv_result_fail);
            this.f27857b.setText(k.core_failed_upper);
        } else if (i11 == 2) {
            this.f27856a.setImageResource(r.cv_result_pending);
            this.f27857b.setText(k.core_pending_upper);
        }
        if (TextUtils.isEmpty(this.f27865o)) {
            this.f27860e.setVisibility(8);
        } else {
            this.f27860e.setVisibility(0);
            this.f27860e.setText(this.f27865o);
        }
        if (TextUtils.isEmpty(this.f27866p)) {
            this.f27859d.setVisibility(8);
        } else {
            this.f27859d.setVisibility(0);
            this.f27859d.setText(this.f27866p);
        }
        if (TextUtils.isEmpty(this.f27865o) && TextUtils.isEmpty(this.f27866p)) {
            this.f27860e.setVisibility(0);
            this.f27860e.setText(k.core_confirm);
        }
        if (!TextUtils.isEmpty(this.f27862g)) {
            this.f27857b.setText(this.f27862g);
        }
        int i12 = this.f27863i;
        if (i12 > 0) {
            this.f27856a.setImageResource(i12);
        }
        this.f27858c.setText(this.f27861f);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.t = null;
    }
}
