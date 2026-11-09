package com.transsnet.palmpay.core.ui.fragment.verify;

import L6.b;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.dialog.DayPickDialog;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBirthdayFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckBirthdayFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBirthdayFragment extends BaseFragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f27967w = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PpFormVertical f27968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DayPickDialog f27969j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PpButton f27970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27971p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27972v = 3;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckBirthdayFragment newInstance(int i7, @Nullable String str) {
            CheckBirthdayFragment checkBirthdayFragment = new CheckBirthdayFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_type", i7);
            bundle.putString("extra_message", str);
            checkBirthdayFragment.setArguments(bundle);
            return checkBirthdayFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_confirm_birthday;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (TextUtils.isEmpty(this.t)) {
            return 0;
        }
        PpFormVertical ppFormVertical = this.f27968i;
        if (ppFormVertical != null) {
            ppFormVertical.setBottomText(this.t);
        }
        PpFormVertical ppFormVertical2 = this.f27968i;
        if (ppFormVertical2 == null) {
            return 0;
        }
        ppFormVertical2.setBottomTextColor(CommonViewExtKt.colorInt(b.ppColorError, requireContext()));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        ImageView rightImg;
        AppCompatEditText editText5;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27972v = arguments.getInt("extra_type");
            this.t = arguments.getString("extra_message");
        }
        this.f27970o = (PpButton) this.f27318b.findViewById(e.tvNext);
        PpFormVertical ppFormVertical = (PpFormVertical) this.f27318b.findViewById(e.inputBirthday);
        this.f27968i = ppFormVertical;
        if (ppFormVertical != null) {
            ppFormVertical.setTitle(h.B(r0.H0(k.core_date_of_birth), getActivity(), null, Integer.valueOf(b.ppColorTextPrimary), null, null, null, 1018));
        }
        PpFormVertical ppFormVertical2 = this.f27968i;
        if (ppFormVertical2 != null && (editText5 = ppFormVertical2.getEditText()) != null) {
            editText5.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        }
        PpFormVertical ppFormVertical3 = this.f27968i;
        if (ppFormVertical3 != null && (rightImg = ppFormVertical3.getRightImg()) != null) {
            Context context = getContext();
            rightImg.setImageDrawable(context != null ? G8.a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(requireContext().getColor(b.ppColorTextNormal)), null, 24.0f, 116) : null);
        }
        DayPickDialog dayPickDialog = new DayPickDialog(getActivity());
        this.f27969j = dayPickDialog;
        dayPickDialog.setShowConfirmBtn(true);
        DayPickDialog dayPickDialog2 = this.f27969j;
        if (dayPickDialog2 != null) {
            dayPickDialog2.setOnDismissListener(new Dd.b(this, 4));
        }
        PpButton ppButton = this.f27970o;
        if (ppButton != null) {
            final int i7 = 0;
            ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckBirthdayFragment f4659b;

                {
                    this.f4659b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerificationCallback payVerificationCallback;
                    switch (i7) {
                        case 0:
                            CheckBirthdayFragment checkBirthdayFragment = this.f4659b;
                            if (!TextUtils.isEmpty(checkBirthdayFragment.f27971p) && (payVerificationCallback = (PayVerificationCallback) checkBirthdayFragment.getActivity()) != null) {
                                payVerificationCallback.verifyPayMethod(checkBirthdayFragment.f27971p, checkBirthdayFragment.f27972v);
                                break;
                            }
                            break;
                        default:
                            DayPickDialog dayPickDialog3 = this.f4659b.f27969j;
                            if (dayPickDialog3 != null) {
                                dayPickDialog3.show();
                            }
                            break;
                    }
                }
            });
        }
        PpFormVertical ppFormVertical4 = this.f27968i;
        final int i10 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Ja.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBirthdayFragment f4659b;

            {
                this.f4659b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayVerificationCallback payVerificationCallback;
                switch (i10) {
                    case 0:
                        CheckBirthdayFragment checkBirthdayFragment = this.f4659b;
                        if (!TextUtils.isEmpty(checkBirthdayFragment.f27971p) && (payVerificationCallback = (PayVerificationCallback) checkBirthdayFragment.getActivity()) != null) {
                            payVerificationCallback.verifyPayMethod(checkBirthdayFragment.f27971p, checkBirthdayFragment.f27972v);
                            break;
                        }
                        break;
                    default:
                        DayPickDialog dayPickDialog3 = this.f4659b.f27969j;
                        if (dayPickDialog3 != null) {
                            dayPickDialog3.show();
                        }
                        break;
                }
            }
        };
        if (ppFormVertical4 != null && (editText4 = ppFormVertical4.getEditText()) != null) {
            editText4.setFocusable(false);
        }
        if (ppFormVertical4 != null && (editText3 = ppFormVertical4.getEditText()) != null) {
            editText3.setEnabled(true);
        }
        if (ppFormVertical4 != null && (editText2 = ppFormVertical4.getEditText()) != null) {
            editText2.setInputType(524289);
        }
        if (ppFormVertical4 != null && (editText = ppFormVertical4.getEditText()) != null) {
            editText.setOnClickListener(onClickListener);
        }
        if (ppFormVertical4 != null) {
            ppFormVertical4.setRightIconClickListener(onClickListener);
        }
        return 0;
    }
}
