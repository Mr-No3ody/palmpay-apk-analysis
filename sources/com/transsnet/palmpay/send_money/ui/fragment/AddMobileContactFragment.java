package com.transsnet.palmpay.send_money.ui.fragment;

import Ab.i;
import Cd.e;
import L6.b;
import O6.c;
import O6.d;
import Pa.r0;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import com.transsnet.palmpay.send_money.bean.EditRecipientReq;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.dialog.SelectDayDialog;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p159kd.h;
import p223od.l;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/AddMobileContactFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lod/l;", "Lcom/transsnet/palmpay/send_money/ui/dialog/SelectDayDialog$DaySelectCallback;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddMobileContactFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMobileContactFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/AddMobileContactFragment\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,477:1\n108#2:478\n80#2,22:479\n*S KotlinDebug\n*F\n+ 1 AddMobileContactFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/AddMobileContactFragment\n*L\n421#1:478\n421#1:479,22\n*E\n"})
public final class AddMobileContactFragment extends BaseMvvmVBFragment<BaseViewModel, l> implements SelectDayDialog.DaySelectCallback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f33662C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f33663A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Disposable f33664B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SelectDayDialog f33665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33666p;
    public int t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RecipientListResp.RecipientBean f33667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f33668w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddMobileContactFragment newInstance(@Nullable RecipientListResp.RecipientBean recipientBean) {
            AddMobileContactFragment addMobileContactFragment = new AddMobileContactFragment();
            if (recipientBean != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("beneficiary_bean", recipientBean);
                addMobileContactFragment.setArguments(bundle);
            }
            return addMobileContactFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void u(AddMobileContactFragment addMobileContactFragment) {
        l lVar = (l) addMobileContactFragment.f27335j;
        if (lVar != null) {
            LinearLayout linearLayout = lVar.f40412b;
            String strValueOf = String.valueOf(lVar.f40421p.getText());
            int length = strValueOf.length() - 1;
            int i7 = 0;
            boolean z3 = false;
            while (i7 <= length) {
                boolean z8 = Intrinsics.h(strValueOf.charAt(!z3 ? i7 : length), 32) <= 0;
                if (z3) {
                    if (!z8) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z8) {
                    i7++;
                } else {
                    z3 = true;
                }
            }
            linearLayout.setVisibility(TextUtils.isEmpty(strValueOf.subSequence(i7, length + 1).toString()) ? 8 : 0);
        }
    }

    public static final void v(AddMobileContactFragment addMobileContactFragment, String str) {
        c cVar = new c(addMobileContactFragment.getContext());
        cVar.e(k.core_title_attention);
        cVar.f6605k = true;
        cVar.f6598d = str;
        cVar.d(k.core_payment_confirm, null);
        d dVarA = cVar.a();
        if (addMobileContactFragment.requireActivity().isFinishing() || addMobileContactFragment.requireActivity().isDestroyed()) {
            return;
        }
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        l lVar;
        ImageView imageView;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        EditText editText6;
        EditText editText7;
        l lVar2 = (l) this.f27335j;
        if (lVar2 != null && (editText7 = lVar2.f40413c.f28343c) != null) {
            editText7.setTypeface(Typeface.create("sans-serif", 0));
        }
        l lVar3 = (l) this.f27335j;
        if (lVar3 != null && (editText6 = lVar3.f40413c.f28343c) != null) {
            editText6.setTextSize(16.0f);
        }
        l lVar4 = (l) this.f27335j;
        if (lVar4 != null && (editText5 = lVar4.f40413c.f28343c) != null) {
            editText5.setTextColor(requireContext().getColor(b.ppColorTextPrimary));
        }
        l lVar5 = (l) this.f27335j;
        if (lVar5 != null && (editText4 = lVar5.f40413c.f28343c) != null) {
            editText4.addTextChangedListener(new i(this, 5));
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            RecipientListResp.RecipientBean recipientBean = arguments != null ? (RecipientListResp.RecipientBean) arguments.getParcelable("beneficiary_bean") : null;
            this.f33667v = recipientBean;
            if (recipientBean != null) {
                this.f33663A = true;
                l lVar6 = (l) this.f27335j;
                if (lVar6 != null && (editText3 = lVar6.f40413c.f28343c) != null) {
                    editText3.setText(r0.w0(recipientBean.getRecipientPhone()));
                }
                l lVar7 = (l) this.f27335j;
                if (lVar7 != null && (editText2 = lVar7.f40413c.f28343c) != null) {
                    editText2.setEnabled(false);
                }
                l lVar8 = (l) this.f27335j;
                if (lVar8 != null && (editText = lVar8.f40413c.f28343c) != null) {
                    editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext()));
                }
                l lVar9 = (l) this.f27335j;
                if (lVar9 != null) {
                    lVar9.f40420o.setCompoundDrawablesWithIntrinsicBounds(0, 0, p159kd.d.sm_lock_icon, 0);
                }
                x(true);
                RecipientListResp.RecipientBean recipientBean2 = this.f33667v;
                if ((recipientBean2 != null ? recipientBean2.getScheduleValue() : 0) > 0) {
                    RecipientListResp.RecipientBean recipientBean3 = this.f33667v;
                    onDaySelect(recipientBean3 != null ? recipientBean3.getScheduleValue() : 0);
                }
            }
        }
        if (!this.f33663A && (lVar = (l) this.f27335j) != null && (imageView = lVar.f40413c.f28344d) != null) {
            imageView.setOnClickListener(new e(this, 0));
        }
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ((SendMoneyApiService) p188md.b.f39648a.f6830b).queryRecipientRelationshipList().k(f.f42629b).i(p071ef.b.a()).subscribe(new Cd.f(this, 2));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        EditText editText;
        ImageView imageView;
        int i7 = 2;
        int i10 = 1;
        l lVar = (l) this.f27335j;
        if (lVar != null) {
            lVar.f40415e.setOnClickListener(new e(this, i10));
        }
        l lVar2 = (l) this.f27335j;
        if (lVar2 != null) {
            lVar2.f40419j.setOnClickListener(new e(this, i7));
        }
        l lVar3 = (l) this.f27335j;
        if (lVar3 != null && (imageView = lVar3.f40413c.f28344d) != null) {
            imageView.setOnClickListener(new e(this, 3));
        }
        l lVar4 = (l) this.f27335j;
        if (lVar4 != null) {
            lVar4.f40413c.f28350o = true;
        }
        if (lVar4 != null && (editText = lVar4.f40413c.f28343c) != null) {
            int i11 = 11;
            if (!BaseApplication.isNG() && BaseApplication.isAO()) {
                i11 = 9;
            }
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11 + 2)});
        }
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        ModelEnterPhoneNumber1 modelEnterPhoneNumber1;
        EditText editText;
        ModelEnterPhoneNumber1 modelEnterPhoneNumber2;
        EditText editText2;
        Editable text;
        ModelEnterPhoneNumber1 modelEnterPhoneNumber3;
        EditText editText3;
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1 && i10 == -1) {
            l lVar = (l) this.f27335j;
            if (lVar != null && (modelEnterPhoneNumber3 = lVar.f40413c) != null && (editText3 = modelEnterPhoneNumber3.f28343c) != null) {
                editText3.setText(r0.w0(intent != null ? intent.getStringExtra("PHONE_NUMBER") : null));
            }
            ViewBinding viewBinding = this.f27335j;
            l lVar2 = (l) viewBinding;
            if (lVar2 == null || (modelEnterPhoneNumber1 = lVar2.f40413c) == null || (editText = modelEnterPhoneNumber1.f28343c) == null) {
                return;
            }
            l lVar3 = (l) viewBinding;
            editText.setSelection((lVar3 == null || (modelEnterPhoneNumber2 = lVar3.f40413c) == null || (editText2 = modelEnterPhoneNumber2.f28343c) == null || (text = editText2.getText()) == null) ? 0 : text.length());
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.SelectDayDialog.DaySelectCallback
    public final void onDaySelect(int i7) {
        TextView textView;
        LinearLayout linearLayout;
        TextView textView2;
        this.f33666p = i7;
        l lVar = (l) this.f27335j;
        if (lVar != null && (textView2 = lVar.f40418i) != null) {
            textView2.setVisibility(8);
        }
        l lVar2 = (l) this.f27335j;
        if (lVar2 != null && (linearLayout = lVar2.f40417g) != null) {
            linearLayout.setVisibility(0);
        }
        l lVar3 = (l) this.f27335j;
        if (lVar3 == null || (textView = lVar3.f40416f) == null) {
            return;
        }
        textView.setText(Jd.c.b(this.f33666p));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_add_mobile_contact_fragment, viewGroup, false);
        int i7 = p159kd.e.layoutNickName;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = p159kd.e.model_phone_num_input;
            ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = (ModelEnterPhoneNumber1) p059e1.a.m(i7, viewInflate);
            if (modelEnterPhoneNumber1 != null) {
                i7 = p159kd.e.relationship1_view;
                FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i7, viewInflate);
                if (flexboxLayout != null) {
                    i7 = p159kd.e.save;
                    Button button = (Button) p059e1.a.m(i7, viewInflate);
                    if (button != null) {
                        i7 = p159kd.e.transfer_time;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = p159kd.e.transfer_time_content;
                            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout2 != null) {
                                i7 = p159kd.e.transfer_time_label;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = p159kd.e.transfer_time_view;
                                    RelativeLayout relativeLayout = (RelativeLayout) p059e1.a.m(i7, viewInflate);
                                    if (relativeLayout != null) {
                                        i7 = p159kd.e.tvMiobileNumberTitle;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = p159kd.e.tvNickName;
                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = p159kd.e.tvPhoneNumberError;
                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = p159kd.e.tvRelationshipError;
                                                    TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView6 != null) {
                                                        l lVar = new l((LinearLayout) viewInflate, linearLayout, modelEnterPhoneNumber1, flexboxLayout, button, textView, linearLayout2, textView2, relativeLayout, textView3, textView4, textView5, textView6);
                                                        Intrinsics.checkNotNullExpressionValue(lVar, "inflate(...)");
                                                        return lVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void w(View view) {
        View childAt;
        String phoneNumInput;
        String phoneNumInput2;
        l lVar = (l) this.f27335j;
        boolean zIsEmpty = TextUtils.isEmpty(String.valueOf(lVar != null ? lVar.f40421p.getText() : null));
        if (zIsEmpty) {
            l lVar2 = (l) this.f27335j;
            String strReplace = (lVar2 == null || (phoneNumInput2 = lVar2.f40413c.getPhoneNumInput()) == null) ? null : new Regex(" ").replace(phoneNumInput2, "");
            if (TextUtils.isEmpty(strReplace)) {
                l lVar3 = (l) this.f27335j;
                if (lVar3 != null) {
                    lVar3.t.setText(getString(h.sm_please_enter_mobile_number));
                }
            } else {
                if ((strReplace != null ? strReplace.length() : 0) < PhoneBaseNumberUtils.INSTANCE.getMobileNumberAcceptedLength(BaseApplication.getCountryLocale())) {
                    l lVar4 = (l) this.f27335j;
                    if (lVar4 != null) {
                        lVar4.t.setText(getString(h.sm_correct_mobile_number));
                    }
                }
            }
            l lVar5 = (l) this.f27335j;
            if (lVar5 != null) {
                lVar5.t.setVisibility(0);
                return;
            }
            return;
        }
        if (zIsEmpty) {
            c cVar = new c(this.f27319c);
            cVar.f6596b = d.f("");
            cVar.f6607m = p159kd.d.sm_icon_warn;
            cVar.d(h.sm_action_okay, null);
            cVar.f6598d = getString(h.sm_beneficiary_not_registered);
            cVar.a().show();
            return;
        }
        int id2 = view.getId();
        if (id2 != p159kd.e.save) {
            if (id2 == p159kd.e.transfer_time_view) {
                if (this.f33665o == null) {
                    SelectDayDialog selectDayDialog = new SelectDayDialog(getContext());
                    this.f33665o = selectDayDialog;
                    selectDayDialog.setCallback(this);
                    SelectDayDialog selectDayDialog2 = this.f33665o;
                    if (selectDayDialog2 != null) {
                        selectDayDialog2.setSelectDay(this.f33666p);
                    }
                }
                SelectDayDialog selectDayDialog3 = this.f33665o;
                if (selectDayDialog3 != null) {
                    selectDayDialog3.show();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f33663A) {
            showLoadingDialog(true);
            EditRecipientReq editRecipientReq = new EditRecipientReq();
            RecipientListResp.RecipientBean recipientBean = this.f33667v;
            editRecipientReq.setRecipientId(recipientBean != null ? recipientBean.getRecipientId() : null);
            int i7 = this.t;
            if (i7 > 0) {
                l lVar6 = (l) this.f27335j;
                childAt = lVar6 != null ? lVar6.f40414d.getChildAt(i7) : null;
                Intrinsics.f(childAt, "null cannot be cast to non-null type android.widget.TextView");
                editRecipientReq.setLabel(((TextView) childAt).getText().toString());
            }
            int i10 = this.f33666p;
            if (i10 > 0) {
                editRecipientReq.setScheduleValue(i10);
            }
            ((SendMoneyApiService) p188md.b.f39648a.f6830b).editRecipient(editRecipientReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new Cd.f(this, 1));
            return;
        }
        showLoadingDialog(true);
        AddRecipientReq addRecipientReq = new AddRecipientReq();
        addRecipientReq.setRecipientType(1);
        l lVar7 = (l) this.f27335j;
        addRecipientReq.setRecipientMobileNo(r0.v0(r0.L0((lVar7 == null || (phoneNumInput = lVar7.f40413c.getPhoneNumInput()) == null) ? null : new Regex(" ").replace(phoneNumInput, ""))));
        int i11 = this.t;
        if (i11 > 0) {
            l lVar8 = (l) this.f27335j;
            childAt = lVar8 != null ? lVar8.f40414d.getChildAt(i11) : null;
            Intrinsics.f(childAt, "null cannot be cast to non-null type android.widget.TextView");
            addRecipientReq.setLabel(((TextView) childAt).getText().toString());
        }
        int i12 = this.f33666p;
        if (i12 > 0) {
            addRecipientReq.setScheduleValue(i12);
        }
        ((SendMoneyApiService) p188md.b.f39648a.f6830b).createRecipient(addRecipientReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new Cd.f(this, 0));
    }

    public final void x(boolean z3) {
        l lVar;
        View childAt;
        int i7 = this.t;
        if (i7 < 0 || (lVar = (l) this.f27335j) == null || (childAt = lVar.f40414d.getChildAt(i7)) == null) {
            return;
        }
        childAt.setSelected(z3);
    }
}
