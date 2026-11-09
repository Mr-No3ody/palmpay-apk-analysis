package com.transsnet.palmpay.core.viewmodel;

import Ad.C0058e;
import C0.G;
import M7.s;
import Pa.n0;
import Pa.r0;
import Ua.l0;
import Ua.q0;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import Wf.v0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.util.Constants;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.dialog.OtpVerifyDialog;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p025ba.k;
import p025ba.m;
import p042cg.e;
import p142ja.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010!\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b$\u0010\u001dJ\u001d\u0010'\u001a\u00020\f2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010\u0019R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0019R\u0011\u00107\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b6\u0010\"¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/OneTimeCodeV5View;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "type", "", "setDefaultOtpType", "(I)V", "Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCodeEnteredListener", "(Lcom/transsnet/palmpay/custom_view/PinEntryView$OnPinEnteredListener;)V", "Landroid/widget/EditText;", "getCodeEditText", "()Landroid/widget/EditText;", "", "enable", "setSendOtcButtonState", "(Z)V", "", "code", "setCode", "(Ljava/lang/String;)V", "title", "setTitle", "titleResId", "getTitle", "()Ljava/lang/String;", "mobile", "setMobileNumber", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "callback", "setLoadingCallback", "(Lcom/transsnet/palmpay/core/callback/CompleteCallback;)V", "setSendOtcButtonStateInternal", "Lcom/transsnet/palmpay/core/listener/OnSendCodeListener;", "g", "Lcom/transsnet/palmpay/core/listener/OnSendCodeListener;", "getSendCodeListener", "()Lcom/transsnet/palmpay/core/listener/OnSendCodeListener;", "setSendCodeListener", "(Lcom/transsnet/palmpay/core/listener/OnSendCodeListener;)V", "sendCodeListener", "value", "isSmsMessageV2", "()Z", "setSmsMessageV2", "getSecurityEmail", "securityEmail", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOneTimeCodeV5View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeCodeV5View.kt\ncom/transsnet/palmpay/core/viewmodel/OneTimeCodeV5View\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,697:1\n116#2:698\n1#3:699\n1878#4,3:700\n37#5:703\n36#5,3:704\n*S KotlinDebug\n*F\n+ 1 OneTimeCodeV5View.kt\ncom/transsnet/palmpay/core/viewmodel/OneTimeCodeV5View\n*L\n433#1:698\n518#1:700,3\n595#1:703\n595#1:704,3\n*E\n"})
public final class OneTimeCodeV5View extends BaseConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f28495A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f28496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p015ag.c f28497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f28498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public OnSendCodeListener sendCodeListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28502j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f28503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28504p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CompleteCallback f28505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f28506w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f28495A = 60000;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTimeCodeV5View(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(OneTimeCodeV5View oneTimeCodeV5View, boolean z3) {
        oneTimeCodeV5View.setSendOtcButtonStateInternal(z3);
    }

    public static void d(OneTimeCodeV5View oneTimeCodeV5View, View keyboardRoot) {
        EditText editText;
        Intrinsics.checkNotNullParameter(keyboardRoot, "keyboardRoot");
        f fVar = oneTimeCodeV5View.f28496c;
        PinEntryView pinEntryView = fVar != null ? fVar.smsCodeView : null;
        if (pinEntryView != null) {
            pinEntryView.setUseCustomKeyboard(true);
        }
        c cVar = oneTimeCodeV5View.f28506w;
        if (cVar != null) {
            cVar.e();
        }
        c cVar2 = new c(keyboardRoot);
        EditText editText2 = pinEntryView != null ? pinEntryView.getEditText() : null;
        l0 inputMode = l0.f9427a;
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        cVar2.a(C1849p.c(editText2), 4, inputMode);
        oneTimeCodeV5View.f28506w = cVar2;
        if (pinEntryView != null) {
            pinEntryView.setOnShowCustomKeyboardListener(new s(oneTimeCodeV5View, 16));
        }
        if (pinEntryView == null || (editText = pinEntryView.getEditText()) == null) {
            return;
        }
        editText.requestFocus();
    }

    private final void setSendOtcButtonStateInternal(boolean enable) {
        IconicsTextView iconicsTextView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (enable) {
            t0 t0Var = this.f28498e;
            if (t0Var != null) {
                t0Var.cancel((CancellationException) null);
            }
            this.f28498e = null;
            f fVar = this.f28496c;
            if (fVar != null && (textView3 = fVar.tvTime) != null) {
                textView3.setText("");
            }
        }
        f fVar2 = this.f28496c;
        if (fVar2 != null && (textView2 = fVar2.textViewSendSms) != null) {
            textView2.setEnabled(enable);
        }
        if (enable) {
            o();
        } else {
            f fVar3 = this.f28496c;
            if (fVar3 != null && (iconicsTextView = fVar3.llOthers) != null) {
                iconicsTextView.setVisibility(8);
            }
        }
        f fVar4 = this.f28496c;
        if (fVar4 != null && (textView = fVar4.textViewSendSms) != null) {
            h.s(textView, enable);
        }
        OnSendCodeListener onSendCodeListener = this.sendCodeListener;
        if (onSendCodeListener != null) {
            f fVar5 = this.f28496c;
            onSendCodeListener.onButtonVisibilityChange(fVar5 != null ? fVar5.textViewSendSms : null, enable ? 0 : 8);
        }
    }

    public final void e() {
        TextView textView;
        IconicsTextView iconicsTextView;
        TextView textView2;
        f fVar = this.f28496c;
        if (fVar != null && (textView2 = fVar.tvTime) != null) {
            textView2.setVisibility(8);
        }
        f fVar2 = this.f28496c;
        if (fVar2 != null && (iconicsTextView = fVar2.llOthers) != null) {
            iconicsTextView.setVisibility(4);
        }
        f fVar3 = this.f28496c;
        if (fVar3 != null && (textView = fVar3.textViewSendSms) != null) {
            textView.setVisibility(4);
        }
        OnSendCodeListener onSendCodeListener = this.sendCodeListener;
        if (onSendCodeListener != null) {
            f fVar4 = this.f28496c;
            onSendCodeListener.onButtonVisibilityChange(fVar4 != null ? fVar4.textViewSendSms : null, 4);
        }
    }

    public final SmsChannelRsp f(int i7) {
        List list = this.f28503o;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((SmsChannelRsp) obj2).type == i7) {
                obj = obj2;
                break;
            }
        }
        return (SmsChannelRsp) obj;
    }

    public final String g(int i7, SubscriptionInfo subscriptionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getContext().getString(k.core_ussd));
        if (subscriptionInfo == null) {
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String number = subscriptionInfo.getNumber();
        if (i7 > 0) {
            sb2.append(i7);
        }
        if (!TextUtils.isEmpty(number)) {
            u.w(sb2, "(", number, ")");
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Nullable
    public final EditText getCodeEditText() {
        PinEntryView pinEntryView;
        f fVar = this.f28496c;
        if (fVar == null || (pinEntryView = fVar.smsCodeView) == null) {
            return null;
        }
        return pinEntryView.getEditText();
    }

    @NotNull
    public final String getSecurityEmail() {
        String str;
        SmsChannelRsp smsChannelRspF = f(3);
        return (smsChannelRspF == null || (str = smsChannelRspF.sender) == null) ? "" : str;
    }

    @Nullable
    public final OnSendCodeListener getSendCodeListener() {
        return this.sendCodeListener;
    }

    @Nullable
    public final String getTitle() {
        TextView textView;
        CharSequence text;
        f fVar = this.f28496c;
        if (fVar == null || (textView = fVar.tvTitle) == null || (text = textView.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final void h() {
        KeyboardUtils.hideSoftInput(this);
        c cVar = this.f28506w;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void i(int i7, String str, boolean z3) {
        IconicsTextView iconicsTextView;
        if (str == null || str.length() == 0) {
            if (z3) {
                n();
                return;
            }
            return;
        }
        if (z3) {
            m(true);
            f fVar = this.f28496c;
            if (fVar != null && (iconicsTextView = fVar.llOthers) != null) {
                iconicsTextView.setVisibility(8);
            }
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        p042cg.f fVar2 = I.f10809a;
        addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new q0(null, str, i7, z3, this, z3), 2));
    }

    public final void j() {
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        f fVar = this.f28496c;
        if (fVar != null && (pinEntryView2 = fVar.smsCodeView) != null) {
            pinEntryView2.setOnShowCustomKeyboardListener(null);
        }
        f fVar2 = this.f28496c;
        if (fVar2 != null && (pinEntryView = fVar2.smsCodeView) != null) {
            pinEntryView.setUseCustomKeyboard(false);
        }
        c cVar = this.f28506w;
        if (cVar != null) {
            cVar.e();
        }
        this.f28506w = null;
    }

    public final void k() {
        TextView textView;
        if (this.f28504p) {
            return;
        }
        p();
        f fVar = this.f28496c;
        if (fVar == null || (textView = fVar.tvInputError) == null) {
            return;
        }
        h.s(textView, false);
    }

    public final void l(int i7) {
        this.f28504p = true;
        if (i7 <= 0) {
            i7 = f28495A;
        }
        f28495A = i7;
        p();
    }

    public final void m(boolean z3) {
        CompleteCallback completeCallback = this.f28505v;
        if (completeCallback != null) {
            completeCallback.onComplete(Boolean.valueOf(z3));
        }
    }

    public final void n() {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            activeSubscriptionInfoList = SubscriptionManager.from(getContext()).getActiveSubscriptionInfoList();
        } catch (Exception unused) {
            activeSubscriptionInfoList = null;
        }
        List list = this.f28503o;
        if (list == null || list.isEmpty()) {
            String string = getContext().getString(k.core_voice_call);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(string);
            arrayList2.add(1);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList3.add(G8.a.x(context, S6.a.pay_Phone, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())), null, 20.0f, 116));
        } else {
            if (f(4) != null && PhoneUtils.isSimCardReady()) {
                List<SubscriptionInfo> list2 = activeSubscriptionInfoList;
                if (list2 == null || list2.isEmpty()) {
                    arrayList.add(g(-1, null));
                    arrayList2.add(Integer.valueOf(Constants.MAX_URL_LENGTH));
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    arrayList3.add(G8.a.x(context2, S6.a.pay_USSDFill, Integer.valueOf(CommonViewExtKt.colorInt(p025ba.c.coreColorUssd, getContext())), null, 20.0f, 116));
                } else if (activeSubscriptionInfoList.size() == 1) {
                    arrayList.add(g(-1, activeSubscriptionInfoList.get(0)));
                    arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId() + Constants.MAX_URL_LENGTH));
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    arrayList3.add(G8.a.x(context3, S6.a.pay_USSDFill, Integer.valueOf(CommonViewExtKt.colorInt(p025ba.c.coreColorUssd, getContext())), null, 20.0f, 116));
                } else {
                    int i7 = 0;
                    for (Object obj : activeSubscriptionInfoList) {
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            C1850q.k();
                            throw null;
                        }
                        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
                        arrayList.add(g(i10, subscriptionInfo));
                        arrayList2.add(Integer.valueOf(subscriptionInfo.getSubscriptionId() + Constants.MAX_URL_LENGTH));
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        arrayList3.add(G8.a.x(context4, S6.a.pay_USSDFill, Integer.valueOf(CommonViewExtKt.colorInt(p025ba.c.coreColorUssd, getContext())), null, 20.0f, 116));
                        i7 = i10;
                    }
                }
            }
            if (f(1) != null) {
                String string2 = getContext().getString(k.core_voice_call);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(string2);
                arrayList2.add(1);
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                arrayList3.add(G8.a.x(context5, S6.a.pay_Phone, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())), null, 20.0f, 116));
            }
            SmsChannelRsp smsChannelRspF = f(3);
            boolean zIsEmailMasked = RegexUtils.isEmailMasked(smsChannelRspF != null ? smsChannelRspF.sender : null);
            if (smsChannelRspF != null && (zIsEmailMasked || RegexUtils.isEmail(smsChannelRspF.sender))) {
                String strC0 = smsChannelRspF.sender;
                if (!zIsEmailMasked) {
                    strC0 = r0.C0(strC0);
                }
                arrayList.add(getContext().getString(k.core_email) + "(" + strC0 + ")");
                arrayList2.add(3);
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                arrayList3.add(G8.a.x(context6, S6.a.pay_Email, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorWarning, getContext())), null, 20.0f, 116));
            }
            if (f(2) != null) {
                String string3 = getContext().getString(k.core_whatsapp);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                arrayList.add(string3);
                arrayList2.add(2);
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                arrayList3.add(G8.a.x(context7, S6.a.pay_Whatsapp, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, getContext())), null, 20.0f, 116));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
        h();
        OtpVerifyDialog.setSingleChoiceItems$default(new OtpVerifyDialog(getContext(), 0, 0, 6, null).setDialogTitle(k.core_get_code_via_other_methods), (String[]) arrayList.toArray(new String[0]), arrayList4, 0, new C0058e(15, this, arrayList2), 4, null).show();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void o() {
        IconicsTextView iconicsTextView;
        int i7;
        f fVar = this.f28496c;
        if (fVar == null || (iconicsTextView = fVar.llOthers) == null) {
            return;
        }
        List list = this.f28503o;
        if (list == null || list.isEmpty()) {
            i7 = 8;
        } else {
            List list2 = this.f28503o;
            Intrinsics.e(list2);
            if (list2.size() >= 1) {
                i7 = 0;
            } else {
                i7 = 8;
            }
        }
        iconicsTextView.setVisibility(i7);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        String string = v3 instanceof TextView ? ((TextView) v3).getText().toString() : "";
        int id2 = v3.getId();
        if (id2 == p025ba.e.textViewSendSms) {
            k();
            OnSendCodeListener onSendCodeListener = this.sendCodeListener;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(this.t, 1, null);
            }
        } else if (id2 == p025ba.e.tvVoiceCall) {
            k();
            OnSendCodeListener onSendCodeListener2 = this.sendCodeListener;
            if (onSendCodeListener2 != null) {
                onSendCodeListener2.onSend(1, 1, null);
            }
        } else if (id2 == p025ba.e.tvWhatsapp) {
            k();
            OnSendCodeListener onSendCodeListener3 = this.sendCodeListener;
            if (onSendCodeListener3 != null) {
                onSendCodeListener3.onSend(2, 1, null);
            }
        } else if (id2 == p025ba.e.tvEmail) {
            k();
            OnSendCodeListener onSendCodeListener4 = this.sendCodeListener;
            if (onSendCodeListener4 != null) {
                onSendCodeListener4.onSend(3, 1, null);
            }
        } else if (id2 == p025ba.e.tvUSSD) {
            k();
            OnSendCodeListener onSendCodeListener5 = this.sendCodeListener;
            if (onSendCodeListener5 != null) {
                onSendCodeListener5.onSend(4, 1, null);
            }
        } else if (id2 == p025ba.e.llOthers) {
            q();
        }
        n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t0 t0Var = this.f28498e;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f28498e = null;
        j();
        AbstractC0777v.c(this.f28497d, null);
    }

    public final void p() {
        TextView textView;
        TextView textView2;
        t0 t0Var = this.f28498e;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f28498e = null;
        f fVar = this.f28496c;
        if (fVar != null && (textView2 = fVar.tvTime) != null) {
            h.s(textView2, true);
        }
        f fVar2 = this.f28496c;
        if (fVar2 != null && (textView = fVar2.textViewSendSms) != null) {
            h.s(textView, false);
        }
        setSendOtcButtonStateInternal(false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f28499f = true;
        this.f28498e = AbstractC0780y.m(this.f28497d, null, null, new Ua.r0(jElapsedRealtime, this, null), 3);
    }

    public final void q() {
        List list = this.f28503o;
        if (list != null && !list.isEmpty()) {
            n();
        } else {
            i(this.f28502j, this.f28501i, true);
        }
    }

    public final void setCode(@Nullable String code) {
        f fVar;
        PinEntryView pinEntryView;
        PinEntryView pinEntryView2;
        if (code == null || code.length() == 0 || !TextUtils.isDigitsOnly(code)) {
            return;
        }
        f fVar2 = this.f28496c;
        if (Intrinsics.c(code, String.valueOf((fVar2 == null || (pinEntryView2 = fVar2.smsCodeView) == null) ? null : pinEntryView2.getText())) || (fVar = this.f28496c) == null || (pinEntryView = fVar.smsCodeView) == null) {
            return;
        }
        pinEntryView.setText(code);
    }

    public final void setCodeEnteredListener(@Nullable PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView;
        f fVar = this.f28496c;
        if (fVar == null || (pinEntryView = fVar.smsCodeView) == null) {
            return;
        }
        pinEntryView.setOnPinEnteredListener(listener);
    }

    public final void setDefaultOtpType(int type) {
        TextView textView;
        this.t = type;
        f fVar = this.f28496c;
        if (fVar == null || (textView = fVar.textViewSendSms) == null) {
            return;
        }
        textView.setText(type == 3 ? k.core_send_code : k.core_send_sms);
    }

    public final void setLoadingCallback(@Nullable CompleteCallback<Boolean> callback) {
        this.f28505v = callback;
    }

    public final void setMobileNumber(@Nullable String mobile) {
        this.f28501i = mobile;
        this.f28502j = 99;
        i(99, mobile, false);
    }

    public final void setSendCodeListener(@Nullable OnSendCodeListener onSendCodeListener) {
        this.sendCodeListener = onSendCodeListener;
    }

    public final void setSendOtcButtonState(boolean enable) {
        if (Intrinsics.c(Looper.getMainLooper(), Looper.myLooper())) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 8));
        }
    }

    public final void setSmsMessageV2(boolean z3) {
        this.f28504p = z3;
    }

    public final void setTitle(@Nullable String title) {
        TextView textView;
        f fVar = this.f28496c;
        if (fVar == null || (textView = fVar.tvTitle) == null) {
            return;
        }
        if (title == null || title.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(title);
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTimeCodeV5View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneTimeCodeV5View(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneTimeCodeV5View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        IconicsTextView iconicsTextView;
        TextView textView;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        this.f28497d = AbstractC0777v.a(kotlin.coroutines.e.c(v0VarC, o.f11960a));
        this.f28499f = true;
        this.f28502j = 99;
        f fVarInflate = f.inflate(LayoutInflater.from(getContext()), this);
        this.f28496c = fVarInflate;
        f28495A = 60000;
        if (fVarInflate != null && (textView = fVarInflate.textViewSendSms) != null) {
            textView.setOnClickListener(this);
        }
        f fVar2 = this.f28496c;
        if (fVar2 != null && (iconicsTextView = fVar2.llOthers) != null) {
            iconicsTextView.setOnClickListener(this);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.OneTimeCodeV5View);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setTitle(typedArrayObtainStyledAttributes.getString(m.OneTimeCodeV5View_core_title_text));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final void setTitle(int titleResId) {
        if (titleResId == 0) {
            setTitle((String) null);
        } else {
            setTitle(getContext().getString(titleResId));
        }
    }
}
