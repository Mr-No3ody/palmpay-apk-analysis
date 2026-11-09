package com.facebook.react.devsupport;

import N8.q0;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.UiThread;
import com.didiglobal.booster.instrument.ShadowToast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.R;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.rnbridge.bridge.AudioChannelBridge;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 Ñ\u00012\u00020\u0001:\u0004Ð\u0001Ñ\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010|\u001a\u00020}2\u000b\u0010~\u001a\u00070\u007fj\u0003`\u0080\u0001H\u0016J\u001d\u0010\u0081\u0001\u001a\u00020}2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\u0007\u0010~\u001a\u00030\u0083\u0001H\u0016J\u001b\u0010\u0084\u0001\u001a\u00020}2\u0007\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00020cH\u0016J)\u0010\u0087\u0001\u001a\u00020}2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u000fH\u0016J\u0012\u0010\u008b\u0001\u001a\u00020}2\u0007\u0010\u008c\u0001\u001a\u00020wH\u0016J8\u0010\u008d\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0\u008e\u00012\u001a\u0010\u008f\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K0\u008e\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020}H\u0016J\u0015\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0007H\u0016J\u0015\u0010\u0094\u0001\u001a\u00020}2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0016J\u0016\u0010\u0096\u0001\u001a\u00020}2\u000b\u0010~\u001a\u00070\u007fj\u0003`\u0080\u0001H\u0002J\t\u0010\u0097\u0001\u001a\u00020}H\u0002J;\u0010\u0098\u0001\u001a\u00020}2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020L0K2\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020SH\u0002¢\u0006\u0003\u0010\u009b\u0001J\t\u0010\u009c\u0001\u001a\u00020}H\u0016J\u0012\u0010\u009d\u0001\u001a\u00020}2\u0007\u0010\u009e\u0001\u001a\u00020*H\u0016J\u0012\u0010\u009f\u0001\u001a\u00020}2\u0007\u0010\u009e\u0001\u001a\u00020*H\u0016J\t\u0010 \u0001\u001a\u00020\tH\u0016J\u0014\u0010¡\u0001\u001a\u00020}2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010*H\u0002J\t\u0010¢\u0001\u001a\u00020}H\u0016J\u0012\u0010£\u0001\u001a\u00020}2\u0007\u0010¤\u0001\u001a\u00020\u0007H\u0003J\t\u0010¥\u0001\u001a\u00020}H\u0005J\t\u0010¦\u0001\u001a\u00020}H\u0005J\u001a\u0010§\u0001\u001a\u00020}2\u0007\u0010¨\u0001\u001a\u00020\u00072\b\u0010©\u0001\u001a\u00030ª\u0001J\u0012\u0010«\u0001\u001a\u00020}2\u0007\u0010¤\u0001\u001a\u00020\u0007H\u0003J\t\u0010¬\u0001\u001a\u00020}H\u0003J\u0013\u0010\u00ad\u0001\u001a\u00020}2\b\u0010©\u0001\u001a\u00030®\u0001H\u0016J\u001d\u0010¯\u0001\u001a\u0004\u0018\u00010f2\u0007\u0010°\u0001\u001a\u00020\u00072\u0007\u0010±\u0001\u001a\u00020fH\u0016J;\u0010²\u0001\u001a\u00020}2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00072\r\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020L0K2\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u009a\u0001\u001a\u00020SH\u0002¢\u0006\u0003\u0010\u009b\u0001J\u001c\u0010³\u0001\u001a\u00020}2\u0007\u0010´\u0001\u001a\u00020\u00072\b\u0010©\u0001\u001a\u00030µ\u0001H\u0016J\u0017\u0010¶\u0001\u001a\u00020}2\f\u0010·\u0001\u001a\u00070\u007fj\u0003`\u0080\u0001H\u0002J\t\u0010¸\u0001\u001a\u00020}H\u0016J\t\u0010¹\u0001\u001a\u00020}H\u0016J\u0012\u0010º\u0001\u001a\u00020}2\u0007\u0010»\u0001\u001a\u00020\tH\u0016J\u0012\u0010¼\u0001\u001a\u00020}2\u0007\u0010½\u0001\u001a\u00020\tH\u0016J\t\u0010¾\u0001\u001a\u00020}H\u0016J\t\u0010¿\u0001\u001a\u00020}H\u0002J\u0011\u0010À\u0001\u001a\u00020}2\u0006\u0010x\u001a\u00020yH\u0016J\u0014\u0010Á\u0001\u001a\u0004\u0018\u00010k2\u0007\u0010Â\u0001\u001a\u00020\u0007H\u0016J.\u0010Ã\u0001\u001a\u00020}2\u0007\u0010Ä\u0001\u001a\u00020\u00032\u0007\u0010Å\u0001\u001a\u00020`2\b\u0010Æ\u0001\u001a\u00030Ç\u00012\u0007\u0010È\u0001\u001a\u00020\tH\u0002J\t\u0010É\u0001\u001a\u00020}H\u0016J\u001c\u0010Ê\u0001\u001a\u00020}2\u0007\u0010\u0082\u0001\u001a\u00020\u00072\b\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0016J\t\u0010Í\u0001\u001a\u00020}H\u0016J\u001a\u0010Î\u0001\u001a\u00020}2\u0007\u0010Ï\u0001\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020\u0007X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\"\u0010+\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010*@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u00102\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010 R\u0014\u0010>\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010 R\u0014\u0010@\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010 R\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010IR$\u0010J\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010R\u001a\u0004\u0018\u00010SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020`X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010a\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020c0bj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020c`dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010mX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010n\u001a\u0004\u0018\u00010oX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010u\u001a\b\u0012\u0004\u0012\u00020w0vX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010x\u001a\u0004\u0018\u00010yX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010z\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010 ¨\u0006Ò\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "applicationContext", "Landroid/content/Context;", "reactInstanceDevHelper", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "jsAppBundleName", "", "enableOnCreate", "", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "devBundleDownloadListener", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "minNumShakes", "", "customPackagerCommandHandlers", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "surfaceDelegateFactory", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "pausedInDebuggerOverlayManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "getApplicationContext", "()Landroid/content/Context;", "getReactInstanceDevHelper", "()Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "getJSAppBundleName", "()Ljava/lang/String;", "getRedBoxHandler", "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "getDevLoadingViewManager", "()Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "setDevLoadingViewManager", "(Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;)V", "uniqueTag", "getUniqueTag", "value", "Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "devSettings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "getDevSettings", "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "isDevSupportEnabled", "devSupportEnabled", "getDevSupportEnabled", "()Z", "setDevSupportEnabled", "(Z)V", "sourceMapUrl", "getSourceMapUrl", "sourceUrl", "getSourceUrl", "downloadedJSBundleFile", "getDownloadedJSBundleFile", "devServerHelper", "Lcom/facebook/react/devsupport/DevServerHelper;", "getDevServerHelper", "()Lcom/facebook/react/devsupport/DevServerHelper;", "lastErrorTitle", "getLastErrorTitle", "setLastErrorTitle", "(Ljava/lang/String;)V", "lastErrorStack", "", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "getLastErrorStack", "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "setLastErrorStack", "([Lcom/facebook/react/devsupport/interfaces/StackFrame;)V", "[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "lastErrorType", "Lcom/facebook/react/devsupport/interfaces/ErrorType;", "getLastErrorType", "()Lcom/facebook/react/devsupport/interfaces/ErrorType;", "setLastErrorType", "(Lcom/facebook/react/devsupport/interfaces/ErrorType;)V", "lastErrorCookie", "getLastErrorCookie", "()I", "setLastErrorCookie", "(I)V", "shakeDetector", "Lcom/facebook/react/common/ShakeDetector;", "reloadAppBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "customDevOptions", "Ljava/util/LinkedHashMap;", "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;", "Lkotlin/collections/LinkedHashMap;", "jsBundleDownloadedFile", "Ljava/io/File;", "jsSplitBundlesDir", "defaultJSExceptionHandler", "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "redBoxSurfaceDelegate", "Lcom/facebook/react/common/SurfaceDelegate;", "devOptionsDialog", "Landroid/app/AlertDialog;", "debugOverlayController", "Lcom/facebook/react/devsupport/DebugOverlayController;", "devLoadingViewVisible", "pendingJSSplitBundleRequests", "isReceiverRegistered", "isShakeDetectorStarted", "isPackagerConnected", "errorCustomizers", "", "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;", "packagerLocationCustomizer", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", "jSExecutorDescription", "getJSExecutorDescription", "handleException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showNewJavaError", "message", "", "addCustomDevOption", "optionName", "optionHandler", "showNewJSError", "details", "Lcom/facebook/react/bridge/ReadableArray;", "errorCookie", "registerErrorCustomizer", "errorCustomizer", "processErrorCustomizers", "Landroid/util/Pair;", "errorInfo", "hideRedboxDialog", "createRootView", "Landroid/view/View;", "appKey", "destroyRootView", "rootView", "logJSException", "hideDevOptionsDialog", "showNewError", StackTraceHelper.STACK_KEY, "errorType", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V", "showDevOptionsDialog", "onNewReactContextCreated", "reactContext", "onReactInstanceDestroyed", "hasUpToDateJSBundleInCache", "resetCurrentContext", "reloadSettings", "showDevLoadingViewForUrl", "bundleUrl", "showDevLoadingViewForRemoteJSEnabled", "hideDevLoadingView", "fetchSplitBundleAndCreateBundleLoader", CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, "callback", "Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;", "showSplitBundleDevLoadingView", "hideSplitBundleDevLoadingView", "isPackagerRunning", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "downloadBundleResourceFromUrlSync", "resourceURL", "outputFile", "updateLastErrorInfo", "reloadJSFromServer", "bundleURL", "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;", "reportBundleLoadingFailure", "cause", "startInspector", "stopInspector", "setHotModuleReplacementEnabled", "isHotModuleReplacementEnabled", "setFpsDebugEnabled", "isFpsDebugEnabled", "toggleElementInspector", "reload", "setPackagerLocationCustomizer", "createSurfaceDelegate", "moduleName", "compatRegisterReceiver", "context", AudioChannelBridge.CHANNEL_RECEIVER, ViewProps.FILTER, "Landroid/content/IntentFilter;", "exported", "openDebugger", "showPausedInDebuggerOverlay", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "hidePausedInDebuggerOverlay", "setAdditionalOptionForPackager", "name", "CallbackWithBundleLoader", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDevSupportManagerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevSupportManagerBase.kt\ncom/facebook/react/devsupport/DevSupportManagerBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,902:1\n1#2:903\n37#3:904\n36#3,3:905\n37#3:908\n36#3,3:909\n*S KotlinDebug\n*F\n+ 1 DevSupportManagerBase.kt\ncom/facebook/react/devsupport/DevSupportManagerBase\n*L\n408#1:904\n408#1:905,3\n445#1:908\n445#1:909,3\n*E\n"})
public abstract class DevSupportManagerBase implements DevSupportManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;

    @NotNull
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";

    @NotNull
    private final Context applicationContext;

    @Nullable
    private ReactContext currentReactContext;

    @NotNull
    private final LinkedHashMap<String, DevOptionHandler> customDevOptions;

    @Nullable
    private final Map<String, RequestHandler> customPackagerCommandHandlers;

    @Nullable
    private DebugOverlayController debugOverlayController;

    @NotNull
    private final DefaultJSExceptionHandler defaultJSExceptionHandler;

    @Nullable
    private final DevBundleDownloadListener devBundleDownloadListener;

    @Nullable
    private DevLoadingViewManager devLoadingViewManager;
    private boolean devLoadingViewVisible;

    @Nullable
    private AlertDialog devOptionsDialog;

    @NotNull
    private final DevServerHelper devServerHelper;

    @NotNull
    private final DeveloperSettings devSettings;

    @NotNull
    private final List<ErrorCustomizer> errorCustomizers;
    private boolean isDevSupportEnabled;
    private boolean isPackagerConnected;
    private boolean isReceiverRegistered;
    private boolean isShakeDetectorStarted;

    @Nullable
    private final String jsAppBundleName;

    @NotNull
    private final File jsBundleDownloadedFile;

    @NotNull
    private final File jsSplitBundlesDir;
    private int lastErrorCookie;

    @Nullable
    private StackFrame[] lastErrorStack;

    @Nullable
    private String lastErrorTitle;

    @Nullable
    private ErrorType lastErrorType;

    @Nullable
    private DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer;

    @Nullable
    private PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager;
    private int pendingJSSplitBundleRequests;

    @NotNull
    private final ReactInstanceDevHelper reactInstanceDevHelper;

    @Nullable
    private final RedBoxHandler redBoxHandler;

    @Nullable
    private SurfaceDelegate redBoxSurfaceDelegate;

    @NotNull
    private final BroadcastReceiver reloadAppBroadcastReceiver;

    @NotNull
    private final ShakeDetector shakeDetector;

    @Nullable
    private final SurfaceDelegateFactory surfaceDelegateFactory;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;", "", "onSuccess", "", "bundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "onError", "url", "", "cause", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallbackWithBundleLoader {
        void onError(@NotNull String url, @NotNull Throwable cause);

        void onSuccess(@NotNull JSBundleLoader bundleLoader);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;", "", "<init>", "()V", "JAVA_ERROR_COOKIE", "", "JSEXCEPTION_ERROR_COOKIE", "RELOAD_APP_ACTION_SUFFIX", "", "EXOPACKAGE_LOCATION_FORMAT", "getReloadAppAction", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getReloadAppAction(Context context) {
            return q0.j(context.getPackageName(), DevSupportManagerBase.RELOAD_APP_ACTION_SUFFIX);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$reload$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"com/facebook/react/devsupport/DevSupportManagerBase$reload$1", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "onPackagerConnected", "", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", "customCommandHandlers", "", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements DevServerHelper.PackagerCommandListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPackagerDevMenuCommand$lambda$1(DevSupportManagerBase devSupportManagerBase) {
            devSupportManagerBase.showDevOptionsDialog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPackagerReloadCommand$lambda$0(DevSupportManagerBase devSupportManagerBase) {
            devSupportManagerBase.handleReloadJS();
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public Map<String, RequestHandler> customCommandHandlers() {
            return DevSupportManagerBase.this.customPackagerCommandHandlers;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerConnected() {
            DevSupportManagerBase.this.isPackagerConnected = true;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDevMenuCommand() {
            UiThreadUtil.runOnUiThread(new k(DevSupportManagerBase.this, 5));
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDisconnected() {
            DevSupportManagerBase.this.isPackagerConnected = false;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerReloadCommand() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                DevSupportManagerBase.this.getDevServerHelper().disableDebugger();
            }
            UiThreadUtil.runOnUiThread(new k(DevSupportManagerBase.this, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevSupportManagerBase(@NotNull Context applicationContext, @NotNull ReactInstanceDevHelper reactInstanceDevHelper, @Nullable String str, boolean z3, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i7, @Nullable Map<String, ? extends RequestHandler> map, @Nullable SurfaceDelegateFactory surfaceDelegateFactory, @Nullable DevLoadingViewManager devLoadingViewManager, @Nullable PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.applicationContext = applicationContext;
        this.reactInstanceDevHelper = reactInstanceDevHelper;
        this.jsAppBundleName = str;
        this.redBoxHandler = redBoxHandler;
        this.devBundleDownloadListener = devBundleDownloadListener;
        this.customPackagerCommandHandlers = map;
        this.surfaceDelegateFactory = surfaceDelegateFactory;
        this.devLoadingViewManager = devLoadingViewManager;
        this.pausedInDebuggerOverlayManager = pausedInDebuggerOverlayManager;
        DevInternalSettings devInternalSettings = new DevInternalSettings(applicationContext, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$devSettings$1
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public void onInternalSettingsChanged() {
                this.this$0.reloadSettings();
            }
        });
        this.devSettings = devInternalSettings;
        this.devServerHelper = new DevServerHelper(devInternalSettings, applicationContext, devInternalSettings.getPackagerConnectionSettings());
        this.shakeDetector = new ShakeDetector(new j(this), i7);
        this.reloadAppBroadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$reloadAppBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.c(DevSupportManagerBase.INSTANCE.getReloadAppAction(context), intent.getAction())) {
                    this.this$0.handleReloadJS();
                }
            }
        };
        this.customDevOptions = new LinkedHashMap<>();
        this.defaultJSExceptionHandler = new DefaultJSExceptionHandler();
        this.errorCustomizers = new ArrayList();
        String uniqueTag = getUniqueTag();
        this.jsBundleDownloadedFile = new File(applicationContext.getFilesDir(), q0.j(uniqueTag, "ReactNativeDevBundle.js"));
        String lowerCase = uniqueTag.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        File dir = applicationContext.getDir(lowerCase + "_dev_js_split_bundles", 0);
        Intrinsics.checkNotNullExpressionValue(dir, "getDir(...)");
        this.jsSplitBundlesDir = dir;
        setDevSupportEnabled(z3);
        if (this.devLoadingViewManager == null) {
            this.devLoadingViewManager = new DefaultDevLoadingViewImplementation(reactInstanceDevHelper);
        }
        if (this.pausedInDebuggerOverlayManager == null) {
            this.pausedInDebuggerOverlayManager = new PausedInDebuggerOverlayDialogManager(new j(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context _init_$lambda$3(DevSupportManagerBase devSupportManagerBase) {
        Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        return currentActivity;
    }

    public static final /* synthetic */ void access$hideSplitBundleDevLoadingView(DevSupportManagerBase devSupportManagerBase) {
        devSupportManagerBase.hideSplitBundleDevLoadingView();
    }

    private final void compatRegisterReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, boolean exported) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(receiver, filter);
        } else {
            context.registerReceiver(receiver, filter, exported ? 2 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchSplitBundleAndCreateBundleLoader$lambda$21(DevSupportManagerBase devSupportManagerBase, String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
        devSupportManagerBase.showSplitBundleDevLoadingView(str);
        DevServerHelper.downloadBundleFromURL$default(devSupportManagerBase.devServerHelper, new DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1(devSupportManagerBase, str, file, callbackWithBundleLoader), file, str, null, null, 16, null);
    }

    private final String getJSExecutorDescription() {
        try {
            return this.reactInstanceDevHelper.getJavaScriptExecutorFactory().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private final void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.devOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.devOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public final void hideSplitBundleDevLoadingView() {
        int i7 = this.pendingJSSplitBundleRequests - 1;
        this.pendingJSSplitBundleRequests = i7;
        if (i7 == 0) {
            hideDevLoadingView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isPackagerRunning$lambda$22(DevSupportManagerBase devSupportManagerBase, PackagerStatusCallback packagerStatusCallback) {
        devSupportManagerBase.devServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    private final void logJSException(Exception e10) {
        String message = e10.getMessage();
        if (message == null) {
            message = "Exception in native call from JS";
        }
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable cause = e10.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (!(e10 instanceof JavascriptException)) {
            showNewJavaError(sb2.toString(), e10);
        } else {
            p229p2.a.i("ReactNative", "Exception in native call from JS", e10);
            showNewError(e10.getMessage(), new StackFrame[0], -1, ErrorType.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reload() {
        DevLoadingViewManager devLoadingViewManager;
        UiThreadUtil.assertOnUiThread();
        if (!this.isDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.debugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(false);
            }
            if (this.isShakeDetectorStarted) {
                this.shakeDetector.stop();
                this.isShakeDetectorStarted = false;
            }
            if (this.isReceiverRegistered) {
                this.applicationContext.unregisterReceiver(this.reloadAppBroadcastReceiver);
                this.isReceiverRegistered = false;
            }
            hideRedboxDialog();
            hideDevOptionsDialog();
            DevLoadingViewManager devLoadingViewManager2 = this.devLoadingViewManager;
            if (devLoadingViewManager2 != null) {
                devLoadingViewManager2.hide();
            }
            this.devServerHelper.closePackagerConnection();
            return;
        }
        DebugOverlayController debugOverlayController2 = this.debugOverlayController;
        if (debugOverlayController2 != null) {
            debugOverlayController2.setFpsDebugViewVisible(this.devSettings.isFpsDebugEnabled());
        }
        if (!this.isShakeDetectorStarted) {
            Object systemService = this.applicationContext.getSystemService("sensor");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            this.shakeDetector.start((SensorManager) systemService);
            this.isShakeDetectorStarted = true;
        }
        if (!this.isReceiverRegistered) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(INSTANCE.getReloadAppAction(this.applicationContext));
            compatRegisterReceiver(this.applicationContext, this.reloadAppBroadcastReceiver, intentFilter, true);
            this.isReceiverRegistered = true;
        }
        if (this.devLoadingViewVisible && (devLoadingViewManager = this.devLoadingViewManager) != null) {
            devLoadingViewManager.showMessage("Reloading...");
        }
        this.devServerHelper.openPackagerConnection(getClass().getSimpleName(), new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadSettings$lambda$20(DevSupportManagerBase devSupportManagerBase) {
        devSupportManagerBase.reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportBundleLoadingFailure(Exception cause) {
        UiThreadUtil.runOnUiThread(new d(4, cause, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportBundleLoadingFailure$lambda$23(Exception exc, DevSupportManagerBase devSupportManagerBase) {
        if (exc instanceof DebugServerException) {
            devSupportManagerBase.showNewJavaError(exc.getMessage(), exc);
        } else {
            devSupportManagerBase.showNewJavaError(devSupportManagerBase.applicationContext.getString(R.string.catalyst_reload_error), exc);
        }
    }

    private final void resetCurrentContext(ReactContext reactContext) {
        if (this.currentReactContext == reactContext) {
            return;
        }
        this.currentReactContext = reactContext;
        DebugOverlayController debugOverlayController = this.debugOverlayController;
        if (debugOverlayController != null) {
            debugOverlayController.setFpsDebugViewVisible(false);
        }
        if (reactContext != null) {
            this.debugOverlayController = new DebugOverlayController(reactContext);
        }
        if (reactContext != null) {
            try {
                URL url = new URL(getSourceUrl());
                String path = url.getPath();
                if (path != null) {
                    path = path.substring(1);
                    Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
                }
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).setup("android", path, url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.devSettings.isHotModuleReplacementEnabled(), url.getProtocol());
            } catch (MalformedURLException e10) {
                showNewJavaError(e10.getMessage(), e10);
            }
        }
        reloadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFpsDebugEnabled$lambda$25(DevSupportManagerBase devSupportManagerBase, boolean z3) {
        devSupportManagerBase.devSettings.setFpsDebugEnabled(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHotModuleReplacementEnabled$lambda$24(DevSupportManagerBase devSupportManagerBase, boolean z3) {
        devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(z3);
        devSupportManagerBase.handleReloadJS();
    }

    @UiThread
    private final void showDevLoadingViewForUrl(String bundleUrl) {
        try {
            URL url = new URL(bundleUrl);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
            if (devLoadingViewManager != null) {
                String string = this.applicationContext.getString(R.string.catalyst_loading_from_url, url.getHost() + ":" + port);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                devLoadingViewManager.showMessage(string);
            }
            this.devLoadingViewVisible = true;
        } catch (MalformedURLException e10) {
            p229p2.a.h("ReactNative", "Bundle url format is invalid. \n\n" + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$10(DevSupportManagerBase devSupportManagerBase) {
        Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            p229p2.a.h("ReactNative", "Unable to launch change bundle location because react activity is not available");
        } else {
            ChangeBundleLocationDialog.INSTANCE.show(currentActivity, devSupportManagerBase.devSettings, new j(devSupportManagerBase));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$10$lambda$9(DevSupportManagerBase devSupportManagerBase, String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        devSupportManagerBase.devSettings.getPackagerConnectionSettings().setDebugServerHost(host);
        devSupportManagerBase.handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$11(DevSupportManagerBase devSupportManagerBase) {
        DeveloperSettings developerSettings = devSupportManagerBase.devSettings;
        developerSettings.setElementInspectorEnabled(!developerSettings.isElementInspectorEnabled());
        devSupportManagerBase.reactInstanceDevHelper.toggleElementInspector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$12(DevSupportManagerBase devSupportManagerBase) {
        boolean zIsHotModuleReplacementEnabled = devSupportManagerBase.devSettings.isHotModuleReplacementEnabled();
        devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(!zIsHotModuleReplacementEnabled);
        ReactContext reactContext = devSupportManagerBase.currentReactContext;
        if (reactContext != null) {
            if (zIsHotModuleReplacementEnabled) {
                HMRClient hMRClient = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient != null) {
                    hMRClient.disable();
                }
            } else {
                HMRClient hMRClient2 = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient2 != null) {
                    hMRClient2.enable();
                }
            }
        }
        if (zIsHotModuleReplacementEnabled || devSupportManagerBase.devSettings.isJSDevModeEnabled()) {
            return;
        }
        Context context = devSupportManagerBase.applicationContext;
        ShadowToast.show(Toast.makeText(context, context.getString(R.string.catalyst_hot_reloading_auto_enable), 1));
        devSupportManagerBase.devSettings.setJSDevModeEnabled(true);
        devSupportManagerBase.handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$13(DevSupportManagerBase devSupportManagerBase) {
        if (!devSupportManagerBase.devSettings.isFpsDebugEnabled()) {
            Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                p229p2.a.h("ReactNative", "Unable to get reference to react activity");
            } else {
                DebugOverlayController.INSTANCE.requestPermission(currentActivity);
            }
        }
        DeveloperSettings developerSettings = devSupportManagerBase.devSettings;
        developerSettings.setFpsDebugEnabled(!developerSettings.isFpsDebugEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$14(DevSupportManagerBase devSupportManagerBase) {
        Intent intent = new Intent(devSupportManagerBase.applicationContext, (Class<?>) DevSettingsActivity.class);
        intent.setFlags(268435456);
        devSupportManagerBase.applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$17(DevOptionHandler[] devOptionHandlerArr, DevSupportManagerBase devSupportManagerBase, DialogInterface dialogInterface, int i7) {
        devOptionHandlerArr[i7].onOptionSelected();
        devSupportManagerBase.devOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$7(DevSupportManagerBase devSupportManagerBase) {
        if (!devSupportManagerBase.devSettings.isJSDevModeEnabled() && devSupportManagerBase.devSettings.isHotModuleReplacementEnabled()) {
            Context context = devSupportManagerBase.applicationContext;
            ShadowToast.show(Toast.makeText(context, context.getString(R.string.catalyst_hot_reloading_auto_disable), 1));
            devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(false);
        }
        devSupportManagerBase.handleReloadJS();
    }

    private final void showNewError(String message, StackFrame[] stack, int errorCookie, ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Lb.b(this, message, stack, errorCookie, errorType, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNewError$lambda$6(DevSupportManagerBase devSupportManagerBase, String str, StackFrame[] stackFrameArr, int i7, ErrorType errorType) {
        SurfaceDelegate surfaceDelegate;
        devSupportManagerBase.updateLastErrorInfo(str, stackFrameArr, i7, errorType);
        if (devSupportManagerBase.redBoxSurfaceDelegate == null) {
            SurfaceDelegate surfaceDelegateCreateSurfaceDelegate = devSupportManagerBase.createSurfaceDelegate(NativeRedBoxSpec.NAME);
            if (surfaceDelegateCreateSurfaceDelegate == null) {
                surfaceDelegateCreateSurfaceDelegate = new RedBoxDialogSurfaceDelegate(devSupportManagerBase);
                surfaceDelegateCreateSurfaceDelegate.createContentView(NativeRedBoxSpec.NAME);
            }
            devSupportManagerBase.redBoxSurfaceDelegate = surfaceDelegateCreateSurfaceDelegate;
        }
        SurfaceDelegate surfaceDelegate2 = devSupportManagerBase.redBoxSurfaceDelegate;
        if ((surfaceDelegate2 == null || !surfaceDelegate2.isShowing()) && (surfaceDelegate = devSupportManagerBase.redBoxSurfaceDelegate) != null) {
            surfaceDelegate.show();
        }
    }

    @UiThread
    private final void showSplitBundleDevLoadingView(String bundleUrl) {
        showDevLoadingViewForUrl(bundleUrl);
        this.pendingJSSplitBundleRequests++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleElementInspector$lambda$26(DevSupportManagerBase devSupportManagerBase) {
        DeveloperSettings developerSettings = devSupportManagerBase.devSettings;
        developerSettings.setElementInspectorEnabled(!developerSettings.isElementInspectorEnabled());
        devSupportManagerBase.reactInstanceDevHelper.toggleElementInspector();
    }

    private final void updateLastErrorInfo(String message, StackFrame[] stack, int errorCookie, ErrorType errorType) {
        this.lastErrorTitle = message;
        this.lastErrorStack = stack;
        this.lastErrorCookie = errorCookie;
        this.lastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(@NotNull String optionName, @NotNull DevOptionHandler optionHandler) {
        Intrinsics.checkNotNullParameter(optionName, "optionName");
        Intrinsics.checkNotNullParameter(optionHandler, "optionHandler");
        this.customDevOptions.put(optionName, optionHandler);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public View createRootView(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return this.reactInstanceDevHelper.createRootView(appKey);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public SurfaceDelegate createSurfaceDelegate(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        SurfaceDelegateFactory surfaceDelegateFactory = this.surfaceDelegateFactory;
        if (surfaceDelegateFactory != null) {
            return surfaceDelegateFactory.createSurfaceDelegate(moduleName);
        }
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(@Nullable View rootView) {
        if (rootView != null) {
            this.reactInstanceDevHelper.destroyRootView(rootView);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public File downloadBundleResourceFromUrlSync(@NotNull String resourceURL, @NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(resourceURL, "resourceURL");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        return this.devServerHelper.downloadBundleResourceFromUrlSync(resourceURL, outputFile);
    }

    public final void fetchSplitBundleAndCreateBundleLoader(@NotNull String bundlePath, @NotNull CallbackWithBundleLoader callback) {
        Intrinsics.checkNotNullParameter(bundlePath, "bundlePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        UiThreadUtil.runOnUiThread(new Da.g(this, this.devServerHelper.getDevServerSplitBundleURL(bundlePath), new File(this.jsSplitBundlesDir, q0.j(new Regex("/").replace(bundlePath, "_"), ".jsbundle")), callback, 14));
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public Activity getCurrentActivity() {
        return this.reactInstanceDevHelper.getCurrentActivity();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public final ReactContext getCurrentReactContext() {
        return this.currentReactContext;
    }

    @Nullable
    public final DevLoadingViewManager getDevLoadingViewManager() {
        return this.devLoadingViewManager;
    }

    @NotNull
    public final DevServerHelper getDevServerHelper() {
        return this.devServerHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @NotNull
    public final DeveloperSettings getDevSettings() {
        return this.devSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    /* JADX INFO: renamed from: getDevSupportEnabled, reason: from getter */
    public final boolean getIsDevSupportEnabled() {
        return this.isDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @NotNull
    public String getDownloadedJSBundleFile() {
        String absolutePath = this.jsBundleDownloadedFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @JvmName(name = "getJSAppBundleName")
    @Nullable
    /* JADX INFO: renamed from: getJSAppBundleName, reason: from getter */
    public final String getJsAppBundleName() {
        return this.jsAppBundleName;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final int getLastErrorCookie() {
        return this.lastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public final StackFrame[] getLastErrorStack() {
        return this.lastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public final String getLastErrorTitle() {
        return this.lastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public final ErrorType getLastErrorType() {
        return this.lastErrorType;
    }

    @NotNull
    public final ReactInstanceDevHelper getReactInstanceDevHelper() {
        return this.reactInstanceDevHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public RedBoxHandler getRedBoxHandler() {
        return this.redBoxHandler;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @NotNull
    public String getSourceMapUrl() {
        String sourceMapUrl;
        String str = this.jsAppBundleName;
        return (str == null || (sourceMapUrl = this.devServerHelper.getSourceMapUrl(str)) == null) ? "" : sourceMapUrl;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @NotNull
    public String getSourceUrl() {
        String sourceUrl;
        String str = this.jsAppBundleName;
        return (str == null || (sourceUrl = this.devServerHelper.getSourceUrl(str)) == null) ? "" : sourceUrl;
    }

    @NotNull
    public abstract String getUniqueTag();

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(@NotNull Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (this.isDevSupportEnabled) {
            logJSException(e10);
        } else {
            this.defaultJSExceptionHandler.handleException(e10);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        if (this.isDevSupportEnabled && this.jsBundleDownloadedFile.exists()) {
            try {
                String packageName = this.applicationContext.getPackageName();
                PackageManager packageManager = this.applicationContext.getPackageManager();
                if (packageManager != null) {
                    if (this.jsBundleDownloadedFile.lastModified() > packageManager.getPackageInfo(packageName, 0).lastUpdateTime) {
                        String str = String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, Arrays.copyOf(new Object[]{packageName}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        File file = new File(str);
                        if (!file.exists() || this.jsBundleDownloadedFile.lastModified() > file.lastModified()) {
                            return true;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p229p2.a.h("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @UiThread
    public final void hideDevLoadingView() {
        DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            devLoadingViewManager.hide();
        }
        this.devLoadingViewVisible = false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
        PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager = this.pausedInDebuggerOverlayManager;
        if (pausedInDebuggerOverlayManager != null) {
            pausedInDebuggerOverlayManager.hidePausedInDebuggerOverlay();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.redBoxSurfaceDelegate;
        if (surfaceDelegate != null) {
            surfaceDelegate.hide();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(@NotNull PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        d dVar = new d(3, this, callback);
        DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer = this.packagerLocationCustomizer;
        if (packagerLocationCustomizer != null) {
            packagerLocationCustomizer.run(dVar);
        } else {
            dVar.run();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (reactContext == this.currentReactContext) {
            resetCurrentContext(null);
        }
        System.gc();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void openDebugger() {
        this.devServerHelper.openDebugger(this.currentReactContext, this.applicationContext.getString(R.string.catalyst_open_debugger_error));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @NotNull
    public Pair<String, StackFrame[]> processErrorCustomizers(@NotNull Pair<String, StackFrame[]> errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        Iterator<ErrorCustomizer> it = this.errorCustomizers.iterator();
        Pair<String, StackFrame[]> pairCustomizeErrorInfo = errorInfo;
        while (it.hasNext()) {
            pairCustomizeErrorInfo = it.next().customizeErrorInfo(errorInfo);
        }
        return pairCustomizeErrorInfo;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(@NotNull ErrorCustomizer errorCustomizer) {
        Intrinsics.checkNotNullParameter(errorCustomizer, "errorCustomizer");
        this.errorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(@NotNull String bundleURL, @NotNull final BundleLoadCallback callback) {
        Intrinsics.checkNotNullParameter(bundleURL, "bundleURL");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        showDevLoadingViewForUrl(bundleURL);
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        DevServerHelper.downloadBundleFromURL$default(this.devServerHelper, new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.reloadJSFromServer.1
            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(Exception cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                DevSupportManagerBase.this.hideDevLoadingView();
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onFailure(cause);
                }
                p229p2.a.i("ReactNative", "Unable to download JS bundle", cause);
                DevSupportManagerBase.this.reportBundleLoadingFailure(cause);
                callback.onError(cause);
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(String status, Integer done, Integer total) {
                DevLoadingViewManager devLoadingViewManager = DevSupportManagerBase.this.getDevLoadingViewManager();
                if (devLoadingViewManager != null) {
                    devLoadingViewManager.updateProgress(status, done, total);
                }
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onProgress(status, done, total);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess() {
                DevSupportManagerBase.this.hideDevLoadingView();
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onSuccess();
                }
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                callback.onSuccess();
            }
        }, this.jsBundleDownloadedFile, bundleURL, bundleInfo, null, 16, null);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new k(this, 1));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.devSettings.getPackagerConnectionSettings().setAdditionalOptionForPackager(name, value);
    }

    public final void setDevLoadingViewManager(@Nullable DevLoadingViewManager devLoadingViewManager) {
        this.devLoadingViewManager = devLoadingViewManager;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final void setDevSupportEnabled(boolean z3) {
        this.isDevSupportEnabled = z3;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(boolean isFpsDebugEnabled) {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new i(this, isFpsDebugEnabled, 0));
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(boolean isHotModuleReplacementEnabled) {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new i(this, isHotModuleReplacementEnabled, 1));
        }
    }

    public final void setLastErrorCookie(int i7) {
        this.lastErrorCookie = i7;
    }

    public final void setLastErrorStack(@Nullable StackFrame[] stackFrameArr) {
        this.lastErrorStack = stackFrameArr;
    }

    public final void setLastErrorTitle(@Nullable String str) {
        this.lastErrorTitle = str;
    }

    public final void setLastErrorType(@Nullable ErrorType errorType) {
        this.lastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(@NotNull DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        Intrinsics.checkNotNullParameter(packagerLocationCustomizer, "packagerLocationCustomizer");
        this.packagerLocationCustomizer = packagerLocationCustomizer;
    }

    @UiThread
    public final void showDevLoadingViewForRemoteJSEnabled() {
        DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            String string = this.applicationContext.getString(R.string.catalyst_debug_connecting);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            devLoadingViewManager.showMessage(string);
        }
        this.devLoadingViewVisible = true;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
        RCTNativeAppEventEmitter rCTNativeAppEventEmitter;
        if (this.devOptionsDialog == null && this.isDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final HashSet hashSet = new HashSet();
            final int i7 = 2;
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_reload), new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i7) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            if (this.devSettings.getIsDeviceDebugEnabled()) {
                boolean z3 = this.isPackagerConnected;
                String string = this.applicationContext.getString(z3 ? R.string.catalyst_debug_open : R.string.catalyst_debug_open_disabled);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (!z3) {
                    hashSet.add(string);
                }
                final int i10 = 3;
                linkedHashMap.put(string, new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DevSupportManagerBase f21725b;

                    {
                        this.f21725b = this;
                    }

                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        switch (i10) {
                            case 0:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                                break;
                            case 1:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                                break;
                            case 2:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                                break;
                            case 3:
                                this.f21725b.openDebugger();
                                break;
                            case 4:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                                break;
                            case 5:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                                break;
                            default:
                                DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                                break;
                        }
                    }
                });
            }
            final int i11 = 4;
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_change_bundle_location), new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i11) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            final int i12 = 5;
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_inspector_toggle), new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i12) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            String string2 = this.devSettings.isHotModuleReplacementEnabled() ? this.applicationContext.getString(R.string.catalyst_hot_reloading_stop) : this.applicationContext.getString(R.string.catalyst_hot_reloading);
            Intrinsics.e(string2);
            final int i13 = 6;
            linkedHashMap.put(string2, new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i13) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            String string3 = this.devSettings.isFpsDebugEnabled() ? this.applicationContext.getString(R.string.catalyst_perf_monitor_stop) : this.applicationContext.getString(R.string.catalyst_perf_monitor);
            Intrinsics.e(string3);
            final int i14 = 0;
            linkedHashMap.put(string3, new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i14) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            final int i15 = 1;
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_settings), new DevOptionHandler(this) { // from class: com.facebook.react.devsupport.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DevSupportManagerBase f21725b;

                {
                    this.f21725b = this;
                }

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    switch (i15) {
                        case 0:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f21725b);
                            break;
                        case 1:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14(this.f21725b);
                            break;
                        case 2:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$7(this.f21725b);
                            break;
                        case 3:
                            this.f21725b.openDebugger();
                            break;
                        case 4:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$10(this.f21725b);
                            break;
                        case 5:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$11(this.f21725b);
                            break;
                        default:
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f21725b);
                            break;
                    }
                }
            });
            if (!this.customDevOptions.isEmpty()) {
                linkedHashMap.putAll(this.customDevOptions);
            }
            Collection collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) collectionValues.toArray(new DevOptionHandler[0]);
            final Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                p229p2.a.h("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(currentActivity);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(currentActivity);
            textView.setText(currentActivity.getString(R.string.catalyst_dev_menu_header, getUniqueTag()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String jSExecutorDescription = getJSExecutorDescription();
            if (jSExecutorDescription != null) {
                TextView textView2 = new TextView(currentActivity);
                textView2.setText(currentActivity.getString(R.string.catalyst_dev_menu_sub_header, jSExecutorDescription));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            Set setKeySet = linkedHashMap.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
            final String[] strArr = (String[]) setKeySet.toArray(new String[0]);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(currentActivity).setCustomTitle(linearLayout).setAdapter(new ArrayAdapter<String>(currentActivity, strArr) { // from class: com.facebook.react.devsupport.DevSupportManagerBase$showDevOptionsDialog$adapter$1
                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean areAllItemsEnabled() {
                    return false;
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int position, View convertView, ViewGroup parent) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    View view = super.getView(position, convertView, parent);
                    Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                    view.setEnabled(isEnabled(position));
                    return view;
                }

                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean isEnabled(int position) {
                    return !hashSet.contains(getItem(position));
                }
            }, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$17(devOptionHandlerArr, this, dialogInterface, i16);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.h
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f21728a.devOptionsDialog = null;
                }
            }).create();
            this.devOptionsDialog = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.show();
            }
            ReactContext reactContext = this.currentReactContext;
            if (reactContext == null || (rCTNativeAppEventEmitter = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)) == null) {
                return;
            }
            rCTNativeAppEventEmitter.emit("RCTDevMenuShown", null);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(@Nullable String message, @Nullable ReadableArray details, int errorCookie) {
        showNewError(message, StackTraceHelper.convertJsStackTrace(details), errorCookie, ErrorType.JS);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(@Nullable String message, @NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        p229p2.a.i("ReactNative", "Exception in native call", e10);
        showNewError(message, StackTraceHelper.convertJavaStackTrace(e10), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(@NotNull String message, @NotNull DevSupportManager.PausedInDebuggerOverlayCommandListener listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
        PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager = this.pausedInDebuggerOverlayManager;
        if (pausedInDebuggerOverlayManager != null) {
            pausedInDebuggerOverlayManager.showPausedInDebuggerOverlay(message, listener);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.isDevSupportEnabled) {
            this.devServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.devServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new k(this, 0));
        }
    }
}
