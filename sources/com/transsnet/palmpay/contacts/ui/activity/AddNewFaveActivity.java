package com.transsnet.palmpay.contacts.ui.activity;

import Bc.i;
import Fd.G;
import L6.b;
import O6.c;
import O6.d;
import Pa.r0;
import R9.e;
import R9.f;
import S6.a;
import V9.C0714c;
import V9.C0716e;
import V9.C0718g;
import V9.ViewOnClickListenerC0715d;
import Z9.m;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.flexbox.FlexboxLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/add_new_fave")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/AddNewFaveActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/contacts/ui/viewmodel/PalmPayFriendsViewModel;", "<init>", "()V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddNewFaveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddNewFaveActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/AddNewFaveActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,369:1\n171#2,12:370\n215#2:382\n171#2,12:383\n215#2:395\n171#2,12:396\n215#2:408\n171#2,12:409\n215#2:421\n171#2,12:422\n215#2:434\n*S KotlinDebug\n*F\n+ 1 AddNewFaveActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/AddNewFaveActivity\n*L\n145#1:370,12\n145#1:382\n148#1:383,12\n148#1:395\n152#1:396,12\n152#1:408\n164#1:409,12\n164#1:421\n174#1:422,12\n174#1:434\n*E\n"})
public final class AddNewFaveActivity extends BaseMvvmActivity<PalmPayFriendsViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f27138o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27142f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f27145j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27139c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27140d = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27143g = "3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27144i = "";

    public static final void m(AddNewFaveActivity addNewFaveActivity, CommonResult commonResult) {
        if (commonResult.isSuccess()) {
            a aVar = a.pay_SelectedOutline;
            String string = addNewFaveActivity.getString(f.ct_submitted_succ);
            ToastDialog toastDialog = new ToastDialog(addNewFaveActivity, t.cv_toast_dialog);
            toastDialog.setMessage(null);
            toastDialog.setTitle(string);
            toastDialog.setIcon(0);
            if (aVar != null) {
                toastDialog.setIcon(p059e1.a.h(addNewFaveActivity, aVar, null, addNewFaveActivity.getColor(b.ppColorButtonTextWhite), 32.0f));
            } else {
                toastDialog.setIcon((Drawable) null);
            }
            toastDialog.setBackground(0);
            toastDialog.show(2000L);
            toastDialog.setOnDismissListener(new Dd.b(addNewFaveActivity, 11));
            return;
        }
        if (Intrinsics.c(commonResult.getRespCode(), "88000000")) {
            c cVar = new c(addNewFaveActivity);
            cVar.f6596b = d.f("");
            cVar.d(k.core_confirm, new ViewOnClickListenerC0715d(addNewFaveActivity, 1));
            cVar.c(k.core_cancel, null);
            cVar.f6598d = addNewFaveActivity.getString(f.ct_add_fave_repeat);
            cVar.a().show();
            return;
        }
        c cVar2 = new c(addNewFaveActivity);
        cVar2.f6596b = d.f("");
        cVar2.f6607m = r.cv_warning_yellow;
        cVar2.d(f.ct_okay, null);
        cVar2.f6598d = commonResult.getRespMsg();
        cVar2.a().show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ct_add_new_fave_activity, (ViewGroup) null, false);
        int i7 = R9.d.editName;
        EditText editText = (EditText) p059e1.a.m(i7, viewInflate);
        if (editText != null) {
            i7 = R9.d.editRemark;
            EditText editText2 = (EditText) p059e1.a.m(i7, viewInflate);
            if (editText2 != null) {
                i7 = R9.d.inputMobile;
                ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = (ModelEnterPhoneNumber1) p059e1.a.m(i7, viewInflate);
                if (modelEnterPhoneNumber1 != null) {
                    i7 = R9.d.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = R9.d.tvSubmit;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = R9.d.viewRelationship;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) p059e1.a.m(i7, viewInflate);
                            if (flexboxLayout != null) {
                                i iVar = new i((LinearLayout) viewInflate, editText, editText2, modelEnterPhoneNumber1, ppTitleBar, textView, flexboxLayout);
                                this.f27145j = iVar;
                                return iVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final String n() {
        String phoneNumInput;
        String strK;
        i iVar = this.f27145j;
        return (iVar == null || (phoneNumInput = ((ModelEnterPhoneNumber1) iVar.f729g).getPhoneNumInput()) == null || (strK = y.k(phoneNumInput, " ", "")) == null) ? "" : strK;
    }

    public final void o(boolean z3) {
        i iVar;
        FlexboxLayout flexboxLayout;
        int childCount;
        if (this.f27139c == -1 || (iVar = this.f27145j) == null || (childCount = (flexboxLayout = (FlexboxLayout) iVar.f730i).getChildCount()) < 0) {
            return;
        }
        int i7 = 0;
        while (r0.q(flexboxLayout.getChildAt(i7).getTag().toString()) != this.f27139c) {
            if (i7 == childCount) {
                return;
            } else {
                i7++;
            }
        }
        flexboxLayout.getChildAt(i7).setSelected(z3);
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        EditText editText;
        EditText editText2;
        super.onActivityResult(i7, i10, intent);
        if (i7 == this.f27140d && i10 == -1) {
            i iVar = this.f27145j;
            if (iVar != null && (editText2 = ((ModelEnterPhoneNumber1) iVar.f729g).f28343c) != null) {
                editText2.setText(r0.w0(intent != null ? intent.getStringExtra("PHONE_NUMBER") : null));
            }
            i iVar2 = this.f27145j;
            if (iVar2 == null || (editText = ((ModelEnterPhoneNumber1) iVar2.f729g).f28343c) == null) {
                return;
            }
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }

    public final void p() {
        Editable text;
        Editable text2;
        AddRelationShipReq req = new AddRelationShipReq();
        req.phone = n();
        req.relationship = String.valueOf(this.f27139c);
        i iVar = this.f27145j;
        req.remark = (iVar == null || (text2 = ((EditText) iVar.f727e).getText()) == null) ? null : text2.toString();
        i iVar2 = this.f27145j;
        req.uniqueName = (iVar2 == null || (text = ((EditText) iVar2.f726d).getText()) == null) ? null : text.toString();
        String str = this.f27143g;
        req.firstSource = str;
        req.finalSource = str;
        req.newPhone = n();
        PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) l();
        if (palmPayFriendsViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.s(palmPayFriendsViewModel, new m(req, null), palmPayFriendsViewModel.f27304g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PalmPayFriendsViewModel) l()).f27303f;
        if (lVar != null) {
            lVar.e(this, new G(new C0716e(this, this, 0), 24));
        }
        l lVar2 = ((PalmPayFriendsViewModel) l()).f27304g;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0716e(this, this, 1), 24));
        }
        l lVar3 = ((PalmPayFriendsViewModel) l()).f27305i;
        if (lVar3 != null) {
            lVar3.e(this, new G(new C0716e(this, this, 2), 24));
        }
        l lVar4 = ((PalmPayFriendsViewModel) l()).f27306j;
        if (lVar4 != null) {
            lVar4.e(this, new G(new C0716e(this, this, 3), 24));
        }
        l lVar5 = ((PalmPayFriendsViewModel) l()).f27308p;
        if (lVar5 != null) {
            lVar5.e(this, new G(new C0716e(this, this, 4), 24));
        }
        ((ContactsApiService) S9.a.f8824a.f41079b).queryRecipientRelationshipEnumList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        ImageView imageView;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        ViewOnClickListenerC0715d viewOnClickListenerC0715d = new ViewOnClickListenerC0715d(this, 2);
        i iVar = this.f27145j;
        h.q(viewOnClickListenerC0715d, iVar != null ? (TextView) iVar.f728f : null);
        i iVar2 = this.f27145j;
        if (iVar2 != null) {
            ((ModelEnterPhoneNumber1) iVar2.f729g).setCallBack(new C0718g(this));
        }
        i iVar3 = this.f27145j;
        if (iVar3 != null && (imageView = ((ModelEnterPhoneNumber1) iVar3.f729g).f28344d) != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC0715d(this, 3));
        }
        i iVar4 = this.f27145j;
        if (iVar4 != null) {
            ((ModelEnterPhoneNumber1) iVar4.f729g).f28350o = true;
        }
        if (iVar4 != null && (editText4 = ((ModelEnterPhoneNumber1) iVar4.f729g).f28343c) != null) {
            editText4.setHintTextColor(getColor(b.ppColorTextDisable));
        }
        i iVar5 = this.f27145j;
        if (iVar5 != null && (editText3 = ((ModelEnterPhoneNumber1) iVar5.f729g).f28343c) != null) {
            editText3.setTypeface(Typeface.create("sans-serif", 0));
        }
        if (TextUtils.isEmpty(this.f27142f)) {
            return;
        }
        i iVar6 = this.f27145j;
        if (iVar6 != null && (editText2 = ((ModelEnterPhoneNumber1) iVar6.f729g).f28343c) != null) {
            editText2.setText(r0.w0(this.f27142f));
        }
        i iVar7 = this.f27145j;
        if (iVar7 != null && (editText = ((ModelEnterPhoneNumber1) iVar7.f729g).f28343c) != null) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
        i iVar8 = this.f27145j;
        if (iVar8 != null) {
            ((PpTitleBar) iVar8.f725c).setTitle(getString(f.ct_edit_fave));
        }
    }
}
