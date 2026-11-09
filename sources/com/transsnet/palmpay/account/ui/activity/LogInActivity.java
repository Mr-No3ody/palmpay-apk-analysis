package com.transsnet.palmpay.account.ui.activity;

import Ad.c0;
import C0.G;
import C0.P;
import Ce.p0;
import F8.d;
import F8.e;
import I8.u;
import M7.s;
import N8.C0463g;
import N8.C0470n;
import N8.C0471o;
import N8.C0473q;
import N8.ViewOnClickListenerC0467k;
import N8.ViewOnClickListenerC0468l;
import N8.q0;
import N8.r;
import O6.c;
import Pa.AbstractC0526x;
import Pa.C0521s;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPswFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.provider.IOkCardModule;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.dialog.SuccessFailDialog;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p025ba.k;
import p042cg.f;
import p051d9.C1623u;
import p071ef.b;
import p183m6.m;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p377z5.l;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "登录", path = "/account/login")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/LogInActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Ld9/u;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/LoginContract$View;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLogInActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogInActivity.kt\ncom/transsnet/palmpay/account/ui/activity/LogInActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1219:1\n562#2,10:1220\n595#2,6:1230\n694#2,50:1236\n694#2,50:1286\n694#2,50:1336\n694#2,50:1386\n694#2,50:1436\n694#2,50:1486\n694#2,50:1536\n1#3:1586\n*S KotlinDebug\n*F\n+ 1 LogInActivity.kt\ncom/transsnet/palmpay/account/ui/activity/LogInActivity\n*L\n256#1:1220,10\n309#1:1230,6\n662#1:1236,50\n674#1:1286,50\n711#1:1336,50\n753#1:1386,50\n783#1:1436,50\n797#1:1486,50\n558#1:1536,50\n*E\n"})
public final class LogInActivity extends i implements CustomActionCallback, EasyPermissions$PermissionCallbacks, LoginContract.View, CancelAdapt {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f25877p0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f25878A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f25879B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f25880C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f25881H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f25882L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f25883M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f25884Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f25885X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public NavHostFragment f25886Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public SignUpRsp f25887Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LogInReq f25888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SuccessFailDialog f25892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25893g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f25895j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f25896k0 = C2131j.b(new La.i(10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f25898p;
    public PreCheckPhoneRsp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f25899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f25900w;

    public static String q(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return stringExtra;
    }

    public final boolean A(int i7, String str) {
        LogInReq logInReq = this.f25888b;
        if (logInReq == null) {
            return false;
        }
        if (logInReq != null) {
            logInReq.smsToken = str;
        }
        if (TextUtils.isEmpty(str)) {
            this.f25895j = 0L;
            this.f25894i = null;
            return true;
        }
        LogInReq logInReq2 = this.f25888b;
        this.f25894i = q0.j(logInReq2 != null ? logInReq2.mobileNo : null, str);
        this.f25895j = Long.valueOf((((long) i7) * 1000) + System.currentTimeMillis());
        return true;
    }

    /* JADX WARN: Failed to calculate best type for var: r1v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v21 ??, new type: androidx.navigation.fragment.NavHostFragment
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: C0.P
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v9 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 'this'  ??, new type: com.transsnet.palmpay.account.ui.activity.LogInActivity
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v11 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v12 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: android.os.Bundle
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 'this'  ??, new type: com.transsnet.palmpay.account.ui.activity.LogInActivity
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void B(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.account.ui.activity.LogInActivity.B(java.lang.String, java.lang.String):void");
    }

    public final void C(String str, boolean z3) {
        Intent intent = new Intent(this, (Class<?>) SignUpActivity.class);
        if (!TextUtils.isEmpty(this.f25878A)) {
            intent.putExtra("source", this.f25878A);
        }
        if (!TextUtils.isEmpty(this.f25899v)) {
            intent.putExtra("business_path", this.f25899v);
        }
        if (str != null && !str.equals(p367ya.a.d().g())) {
            intent.putExtra("_input_number", str);
        }
        intent.putExtra("extra_data", this.f25881H);
        intent.putExtra("extra_flag", z3);
        AbstractC0526x.a(this, intent);
        h.a(this, p025ba.a.core_anim_fade_in, p025ba.a.core_anim_fade_out);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_common_fragment_container;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return 3;
    }

    @Override // com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String message) {
        P pF;
        Intrinsics.checkNotNullParameter(message, "message");
        if (!i0.W(this)) {
            return false;
        }
        try {
            SuccessFailDialog successFailDialog = this.f25892f;
            if (successFailDialog != null) {
                successFailDialog.dismiss();
            }
            this.f25892f = null;
            this.f25900w = message;
            if (!TextUtils.isEmpty(message)) {
                runOnUiThread(new s(this, 2));
            }
            NavHostFragment navHostFragment = this.f25886Y;
            if (navHostFragment == null || (pF = navHostFragment.f()) == null) {
                return true;
            }
            pF.k(d.fragment_login_input_mobile, false);
            return true;
        } catch (Exception e10) {
            Log.e(this.TAG, "goBack: ", e10);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleLoginResult(LogInReq logInReq, CommonBeanResult commonBeanResult, String str) {
        String str2;
        String str3;
        String str4 = "";
        int i7 = 0;
        if (commonBeanResult == null) {
            showLoadingDialog(false);
            n();
            B("", str);
            return;
        }
        if (!commonBeanResult.isSuccess()) {
            n0.g().u((ViewEvent) G.g("Login_Result_Failed", true));
            showLoadingDialog(false);
            B(commonBeanResult.getRespCode(), commonBeanResult.getRespMsg());
            return;
        }
        if (commonBeanResult.data == 0) {
            showLoadingDialog(false);
            B("", getString(F8.h.ac_login_failed));
            return;
        }
        C0521s c0521s = C0521s.f7158a;
        C0521s.b();
        if (logInReq == null || (str3 = logInReq.mobileNo) == null || !str3.equals(logInReq.loginName)) {
            if (logInReq != null && (str2 = logInReq.loginName) != null) {
                str4 = str2;
            }
            p059e1.a.W("account_sp_last_login_accountno", str4);
        } else {
            p059e1.a.W("account_sp_last_login_accountno", "");
        }
        this.f25887Z = (SignUpRsp) commonBeanResult.data;
        BaseApplication.get().setToken(((SignUpRsp) commonBeanResult.data).getToken());
        n0 n0VarG = n0.g();
        SignUpRsp signUpRsp = this.f25887Z;
        n0VarG.D(signUpRsp != null ? signUpRsp.getMemberId() : null);
        if (((SignUpRsp) commonBeanResult.data).reportSignupSuccess) {
            ViewEvent viewEvent = (ViewEvent) G.g("Signup_Result_Success", true);
            SignUpRsp signUpRsp2 = this.f25887Z;
            ViewEvent viewEventAdd = viewEvent.add("memberId", signUpRsp2 != null ? signUpRsp2.getMemberId() : null);
            n0.g().u(viewEventAdd);
            L8.a.f(viewEventAdd);
        } else {
            n0 n0VarG2 = n0.g();
            ViewEvent viewEvent2 = (ViewEvent) G.g("Login_Result_Success", true);
            SignUpRsp signUpRsp3 = this.f25887Z;
            n0VarG2.u(viewEvent2.add("memberId", signUpRsp3 != null ? signUpRsp3.getMemberId() : null));
        }
        SignUpRsp signUpRsp4 = (SignUpRsp) commonBeanResult.data;
        if (signUpRsp4.memberInfo != null) {
            showLoadingDialog(false);
            p156ka.a userDataSource = BaseApplication.get().getUserDataSource();
            if (userDataSource != null) {
                userDataSource.d(((SignUpRsp) commonBeanResult.data).memberInfo, false);
            }
            T data = commonBeanResult.data;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            w((SignUpRsp) data);
        } else if (signUpRsp4.isNeedAddGuardian()) {
            p367ya.a.d().f44149a.i("last_phone_number", this.f25879B);
            T data2 = commonBeanResult.data;
            Intrinsics.checkNotNullExpressionValue(data2, "data");
            BaseApplication.get().setToken(null);
            AddGuardianActivity.f25811i.start(this, (SignUpRsp) data2);
            finish();
        } else {
            BaseApplication.get().getUserDataSource().a().i(b.a()).subscribe(new r(i7, this, commonBeanResult));
        }
        p059e1.a.X("keyConfirmPermissionDialog", true);
        n.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.View
    public final void handleShareAccountDetailResult(CommonBeanResult response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccess()) {
            r();
            r0.O0(((ShareAccountDetailBean) response.data).getTransType(), Integer.valueOf(((ShareAccountDetailBean) response.data).getBusinessType()), ((ShareAccountDetailBean) response.data).getAccountNo(), p002a.a.e(new Pair("core_order_source_type", "DEEPLINK"), new Pair("MEMBER_ID", ((ShareAccountDetailBean) response.data).getMemberId())));
        } else {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            r();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f25888b = new LogInReq();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_data_1");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.t = (PreCheckPhoneRsp) d0.l(PreCheckPhoneRsp.class, stringExtra);
            }
            this.f25899v = intent.getStringExtra("business_path");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new C1623u();
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [N8.m] */
    public final boolean m(CommonResult result, boolean z3) {
        final int i7 = 1;
        final int i10 = 0;
        int i11 = 2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (("pin_300001".equals(result.getRespCode()) || "pin_300044".equals(result.getRespCode()) || "CMPW0001".equals(result.getRespCode()) || "CMPW0002".equals(result.getRespCode()) || "CMPW0003".equals(result.getRespCode()) || "CMPW0004".equals(result.getRespCode()) || "CMPW0005".equals(result.getRespCode()) || "CMPW0006".equals(result.getRespCode()) || "CMPW0007".equals(result.getRespCode()) || "CMPW0008".equals(result.getRespCode()) || CommonResult.CODE_PIN_ERROR.equalsIgnoreCase(result.getRespCode()) || CommonResult.CODE_PIN_LOCKED.equalsIgnoreCase(result.getRespCode())) && (o() instanceof LogInWithTouchIdFragment)) {
            PreCheckPhoneRsp preCheckPhoneRsp = this.t;
            boolean zCheckVerifyWithPsw = preCheckPhoneRsp != null ? preCheckPhoneRsp.checkVerifyWithPsw() : false;
            int i12 = k.core_failed_all_cap;
            String respMsg = result.getRespMsg();
            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
            int i13 = zCheckVerifyWithPsw ? F8.h.ac_psw_verification : F8.h.ac_pin_verification;
            ViewOnClickListenerC0468l viewOnClickListenerC0468l = new ViewOnClickListenerC0468l(this, zCheckVerifyWithPsw);
            int i14 = k.core_retry;
            c cVar = new c(this);
            cVar.f6614u = 2;
            cVar.e(i12);
            cVar.f6598d = respMsg;
            cVar.d(i13, viewOnClickListenerC0468l);
            cVar.c(i14, null);
            cVar.f6605k = true;
            cVar.f6606l = 1;
            G.v(cVar, false, false);
            return true;
        }
        if (!"pin_300001".equals(result.getRespCode()) && !"pin_300044".equals(result.getRespCode()) && !CommonResult.CODE_PIN_LOCKED.equalsIgnoreCase(result.getRespCode())) {
            if (!z3) {
                return C0521s.l(C0521s.f7158a, this, result, this.f25879B, new Function0(this) { // from class: N8.m

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ LogInActivity f6239b;

                    {
                        this.f6239b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        LogInActivity logInActivity = this.f6239b;
                        switch (i7) {
                            case 0:
                                int i15 = LogInActivity.f25877p0;
                                LogInWithPswFragment logInWithPswFragment = (LogInWithPswFragment) logInActivity.o();
                                if (logInWithPswFragment != null) {
                                    logInWithPswFragment.u();
                                }
                                break;
                            default:
                                int i16 = LogInActivity.f25877p0;
                                logInActivity.x();
                                logInActivity.finish();
                                break;
                        }
                        return Unit.f38893a;
                    }
                }, 8);
            }
            C0521s c0521s = C0521s.f7158a;
            return C0521s.k(this, result, this.f25879B, z3, new Function0(this) { // from class: N8.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LogInActivity f6239b;

                {
                    this.f6239b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LogInActivity logInActivity = this.f6239b;
                    switch (i10) {
                        case 0:
                            int i15 = LogInActivity.f25877p0;
                            LogInWithPswFragment logInWithPswFragment = (LogInWithPswFragment) logInActivity.o();
                            if (logInWithPswFragment != null) {
                                logInWithPswFragment.u();
                            }
                            break;
                        default:
                            int i16 = LogInActivity.f25877p0;
                            logInActivity.x();
                            logInActivity.finish();
                            break;
                    }
                    return Unit.f38893a;
                }
            });
        }
        n();
        String respMsg2 = result.getRespMsg();
        if (respMsg2 != null) {
            if (z3 && (o() instanceof LogInWithPswFragment)) {
                int i15 = k.core_failed_all_cap;
                int i16 = F8.h.ac_forget_psw;
                ViewOnClickListenerC0467k viewOnClickListenerC0467k = new ViewOnClickListenerC0467k(this, i11);
                int i17 = k.core_confirm;
                c cVar2 = new c(this);
                cVar2.f6614u = 2;
                cVar2.e(i15);
                cVar2.f6598d = respMsg2;
                cVar2.d(i16, viewOnClickListenerC0467k);
                cVar2.c(i17, null);
                cVar2.f6605k = true;
                cVar2.f6606l = 1;
                G.v(cVar2, false, false);
                return true;
            }
            int i18 = k.core_failed_all_cap;
            int i19 = F8.h.ac_forget_pin_2;
            ViewOnClickListenerC0467k viewOnClickListenerC0467k2 = new ViewOnClickListenerC0467k(this, 3);
            int i20 = k.core_confirm;
            c cVar3 = new c(this);
            cVar3.f6614u = 1;
            cVar3.e(i18);
            cVar3.f6598d = respMsg2;
            cVar3.d(i19, viewOnClickListenerC0467k2);
            cVar3.c(i20, null);
            cVar3.f6605k = true;
            cVar3.f6606l = 1;
            G.v(cVar3, false, false);
        }
        return true;
    }

    public final void n() {
        LogInWithPswFragment logInWithPswFragment;
        u uVar;
        PinEntryView pinEntryView;
        u uVar2;
        PinEntryView pinEntryView2;
        y("");
        z("");
        if (o() instanceof LogInWithPinFragment) {
            LogInWithPinFragment logInWithPinFragment = (LogInWithPinFragment) o();
            if (logInWithPinFragment == null || (uVar2 = logInWithPinFragment.f26215o) == null || (pinEntryView2 = uVar2.f4229e) == null) {
                return;
            }
            pinEntryView2.setText("");
            return;
        }
        if (!(o() instanceof LogInWithPswFragment) || (logInWithPswFragment = (LogInWithPswFragment) o()) == null || (uVar = logInWithPswFragment.f26218o) == null || (pinEntryView = uVar.f4229e) == null) {
            return;
        }
        pinEntryView.setText("");
    }

    public final Fragment o() {
        Z childFragmentManager;
        List listF;
        try {
            NavHostFragment navHostFragment = this.f25886Y;
            if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (listF = childFragmentManager.f17069c.f()) != null) {
                return (Fragment) listF.get(0);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SuccessFailDialog successFailDialog = this.f25892f;
        if (successFailDialog != null) {
            successFailDialog.dismiss();
        }
        this.f25892f = null;
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        this.f25899v = intent.getStringExtra("business_path");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((Handler) this.f25896k0.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ActivityResultCaller activityResultCallerO = o();
        if (activityResultCallerO instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerO).onPermissionsDenied(i7, list);
        }
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ActivityResultCaller activityResultCallerO = o();
        if (activityResultCallerO instanceof EasyPermissions$PermissionCallbacks) {
            ((EasyPermissions$PermissionCallbacks) activityResultCallerO).onPermissionsGranted(i7, list);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        l.r(i7, permissions, grantResults, this);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        LogInReq logInReq = (LogInReq) savedInstanceState.getParcelable("mLogInReq");
        if (logInReq != null) {
            this.f25888b = logInReq;
        }
        String string = savedInstanceState.getString("mFullMobileNumber");
        if (!TextUtils.isEmpty(string)) {
            this.f25879B = string;
        }
        String string2 = savedInstanceState.getString("mRawPin");
        if (!TextUtils.isEmpty(string2)) {
            this.f25891e = string2;
        }
        String string3 = savedInstanceState.getString("mCountryLocale");
        if (!TextUtils.isEmpty(string3)) {
            this.f25889c = string3;
        }
        String string4 = savedInstanceState.getString("mMobileNumber");
        if (TextUtils.isEmpty(string4)) {
            return;
        }
        this.f25890d = string4;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0780y.m(V.f(this), null, null, new C0473q(2, null), 3);
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putString("mFullMobileNumber", this.f25879B);
        outState.putString("mRawPin", this.f25891e);
        outState.putString("mCountryLocale", this.f25889c);
        outState.putString("mMobileNumber", this.f25890d);
        outState.putParcelable("mLogInReq", this.f25888b);
        super.onSaveInstanceState(outState);
    }

    public final void p(Argument2Callback argument2Callback) {
        Intent intent = new Intent(this, (Class<?>) IdentityVerificationActivity.class);
        intent.putExtra("source", "FROM_LOGIN_PAGE");
        intent.putExtra("_number", this.f25879B);
        C0525w c0525wF = C0525w.f();
        intent.putExtra("extra_data", ((Gson) c0525wF.f7166b).toJson(this.t));
        getF28604i().f(intent, new c0(24, this, argument2Callback));
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        F6.d.h(this.TAG, 3, "processLogic: " + bundle);
        if (bundle == null) {
            getWindow().getDecorView().post(new androidx.camera.core.impl.utils.futures.i(8, (Handler) this.f25896k0.getValue(), this));
        }
    }

    public final void r() {
        Postcard postcardWithBoolean = ARouter.getInstance().build("/main/home").withBoolean("FROM_LOGIN_PAGE", true);
        SignUpRsp signUpRsp = this.f25887Z;
        Postcard postcardWithBoolean2 = postcardWithBoolean.withBoolean("JUMP_TO_WELCOME_BACK_PAGE", signUpRsp != null && signUpRsp.couponAreaType == 2);
        SignUpRsp signUpRsp2 = this.f25887Z;
        postcardWithBoolean2.withBoolean("JUMP_TO_SIGNUP_SUCCESS_PAGE", "/account/sign_up_success".equals(signUpRsp2 != null ? signUpRsp2.jumpPath : null)).withFlags(32768).navigation(this);
    }

    public final void s() {
        Activity activityO;
        r0.o();
        String strH = com.transsnet.palmpay.core.config.d.h();
        Intrinsics.checkNotNullExpressionValue(strH, "getKeyLastPinTime(...)");
        p059e1.a.U(0, strH);
        if (TextUtils.isEmpty(this.f25899v) && (activityO = com.facebook.imagepipeline.nativecode.b.o("LoanHome", "LoanTabHome")) != null) {
            ActivityUtils.finishToActivity(activityO, false);
            finish();
            return;
        }
        if (ActivityUtils.getActivityList().size() <= (i0.l() ? 2 : 1)) {
            t();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Activity activity : ActivityUtils.getActivityList()) {
            if (i0.W(activity) && !(activity instanceof LogInActivity) && !(activity instanceof SignUpActivity) && !"SplashActivity".equals(activity.getClass().getSimpleName())) {
                arrayList.add(activity);
            }
        }
        if (arrayList.isEmpty() || !TextUtils.isEmpty(this.f25899v)) {
            t();
        } else {
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        androidx.activity.u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 2));
    }

    public final void t() {
        try {
            ((IOkCardModule) ARouter.getInstance().navigation(IOkCardModule.class)).collectDeviceInfo();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(this.f25883M) && !TextUtils.isEmpty(this.f25884Q)) {
            ActivityUtils.finishAllActivitiesExceptNewest();
            C1623u c1623u = (C1623u) this.f27350a;
            if (c1623u != null) {
                c1623u.queryShareAccountDetail(new ShareAccountDetailReq(this.f25883M, this.f25884Q));
                return;
            }
            return;
        }
        Activity activityS = i0.S("/main/merchant_payment");
        if (activityS != null) {
            ActivityUtils.finishToActivity(activityS, false);
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new C0470n(this, null), 2);
    }

    public final boolean u() {
        String str;
        Long l5 = this.f25895j;
        if ((l5 != null ? l5.longValue() : 0L) < System.currentTimeMillis() || TextUtils.isEmpty(this.f25894i)) {
            return false;
        }
        String str2 = this.f25894i;
        Intrinsics.e(str2);
        LogInReq logInReq = this.f25888b;
        if (logInReq == null || (str = logInReq.mobileNo) == null) {
            str = "";
        }
        return y.m(str2, str, false);
    }

    public final void v() {
        showLoadingDialog(true);
        LogInReq logInReq = this.f25888b;
        if (logInReq != null) {
            p367ya.a.d().getClass();
            logInReq.fcmToken = p059e1.a.I("fcm_sp_fcm_token", "");
        }
        if (logInReq != null) {
            logInReq.gaid = p367ya.a.d().c();
        }
        if (logInReq != null) {
            logInReq.mobileNo = this.f25879B;
        }
        if (!u() && logInReq != null) {
            logInReq.smsToken = null;
        }
        C1623u c1623u = (C1623u) this.f27350a;
        if (c1623u != null) {
            c1623u.login(logInReq);
        }
    }

    public final void w(SignUpRsp signUpRsp) {
        int i7 = 2;
        r0.C1(this);
        try {
            m mVar = p183m6.n.f39523a;
            mVar.instance().e(signUpRsp.getMemberId());
            mVar.instance().a(null, new String[0]);
        } catch (Exception unused) {
        }
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_LOG_IN_SUCCESS));
        if (i0.W(this)) {
            com.transsnet.palmpay.custom_view.dialog.t tVar = new com.transsnet.palmpay.custom_view.dialog.t(this);
            tVar.b();
            tVar.c(F8.h.ac_login_succeed);
            tVar.f31303b = "";
            SuccessFailDialog successFailDialogE = tVar.e(signUpRsp.securityDevice == 1);
            this.f25892f = successFailDialogE;
            successFailDialogE.setCanceledOnTouchOutside(false);
            SuccessFailDialog successFailDialog = this.f25892f;
            if (successFailDialog != null) {
                successFailDialog.setCancelable(false);
            }
            if (signUpRsp.securityDevice == 1) {
                SuccessFailDialog successFailDialog2 = this.f25892f;
                if (successFailDialog2 != null) {
                    successFailDialog2.setOnDismissListener(new p0(i7, this, signUpRsp));
                }
            } else if (signUpRsp.isNeedAddGuardian()) {
                BaseApplication.get().setToken(null);
                AddGuardianActivity.f25811i.start(this, signUpRsp);
                finish();
            } else {
                showLoadingDialog(true);
                s();
            }
        }
        Wf.V v3 = Wf.V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new C0471o(2, null), 2);
    }

