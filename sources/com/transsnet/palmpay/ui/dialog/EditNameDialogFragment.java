package com.transsnet.palmpay.ui.dialog;

import Ab.D;
import Ab.i;
import Ac.e;
import Ac.f;
import Ac.h;
import F6.d;
import L6.b;
import Tb.c;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.ui.dialog.EditNameDialogFragment;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public class EditNameDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public User f35048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f35050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f35051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f35052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TitleEditView f35053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TitleEditView f35054g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TitleEditView f35055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PpFormVertical f35056j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f35057o;

    public final void g(String str, boolean z3) {
        if (!z3) {
            this.f35056j.setBottomText(null);
        } else {
            this.f35056j.setBottomText(str);
            this.f35056j.setBottomTextColor(getContext().getColor(b.ppColorError));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35048a = BaseApplication.getInstance().getUser();
        this.f35049b = getArguments().getBoolean("nickname", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i7 = 1;
        final int i10 = 0;
        View viewInflate = layoutInflater.inflate(f.main_edit_name_dialog_layout, viewGroup, false);
        this.f35051d = (ImageView) viewInflate.findViewById(e.imageViewClose);
        this.f35052e = (TextView) viewInflate.findViewById(e.textViewTitle);
        this.f35053f = (TitleEditView) viewInflate.findViewById(e.inputFirstName);
        this.f35054g = (TitleEditView) viewInflate.findViewById(e.inputMiddleName);
        this.f35055i = (TitleEditView) viewInflate.findViewById(e.inputLastName);
        PpFormVertical ppFormVertical = (PpFormVertical) viewInflate.findViewById(e.editNickName);
        this.f35056j = ppFormVertical;
        ppFormVertical.getEditText().setTextColor(getContext().getColor(b.ppColorTextPrimary));
        this.f35057o = viewInflate.findViewById(e.textViewComplete);
        this.f35051d.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNameDialogFragment f271b;

            {
                this.f271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f271b.dismissAllowingStateLoss();
                        break;
                    default:
                        EditNameDialogFragment editNameDialogFragment = this.f271b;
                        ChangeUserInfoReq changeUserInfoReq = new ChangeUserInfoReq();
                        if (!editNameDialogFragment.f35049b) {
                            changeUserInfoReq.firstName = editNameDialogFragment.f35053f.getEditText();
                            changeUserInfoReq.middleName = editNameDialogFragment.f35054g.getEditText();
                            changeUserInfoReq.lastName = editNameDialogFragment.f35055i.getEditText();
                            if (TextUtils.isEmpty(changeUserInfoReq.firstName)) {
                                TitleEditView titleEditView = editNameDialogFragment.f35053f;
                                titleEditView.setError(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, titleEditView.getTitle()));
                            } else if (TextUtils.isEmpty(changeUserInfoReq.lastName)) {
                                TitleEditView titleEditView2 = editNameDialogFragment.f35055i;
                                titleEditView2.setError(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, titleEditView2.getTitle()));
                            } else if (changeUserInfoReq.firstName.equals(editNameDialogFragment.f35048a.getFirstName()) && changeUserInfoReq.lastName.equals(editNameDialogFragment.f35048a.getLastName())) {
                                editNameDialogFragment.f35055i.setError(editNameDialogFragment.getString(Ac.h.main_msg_name_is_same));
                            } else {
                                editNameDialogFragment.f35048a.setUpdateNameFlag(0);
                            }
                        } else {
                            String editContent = editNameDialogFragment.f35056j.getEditContent();
                            changeUserInfoReq.nickName = editContent;
                            if (TextUtils.isEmpty(editContent)) {
                                editNameDialogFragment.g(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, editNameDialogFragment.getString(Ac.h.main_nick_name)), true);
                            } else if (TextUtils.isDigitsOnly(changeUserInfoReq.nickName)) {
                                editNameDialogFragment.g(editNameDialogFragment.getString(Ac.h.main_msg_valid_characters_only), true);
                            } else {
                                editNameDialogFragment.f35048a.setNickName(changeUserInfoReq.nickName);
                            }
                        }
                        G8.a.t().changeUserName(changeUserInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(editNameDialogFragment, 1));
                        break;
                }
            }
        });
        this.f35057o.setOnClickListener(new View.OnClickListener(this) { // from class: Ae.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNameDialogFragment f271b;

            {
                this.f271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f271b.dismissAllowingStateLoss();
                        break;
                    default:
                        EditNameDialogFragment editNameDialogFragment = this.f271b;
                        ChangeUserInfoReq changeUserInfoReq = new ChangeUserInfoReq();
                        if (!editNameDialogFragment.f35049b) {
                            changeUserInfoReq.firstName = editNameDialogFragment.f35053f.getEditText();
                            changeUserInfoReq.middleName = editNameDialogFragment.f35054g.getEditText();
                            changeUserInfoReq.lastName = editNameDialogFragment.f35055i.getEditText();
                            if (TextUtils.isEmpty(changeUserInfoReq.firstName)) {
                                TitleEditView titleEditView = editNameDialogFragment.f35053f;
                                titleEditView.setError(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, titleEditView.getTitle()));
                            } else if (TextUtils.isEmpty(changeUserInfoReq.lastName)) {
                                TitleEditView titleEditView2 = editNameDialogFragment.f35055i;
                                titleEditView2.setError(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, titleEditView2.getTitle()));
                            } else if (changeUserInfoReq.firstName.equals(editNameDialogFragment.f35048a.getFirstName()) && changeUserInfoReq.lastName.equals(editNameDialogFragment.f35048a.getLastName())) {
                                editNameDialogFragment.f35055i.setError(editNameDialogFragment.getString(Ac.h.main_msg_name_is_same));
                            } else {
                                editNameDialogFragment.f35048a.setUpdateNameFlag(0);
                            }
                        } else {
                            String editContent = editNameDialogFragment.f35056j.getEditContent();
                            changeUserInfoReq.nickName = editContent;
                            if (TextUtils.isEmpty(editContent)) {
                                editNameDialogFragment.g(editNameDialogFragment.getString(p025ba.k.core_msg_sth_is_empty, editNameDialogFragment.getString(Ac.h.main_nick_name)), true);
                            } else if (TextUtils.isDigitsOnly(changeUserInfoReq.nickName)) {
                                editNameDialogFragment.g(editNameDialogFragment.getString(Ac.h.main_msg_valid_characters_only), true);
                            } else {
                                editNameDialogFragment.f35048a.setNickName(changeUserInfoReq.nickName);
                            }
                        }
                        G8.a.t().changeUserName(changeUserInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(editNameDialogFragment, 1));
                        break;
                }
            }
        });
        if (this.f35049b) {
            this.f35052e.setText(h.main_edit_nickname);
            String nickName = this.f35048a.getNickName();
            this.f35056j.setEditContent(nickName);
            try {
                if (!TextUtils.isEmpty(nickName)) {
                    this.f35056j.getEditText().setSelection(this.f35056j.getEditContent().length());
                }
            } catch (Exception e10) {
                d.c("EditNameDialogFragment", "onCreateView: ", e10);
            }
            this.f35056j.getEditText().setFilters(new InputFilter[]{new Tb.b(), new c(getResources().getInteger(p025ba.f.max_nick_name_length), 0)});
            this.f35056j.setVisibility(0);
            this.f35053f.setVisibility(8);
            this.f35054g.setVisibility(8);
            this.f35055i.setVisibility(8);
            this.f35056j.setEditTextWatcher(new i(this, 2));
        } else {
            this.f35052e.setText(h.main_edit_full_name);
            this.f35053f.setEditText(this.f35048a.getFirstName());
            this.f35054g.setEditText(this.f35048a.getMiddleName());
            this.f35055i.setEditText(this.f35048a.getLastName());
            if (BaseApplication.isNG()) {
                this.f35053f.setTitle(getString(h.main_legal_first_name));
                this.f35055i.setTitle(getString(h.main_legal_last_name));
            }
            this.f35056j.setVisibility(8);
            this.f35053f.setVisibility(0);
            this.f35054g.setVisibility(8);
            this.f35055i.setVisibility(0);
            this.f35053f.setInputFilter(new InputFilter[]{new c(getResources().getInteger(p025ba.f.max_name_length), 0), new Tb.b(0)});
            this.f35054g.setInputFilter(new InputFilter[]{new c(getResources().getInteger(p025ba.f.max_name_length), 0), new Tb.b(0)});
            this.f35055i.setInputFilter(new InputFilter[]{new c(getResources().getInteger(p025ba.f.max_name_length), 0), new Tb.b(0)});
        }
        getDialog().getWindow().requestFeature(1);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        a aVar = this.f35050c;
        if (aVar != null) {
            aVar.dispose();
            this.f35050c = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
}
