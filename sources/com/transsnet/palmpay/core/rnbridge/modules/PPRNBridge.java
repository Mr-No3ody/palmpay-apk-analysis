package com.transsnet.palmpay.core.rnbridge.modules;

import B6.RunnableC0085g;
import C0.G;
import Ce.C0181x;
import Da.a;
import Da.b;
import Da.c;
import Da.f;
import Da.g;
import Da.h;
import Da.i;
import Da.j;
import Da.l;
import Da.n;
import Da.p;
import Da.q;
import O6.d;
import Pa.C0521s;
import Pa.F;
import Pa.n0;
import Pa.r0;
import U2.B;
import Wf.AbstractC0780y;
import Wf.I;
import X6.m;
import X6.o;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.M;
import androidx.fragment.app.Z;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.Scopes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.palmpay.lib.bridgewrapper.DefaultBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.State;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.ui.activity.PPRNActivity;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.StringUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b%\u0010\u0010J=\u0010*\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b2\u0010\u001dJ\u0019\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b4\u0010\fJ)\u00108\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u0006H\u0007¢\u0006\u0004\b8\u0010/J\u000f\u00109\u001a\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010\bJ\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0007¢\u0006\u0004\b>\u0010\u001dJ!\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b@\u0010AJ!\u0010B\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bB\u0010AJ!\u0010C\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bC\u0010AJ!\u0010D\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bD\u0010AJ\u0019\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bF\u0010\fJ\u0019\u0010G\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bG\u0010\fJ\u0019\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0007¢\u0006\u0004\bK\u0010\u0012J\u001f\u0010N\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0007¢\u0006\u0004\bN\u0010\u001dJ\u0019\u0010O\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010\fJ\u000f\u0010P\u001a\u00020\nH\u0007¢\u0006\u0004\bP\u0010\u0012J!\u0010R\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010Q\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bR\u0010\u001dJ!\u0010T\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bV\u0010AJ\u0019\u0010X\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bX\u0010\fJ\u000f\u0010Y\u001a\u00020\u0006H\u0007¢\u0006\u0004\bY\u0010\bJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u0006H\u0007¢\u0006\u0004\bZ\u0010\fJ\u0019\u0010\\\u001a\u00020\n2\b\u0010[\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\\\u0010\fJ)\u0010`\u001a\u00020\n2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\bc\u0010<J)\u0010h\u001a\u00020\n2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ<\u0010n\u001a\u00020\n2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u00062\u001b\b\u0002\u0010m\u001a\u0015\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\n\u0018\u00010k¢\u0006\u0002\blH\u0002¢\u0006\u0004\bn\u0010oJ<\u0010r\u001a\u00020\n2\u0006\u0010q\u001a\u00020p2\u0006\u0010j\u001a\u00020\u00062\u001b\b\u0002\u0010m\u001a\u0015\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\n\u0018\u00010k¢\u0006\u0002\blH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020u2\u0006\u0010t\u001a\u00020\u0006H\u0002¢\u0006\u0004\bv\u0010wJ#\u0010x\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\bx\u0010\"J\u0017\u0010z\u001a\u00020u2\u0006\u0010y\u001a\u00020\u0006H\u0002¢\u0006\u0004\bz\u0010wJ!\u0010|\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b|\u0010}J$\u0010\u0080\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020~2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J#\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\"\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0083\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J@\u0010\u008b\u0001\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0088\u0001j\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u0001`\u008a\u00012\b\u0010?\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J0\u0010\u0090\u0001\u001a\u00020\n2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u008f\u0001\u001a\u00030\u008d\u00012\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001d\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009b\u0001\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0005\b\u009b\u0001\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010£\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/modules/PPRNBridge;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "apiKey", "", "initSDK", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getAppVersion", "(Lcom/facebook/react/bridge/Promise;)V", "navigateToLoginOrRegisterPage", "()V", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "getHttpHeaderInfo", "(Ljava/lang/String;)Ljava/lang/String;", "getUserInfo", "", "getAppEnv", "()I", "url", "validationCheckRespJson", "navigateToCBNDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "title", "Lcom/facebook/react/bridge/ReadableMap;", "params", "navigateToPpDialog", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "shortPageName", "navigateToPage", "isMobileInstallmentStandaloneAvailable", "requestCode", "Lcom/facebook/react/bridge/Callback;", "onDone", "onCancel", "navigateToPageForResult", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Integer;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "businessType", "shareText", PPRNBridge.DIALOG_TYPE_COMMON_SHARE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventId", "eventDataValue", "logEvent", LogConstants.Autotrack.PAGE_NAME, "updateRnDebugModuleName", "transType", "outOrderNo", "subTransType", "jumpBillDetailRouter", "getCountryLocale", "event", "postEventBus", "(Lcom/facebook/react/bridge/ReadableMap;)V", "linkUrl", "jumpCouponRouter", "jsonString", "showSingleColumnPopView", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "showCommonPopViewWithArray", "showDatePicker", "showDatePickerByMode", "message", "showShortToast", "showLongToast", "onEnable", "areNotificationsEnabled", "(Lcom/facebook/react/bridge/Callback;)V", "goToNotificationSettingPage", "phone", "smsText", "sendSMS", "showFlexiCashLoaing", "dismissFlexiCashLoading", "shareTxt", "shareTitleAndText", "arg", "bridgeToNative", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "collectInfo", "currentRouter", "jump2NextRouter", "getPhoneInfo", "callPhone", "action", "gotoSystemSetting", "", "beginTime", "endTime", "insertCalendarEvent", "(DDLcom/facebook/react/bridge/ReadableMap;)V", "jsErrorMap", "recordError", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "dialogType", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "fillExtra", "emitDialogDismiss", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Dialog;", "dialog", "bindDialogDismissEvent", "(Landroid/app/Dialog;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "path", "", "isAroutePathAvailable", "(Ljava/lang/String;)Z", "navigateToPageReally", "targetPath", "isMobileInstallmentStandalonePath", "page", "resolveRnNavigatePath", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "applyReadableMapToIntent", "(Landroid/content/Intent;Lcom/facebook/react/bridge/ReadableMap;)V", "jsonArray", "", "Lcom/transsnet/palmpay/core/bean/State;", "jsonArrayToList", "(Ljava/lang/String;)Ljava/util/List;", "jsonStringArrayToList", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getMap", "(Ljava/lang/String;)Ljava/util/HashMap;", "", "beginTimeTmp", "endTimeTmp", "insertCalendarEventReally", "(JJLcom/facebook/react/bridge/ReadableMap;)V", "map", "Lorg/json/JSONObject;", "convertReadableToJsonObject", "(Lcom/facebook/react/bridge/ReadableMap;)Lorg/json/JSONObject;", "Lcom/facebook/react/bridge/ReadableArray;", "arr", "Lorg/json/JSONArray;", "convertReadableToJsonArray", "(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;", "recordJavaScriptError", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mDoneCallback", "Lcom/facebook/react/bridge/Callback;", "mCancelCallback", "REQUEST_CODE", "I", "Lcom/facebook/react/bridge/ActivityEventListener;", "mActivityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "Companion", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPPRNBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PPRNBridge.kt\ncom/transsnet/palmpay/core/rnbridge/modules/PPRNBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1074:1\n1#2:1075\n*E\n"})
public final class PPRNBridge extends ReactContextBaseJavaModule {

