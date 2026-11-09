package com.transsnet.palmpay.account.ui.fragment.identify;

import A8.g;
import C0.AbstractC0130w;
import F6.d;
import F8.e;
import F8.h;
import Fd.G;
import G8.a;
import I8.o;
import N8.C0463g;
import Tb.b;
import Tb.c;
import V8.r;
import V8.t;
import V8.u;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.perf.util.Constants;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.account.ui.view.GenderV2View;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.TimeUtils;
import io.fastkv.n;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p025ba.f;
import p025ba.k;
import p097g9.C1718p;
import p097g9.C1719q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/IdentityVerificationViewModel;", "LI8/o;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdentityVerificationStep2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityVerificationStep2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep2Fragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 XDatePickerDialog.kt\ncom/palmpay/lib/ui/picker/picker/XDatePickerDialog$Builder$Companion\n*L\n1#1,608:1\n383#2:609\n401#2:610\n171#2,12:611\n215#2:623\n171#2,12:624\n215#2:636\n171#2,12:637\n215#2:649\n115#2,8:650\n145#2:658\n37#3:659\n36#3,3:660\n138#4:663\n*S KotlinDebug\n*F\n+ 1 IdentityVerificationStep2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/identify/IdentityVerificationStep2Fragment\n*L\n156#1:609\n156#1:610\n162#1:611,12\n162#1:623\n166#1:624,12\n166#1:636\n211#1:637,12\n211#1:649\n235#1:650,8\n235#1:658\n511#1:659\n511#1:660,3\n564#1:663\n*E\n"})
public final class IdentityVerificationStep2Fragment extends BaseMvvmVBFragment<IdentityVerificationViewModel, o> implements TextWatcher, CustomActionCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26177o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f26178p;
    public AbstractC0130w t;

    public final IdentityVerificationActivity A() {
        E e10 = this.f27319c;
        if (!(e10 instanceof IdentityVerificationActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
        return (IdentityVerificationActivity) e10;
    }

    public final void B() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        try {
            IdentityVerificationActivity identityVerificationActivityA = A();
            if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
                D(checkIdentifyReqN);
            }
            IdentityVerificationActivity identityVerificationActivityA2 = A();
            if (identityVerificationActivityA2 != null && (addUserExtraInfoReqL = identityVerificationActivityA2.l()) != null) {
                D(addUserExtraInfoReqL);
            }
            o oVar = (o) this.f27335j;
            if (oVar != null) {
                oVar.f4172g.b(true);
            }
            IdentityVerificationActivity identityVerificationActivityA3 = A();
            if (identityVerificationActivityA3 == null || !identityVerificationActivityA3.q()) {
                IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i;
                if (identityVerificationViewModel != null) {
                    IdentityVerificationActivity identityVerificationActivityA4 = A();
                    identityVerificationViewModel.f(identityVerificationActivityA4 != null ? identityVerificationActivityA4.n() : null);
                    return;
                }
                return;
            }
            IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
            if (identityVerificationViewModel2 != null) {
                IdentityVerificationActivity identityVerificationActivityA5 = A();
                identityVerificationViewModel2.d(identityVerificationActivityA5 != null ? identityVerificationActivityA5.l() : null);
            }
        } catch (Exception e10) {
            d.c(this.f27317a, "goNext: ", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0090, B:45:0x0094), top: B:61:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final void C(AddUserExtraInfoReq addUserExtraInfoReq) {
        int i7;
        Calendar calendar;
        o oVar;
        o oVar2;
        String[] strArr;
        int i10;
        int i11;
        String str;
        String str2;
        String str3;
        o oVar3;
        o oVar4;
        o oVar5;
        if (!TextUtils.isEmpty(addUserExtraInfoReq.firstName) && (oVar5 = (o) this.f27335j) != null) {
            oVar5.f4169d.setEditContent(addUserExtraInfoReq.firstName);
        }
        if (!TextUtils.isEmpty(addUserExtraInfoReq.lastName) && (oVar4 = (o) this.f27335j) != null) {
            oVar4.f4170e.setEditContent(addUserExtraInfoReq.lastName);
        }
        if (!TextUtils.isEmpty(addUserExtraInfoReq.middleName) && (oVar3 = (o) this.f27335j) != null) {
            oVar3.f4171f.setEditContent(addUserExtraInfoReq.middleName);
        }
        if (TextUtils.isEmpty(addUserExtraInfoReq.birthday)) {
            return;
        }
        String str4 = addUserExtraInfoReq.birthday;
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        int i12 = Constants.MAX_URL_LENGTH;
        int i13 = 0;
        if (zIsEmpty) {
            i7 = 1;
        } else if (str4 != null) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(str4, new String[]{"-"}, false, 0, 6, null);
                if (listSplit$default != null) {
                    strArr = (String[]) listSplit$default.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                if (strArr != null || (str3 = strArr[0]) == null) {
                    i12 = 0;
                } else {
                    i12 = Integer.parseInt(str3);
                }
                if (strArr != null || (str2 = strArr[1]) == null) {
                    i10 = 0;
                } else {
                    i10 = Integer.parseInt(str2);
                }
                if (i10 > 0) {
                    i11 = i10 - 1;
                } else {
                    i11 = 0;
                }
                if (strArr != null) {
                    try {
                        str = strArr[2];
                        if (str != null) {
                            i13 = Integer.parseInt(str);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        i13 = i11;
                        d.c(this.f27317a, "parseDate: ", e);
                        i7 = 1;
                    }
                }
                i7 = i13;
                i13 = i11;
            } catch (Exception e11) {
                e = e11;
                d.c(this.f27317a, "parseDate: ", e);
                i7 = 1;
                calendar = Calendar.getInstance();
                calendar.clear();
                calendar.set(1, i12);
                calendar.set(2, i13);
                calendar.set(5, i7);
                oVar = (o) this.f27335j;
                if (oVar != null) {
                    oVar.f4168c.setTag(calendar);
                }
                oVar2 = (o) this.f27335j;
                if (oVar2 != null) {
                    PpFormVertical ppFormVertical = oVar2.f4168c;
                    String strDate2String = TimeUtils.date2String(w().getTime(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
                    Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
                    ppFormVertical.setEditContent(strDate2String);
                }
            }
        } else {
            strArr = null;
            if (strArr != null) {
                i12 = 0;
            } else {
                i12 = 0;
            }
            if (strArr != null) {
                i10 = 0;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                i11 = i10 - 1;
            } else {
                i11 = 0;
            }
            if (strArr != null) {
                str = strArr[2];
                if (str != null) {
                    i13 = Integer.parseInt(str);
                }
            }
            i7 = i13;
            i13 = i11;
        }
        calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, i12);
        calendar.set(2, i13);
        calendar.set(5, i7);
        oVar = (o) this.f27335j;
        if (oVar != null) {
            oVar.f4168c.setTag(calendar);
        }
        oVar2 = (o) this.f27335j;
        if (oVar2 != null) {
            PpFormVertical ppFormVertical2 = oVar2.f4168c;
            String strDate2String2 = TimeUtils.date2String(w().getTime(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
            Intrinsics.checkNotNullExpressionValue(strDate2String2, "date2String(...)");
            ppFormVertical2.setEditContent(strDate2String2);
        }
    }

    public final void D(AddUserExtraInfoReq addUserExtraInfoReq) {
        o oVar = (o) this.f27335j;
        addUserExtraInfoReq.gender = String.valueOf(oVar != null ? Integer.valueOf(oVar.f4167b.getGender()) : null);
        String strDate2String = TimeUtils.date2String(w().getTime(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH));
        Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
        addUserExtraInfoReq.birthday = strDate2String;
        addUserExtraInfoReq.firstName = x();
        addUserExtraInfoReq.lastName = y();
        addUserExtraInfoReq.middleName = z();
    }

    public final void E(AddUserExtraInfoReq addUserExtraInfoReq) {
        o oVar = (o) this.f27335j;
        if (oVar != null) {
            IconicsTextView iconicsTextView = oVar.f4174j;
            int i7 = h.ac_msg_sign_up_header_9;
            Integer num = addUserExtraInfoReq.verifyType;
            iconicsTextView.setText(getString(i7, (num != null && num.intValue() == 3) ? getString(k.core_bvn) : "NIN", addUserExtraInfoReq.verifyNum));
        }
    }

    public final boolean F() {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpButton ppButton;
        PpFormVertical ppFormVertical4;
        PpFormVertical ppFormVertical5;
        boolean z3 = false;
        if (TextUtils.isEmpty(x())) {
            o oVar = (o) this.f27335j;
            if (oVar != null && (ppFormVertical5 = oVar.f4169d) != null) {
                ppFormVertical5.setBottomText("");
            }
            o oVar2 = (o) this.f27335j;
            if (oVar2 != null && (ppFormVertical4 = oVar2.f4169d) != null) {
                ppFormVertical4.d();
            }
        } else if (TextUtils.isEmpty(y())) {
            o oVar3 = (o) this.f27335j;
            if (oVar3 != null && (ppFormVertical3 = oVar3.f4170e) != null) {
                ppFormVertical3.setBottomText("");
            }
            o oVar4 = (o) this.f27335j;
            if (oVar4 != null && (ppFormVertical2 = oVar4.f4169d) != null) {
                ppFormVertical2.d();
            }
        } else {
            o oVar5 = (o) this.f27335j;
            if (!TextUtils.isEmpty((oVar5 == null || (ppFormVertical = oVar5.f4168c) == null) ? null : ppFormVertical.getEditContent())) {
                z3 = true;
            }
        }
        o oVar6 = (o) this.f27335j;
        if (oVar6 != null && (ppButton = oVar6.f4172g) != null) {
            ppButton.setEnabled(z3);
        }
        return z3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
        F();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26177o) {
            return false;
        }
        Context context = getContext();
        if (context == null) {
            return true;
        }
        int i7 = h.ac_quit;
        n.O(context, 0, null, "Complete Information", null, null, null, "Fill out your personal information, activate your account and get a bonus!", null, ReactEditTextInputConnectionWrapper.ENTER_KEY_VALUE, null, Integer.valueOf(i7), null, new r(this, 0), null, true, 0, 8312187);
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ImageView rightImg;
        AppCompatEditText editText;
        AppCompatEditText editText2;
        AppCompatEditText editText3;
        AppCompatEditText editText4;
        final int i7 = 1;
        final int i10 = 0;
        int integer = getResources().getInteger(f.max_name_length);
        o oVar = (o) this.f27335j;
        if (oVar != null) {
            oVar.f4169d.setInputFilters(new InputFilter[]{new c(integer, 0), new b()});
        }
        o oVar2 = (o) this.f27335j;
        if (oVar2 != null) {
            oVar2.f4170e.setInputFilters(new InputFilter[]{new c(integer, 0), new b()});
        }
        o oVar3 = (o) this.f27335j;
        if (oVar3 != null) {
            oVar3.f4171f.setInputFilters(new b[]{new b()});
        }
        o oVar4 = (o) this.f27335j;
        if (oVar4 != null) {
            oVar4.f4169d.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: V8.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationStep2Fragment f10159b;

                {
                    this.f10159b = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z3) {
                    switch (i10) {
                        case 0:
                            if (!z3) {
                                IdentityVerificationStep2Fragment identityVerificationStep2Fragment = this.f10159b;
                                I8.o oVar5 = (I8.o) identityVerificationStep2Fragment.f27335j;
                                identityVerificationStep2Fragment.u(oVar5 != null ? oVar5.f4169d : null);
                            }
                            break;
                        default:
                            if (!z3) {
                                IdentityVerificationStep2Fragment identityVerificationStep2Fragment2 = this.f10159b;
                                I8.o oVar6 = (I8.o) identityVerificationStep2Fragment2.f27335j;
                                identityVerificationStep2Fragment2.u(oVar6 != null ? oVar6.f4170e : null);
                            }
                            break;
                    }
                }
            });
        }
        o oVar5 = (o) this.f27335j;
        if (oVar5 != null) {
            oVar5.f4170e.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: V8.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdentityVerificationStep2Fragment f10159b;

                {
                    this.f10159b = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z3) {
                    switch (i7) {
                        case 0:
                            if (!z3) {
                                IdentityVerificationStep2Fragment identityVerificationStep2Fragment = this.f10159b;
                                I8.o oVar6 = (I8.o) identityVerificationStep2Fragment.f27335j;
                                identityVerificationStep2Fragment.u(oVar6 != null ? oVar6.f4169d : null);
                            }
                            break;
                        default:
                            if (!z3) {
                                IdentityVerificationStep2Fragment identityVerificationStep2Fragment2 = this.f10159b;
                                I8.o oVar7 = (I8.o) identityVerificationStep2Fragment2.f27335j;
                                identityVerificationStep2Fragment2.u(oVar7 != null ? oVar7.f4170e : null);
                            }
                            break;
                    }
                }
            });
        }
        o oVar6 = (o) this.f27335j;
        if (oVar6 != null) {
            oVar6.f4168c.setEditTextWatcher(this);
        }
        o oVar7 = (o) this.f27335j;
        PpFormVertical ppFormVertical = oVar7 != null ? oVar7.f4168c : null;
        r rVar = new r(this, i7);
        if (ppFormVertical != null && (editText4 = ppFormVertical.getEditText()) != null) {
            editText4.setFocusable(false);
        }
        if (ppFormVertical != null && (editText3 = ppFormVertical.getEditText()) != null) {
            editText3.setEnabled(true);
        }
        if (ppFormVertical != null && (editText2 = ppFormVertical.getEditText()) != null) {
            editText2.setInputType(524289);
        }
        if (ppFormVertical != null && (editText = ppFormVertical.getEditText()) != null) {
            editText.setOnClickListener(rVar);
        }
        if (ppFormVertical != null) {
            ppFormVertical.setRightIconClickListener(rVar);
        }
        o oVar8 = (o) this.f27335j;
        if (oVar8 != null && (rightImg = oVar8.f4168c.getRightImg()) != null) {
            Context context = getContext();
            rightImg.setImageDrawable(context != null ? a.x(context, S6.a.pay_Arrowdown, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, requireContext())), null, 24.0f, 116) : null);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        IdentityVerificationViewModel identityVerificationViewModel;
        int i7 = 1;
        F();
        o oVar = (o) this.f27335j;
        if (oVar != null) {
            oVar.f4169d.setEditTextWatcher(new u(this, 0));
        }
        o oVar2 = (o) this.f27335j;
        if (oVar2 != null) {
            oVar2.f4170e.setEditTextWatcher(new u(this, 1));
        }
        IdentityVerificationViewModel identityVerificationViewModel2 = (IdentityVerificationViewModel) this.f27333i;
        if (identityVerificationViewModel2 != null) {
            C1718p c1718p = new C1718p(1, null);
            Boolean bool = Boolean.FALSE;
            l lVar = identityVerificationViewModel2.f26421e;
            lVar.f27356m = bool;
            Unit unit = Unit.f38893a;
            p140j8.f.v(identityVerificationViewModel2, c1718p, lVar, 0L);
        }
        IdentityVerificationViewModel identityVerificationViewModel3 = (IdentityVerificationViewModel) this.f27333i;
        l lVar2 = identityVerificationViewModel3 != null ? identityVerificationViewModel3.f26421e : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new T8.o(4, lVar2, this), 21));
        }
        IdentityVerificationViewModel identityVerificationViewModel4 = (IdentityVerificationViewModel) this.f27333i;
        l lVar3 = identityVerificationViewModel4 != null ? identityVerificationViewModel4.f26422f : null;
        if (lVar3 != null) {
            lVar3.e(this, new G(new T8.o(3, this, this), 21));
        }
        IdentityVerificationViewModel identityVerificationViewModel5 = (IdentityVerificationViewModel) this.f27333i;
        l lVar4 = identityVerificationViewModel5 != null ? identityVerificationViewModel5.f26423g : null;
        if (lVar4 != null) {
            lVar4.e(this, new G(new t(this, this, i7), 21));
        }
        IdentityVerificationViewModel identityVerificationViewModel6 = (IdentityVerificationViewModel) this.f27333i;
        l lVar5 = identityVerificationViewModel6 != null ? identityVerificationViewModel6.f26424i : null;
        if (lVar5 != null) {
            lVar5.e(this, new G(new t(this, this, 2), 21));
        }
        IdentityVerificationViewModel identityVerificationViewModel7 = (IdentityVerificationViewModel) this.f27333i;
        l lVar6 = identityVerificationViewModel7 != null ? identityVerificationViewModel7.f26426o : null;
        if (lVar6 != null) {
            lVar6.e(this, new G(new t(this), 21));
        }
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA == null || !identityVerificationActivityA.r() || (identityVerificationViewModel = (IdentityVerificationViewModel) this.f27333i) == null) {
            return;
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        p140j8.f.s(identityVerificationViewModel, new C1719q(identityVerificationActivityA2 != null ? identityVerificationActivityA2.f25864c : null, null), identityVerificationViewModel.f26426o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        super.o();
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null) {
            identityVerificationActivityA.s((IdentityVerificationViewModel) this.f27333i, new C0463g(this, 15));
        }
        this.t = NavHostFragment.f17502e.findNavController(this);
        o oVar = (o) this.f27335j;
        if (oVar != null) {
            oVar.f4172g.setOnClickListener(new r(this, 2));
        }
        o oVar2 = (o) this.f27335j;
        if (oVar2 != null) {
            oVar2.f4167b.setOnCheckedChangeListener(new g(this, 5));
        }
        o oVar3 = (o) this.f27335j;
        if (oVar3 != null) {
            oVar3.f4167b.setMaleIconVisible(false);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 != null && (checkIdentifyReqN = identityVerificationActivityA2.n()) != null) {
            E(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityA3 = A();
        if (identityVerificationActivityA3 != null && (addUserExtraInfoReqL = identityVerificationActivityA3.l()) != null) {
            E(addUserExtraInfoReqL);
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
            D(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 != null && (addUserExtraInfoReqL = identityVerificationActivityA2.l()) != null) {
            D(addUserExtraInfoReqL);
        }
        super.onPause();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        super.onResume();
        IdentityVerificationActivity identityVerificationActivityA = A();
        if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
            C(checkIdentifyReqN);
        }
        IdentityVerificationActivity identityVerificationActivityA2 = A();
        if (identityVerificationActivityA2 == null || (addUserExtraInfoReqL = identityVerificationActivityA2.l()) == null) {
            return;
        }
        C(addUserExtraInfoReqL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ViewBinding viewBinding = this.f27335j;
        o oVar = (o) viewBinding;
        String editContent = null;
        if ((oVar != null ? oVar.f4169d : null) != null) {
            o oVar2 = (o) viewBinding;
            outState.putString("inputFirstName", (oVar2 == null || (ppFormVertical3 = oVar2.f4169d) == null) ? null : ppFormVertical3.getEditContent());
        }
        ViewBinding viewBinding2 = this.f27335j;
        o oVar3 = (o) viewBinding2;
        if ((oVar3 != null ? oVar3.f4170e : null) != null) {
            o oVar4 = (o) viewBinding2;
            outState.putString("inputLastName", (oVar4 == null || (ppFormVertical2 = oVar4.f4170e) == null) ? null : ppFormVertical2.getEditContent());
        }
        ViewBinding viewBinding3 = this.f27335j;
        o oVar5 = (o) viewBinding3;
        if ((oVar5 != null ? oVar5.f4171f : null) != null) {
            o oVar6 = (o) viewBinding3;
            if (oVar6 != null && (ppFormVertical = oVar6.f4171f) != null) {
                editContent = ppFormVertical.getEditContent();
            }
            outState.putString("inputMiddleName", editContent);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        o oVar;
        PpFormVertical ppFormVertical;
        o oVar2;
        PpFormVertical ppFormVertical2;
        o oVar3;
        PpFormVertical ppFormVertical3;
        super.onViewStateRestored(bundle);
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("inputFirstName");
        if (!TextUtils.isEmpty(string)) {
            ViewBinding viewBinding = this.f27335j;
            o oVar4 = (o) viewBinding;
            if ((oVar4 != null ? oVar4.f4169d : null) != null && (oVar3 = (o) viewBinding) != null && (ppFormVertical3 = oVar3.f4169d) != null) {
                ppFormVertical3.setEditContent(string);
            }
        }
        String string2 = bundle.getString("inputLastName");
        if (!TextUtils.isEmpty(string2)) {
            ViewBinding viewBinding2 = this.f27335j;
            o oVar5 = (o) viewBinding2;
            if ((oVar5 != null ? oVar5.f4170e : null) != null && (oVar2 = (o) viewBinding2) != null && (ppFormVertical2 = oVar2.f4170e) != null) {
                ppFormVertical2.setEditContent(string2);
            }
        }
        if (TextUtils.isEmpty(bundle.getString("inputMiddleName"))) {
            return;
        }
        ViewBinding viewBinding3 = this.f27335j;
        o oVar6 = (o) viewBinding3;
        if ((oVar6 != null ? oVar6.f4171f : null) == null || (oVar = (o) viewBinding3) == null || (ppFormVertical = oVar.f4171f) == null) {
            return;
        }
        ppFormVertical.setEditContent(string2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_identity_verification_step2, viewGroup, false);
        int i7 = F8.d.genderView;
        GenderV2View genderV2View = (GenderV2View) p059e1.a.m(i7, viewInflate);
        if (genderV2View != null) {
            i7 = F8.d.inputBirthday;
            PpFormVertical ppFormVertical = (PpFormVertical) p059e1.a.m(i7, viewInflate);
            if (ppFormVertical != null) {
                i7 = F8.d.inputFirstName;
                PpFormVertical ppFormVertical2 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                if (ppFormVertical2 != null) {
                    i7 = F8.d.inputLastName;
                    PpFormVertical ppFormVertical3 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                    if (ppFormVertical3 != null) {
                        i7 = F8.d.inputMiddleName;
                        PpFormVertical ppFormVertical4 = (PpFormVertical) p059e1.a.m(i7, viewInflate);
                        if (ppFormVertical4 != null) {
                            i7 = F8.d.textViewNext;
                            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                            if (ppButton != null) {
                                i7 = F8.d.tvGenderError;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = F8.d.tvMessage;
                                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                    if (iconicsTextView != null) {
                                        o oVar = new o((ConstraintLayout) viewInflate, genderV2View, ppFormVertical, ppFormVertical2, ppFormVertical3, ppFormVertical4, ppButton, textView, iconicsTextView);
                                        Intrinsics.checkNotNullExpressionValue(oVar, "inflate(...)");
                                        return oVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u(PpFormVertical ppFormVertical) {
        List list;
        if (ppFormVertical != null) {
            String editContent = ppFormVertical.getEditContent();
            if (TextUtils.isEmpty(editContent) || (list = this.f26178p) == null) {
                return;
            }
            if (list == null || !list.isEmpty()) {
                List<RegularRuleRsp.DataBean> list2 = this.f26178p;
                Intrinsics.e(list2);
                for (RegularRuleRsp.DataBean dataBean : list2) {
                    if (RegexUtils.isMatch(dataBean.rule, editContent) != dataBean.pass) {
                        ppFormVertical.h(dataBean.msg);
                    } else {
                        ppFormVertical.d();
                    }
                }
            }
        }
    }

    public final boolean v() {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        PpFormVertical ppFormVertical5;
        PpFormVertical ppFormVertical6;
        String strX = x();
        String strY = y();
        String strZ = z();
        o oVar = (o) this.f27335j;
        if (oVar != null && (ppFormVertical6 = oVar.f4169d) != null) {
            ppFormVertical6.d();
        }
        o oVar2 = (o) this.f27335j;
        if (oVar2 != null && (ppFormVertical5 = oVar2.f4170e) != null) {
            ppFormVertical5.d();
        }
        o oVar3 = (o) this.f27335j;
        if (oVar3 != null && (ppFormVertical4 = oVar3.f4171f) != null) {
            ppFormVertical4.d();
        }
        List<RegularRuleRsp.DataBean> list = this.f26178p;
        Intrinsics.e(list);
        for (RegularRuleRsp.DataBean dataBean : list) {
            if (RegexUtils.isMatch(dataBean.rule, strX) != dataBean.pass) {
                o oVar4 = (o) this.f27335j;
                if (oVar4 != null && (ppFormVertical = oVar4.f4169d) != null) {
                    ppFormVertical.h(dataBean.msg);
                }
                return false;
            }
            if (RegexUtils.isMatch(dataBean.rule, strY) != dataBean.pass) {
                o oVar5 = (o) this.f27335j;
                if (oVar5 != null && (ppFormVertical2 = oVar5.f4170e) != null) {
                    ppFormVertical2.h(dataBean.msg);
                }
                return false;
            }
            if (!TextUtils.isEmpty(strZ) && RegexUtils.isMatch(dataBean.rule, strZ) != dataBean.pass) {
                o oVar6 = (o) this.f27335j;
                if (oVar6 != null && (ppFormVertical3 = oVar6.f4171f) != null) {
                    ppFormVertical3.h(dataBean.msg);
                }
                return false;
            }
        }
        return true;
    }

    public final Calendar w() {
        PpFormVertical ppFormVertical;
        o oVar = (o) this.f27335j;
        Object tag = (oVar == null || (ppFormVertical = oVar.f4168c) == null) ? null : ppFormVertical.getTag();
        if (tag instanceof Calendar) {
            return (Calendar) tag;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - 18);
        calendar.setTimeInMillis(calendar.getTimeInMillis() - 86400000);
        return calendar;
    }

    public final String x() {
        PpFormVertical ppFormVertical;
        String editContent;
        o oVar = (o) this.f27335j;
        return (oVar == null || (ppFormVertical = oVar.f4169d) == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    public final String y() {
        PpFormVertical ppFormVertical;
        String editContent;
        o oVar = (o) this.f27335j;
        return (oVar == null || (ppFormVertical = oVar.f4170e) == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }

    public final String z() {
        PpFormVertical ppFormVertical;
        String editContent;
        o oVar = (o) this.f27335j;
        return (oVar == null || (ppFormVertical = oVar.f4171f) == null || (editContent = ppFormVertical.getEditContent()) == null) ? "" : editContent;
    }
}
