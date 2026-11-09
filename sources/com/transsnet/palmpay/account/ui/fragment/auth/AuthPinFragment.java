package com.transsnet.palmpay.account.ui.fragment.auth;

import C9.ViewOnClickListenerC0146m;
import F8.d;
import F8.e;
import M7.s;
import R8.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthTouchIdV2Fragment;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SpanUtils;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public class AuthPinFragment extends BaseFragment implements KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PinEntryView f26095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f26096j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f26097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f26098p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26100w = 1;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        int i7 = getArguments().getInt("extra_type", 1);
        this.f26100w = i7;
        if (i7 != 2) {
            return e.ac_fragment_auth_pin;
        }
        BarUtils.setStatusBarLightMode(getActivity().getWindow(), true);
        return e.ac_fragment_auth_pin_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        this.f26095i.setOnPinEnteredListener(new b(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26095i = (PinEntryView) this.f27318b.findViewById(d.pinView);
        this.f26096j = (TextView) this.f27318b.findViewById(d.textViewMessage);
        this.f26098p = (TextView) this.f27318b.findViewById(d.textViewFailMessage);
        TextView textView = (TextView) this.f27318b.findViewById(d.tv_forget_pin);
        this.f26097o = textView;
        textView.setOnClickListener(new ViewOnClickListenerC0146m(this, 7));
        this.t = getArguments().getInt("extra_mode");
        this.f26099v = getArguments().getBoolean("need_pin", false);
        this.f26095i.setEnabled(false);
        v();
        final int i7 = 0;
        this.f27318b.findViewById(d.imageViewClose).setOnClickListener(new View.OnClickListener(this) { // from class: R8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthPinFragment f7935b;

            {
                this.f7935b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationActivity authenticationActivity;
                switch (i7) {
                    case 0:
                        this.f7935b.getActivity().onBackPressed();
                        break;
                    default:
                        AuthPinFragment authPinFragment = this.f7935b;
                        if (authPinFragment.t == 0 && (authenticationActivity = (AuthenticationActivity) authPinFragment.getActivity()) != null) {
                            p220oa.h.i(authenticationActivity, F8.d.fragment_container, AuthTouchIdV2Fragment.f26106A.newInstance(authPinFragment.t, authenticationActivity.f25832c, null, authenticationActivity.getIntent().getStringExtra("extra_scene")));
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f27318b.findViewById(d.textViewMessage).setOnClickListener(new View.OnClickListener(this) { // from class: R8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthPinFragment f7935b;

            {
                this.f7935b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationActivity authenticationActivity;
                switch (i10) {
                    case 0:
                        this.f7935b.getActivity().onBackPressed();
                        break;
                    default:
                        AuthPinFragment authPinFragment = this.f7935b;
                        if (authPinFragment.t == 0 && (authenticationActivity = (AuthenticationActivity) authPinFragment.getActivity()) != null) {
                            p220oa.h.i(authenticationActivity, F8.d.fragment_container, AuthTouchIdV2Fragment.f26106A.newInstance(authPinFragment.t, authenticationActivity.f25832c, null, authenticationActivity.getIntent().getStringExtra("extra_scene")));
                            break;
                        }
                        break;
                }
            }
        });
        ((KeyboardGridLayout) this.f27318b.findViewById(p025ba.e.number_keyboard_content)).setNumKeyboardClickListener(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        String string = this.f26095i.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f26095i.setText(string.substring(0, string.length() - 1));
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String str) {
        String string = this.f26095i.getText().toString();
        if (string == null || string.length() <= 4) {
            this.f26095i.setText(string + str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getActivity() == null || getActivity().getWindow() == null) {
            return;
        }
        getActivity().getWindow().clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getActivity() == null || getActivity().getWindow() == null) {
            return;
        }
        getActivity().getWindow().setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
    }

    public final void t(String str, String str2) {
        AuthenticationActivity authenticationActivity = (AuthenticationActivity) getActivity();
        if (authenticationActivity == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = SecurityUtils.a(this.f26095i.getText().toString());
        }
        int i7 = this.t;
        if (i7 == 1) {
            h.i(authenticationActivity, d.fragment_container, AuthTouchIdV2Fragment.f26106A.newInstance(i7, authenticationActivity.f25832c, str, authenticationActivity.getIntent().getStringExtra("extra_scene")));
        } else {
            authenticationActivity.m(str, str2, true);
        }
    }

    public final void u(String str) {
        TextView textView = this.f26098p;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(L6.b.ppColorError));
            this.f26098p.setText(str);
            this.f26098p.setVisibility(0);
            this.f26098p.postDelayed(new s(this, 11), 1000L);
        }
        this.f26096j.setVisibility(8);
    }

    public final void v() {
        if (this.f26096j == null || !isVisible() || isDetached()) {
            return;
        }
        this.f26096j.setVisibility(0);
        this.f26098p.setVisibility(8);
        if (this.t == 0) {
            this.f26096j.setText(new SpanUtils().append(getString(F8.h.ac_use_touch_id)).setForegroundColor(getResources().getColor(L6.b.ppColorPrimary)).create());
        } else if (this.f26100w == 2) {
            this.f26096j.setText(F8.h.ac_msg_input_pin);
        } else {
            this.f26096j.setText("");
        }
    }
}