    @NotNull
    private static final String ACTION_MOBILE_INSTALLMENT_TAB = "mobileInstallmentTab";
    private static final int APP_ENV_DEV = 0;
    private static final int APP_ENV_PREM = 2;
    private static final int APP_ENV_PRE_RELEASE = 4;
    private static final int APP_ENV_RELEASE = 3;
    private static final int APP_ENV_TEST = 1;

    @NotNull
    public static final String DIALOG_ACTION_CANCEL = "cancel";

    @NotNull
    public static final String DIALOG_ACTION_DISMISS = "dismiss";

    @NotNull
    public static final String DIALOG_TYPE_CBN = "cbnDialog";

    @NotNull
    public static final String DIALOG_TYPE_COMMON_SHARE = "commonShareDialog";

    @NotNull
    public static final String DIALOG_TYPE_DATE_PICKER = "datePicker";

    @NotNull
    public static final String DIALOG_TYPE_DATE_PICKER_BY_MODE = "datePickerByMode";

    @NotNull
    public static final String DIALOG_TYPE_PP = "ppDialog";

    @NotNull
    public static final String EVENT_DIALOG_DISMISS = "dialogDismiss";

    @NotNull
    private static final String TAB_FINANCE = "finance";

    @NotNull
    private static final String TAG = "PPRNBridge";
    private int REQUEST_CODE;

    @NotNull
    private final ReactApplicationContext context;

    @NotNull
    private final ActivityEventListener mActivityEventListener;

    @Nullable
    private Callback mCancelCallback;

    @Nullable
    private Context mContext;

    @Nullable
    private Callback mDoneCallback;

    public PPRNBridge(@NotNull ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.REQUEST_CODE = 1;
        n nVar = new n(this);
        this.mActivityEventListener = nVar;
        try {
            context.addActivityEventListener(nVar);
        } catch (Exception unused) {
        }
    }

