package Ja;

import Bc.C0105b;
import Pa.n0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.C0915t;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.req.CheckPinTouchWithOrderReq;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdV2Activity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthTouchIdV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayPinWithTouchFragment;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p051d9.C1623u;
import p097g9.X;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, int i7) {
        super(9);
        this.f4679e = i7;
        this.f4680f = obj;
    }

    @Override // p059e1.a
    public final void P(int i7, CharSequence errString) {
        PpButton ppButton;
        TextView textView;
        TextView textView2;
        TextView textView3;
        AuthenticationActivity authenticationActivityT;
        Object obj = this.f4680f;
        int i10 = this.f4679e;
        Intrinsics.checkNotNullParameter(errString, "errString");
        switch (i10) {
            case 0:
                CheckPalmPayPinWithTouchFragment checkPalmPayPinWithTouchFragment = (CheckPalmPayPinWithTouchFragment) obj;
                D3.a.O(D3.a.s(i7, errString, D3.a.C(checkPalmPayPinWithTouchFragment.f27933w), D3.a.B(checkPalmPayPinWithTouchFragment.f27933w), checkPalmPayPinWithTouchFragment.f28003Y));
                if (i7 != 13) {
                    Context context = checkPalmPayPinWithTouchFragment.getContext();
                    if (context != null) {
                        p220oa.h.x(context, ((Object) errString) + "[" + i7 + "]");
                    }
                    PpButton ppButton2 = checkPalmPayPinWithTouchFragment.f27998H;
                    if (ppButton2 != null) {
                        ppButton2.setEnabled(true);
                    }
                    View view = checkPalmPayPinWithTouchFragment.f28000M;
                    if (view != null) {
                        p220oa.h.A(view, true, com.transsnet.palmpay.custom_view.m.cv_anim_bottom_in);
                    }
                } else {
                    checkPalmPayPinWithTouchFragment.D();
                }
                break;
            case 1:
                SetTouchIdV2Activity setTouchIdV2Activity = (SetTouchIdV2Activity) obj;
                if (i7 != 7) {
                    if (i7 == 13) {
                        setTouchIdV2Activity.finish();
                        break;
                    } else if (i7 != 9) {
                        if (i7 == 10) {
                            p220oa.h.x(setTouchIdV2Activity, errString.toString());
                            setTouchIdV2Activity.finish();
                            break;
                        } else {
                            C0105b c0105b = setTouchIdV2Activity.f26028f;
                            if (c0105b != null && (textView3 = (TextView) c0105b.f663c) != null) {
                                textView3.setText(errString.toString());
                            }
                            C0105b c0105b2 = setTouchIdV2Activity.f26028f;
                            if (c0105b2 != null && (textView2 = (TextView) c0105b2.f663c) != null) {
                                p220oa.h.s(textView2, true);
                            }
                            C0105b c0105b3 = setTouchIdV2Activity.f26028f;
                            if (c0105b3 != null && (textView = (TextView) c0105b3.f664d) != null) {
                                p220oa.h.s(textView, false);
                            }
                            C0105b c0105b4 = setTouchIdV2Activity.f26028f;
                            if (c0105b4 != null && (ppButton = (PpButton) c0105b4.f666f) != null) {
                                p220oa.h.s(ppButton, false);
                                break;
                            }
                        }
                    }
                }
                p220oa.h.x(setTouchIdV2Activity, errString.toString());
                setTouchIdV2Activity.finish();
                break;
            case 2:
                AuthTouchIdV2Fragment authTouchIdV2Fragment = (AuthTouchIdV2Fragment) obj;
                if (i7 != 7) {
                    if (i7 != 13) {
                        if (i7 != 9) {
                            if (i7 == 10) {
                                Context context2 = authTouchIdV2Fragment.getContext();
                                if (context2 != null) {
                                    p220oa.h.x(context2, errString.toString());
                                }
                                androidx.fragment.app.E activity = authTouchIdV2Fragment.getActivity();
                                if (activity != null) {
                                    activity.onBackPressed();
                                }
                            } else {
                                Context context3 = authTouchIdV2Fragment.getContext();
                                if (context3 != null) {
                                    p220oa.h.x(context3, errString.toString());
                                }
                            }
                        }
                        break;
                    } else {
                        AuthTouchIdV2Fragment.a aVar = AuthTouchIdV2Fragment.f26106A;
                        int i11 = authTouchIdV2Fragment.f26107j;
                        if (i11 != 0) {
                            androidx.fragment.app.E activity2 = authTouchIdV2Fragment.getActivity();
                            if (activity2 != null) {
                                activity2.onBackPressed();
                            }
                            break;
                        } else if (i11 == 0 && (authenticationActivityT = authTouchIdV2Fragment.t()) != null) {
                            authenticationActivityT.l(authTouchIdV2Fragment.f26107j);
                            break;
                        }
                    }
                }
                Context context4 = authTouchIdV2Fragment.getContext();
                if (context4 != null) {
                    p220oa.h.x(context4, errString.toString());
                }
                androidx.fragment.app.E activity3 = authTouchIdV2Fragment.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                }
                break;
            default:
                LogInWithTouchIdFragment logInWithTouchIdFragment = (LogInWithTouchIdFragment) obj;
                logInWithTouchIdFragment.f26235p = false;
                D3.a.O(D3.a.s(i7, errString, "login", "login_page", logInWithTouchIdFragment.f26237w));
                if (i7 != 5) {
                    if (i7 != 7) {
                        if (i7 == 13) {
                            logInWithTouchIdFragment.x();
                        } else if (i7 != 9) {
                            if (i7 != 10) {
                                logInWithTouchIdFragment.f26236v = true;
                                LogInWithTouchIdFragment.u(logInWithTouchIdFragment, errString);
                                logInWithTouchIdFragment.y();
                            }
                        }
                    }
                    logInWithTouchIdFragment.f26236v = true;
                    LogInWithTouchIdFragment.u(logInWithTouchIdFragment, errString);
                    C0105b c0105b5 = logInWithTouchIdFragment.f26232B;
                    if (c0105b5 != null) {
                        p220oa.h.s((PpButton) c0105b5.f666f, false);
                    }
                    C0105b c0105b6 = logInWithTouchIdFragment.f26232B;
                    if (c0105b6 != null) {
                        p220oa.h.s((TextView) c0105b6.f663c, false);
                    }
                }
                logInWithTouchIdFragment.f26236v = true;
                logInWithTouchIdFragment.z();
                logInWithTouchIdFragment.y();
                break;
        }
    }

    @Override // p059e1.a
    public final void Q() {
        switch (this.f4679e) {
            case 0:
                CheckPalmPayPinWithTouchFragment checkPalmPayPinWithTouchFragment = (CheckPalmPayPinWithTouchFragment) this.f4680f;
                checkPalmPayPinWithTouchFragment.f28003Y++;
                Context context = checkPalmPayPinWithTouchFragment.getContext();
                if (context != null) {
                    p220oa.h.x(context, checkPalmPayPinWithTouchFragment.getString(p025ba.k.core_msg_authentication_fail));
                }
                PpButton ppButton = checkPalmPayPinWithTouchFragment.f27998H;
                if (ppButton != null) {
                    ppButton.setEnabled(true);
                }
                View view = checkPalmPayPinWithTouchFragment.f28000M;
                if (view != null) {
                    p220oa.h.A(view, true, com.transsnet.palmpay.custom_view.m.cv_anim_bottom_in);
                }
                break;
            case 1:
                int i7 = p025ba.k.core_msg_authentication_fail;
                SetTouchIdV2Activity setTouchIdV2Activity = (SetTouchIdV2Activity) this.f4680f;
                p220oa.h.x(setTouchIdV2Activity, setTouchIdV2Activity.getString(i7));
                break;
            case 2:
                AuthTouchIdV2Fragment authTouchIdV2Fragment = (AuthTouchIdV2Fragment) this.f4680f;
                Context context2 = authTouchIdV2Fragment.getContext();
                if (context2 != null) {
                    p220oa.h.x(context2, authTouchIdV2Fragment.getString(p025ba.k.core_msg_authentication_fail));
                }
                break;
            default:
                LogInWithTouchIdFragment logInWithTouchIdFragment = (LogInWithTouchIdFragment) this.f4680f;
                logInWithTouchIdFragment.f26237w++;
                logInWithTouchIdFragment.f26235p = false;
                logInWithTouchIdFragment.f26236v = true;
                LogInWithTouchIdFragment.u(logInWithTouchIdFragment, null);
                logInWithTouchIdFragment.y();
                break;
        }
    }

    @Override // p059e1.a
    public final void R(C0915t result) {
        byte[] bArrDoFinal;
        String str = null;
        Object obj = this.f4680f;
        int i7 = this.f4679e;
        Intrinsics.checkNotNullParameter(result, "result");
        switch (i7) {
            case 0:
                androidx.biometric.u uVar = result.f13090a;
                Cipher cipher = uVar != null ? uVar.f13093b : null;
                int i10 = CheckPalmPayPinWithTouchFragment.f27995Z;
                CheckPalmPayPinWithTouchFragment checkPalmPayPinWithTouchFragment = (CheckPalmPayPinWithTouchFragment) obj;
                try {
                    if (cipher != null) {
                        byte[] bArrDoFinal2 = cipher.doFinal(Base64.decode(p059e1.a.H("main_sp_touch_id_pay_encrypt_text" + BaseApplication.get().getUser().getPhoneNumber()), 2));
                        if (bArrDoFinal2 != null) {
                            str = new String(bArrDoFinal2, Charsets.UTF_8);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            D3.a.O(new Qa.a(D3.a.C(checkPalmPayPinWithTouchFragment.f27933w), "fingerprint", D3.a.B(checkPalmPayPinWithTouchFragment.f27933w), "success", "local_verify", null, null, null, checkPalmPayPinWithTouchFragment.f28003Y, 1760));
                            PpButton ppButton = checkPalmPayPinWithTouchFragment.f27998H;
                            if (ppButton != null) {
                                ppButton.b(true);
                            }
                            PayVerificationCallback payVerificationCallbackU = checkPalmPayPinWithTouchFragment.u();
                            if (payVerificationCallbackU != null) {
                                payVerificationCallbackU.verifyPayMethod(str, Integer.MAX_VALUE);
                            }
                        } else {
                            ToastUtils.showLong(p025ba.k.core_msg_authentication_fail);
                        }
                    } else {
                        ToastUtils.showLong(p025ba.k.core_msg_authentication_fail);
                    }
                } catch (Exception unused) {
                    ToastUtils.showLong(p025ba.k.core_msg_authentication_fail);
                    return;
                }
                break;
            case 1:
                SetTouchIdV2Activity setTouchIdV2Activity = (SetTouchIdV2Activity) obj;
                if (!setTouchIdV2Activity.f26023a) {
                    setTouchIdV2Activity.l();
                } else {
                    androidx.biometric.u uVar2 = result.f13090a;
                    Cipher cipher2 = uVar2 != null ? uVar2.f13093b : null;
                    if (!TextUtils.isEmpty(setTouchIdV2Activity.f26024b) && cipher2 != null) {
                        try {
                            String str2 = setTouchIdV2Activity.f26024b;
                            Intrinsics.e(str2);
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            byte[] bytes = str2.getBytes(UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            byte[] bArrDoFinal3 = cipher2.doFinal(bytes);
                            Intrinsics.checkNotNullExpressionValue(bArrDoFinal3, "doFinal(...)");
                            io.fastkv.n.I(Base64.encodeToString(cipher2.getIV(), 2), Base64.encodeToString(bArrDoFinal3, 2));
                            io.fastkv.n.M(true);
                            D3.a.N("enable", "success", null);
                        } catch (Exception e10) {
                            if (e10 instanceof IllegalBlockSizeException) {
                                p145jd.a.b("login_keystore_alias");
                            }
                            p220oa.h.x(setTouchIdV2Activity, setTouchIdV2Activity.getString(p025ba.k.core_msg_authentication_fail));
                            setTouchIdV2Activity.finish();
                            return;
                        }
                    }
                    setTouchIdV2Activity.l();
                }
                break;
            case 2:
                AuthTouchIdV2Fragment authTouchIdV2Fragment = (AuthTouchIdV2Fragment) obj;
                boolean z3 = authTouchIdV2Fragment.f26109p;
                String str3 = authTouchIdV2Fragment.f27317a;
                if (!z3) {
                    AuthenticationActivity authenticationActivityT = authTouchIdV2Fragment.t();
                    if (authenticationActivityT != null) {
                        String str4 = authenticationActivityT.f25831b;
                        if (!TextUtils.isEmpty(str4)) {
                            CheckPinTouchWithOrderReq req = new CheckPinTouchWithOrderReq();
                            req.orderNo = str4;
                            try {
                                Boolean bool = SecurityUtils.f33145a;
                                req.payPinOrTouch = URLEncoder.encode(SecurityUtils.e(str4.getBytes()), "utf-8");
                            } catch (Exception e11) {
                                F6.d.c(str3, "checkPinWithOrderNo: ", e11);
                            }
                            req.payPinOrTouchFlag = "1";
                            SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) authTouchIdV2Fragment.f27333i;
                            if (safeVerifyViewModel != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                p140j8.f.s(safeVerifyViewModel, new X(req, null), safeVerifyViewModel.f26441g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                        }
                    }
                    AuthenticationActivity authenticationActivityT2 = authTouchIdV2Fragment.t();
                    if (authenticationActivityT2 != null) {
                        authenticationActivityT2.m(null, null, true);
                    }
                } else {
                    androidx.biometric.u uVar3 = result.f13090a;
                    Cipher cipher3 = uVar3 != null ? uVar3.f13093b : null;
                    if (TextUtils.isEmpty(authTouchIdV2Fragment.t) || cipher3 == null) {
                        F6.d.h(str3, 3, "onAuthenticationSucceeded: " + cipher3);
                        AuthenticationActivity authenticationActivityT3 = authTouchIdV2Fragment.t();
                        if (authenticationActivityT3 != null) {
                            authenticationActivityT3.m(null, null, false);
                        }
                    } else {
                        try {
                            String str5 = authTouchIdV2Fragment.t;
                            Intrinsics.e(str5);
                            Charset UTF_9 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                            byte[] bytes2 = str5.getBytes(UTF_9);
                            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                            byte[] bArrDoFinal4 = cipher3.doFinal(bytes2);
                            Intrinsics.checkNotNullExpressionValue(bArrDoFinal4, "doFinal(...)");
                            Intent intent = new Intent();
                            String strEncodeToString = Base64.encodeToString(bArrDoFinal4, 2);
                            String strEncodeToString2 = Base64.encodeToString(cipher3.getIV(), 2);
                            intent.putExtra("_encrypt_text", strEncodeToString);
                            intent.putExtra("_cipher_vector", strEncodeToString2);
                            if (TextUtils.isEmpty(strEncodeToString) || TextUtils.isEmpty(strEncodeToString2)) {
                                AuthenticationActivity authenticationActivityT4 = authTouchIdV2Fragment.t();
                                if (authenticationActivityT4 != null) {
                                    authenticationActivityT4.m(null, null, false);
                                    Unit unit = Unit.f38893a;
                                }
                            } else {
                                AuthenticationActivity authenticationActivityT5 = authTouchIdV2Fragment.t();
                                if (authenticationActivityT5 != null) {
                                    intent.putExtra("result", "1");
                                    authenticationActivityT5.setResult(-1, intent);
                                    authenticationActivityT5.finish();
                                    Unit unit2 = Unit.f38893a;
                                }
                            }
                        } catch (Exception e12) {
                            if (e12 instanceof IllegalBlockSizeException) {
                                if (Intrinsics.c(authTouchIdV2Fragment.f26108o, "_scene_login_with_touch")) {
                                    p145jd.a.b("login_keystore_alias");
                                } else {
                                    p145jd.a.a(authTouchIdV2Fragment.getContext());
                                }
                            }
                            AuthenticationActivity authenticationActivityT6 = authTouchIdV2Fragment.t();
                            if (authenticationActivityT6 != null) {
                                authenticationActivityT6.m(null, null, false);
                                Unit unit3 = Unit.f38893a;
                                return;
                            }
                            return;
                        }
                    }
                }
                break;
            default:
                LogInWithTouchIdFragment logInWithTouchIdFragment = (LogInWithTouchIdFragment) obj;
                logInWithTouchIdFragment.f26235p = false;
                logInWithTouchIdFragment.z();
                try {
                    androidx.biometric.u uVar4 = result.f13090a;
                    Cipher cipher4 = uVar4 != null ? uVar4.f13093b : null;
                    if (cipher4 != null) {
                        LogInActivity logInActivityV = logInWithTouchIdFragment.v();
                        bArrDoFinal = cipher4.doFinal(Base64.decode(io.fastkv.n.o(logInActivityV != null ? logInActivityV.f25879B : null), 2));
                    } else {
                        bArrDoFinal = null;
                    }
                    String str6 = bArrDoFinal == null ? null : new String(bArrDoFinal, Charsets.UTF_8);
                    if (!TextUtils.isEmpty(str6)) {
                        n0.g().m("PalmPayLogin_VerifyType", "VerifyType", "touchid");
                        D3.a.O(new Qa.a("login", "fingerprint", "login_page", "success", "local_verify", null, null, null, logInWithTouchIdFragment.f26237w, 1760));
                        LogInActivity logInActivityV2 = logInWithTouchIdFragment.v();
                        if (logInActivityV2 != null) {
                            logInActivityV2.f25891e = "";
                            LogInReq logInReq = logInActivityV2.f25888b;
                            if (logInReq != null) {
                                logInReq.pin = str6;
                            }
                            if (logInReq != null) {
                                logInReq.loginPassword = null;
                            }
                            if (logInReq != null) {
                                logInReq.pinType = 8;
                            }
                            Integer numB = L8.a.b(logInWithTouchIdFragment.v(), logInWithTouchIdFragment.f26231A, new Bundle());
                            if (numB != null) {
                                C1623u c1623u = (C1623u) logInWithTouchIdFragment.f27328i;
                                if (c1623u != null) {
                                    LogInActivity logInActivityV3 = logInWithTouchIdFragment.v();
                                    c1623u.checkPin(str6, logInActivityV3 != null ? logInActivityV3.f25879B : null, numB.intValue());
                                }
                            } else {
                                logInActivityV2.v();
                            }
                        }
                    } else {
                        ToastUtils.showLong(p025ba.k.core_msg_authentication_fail);
                        D3.a.O(new Qa.a("login", "fingerprint", "login_page", "fail", "local_verify", "app_call", "param_error", logInWithTouchIdFragment.getString(p025ba.k.core_msg_authentication_fail), logInWithTouchIdFragment.f26237w, 1536));
                        logInWithTouchIdFragment.x();
                        Unit unit4 = Unit.f38893a;
                    }
                } catch (Exception unused2) {
                    ToastUtils.showLong(p025ba.k.core_msg_authentication_fail);
                    Unit unit5 = Unit.f38893a;
                }
                break;
        }
    }
}
