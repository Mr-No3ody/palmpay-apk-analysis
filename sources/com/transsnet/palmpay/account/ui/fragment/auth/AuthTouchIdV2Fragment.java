package com.transsnet.palmpay.account.ui.fragment.auth;

import C9.C0138e;
import C9.C0139f;
import F8.e;
import F8.h;
import Ja.t;
import android.content.Context;
import android.os.Bundle;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.core.content.d;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import io.fastkv.n;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/AuthTouchIdV2Fragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/SafeVerifyViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthTouchIdV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTouchIdV2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/AuthTouchIdV2Fragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,273:1\n115#2,8:274\n145#2:282\n*S KotlinDebug\n*F\n+ 1 AuthTouchIdV2Fragment.kt\ncom/transsnet/palmpay/account/ui/fragment/auth/AuthTouchIdV2Fragment\n*L\n243#1:274,8\n243#1:282\n*E\n"})
public final class AuthTouchIdV2Fragment extends BaseMvvmFragment<SafeVerifyViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f26106A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26107j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26109p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f26110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f26111w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AuthTouchIdV2Fragment newInstance(int i7, boolean z3, @Nullable String str, @Nullable String str2) {
            AuthTouchIdV2Fragment authTouchIdV2Fragment = new AuthTouchIdV2Fragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_mode", i7);
            bundle.putBoolean("_encrypt", z3);
            bundle.putString("extra_data", str);
            bundle.putString("extra_scene", str2);
            authTouchIdV2Fragment.setArguments(bundle);
            return authTouchIdV2Fragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.ac_fragment_auth_touch_id_v2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        this.f26111w = new w(this, d.d(requireContext()), new t(this, 2));
        v vVar = new v();
        vVar.f13097a = getString(h.ac_touch_id_verification);
        Intrinsics.checkNotNullExpressionValue(vVar, "setTitle(...)");
        if (this.f26107j == 0) {
            vVar.f13099c = getString(h.ac_user_pin_to_touch_id);
        } else {
            vVar.f13099c = getString(h.ac_cancel);
        }
        this.f26110v = vVar.a();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) this.f27333i;
        l lVar = safeVerifyViewModel != null ? safeVerifyViewModel.f26441g : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 24), (byte) 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26107j = arguments.getInt("extra_mode");
            this.f26109p = arguments.getBoolean("_encrypt", false);
            this.t = arguments.getString("extra_data");
            this.f26108o = arguments.getString("extra_scene");
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            w wVar = this.f26111w;
            if (wVar != null) {
                wVar.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u();
    }

    public final AuthenticationActivity t() {
        E activity = getActivity();
        if (activity instanceof AuthenticationActivity) {
            return (AuthenticationActivity) activity;
        }
        return null;
    }

    public final void u() {
        Context context;
        int i7 = 0;
        String str = this.f27317a;
        F6.d.h(str, 3, "startAuthentication: ");
        v vVar = this.f26110v;
        if (vVar != null) {
            try {
                Cipher cipherD = null;
                if (!this.f26109p) {
                    w wVar = this.f26111w;
                    if (wVar != null) {
                        wVar.b(vVar, null);
                        Unit unit = Unit.f38893a;
                        return;
                    }
                    return;
                }
                if (Intrinsics.c(this.f26108o, "_scene_login_with_touch")) {
                    Cipher cipherD2 = p145jd.a.d("login_keystore_alias", false);
                    w wVar2 = this.f26111w;
                    if (wVar2 != null) {
                        wVar2.a(vVar, new u(cipherD2));
                        Unit unit2 = Unit.f38893a;
                        return;
                    }
                    return;
                }
                Context context2 = getContext();
                p145jd.a aVar = new p145jd.a(context2);
                w wVar3 = this.f26111w;
                if (wVar3 != null) {
                    try {
                        cipherD = p145jd.a.d(aVar.f38590a, true);
                    } catch (Exception e10) {
                        if (e10 instanceof KeyPermanentlyInvalidatedException) {
                            try {
                                p145jd.a.a(context2);
                                aVar.f(context2);
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                                cipher.init(1, p145jd.a.e(aVar.f38590a, true));
                                cipherD = cipher;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    wVar3.a(vVar, new u(cipherD));
                    Unit unit3 = Unit.f38893a;
                }
            } catch (Exception e12) {
                if ((e12 instanceof InvalidKeyException) && (context = getContext()) != null) {
                    n.O(context, 0, Integer.valueOf(h.ac_fingerprint_verifying_unavailable), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to unlock", Integer.valueOf(k.core_confirm), null, new R8.d(this, i7), null, null, null, null, false, 0, 8387197);
                }
                F6.d.h(str, 3, "initData: " + e12);
                Unit unit4 = Unit.f38893a;
            }
        }
    }
}