    private final void applyReadableMapToIntent(Intent intent, ReadableMap params) {
        if (params == null) {
            return;
        }
        Iterator<Map.Entry<String, Object>> entryIterator = params.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            if (next.getValue() != null) {
                Object value = next.getValue();
                if (value instanceof Boolean) {
                    String key = next.getKey();
                    Object value2 = next.getValue();
                    Intrinsics.f(value2, "null cannot be cast to non-null type kotlin.Boolean");
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(key, ((Boolean) value2).booleanValue()), "putExtra(...)");
                } else if (value instanceof Number) {
                    try {
                        String key2 = next.getKey();
                        Object value3 = next.getValue();
                        Intrinsics.f(value3, "null cannot be cast to non-null type kotlin.Number");
                        Intrinsics.e(intent.putExtra(key2, ((Number) value3).longValue()));
                    } catch (Exception unused) {
                        Unit unit = Unit.f38893a;
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(next.getKey(), String.valueOf(next.getValue())), "putExtra(...)");
                }
            }
        }
    }

    private final void bindDialogDismissEvent(Dialog dialog, final String dialogType, final Function1<? super WritableMap, Unit> fillExtra) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        dialog.setOnCancelListener(new j(atomicBoolean, 0));
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Da.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PPRNBridge.bindDialogDismissEvent$lambda$1(atomicBoolean2, atomicBoolean, this, dialogType, fillExtra, dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindDialogDismissEvent$default(PPRNBridge pPRNBridge, Dialog dialog, String str, Function1 function1, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            function1 = null;
        }
        pPRNBridge.bindDialogDismissEvent(dialog, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindDialogDismissEvent$lambda$1(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, PPRNBridge pPRNBridge, String str, Function1 function1, DialogInterface dialogInterface) {
        if (atomicBoolean.compareAndSet(false, true)) {
            pPRNBridge.emitDialogDismiss(str, atomicBoolean2.get() ? DIALOG_ACTION_CANCEL : DIALOG_ACTION_DISMISS, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void commonShareDialog$lambda$15(Activity activity, String str, String str2, String str3, PPRNBridge pPRNBridge) {
        try {
            ShareDialog shareDialog = new ShareDialog(activity);
            shareDialog.setH5ShareText(Integer.parseInt(str), str2, str3);
            pPRNBridge.bindDialogDismissEvent(shareDialog, DIALOG_TYPE_COMMON_SHARE, new C0181x(str, 1));
            shareDialog.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit commonShareDialog$lambda$15$lambda$14(String str, WritableMap bindDialogDismissEvent) {
        Intrinsics.checkNotNullParameter(bindDialogDismissEvent, "$this$bindDialogDismissEvent");
        bindDialogDismissEvent.putString("businessType", str);
        return Unit.f38893a;
    }

    private final JSONArray convertReadableToJsonArray(ReadableArray arr) throws Exception {
        JSONArray jSONArray = new JSONArray();
        int size = arr.size();
        for (int i7 = 0; i7 < size; i7++) {
            switch (l.f1765a[arr.getType(i7).ordinal()]) {
                case 1:
                    ReadableMap map = arr.getMap(i7);
                    if (map != null) {
                        jSONArray.put(convertReadableToJsonObject(map));
                    }
                    break;
                case 2:
                    ReadableArray array = arr.getArray(i7);
                    if (array != null) {
                        jSONArray.put(convertReadableToJsonArray(array));
                    }
                    break;
                case 3:
                    jSONArray.put(arr.getString(i7));
                    break;
                case 4:
                    double d2 = arr.getDouble(i7);
                    if (d2 == Math.floor(d2) && !Double.isInfinite(d2)) {
                        jSONArray.put((long) d2);
                    } else {
                        try {
                            jSONArray.put(d2);
                        } catch (JSONException unused) {
                            throw new Exception("Unable to put value " + arr.getDouble(i7) + " in JSONArray");
                        }
                    }
                    break;
                case 5:
                    jSONArray.put(arr.getBoolean(i7));
                    break;
                case 6:
                    jSONArray.put((Object) null);
                    break;
                default:
                    throw new p355xf.l();
            }
        }
        return jSONArray;
    }

    private final JSONObject convertReadableToJsonObject(ReadableMap map) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            ReadableType type = map.getType(strNextKey);
            try {
                switch (l.f1765a[type.ordinal()]) {
                    case 1:
                        ReadableMap map2 = map.getMap(strNextKey);
                        jSONObject.put(strNextKey, map2 != null ? convertReadableToJsonObject(map2) : null);
                        continue;
                    case 2:
                        ReadableArray array = map.getArray(strNextKey);
                        jSONObject.put(strNextKey, array != null ? convertReadableToJsonArray(array) : null);
                        continue;
                    case 3:
                        jSONObject.put(strNextKey, map.getString(strNextKey));
                        continue;
                    case 4:
                        jSONObject.put(strNextKey, map.getDouble(strNextKey));
                        continue;
                    case 5:
                        jSONObject.put(strNextKey, map.getBoolean(strNextKey));
                        continue;
                    case 6:
                        jSONObject.put(strNextKey, (Object) null);
                        continue;
                    default:
                        throw new Exception("Unrecognized type: " + type + " of key: " + strNextKey);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            e10.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissFlexiCashLoading$lambda$41$lambda$40(Activity activity) {
        ((PPRNActivity) activity).e();
    }

    private final void emitDialogDismiss(String dialogType, String action, Function1<? super WritableMap, Unit> fillExtra) {
        try {
            if (this.context.hasActiveReactInstance()) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putString("dialogType", dialogType);
                writableMapCreateMap.putString("action", action);
                if (fillExtra != null) {
                    fillExtra.invoke(writableMapCreateMap);
                }
                sendEvent(this.context, EVENT_DIALOG_DISMISS, writableMapCreateMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void emitDialogDismiss$default(PPRNBridge pPRNBridge, String str, String str2, Function1 function1, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            function1 = null;
        }
        pPRNBridge.emitDialogDismiss(str, str2, function1);
    }

    private final HashMap<String, Object> getMap(String jsonString) {
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            HashMap<String, Object> map = new HashMap<>();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Any");
                map.put(next, obj);
            }
            return map;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void goToNotificationSettingPage$lambda$34(PPRNBridge pPRNBridge) {
        AppUtils.gotoNotificationSettingPage(pPRNBridge.context.getCurrentActivity());
    }

    private final void insertCalendarEventReally(long beginTimeTmp, long endTimeTmp, ReadableMap params) {
        if (beginTimeTmp == 0) {
            try {
                beginTimeTmp = Calendar.getInstance().getTimeInMillis();
            } catch (Exception unused) {
                return;
            }
        }
        if (endTimeTmp == 0) {
            endTimeTmp = ((long) Constants.THIRTY_MINUTES) + beginTimeTmp;
        }
        Intent intent = new Intent("android.intent.action.INSERT", CalendarContract.Events.CONTENT_URI);
        intent.putExtra("eventLocation", "PalmPay");
        intent.putExtra("allDay", true);
        intent.putExtra("beginTime", beginTimeTmp);
        intent.putExtra("endTime", endTimeTmp);
        if (params != null) {
            Iterator<Map.Entry<String, Object>> entryIterator = params.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                if (next.getValue() == null) {
                    return;
                }
                Object value = next.getValue();
                if (value instanceof Boolean) {
                    String key = next.getKey();
                    Object value2 = next.getValue();
                    Intrinsics.f(value2, "null cannot be cast to non-null type kotlin.Boolean");
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(key, ((Boolean) value2).booleanValue()), "putExtra(...)");
                } else if (value instanceof Number) {
                    try {
                        String key2 = next.getKey();
                        Object value3 = next.getValue();
                        Intrinsics.f(value3, "null cannot be cast to non-null type kotlin.Number");
                        Intrinsics.e(intent.putExtra(key2, ((Number) value3).longValue()));
                    } catch (Exception unused2) {
                        Unit unit = Unit.f38893a;
                    }
                } else {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(next.getKey(), String.valueOf(next.getValue())), "putExtra(...)");
                }
            }
        }
        intent.addFlags(268435456);
        ActivityUtils.startActivity(this.context.getCurrentActivity(), intent);
    }

    private final boolean isAroutePathAvailable(String path) {
        try {
            Postcard postcardBuild = ARouter.getInstance().build(path);
            LogisticsCenter.completion(postcardBuild);
            return !TextUtils.isEmpty(postcardBuild.getDestination().toString());
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean isMobileInstallmentStandalonePath(String targetPath) {
        return Intrinsics.c(targetPath, "/credit_score/oc_home_mobile_installment_standalone_activity");
    }

    private final List<State> jsonArrayToList(String jsonArray) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jsonArray);
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                State state = new State();
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                state.stateName = jSONObject.getString("stateName");
                state.stateCode = jSONObject.getString("stateCode");
                arrayList.add(state);
            }
            if (y.h(Build.BRAND, "Huawei", true)) {
                arrayList.add(new State());
                return arrayList;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    private final List<String> jsonStringArrayToList(String jsonArray) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jsonArray);
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(jSONArray.get(i7).toString());
            }
            if (y.h(Build.BRAND, "Huawei", true)) {
                arrayList.add("");
                return arrayList;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    public static /* synthetic */ void jumpBillDetailRouter$default(PPRNBridge pPRNBridge, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = "";
        }
        pPRNBridge.jumpBillDetailRouter(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToCBNDialog$lambda$3(Activity activity, String str, String str2, PPRNBridge pPRNBridge) {
        C0521s c0521s = C0521s.f7158a;
        d dVarH = C0521s.h(activity, str, str2);
        if (dVarH != null) {
            bindDialogDismissEvent$default(pPRNBridge, dVarH, DIALOG_TYPE_CBN, null, 4, null);
        }
    }

    private final void navigateToPageReally(String shortPageName, ReadableMap params) {
        Intent intentA;
        Activity currentActivity;
        if (shortPageName == null || (intentA = F.a(this.context, shortPageName)) == null) {
            return;
        }
        applyReadableMapToIntent(intentA, params);
        Intent intentL = F.l(intentA);
        boolean booleanExtra = intentL.getBooleanExtra("closeSelf", false);
        if (booleanExtra && isMobileInstallmentStandalonePath(shortPageName)) {
            intentL.addFlags(603979776);
        }
        ActivityUtils.startActivity(intentL);
        if (!booleanExtra || (currentActivity = this.context.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToPpDialog$lambda$10(kotlin.jvm.internal.F f10, PPRNBridge pPRNBridge, View view) {
        Intent intentA;
        String str = (String) f10.f38951a;
        if (str == null || (intentA = F.a(pPRNBridge.context, str)) == null) {
            return;
        }
        ActivityUtils.startActivity(intentA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToPpDialog$lambda$7(kotlin.jvm.internal.F f10, PPRNBridge pPRNBridge, View view) {
        Intent intentA;
        String str = (String) f10.f38951a;
        if (str == null || (intentA = F.a(pPRNBridge.context, str)) == null) {
            return;
        }
        ActivityUtils.startActivity(intentA);
    }

    private final void recordJavaScriptError(ReadableMap jsErrorMap) {
        if (jsErrorMap != null) {
            try {
                String string = jsErrorMap.getString("message");
                ReadableArray array = jsErrorMap.getArray("frames");
                Objects.requireNonNull(array);
                ReadableArray readableArray = array;
                B b7 = jsErrorMap.getBoolean("isUnhandledRejection") ? new B(string, 2) : new B(string, 1);
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
                int size = readableArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ReadableMap map = readableArray.getMap(i7);
                    if (map != null) {
                        stackTraceElementArr[i7] = new StackTraceElement("", map.getString("fn"), map.getString("file"), -1);
                    }
                }
                b7.setStackTrace(stackTraceElementArr);
                FirebaseCrashlytics.getInstance().recordException(b7);
                Log.e(TAG, "recordJavaScriptError: ", b7);
            } catch (Exception unused) {
            }
        }
    }

    private final String resolveRnNavigatePath(String page, ReadableMap params) {
        return page;
    }

    private final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendSMS$lambda$35(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        ActivityUtils.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCommonPopViewWithArray$lambda$23$lambda$22(PPRNBridge pPRNBridge, String str, Activity activity, Promise promise) {
        String string;
        String string2;
        Object obj;
        String string3;
        Object obj2;
        Object obj3;
        try {
            HashMap<String, Object> map = pPRNBridge.getMap(str);
            if (map == null || (obj3 = map.get("title")) == null || (string = obj3.toString()) == null) {
                string = activity.getString(v.cv_select_state);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (map == null || (obj2 = map.get("listData")) == null || (string2 = obj2.toString()) == null) {
                string2 = "[]";
            }
            List<String> listJsonStringArrayToList = pPRNBridge.jsonStringArrayToList(string2);
            PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new p(promise), listJsonStringArrayToList, listJsonStringArrayToList.get((map == null || (obj = map.get("selectedIndex")) == null || (string3 = obj.toString()) == null) ? 0 : Integer.parseInt(string3)), string);
            Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Z supportFragmentManager = ((AbstractActivityC0837o) activity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            pickStateDialogFragmentNewInstance.show(supportFragmentManager, "PickStateDialogFragment");
        } catch (Exception e10) {
            F6.d.c(TAG, "showCommonPopViewWithArray: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDatePicker$lambda$27$lambda$26(PPRNBridge pPRNBridge, String str, Activity activity, Promise promise) {
        String string;
        Object obj;
        String string2;
        Object obj2;
        String string3;
        Object obj3;
        String string4;
        Object obj4;
        HashMap<String, Object> map = pPRNBridge.getMap(str);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - 100);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(1, calendar.get(1) + 82);
        long timeInMillis2 = calendar.getTimeInMillis() - 86400000;
        if (map == null || (obj4 = map.get("title")) == null || (string = obj4.toString()) == null) {
            string = activity.getString(v.cv_select_state);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        if (map != null && (obj3 = map.get("startDate")) != null && (string4 = obj3.toString()) != null) {
            timeInMillis = Long.parseLong(string4);
        }
        if (map != null && (obj2 = map.get("endDate")) != null && (string3 = obj2.toString()) != null) {
            timeInMillis2 = Long.parseLong(string3);
        }
        long jCurrentTimeMillis = (map == null || (obj = map.get("selectDate")) == null || (string2 = obj.toString()) == null) ? System.currentTimeMillis() : Long.parseLong(string2);
        m mVar = new m(activity);
        mVar.f11027b = string;
        mVar.f11028c = 3;
        mVar.f11029d = Long.valueOf(timeInMillis);
        mVar.f11031f = Long.valueOf(timeInMillis2);
        mVar.f11030e = Long.valueOf(jCurrentTimeMillis);
        mVar.f11032g = new c(1, promise);
        o oVarA = mVar.a();
        bindDialogDismissEvent$default(pPRNBridge, oVarA, DIALOG_TYPE_DATE_PICKER, null, 4, null);
        oVarA.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDatePicker$lambda$27$lambda$26$lambda$25$lambda$24(Promise promise, long j6, Long l5) {
        promise.resolve(String.valueOf(j6));
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDatePickerByMode$lambda$31$lambda$30(PPRNBridge pPRNBridge, String str, Activity activity, Promise promise) {
        String string;
        Object obj;
        String string2;
        Object obj2;
        String string3;
        Object obj3;
        String string4;
        Object obj4;
        HashMap<String, Object> map = pPRNBridge.getMap(str);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1));
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(1, calendar.get(1) + 100);
        long timeInMillis2 = calendar.getTimeInMillis() - 86400000;
        if (map == null || (obj4 = map.get("title")) == null || (string = obj4.toString()) == null) {
            string = "Select Date";
        }
        if (map != null && (obj3 = map.get("startDate")) != null && (string4 = obj3.toString()) != null) {
            timeInMillis = Long.parseLong(string4);
        }
        if (map != null && (obj2 = map.get("endDate")) != null && (string3 = obj2.toString()) != null) {
            timeInMillis2 = Long.parseLong(string3);
        }
        long jCurrentTimeMillis = (map == null || (obj = map.get("selectDate")) == null || (string2 = obj.toString()) == null) ? System.currentTimeMillis() : Long.parseLong(string2);
        m mVar = new m(activity);
        mVar.f11027b = string;
        mVar.f11028c = 1;
        mVar.f11029d = Long.valueOf(timeInMillis);
        mVar.f11031f = Long.valueOf(timeInMillis2);
        mVar.f11030e = Long.valueOf(jCurrentTimeMillis);
        mVar.f11032g = new c(0, promise);
        o oVarA = mVar.a();
        bindDialogDismissEvent$default(pPRNBridge, oVarA, DIALOG_TYPE_DATE_PICKER_BY_MODE, null, 4, null);
        oVarA.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDatePickerByMode$lambda$31$lambda$30$lambda$29$lambda$28(Promise promise, long j6, Long l5) {
        promise.resolve(String.valueOf(j6));
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFlexiCashLoaing$lambda$38$lambda$37(Activity activity, String str) {
        PPRNActivity pPRNActivity = (PPRNActivity) activity;
        pPRNActivity.e();
        com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(pPRNActivity);
        nVar.f31288b = str;
        LoadingDialog loadingDialogA = nVar.a();
        loadingDialogA.show();
        pPRNActivity.f27683g = loadingDialogA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLongToast$lambda$33(String str) {
        ToastUtils.showLong(str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showShortToast$lambda$32(String str) {
        ToastUtils.showShort(str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSingleColumnPopView$lambda$21$lambda$20(PPRNBridge pPRNBridge, String str, Activity activity, Promise promise) {
        String string;
        String string2;
        Object obj;
        String string3;
        Object obj2;
        Object obj3;
        try {
            HashMap<String, Object> map = pPRNBridge.getMap(str);
            if (map == null || (obj3 = map.get("title")) == null || (string = obj3.toString()) == null) {
                string = activity.getString(v.cv_select_state);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (map == null || (obj2 = map.get("listData")) == null || (string2 = obj2.toString()) == null) {
                string2 = "[]";
            }
            List<State> listJsonArrayToList = pPRNBridge.jsonArrayToList(string2);
            PickStateDialogFragment pickStateDialogFragmentNewInstance = PickStateDialogFragment.f31255Q.newInstance(new q(promise), listJsonArrayToList, listJsonArrayToList.get((map == null || (obj = map.get("selectedIndex")) == null || (string3 = obj.toString()) == null) ? 0 : Integer.parseInt(string3)), string);
            Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Z supportFragmentManager = ((AbstractActivityC0837o) activity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            pickStateDialogFragmentNewInstance.show(supportFragmentManager, "PickStateDialogFragment");
        } catch (Exception e10) {
            F6.d.c(TAG, "showSingleColumnPopView: ", e10);
        }
    }

    @ReactMethod
    public final void areNotificationsEnabled(@Nullable Callback onEnable) {
        if (onEnable != null) {
            onEnable.invoke(Boolean.valueOf(new M(this.context).f15943b.areNotificationsEnabled()));
        }
    }

    @ReactMethod
    public final void bridgeToNative(@Nullable ReadableMap arg, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (arg != null) {
            JSONObject jSONObjectConvertReadableToJsonObject = convertReadableToJsonObject(arg);
            DefaultBridge defaultBridge = new DefaultBridge();
            Activity currentActivity = this.context.getCurrentActivity();
            String string = jSONObjectConvertReadableToJsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            defaultBridge.b2n(currentActivity, string, new p1.c(promise, 2));
        }
    }

    @ReactMethod
    public final void callPhone(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            if (!TextUtils.isEmpty(phone)) {
                Uri uri = Uri.parse("tel:" + Uri.encode(phone));
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                intent.setData(uri);
            }
            intent.addFlags(268435456);
            this.context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public final void collectInfo(@Nullable String jsonString, @NotNull Promise promise) {
        JSONObject jSONObject;
        Exception e10;
        Intrinsics.checkNotNullParameter(promise, "promise");
        F6.d.h(TAG, 3, "collectInfo, jsonString = " + jsonString);
        if (StringUtils.isEmpty(jsonString)) {
            promise.reject("100", "params is empty");
            return;
        }
        try {
            jSONObject = new JSONObject(jsonString);
            try {
                if (StringUtils.isEmpty(jSONObject.optString("product", "JOIN_DEBIT"))) {
                    promise.reject("101", "params product is empty");
                    return;
                }
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
            }
        } catch (Exception e12) {
            jSONObject = null;
            e10 = e12;
        }
        if (jSONObject == null) {
            promise.reject("102", "params is not json");
        } else {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_RN_LOAN_ROUTE, jsonString));
            promise.resolve("200");
        }
    }

    @ReactMethod
    public final void commonShareDialog(@NotNull String businessType, @NotNull String shareText, @NotNull String params) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null) {
                return;
            }
            String localClassName = topActivity.getLocalClassName();
            Intrinsics.checkNotNullExpressionValue(localClassName, "getLocalClassName(...)");
            Activity topActivity2 = ActivityUtils.getTopActivity();
            if (topActivity2 != null && Intrinsics.c(localClassName, topActivity2.getLocalClassName())) {
                topActivity2.runOnUiThread(new a(topActivity2, businessType, shareText, params, this, 0));
            }
        } catch (Exception unused) {
        }
    }

    @ReactMethod
    public final void dismissFlexiCashLoading() {
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof PPRNActivity)) {
                currentActivity = null;
            }
            if (currentActivity != null) {
                ((PPRNActivity) currentActivity).runOnUiThread(new f(currentActivity, 0));
            }
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getAppEnv() {
        return 3;
    }

    @ReactMethod
    public final void getAppVersion(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(BaseApplication.get().getVersionName());
    }

    @NotNull
    public final ReactApplicationContext getContext() {
        return this.context;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getCountryLocale() {
        String countryLocale = BaseApplication.getCountryLocale();
        Intrinsics.checkNotNullExpressionValue(countryLocale, "getCountryLocale(...)");
        return countryLocale;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getHttpHeaderInfo(@Nullable String info) {
        String strR0 = r0.R0(null, info);
        Intrinsics.checkNotNullExpressionValue(strR0, "httpHeaderInfo(...)");
        return strR0;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return TAG;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getPhoneInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("manufacturer", DeviceUtils.getManufacturer());
            jSONObject.put("model", DeviceUtils.getModel());
        } catch (Exception e10) {
            F6.d.c("AppInfoUtil", "getUserInfo: ", e10);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "getPhoneInfo(...)");
        return string;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @NotNull
    public final String getUserInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isPalmForceUser", false);
            User user = BaseApplication.getInstance().getUser();
            if (user != null) {
                jSONObject.put("memberId", user.getMemberId());
                jSONObject.put("firstName", user.getFirstName());
                jSONObject.put("middleName", user.getMiddleName());
                jSONObject.put("lastName", user.getLastName());
                jSONObject.put("nickName", user.getNickName());
                jSONObject.put("fullName", user.getFullName());
                jSONObject.put("avatar", user.getAvatar());
                jSONObject.put(Scopes.EMAIL, user.getEmail());
                jSONObject.put("birthday", user.getBirthday());
                jSONObject.put("phoneNumber", user.getPhoneNumber());
                jSONObject.put("mobileMoneyAccountTier", user.getMobileMoneyAccountTier());
                jSONObject.put("useLoginPassword", user.isLoginPswEnabled());
            }
        } catch (Exception e10) {
            F6.d.c("AppInfoUtil", "getUserInfo: ", e10);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "getUserInfo(...)");
        return string;
    }

    @ReactMethod
    public final void goToNotificationSettingPage() {
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Ae.n(this, 9));
        }
    }

    @ReactMethod
    public final void gotoSystemSetting(@Nullable String action) {
        if (action != null) {
            if (TextUtils.isEmpty(action)) {
                action = null;
            }
            if (action != null) {
                try {
                    Intent intent = new Intent(action);
                    intent.addFlags(268435456);
                    ActivityUtils.startActivity(this.context.getCurrentActivity(), intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    @ReactMethod
    public final void initSDK(@Nullable String apiKey) {
    }

    @ReactMethod
    public final void insertCalendarEvent(double beginTime, double endTime, @Nullable ReadableMap params) {
        insertCalendarEventReally((long) beginTime, (long) endTime, params);
    }

    @ReactMethod
    public final void isMobileInstallmentStandaloneAvailable(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(isAroutePathAvailable("/credit_score/oc_home_mobile_installment_standalone_activity")));
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @ReactMethod
    public final void jump2NextRouter(@Nullable String currentRouter) {
        F6.d.h(TAG, 3, G.o("currentRouter=", currentRouter));
        if (currentRouter != null) {
            switch (currentRouter) {
                case "BankVerify":
                    G.u(MessageEvent.EVENT_OC_BANK_VERIFY_COMPLETED, org.greenrobot.eventbus.c.b());
                    break;
                case "BankAuth":
                    G.u(MessageEvent.EVENT_OC_BANK_AUTH_COMPLETED, org.greenrobot.eventbus.c.b());
                    break;
                case "LoanExpectation":
                    G.u(MessageEvent.EVENT_OC_LOAN_EXPECTATION_COMPLETED, org.greenrobot.eventbus.c.b());
                    break;
                case "LoanOpayReverse":
                    G.u(MessageEvent.EVENT_OC_OPAY_REVERSE_COMPLETED, org.greenrobot.eventbus.c.b());
                    break;
                default:
                    G.u(MessageEvent.EVENT_OC_PERSON_COMPLETED, org.greenrobot.eventbus.c.b());
                    break;
            }
        } else {
            G.u(MessageEvent.EVENT_OC_PERSON_COMPLETED, org.greenrobot.eventbus.c.b());
        }
        if (ActivityUtils.getTopActivity() != null) {
            ActivityUtils.getTopActivity().finish();
        }
    }

    @ReactMethod
    public final void jumpBillDetailRouter(@NotNull String transType, @NotNull String outOrderNo, @NotNull String subTransType) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(outOrderNo, "outOrderNo");
        Intrinsics.checkNotNullParameter(subTransType, "subTransType");
        Ea.a.e(transType, outOrderNo, subTransType);
    }

    @ReactMethod
    public final void jumpCouponRouter(@NotNull String transType, @NotNull String linkUrl) {
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        if (!TextUtils.isEmpty(linkUrl)) {
            ActivityUtils.startActivity(F.a(BaseApplication.getContext(), linkUrl));
            return;
        }
        if ("04".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
            return;
        }
        if ("15".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/water_home");
            return;
        }
        if ("16".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/electricity_home");
            return;
        }
        if ("17".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/tv_home");
            return;
        }
        if ("29".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/internet_home");
            return;
        }
        if (TransType.TRANS_TYPE_BUNDLE.equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/buy_bundle_ng");
        } else if (TransType.TRANS_TYPE_BILLER_BETTING.equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/quick_teller/betting_home");
        } else if ("0".equals(transType)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/app/all_function_activity");
        }
    }

    @ReactMethod
    public final void logEvent(@NotNull String eventId, @Nullable String eventDataValue) {
        Activity currentActivity;
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        try {
            n0.g().r(eventId, getMap(eventDataValue));
            if (!"event_track_rn_screen".equals(eventId) || (currentActivity = this.context.getCurrentActivity()) == null) {
                return;
            }
            if (!(currentActivity instanceof PPRNActivity)) {
                currentActivity = null;
            }
            if (currentActivity != null) {
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f((PPRNActivity) currentActivity);
                p042cg.f fVar = I.f10809a;
                AbstractC0780y.m(lifecycleCoroutineScopeImplF, p015ag.o.f11960a, null, new Da.m(currentActivity, null), 2);
            }
        } catch (Exception e10) {
            F6.d.c(TAG, "logEvent: ", e10);
        }
    }

    @ReactMethod
    public final void navigateToCBNDialog(@Nullable String url, @Nullable String validationCheckRespJson) {
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity instanceof PPRNActivity) {
            ((PPRNActivity) topActivity).runOnUiThread(new g((PPRNActivity) topActivity, url, validationCheckRespJson, this, 0));
        }
    }

    @ReactMethod
    public final void navigateToLoginOrRegisterPage() {
        Wf.V v3 = Wf.V.f10828a;
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(v3, p015ag.o.f11960a, null, new Da.o(2, null), 2);
    }

    @ReactMethod
    public final void navigateToPage(@Nullable String shortPageName, @Nullable ReadableMap params) {
        navigateToPageReally(shortPageName, params);
    }

    @ReactMethod
    public final void navigateToPageForResult(@Nullable String shortPageName, @Nullable ReadableMap params, @Nullable Integer requestCode, @NotNull Callback onDone, @NotNull Callback onCancel) {
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        F6.d.h(TAG, 3, "navigateToPageForResult >>> shortPageName=" + shortPageName);
        if (TextUtils.isEmpty(shortPageName)) {
            return;
        }
        this.REQUEST_CODE = requestCode != null ? requestCode.intValue() : this.REQUEST_CODE;
        this.mCancelCallback = onCancel;
        this.mDoneCallback = onDone;
        Intrinsics.e(shortPageName);
        Postcard postcardBuild = ARouter.getInstance().build(resolveRnNavigatePath(shortPageName, params));
        if (params != null) {
            try {
                Iterator<Map.Entry<String, Object>> entryIterator = params.getEntryIterator();
                while (entryIterator.hasNext()) {
                    Map.Entry<String, Object> next = entryIterator.next();
                    if (next.getValue() != null) {
                        Object value = next.getValue();
                        if (value instanceof Boolean) {
                            String key = next.getKey();
                            Object value2 = next.getValue();
                            Intrinsics.f(value2, "null cannot be cast to non-null type kotlin.Boolean");
                            postcardBuild.withBoolean(key, ((Boolean) value2).booleanValue());
                        } else if (value instanceof Number) {
                            String key2 = next.getKey();
                            Object value3 = next.getValue();
                            Intrinsics.f(value3, "null cannot be cast to non-null type kotlin.Number");
                            postcardBuild.withLong(key2, ((Number) value3).longValue());
                        } else {
                            postcardBuild.withString(next.getKey(), String.valueOf(next.getValue()));
                        }
                    }
                }
            } catch (Exception e10) {
                F6.d.c("value type error", e10.getLocalizedMessage());
            }
        }
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            postcardBuild.navigation(currentActivity, this.REQUEST_CODE);
        }
    }

    @ReactMethod
    public final void navigateToPpDialog(@Nullable String title, @Nullable ReadableMap params) {
        String string;
        String string2;
        String string3;
        final kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        f10.f38951a = "";
        final kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
        f11.f38951a = "";
        if (params != null) {
            string = params.getString("msg");
            if (string == null) {
                string = "";
            }
            string2 = params.getString("positiveBtnStr");
            if (string2 == null) {
                string2 = "";
            }
            string3 = params.getString("negativeBtnStr");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = params.getString("positiveLinkOfAndroid");
            if (string4 == null) {
                string4 = "";
            }
            f10.f38951a = string4;
            String string5 = params.getString("negativeLinkOfAndroid");
            if (string5 == null) {
                string5 = "";
            }
            f11.f38951a = string5;
        } else {
            string = "";
            string2 = string;
            string3 = string2;
        }
        O6.c cVar = new O6.c(this.context);
        if (title == null) {
            title = "";
        }
        cVar.f6596b = d.f(title);
        cVar.f6598d = string;
        final int i7 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Da.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        PPRNBridge.navigateToPpDialog$lambda$7(f10, this, view);
                        break;
                    default:
                        PPRNBridge.navigateToPpDialog$lambda$10(f10, this, view);
                        break;
                }
            }
        };
        cVar.f6600f = string2;
        cVar.f6602h = onClickListener;
        final int i10 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: Da.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        PPRNBridge.navigateToPpDialog$lambda$7(f11, this, view);
                        break;
                    default:
                        PPRNBridge.navigateToPpDialog$lambda$10(f11, this, view);
                        break;
                }
            }
        };
        cVar.f6601g = string3;
        cVar.f6603i = onClickListener2;
        bindDialogDismissEvent$default(this, cVar.g(), DIALOG_TYPE_PP, null, 4, null);
    }

    @ReactMethod
    public final void postEventBus(@Nullable ReadableMap event) {
        if (event != null) {
            try {
                Iterator<Map.Entry<String, Object>> entryIterator = event.getEntryIterator();
                int iIntValue = 0;
                String strValueOf = null;
                while (entryIterator.hasNext()) {
                    Map.Entry<String, Object> next = entryIterator.next();
                    if (next.getValue() == null) {
                        return;
                    }
                    String key = next.getKey();
                    if (Intrinsics.c(key, "eventType")) {
                        Object value = next.getValue();
                        Intrinsics.f(value, "null cannot be cast to non-null type kotlin.Number");
                        iIntValue = ((Number) value).intValue();
                    } else if (Intrinsics.c(key, "eventContent")) {
                        strValueOf = String.valueOf(next.getValue());
                    }
                }
                org.greenrobot.eventbus.c.b().f(new MessageEvent(iIntValue, strValueOf));
            } catch (Exception e10) {
                F6.d.h("value type error", 3, e10.getLocalizedMessage());
            }
        }
    }

    @ReactMethod
    public final void recordError(@Nullable ReadableMap jsErrorMap) {
        recordJavaScriptError(jsErrorMap);
    }

    @ReactMethod
    public final void sendSMS(@NotNull String phone, @NotNull String smsText) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(smsText, "smsText");
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new RunnableC0085g(5, phone, smsText));
        }
    }

    public final void shareTitleAndText(@Nullable String title, @Nullable String shareTxt) {
        Activity currentActivity;
        if (TextUtils.isEmpty(shareTxt) || (currentActivity = this.context.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.runOnUiThread(new h(currentActivity, 0, title, shareTxt));
    }

    @ReactMethod
    public final void showCommonPopViewWithArray(@Nullable String jsonString, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(this, jsonString, currentActivity, promise, 2));
        }
    }

    @ReactMethod
    public final void showDatePicker(@Nullable String jsonString, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(this, jsonString, currentActivity, promise, 1));
        }
    }

    @ReactMethod
    public final void showDatePickerByMode(@Nullable String jsonString, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(this, jsonString, currentActivity, promise, 0));
        }
    }

    @ReactMethod
    public final void showFlexiCashLoaing(@Nullable String message) {
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof PPRNActivity)) {
                currentActivity = null;
            }
            if (currentActivity != null) {
                ((PPRNActivity) currentActivity).runOnUiThread(new i(currentActivity, message, 0));
            }
        }
    }

    @ReactMethod
    public final void showLongToast(@Nullable String message) {
        Activity currentActivity;
        if (TextUtils.isEmpty(message) || (currentActivity = this.context.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.runOnUiThread(new Da.d(message, 1));
    }

    @ReactMethod
    public final void showShortToast(@Nullable String message) {
        Activity currentActivity;
        if (TextUtils.isEmpty(message) || (currentActivity = this.context.getCurrentActivity()) == null) {
            return;
        }
        currentActivity.runOnUiThread(new Da.d(message, 0));
    }

    @ReactMethod
    public final void showSingleColumnPopView(@Nullable String jsonString, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = this.context.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(this, jsonString, currentActivity, promise, 3));
        }
    }

    @ReactMethod
    public final void updateRnDebugModuleName(@Nullable String pageName) {
    }
}
