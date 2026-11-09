package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import F6.d;
import Ja.RunnableC0336i;
import N8.q0;
import Pa.C0515l;
import Pa.r0;
import Ua.ViewOnFocusChangeListenerC0631l;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CountryCode;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003IJKB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010'\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020!H\u0002¢\u0006\u0004\b/\u0010$R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R(\u00105\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00104\"\u0004\b7\u0010\u000eR(\u0010;\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b:\u0010\u000eR(\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00104\"\u0004\b>\u0010\u000eR\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010E¨\u0006L"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/MobileNumberInputV4View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "setCountryCode", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCountryCodeClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/transsnet/palmpay/core/viewmodel/MobileNumberInputV4View$OnPhoneNumberEnteredListener;", "mOnPhoneNumberEnteredListener", "setOnPhoneNumberEnteredListener", "(Lcom/transsnet/palmpay/core/viewmodel/MobileNumberInputV4View$OnPhoneNumberEnteredListener;)V", "title", "setTitle", "", "hint", "setHint", "(Ljava/lang/CharSequence;)V", "textId", "(I)V", "resid", "setBackground", "", "editable", "setEditable", "(Z)V", "error", "setError", "setErrorWithoutAutoClear", "Landroid/widget/TextView;", "getErrorTextView", "()Landroid/widget/TextView;", "Landroid/widget/RelativeLayout;", "getParentLayout", "()Landroid/widget/RelativeLayout;", "enable", "setEditTextMobileEnable", "value", "v", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "countryLocale", "getCountryLocale", "setCountryLocale", "mobile", "getMobileNumber", "setMobileNumber", "mobileNumber", "fullNumber", "getFullMobileNumber", "setFullMobileNumber", "fullMobileNumber", "Landroid/widget/EditText;", "getEditTextMobile", "()Landroid/widget/EditText;", "editTextMobile", "getMaxNumberLength", "()I", "maxNumberLength", "getMaxNumberLengthWithSpace", "maxNumberLengthWithSpace", "OnPhoneNumberEnteredListener", "Ja/i", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MobileNumberInputV4View extends LinearLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f28222C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OnPhoneNumberEnteredListener f28223A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC0336i f28224B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f28225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatEditText f28226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f28228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f28229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f28231g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f28232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RelativeLayout f28233j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0515l f28235p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public String countryCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View.OnClickListener f28237w;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/MobileNumberInputV4View$OnPhoneNumberEnteredListener;", "", "onNumberEntered", "", "code", "", "number", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnPhoneNumberEnteredListener {
        void onNumberEntered(@Nullable String code, @Nullable String number);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f28222C = "MobileInputV4View";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MobileNumberInputV4View(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxNumberLength() {
        return PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(BaseApplication.getCountryLocale());
    }

    private final int getMaxNumberLengthWithSpace() {
        return PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(BaseApplication.getCountryLocale()) + 2;
    }

    private final void setEditTextMobileEnable(boolean enable) {
        if (this.f28234o) {
            AppCompatEditText appCompatEditText = this.f28226b;
            if (appCompatEditText != null) {
                appCompatEditText.setEnabled(enable);
                return;
            }
            return;
        }
        AppCompatEditText appCompatEditText2 = this.f28226b;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setEnabled(false);
        }
    }

    public final void b() {
        if ("NG".equals(getT()) || "TZ".equals(getT()) || "GH".equals(getT())) {
            TextView textView = this.f28228d;
            if (textView != null) {
                textView.setText("");
                return;
            }
            return;
        }
        TextView textView2 = this.f28228d;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: getCountryLocale, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Nullable
    public final EditText getEditTextMobile() {
        return this.f28226b;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorTextView, reason: from getter */
    public final TextView getF28229e() {
        return this.f28229e;
    }

    @Nullable
    public final String getFullMobileNumber() {
        String mobileNumber = getMobileNumber();
        String str = this.countryCode;
        String str2 = "";
        if (TextUtils.isEmpty(mobileNumber) || TextUtils.isEmpty(str)) {
            return "";
        }
        if (str != null && str.length() == 1) {
            str2 = "000";
        } else if (str != null && str.length() == 2) {
            str2 = TransType.TRANS_SCENE_REFUND;
        } else if (str != null && str.length() == 3) {
            str2 = "0";
        }
        return q0.y(str2, str, mobileNumber);
    }

    @Nullable
    public final String getMobileNumber() {
        AppCompatEditText appCompatEditText = this.f28226b;
        if (appCompatEditText != null) {
            String strValueOf = String.valueOf(appCompatEditText.getText());
            if (!TextUtils.isEmpty(strValueOf)) {
                return r0.L0(y.k(strValueOf, " ", ""));
            }
        }
        return "";
    }

    @Nullable
    /* JADX INFO: renamed from: getParentLayout, reason: from getter */
    public final RelativeLayout getF28233j() {
        return this.f28233j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        TextView textView = this.f28229e;
        if (textView != null && textView != null) {
            textView.removeCallbacks(this.f28224B);
        }
        super.onDetachedFromWindow();
    }

    public final void setBackground(@DrawableRes int resid) {
        RelativeLayout relativeLayout = this.f28233j;
        if (relativeLayout == null || relativeLayout == null) {
            return;
        }
        relativeLayout.setBackgroundResource(resid);
    }

    public final void setCountryCode(@Nullable String countryCode) {
        Integer numValueOf;
        String strValueOf;
        CountryCode.CountriesBean countriesBeanA;
        String str = f28222C;
        if (TextUtils.isEmpty(countryCode)) {
            return;
        }
        try {
            if (TextUtils.isEmpty(countryCode)) {
                strValueOf = countryCode;
            } else {
                if (countryCode != null) {
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(countryCode));
                    } catch (Exception e10) {
                        d.c(str, "formatCountryCode: ", e10);
                        strValueOf = countryCode;
                    }
                } else {
                    numValueOf = null;
                }
                strValueOf = String.valueOf(numValueOf);
            }
            this.countryCode = strValueOf;
            C0515l c0515l = this.f28235p;
            if (c0515l != null) {
                countriesBeanA = c0515l.a(countryCode != null ? Integer.parseInt(countryCode) : 0);
            } else {
                countriesBeanA = null;
            }
            String str2 = countriesBeanA != null ? countriesBeanA.locale : null;
            this.t = str2;
            ImageView imageView = this.f28225a;
            if (imageView != null) {
                imageView.setImageResource(C0515l.e(str2));
            }
            TextView textView = this.f28227c;
            if (textView != null) {
                textView.setText("+" + this.countryCode);
            }
            getMobileNumber();
            b();
            AppCompatEditText appCompatEditText = this.f28226b;
            if (appCompatEditText != null) {
                appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getMaxNumberLengthWithSpace())});
            }
        } catch (Exception e11) {
            d.c(str, "setCountryCode: ", e11);
        }
    }

    public final void setCountryCodeClickListener(@Nullable View.OnClickListener listener) {
        this.f28237w = listener;
    }

    public final void setCountryLocale(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.t = str;
            C0515l c0515l = this.f28235p;
            CountryCode.CountriesBean countriesBeanB = c0515l != null ? c0515l.b(str) : null;
            this.countryCode = String.valueOf(countriesBeanB != null ? Integer.valueOf(countriesBeanB.code) : null);
            ImageView imageView = this.f28225a;
            if (imageView != null) {
                imageView.setImageResource(C0515l.e(this.t));
            }
            TextView textView = this.f28227c;
            if (textView != null) {
                textView.setText("+" + this.countryCode);
            }
            getMobileNumber();
            b();
            AppCompatEditText appCompatEditText = this.f28226b;
            if (appCompatEditText != null) {
                appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getMaxNumberLengthWithSpace())});
            }
        } catch (Exception e10) {
            d.c(f28222C, "setCountryLocale: ", e10);
        }
    }

    public final void setEditable(boolean editable) {
        this.f28234o = editable;
        setEditTextMobileEnable(editable);
    }

    public final void setError(@Nullable String error) {
        TextView textView = this.f28229e;
        if (textView != null) {
            if (textView != null) {
                textView.setText(error);
            }
            TextView textView2 = this.f28229e;
            if (textView2 != null) {
                textView2.postDelayed(this.f28224B, 2000L);
            }
            View view = this.f28232i;
            if (view != null) {
                h.s(view, true);
            }
        }
    }

    public final void setErrorWithoutAutoClear(@Nullable String error) {
        TextView textView = this.f28229e;
        if (textView != null) {
            if (textView != null) {
                textView.setText(error);
            }
            TextView textView2 = this.f28228d;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.f28229e;
            if (textView3 != null) {
                textView3.setVisibility(TextUtils.isEmpty(error) ? 8 : 0);
            }
            View view = this.f28232i;
            if (view != null) {
                h.s(view, true);
            }
        }
    }

    public final void setFullMobileNumber(@Nullable String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str) || this.f28226b == null) {
            return;
        }
        String strSubstring2 = null;
        if (str != null) {
            strSubstring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
        }
        if (str != null) {
            strSubstring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        }
        setCountryCode(strSubstring);
        setMobileNumber(strSubstring2);
    }

    public final void setHint(@Nullable CharSequence hint) {
        TextView textView = this.f28230f;
        if (textView == null || textView == null) {
            return;
        }
        textView.setText(hint);
    }

    public final void setMobileNumber(@Nullable String str) {
        AppCompatEditText appCompatEditText;
        if (this.f28226b != null) {
            if (!TextUtils.isEmpty(str)) {
                str = str != null ? y.k(str, " ", "") : null;
            }
            AppCompatEditText appCompatEditText2 = this.f28226b;
            if (appCompatEditText2 != null) {
                appCompatEditText2.setText(str);
            }
            if (!TextUtils.isEmpty(str) && (appCompatEditText = this.f28226b) != null) {
                appCompatEditText.setSelection(String.valueOf(appCompatEditText.getText()).length());
            }
            getMobileNumber();
            b();
        }
    }

    public final void setOnPhoneNumberEnteredListener(@Nullable OnPhoneNumberEnteredListener mOnPhoneNumberEnteredListener) {
        this.f28223A = mOnPhoneNumberEnteredListener;
    }

    @Deprecated(message = "")
    public final void setTitle(@Nullable String title) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MobileNumberInputV4View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MobileNumberInputV4View(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void setHint(int textId) {
        TextView textView = this.f28230f;
        if (textView == null || textView == null) {
            return;
        }
        textView.setText(textId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MobileNumberInputV4View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28234o = true;
        setOrientation(1);
        View.inflate(context, g.core_layout_mobile_number_input_v4, this);
        this.f28224B = new RunnableC0336i(this);
        C0515l c0515l = new C0515l();
        this.f28235p = c0515l;
        p367ya.a.d().f44149a.i("key_default_language", "NG");
        CountryCode.CountriesBean countriesBeanB = c0515l.b("NG");
        this.countryCode = String.valueOf(countriesBeanB != null ? Integer.valueOf(countriesBeanB.code) : null);
        this.t = countriesBeanB != null ? countriesBeanB.locale : null;
        this.f28228d = (TextView) findViewById(e.textViewCounter);
        this.f28227c = (TextView) findViewById(e.textViewCountryCode);
        this.f28230f = (TextView) findViewById(e.tvHint);
        this.f28229e = (TextView) findViewById(e.textViewError);
        this.f28232i = findViewById(e.layoutError);
        TextView textView = this.f28227c;
        if (textView != null) {
            G.x("+", this.countryCode, textView);
        }
        ImageView imageView = (ImageView) findViewById(e.imageViewCountry);
        this.f28225a = imageView;
        if (imageView != null) {
            imageView.setImageResource(C0515l.e(this.t));
        }
        this.f28226b = (AppCompatEditText) findViewById(e.editTextMobile);
        this.f28233j = (RelativeLayout) findViewById(e.layoutParent);
        this.f28231g = findViewById(e.dividerView);
        AppCompatEditText appCompatEditText = this.f28226b;
        if (appCompatEditText != null) {
            appCompatEditText.setSupportBackgroundTintList(getResources().getColorStateList(p.cv_edit_underline_color));
        }
        AppCompatEditText appCompatEditText2 = this.f28226b;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(getMaxNumberLengthWithSpace())});
        }
        AppCompatEditText appCompatEditText3 = this.f28226b;
        if (appCompatEditText3 != null) {
            appCompatEditText3.setCustomSelectionActionModeCallback(new T6.c(1));
        }
        AppCompatEditText appCompatEditText4 = this.f28226b;
        if (appCompatEditText4 != null) {
            appCompatEditText4.setLongClickable(false);
        }
        TextView textView2 = this.f28227c;
        if (textView2 != null) {
            textView2.setOnClickListener(new R8.d(this, 13));
        }
        AppCompatEditText appCompatEditText5 = this.f28226b;
        if (appCompatEditText5 != null) {
            h.r(appCompatEditText5, new R3.e(this, 5), new ViewOnFocusChangeListenerC0631l(0));
        }
        b();
        if (this.f28230f == null) {
            return;
        }
        String mobileNumber = getMobileNumber();
        TextView textView3 = this.f28230f;
        if (textView3 != null) {
            textView3.setVisibility(TextUtils.isEmpty(mobileNumber) ? 0 : 8);
        }
    }
}