    public final void x() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_type", SecurityVerifyMethodReq.UNLOGIN_RESET_PIN);
        String strG = this.f25879B;
        if (TextUtils.isEmpty(strG)) {
            strG = p367ya.a.d().g();
        }
        bundle.putString("_number", strG);
        bundle.putString("_email", this.f25897o);
        com.palmpay.lib.apm.launchcounter.util.d.E(bundle, "/account/verifyAccount");
    }

    public final void y(String str) {
        this.f25891e = str;
        LogInReq logInReq = this.f25888b;
        if (logInReq != null) {
            logInReq.loginPassword = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogInReq logInReq2 = this.f25888b;
            if (logInReq2 != null) {
                logInReq2.pin = str;
                return;
            }
            return;
        }
        LogInReq logInReq3 = this.f25888b;
        if (logInReq3 != null) {
            logInReq3.pin = SecurityUtils.a(str);
        }
    }

    public final void z(String str) {
        this.f25891e = null;
        LogInReq logInReq = this.f25888b;
        if (logInReq != null) {
            logInReq.pin = null;
        }
        if (TextUtils.isEmpty(str)) {
            LogInReq logInReq2 = this.f25888b;
            if (logInReq2 != null) {
                logInReq2.loginPassword = str;
                return;
            }
            return;
        }
        LogInReq logInReq3 = this.f25888b;
        if (logInReq3 != null) {
            logInReq3.loginPassword = SecurityUtils.a(str);
        }
    }
}
