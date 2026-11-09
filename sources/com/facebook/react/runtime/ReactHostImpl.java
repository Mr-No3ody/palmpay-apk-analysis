package com.facebook.react.runtime;

import Ad.C0058e;
import C0.G;
import N8.q0;
import Pa.RunnableC0527y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import androidx.work.impl.CallableC1270c;
import androidx.work.impl.D;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.MemoryPressureRouter;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkHelper;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.BlackHoleEventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.maps.android.BuildConfig;
import com.horcrux.svg.d0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ü\u00012\u00020\u0001:\u0004û\u0001ü\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0013J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0016J\u001b\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0002\bHJ\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0002\bJJ\u001b\u0010K\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0002\bLJ\u001c\u0010M\u001a\u00020;2\b\u0010&\u001a\u0004\u0018\u00010(2\b\u0010N\u001a\u0004\u0018\u000105H\u0017J\u0012\u0010M\u001a\u00020;2\b\u0010&\u001a\u0004\u0018\u00010(H\u0017J\u0012\u0010O\u001a\u00020;2\b\u0010&\u001a\u0004\u0018\u00010(H\u0017J\u0012\u0010P\u001a\u00020;2\b\u0010&\u001a\u0004\u0018\u00010(H\u0017J\b\u0010P\u001a\u00020;H\u0017J\b\u0010Q\u001a\u00020;H\u0017J\u0012\u0010Q\u001a\u00020;2\b\u0010&\u001a\u0004\u0018\u00010(H\u0017J\u0010\u0010R\u001a\u00020;2\u0006\u0010S\u001a\u00020\fH\u0002J\"\u0010X\u001a\u00020Y2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\b\u0010a\u001a\u00020\fH\u0017J\u0010\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u000208H\u0016J\u0010\u0010h\u001a\u00020;2\u0006\u0010g\u001a\u000208H\u0016J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010j\u001a\u00020[H\u0016J\u0012\u0010k\u001a\u00020;2\b\u0010l\u001a\u0004\u0018\u00010[H\u0003J\u0018\u0010q\u001a\u00020;2\u0006\u0010r\u001a\u00020[2\u0006\u0010g\u001a\u00020sH\u0003JI\u0010t\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010j\u001a\u00020[2\u000e\u0010u\u001a\n\u0018\u00010vj\u0004\u0018\u0001`w2!\u0010x\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(|\u0012\u0004\u0012\u00020;0yH\u0016J&\u0010t\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010j\u001a\u00020[2\u000e\u0010u\u001a\n\u0018\u00010vj\u0004\u0018\u0001`wH\u0016J\u0010\u0010}\u001a\u0002032\u0006\u0010#\u001a\u00020\"H\u0002J,\u0010\u008d\u0001\u001a\u00020\f\"\n\b\u0000\u0010\u008e\u0001*\u00030\u008f\u00012\u000f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008e\u00010\u0091\u0001H\u0000¢\u0006\u0003\b\u0092\u0001J2\u0010\u0097\u0001\u001a\u0005\u0018\u0001H\u008e\u0001\"\n\b\u0000\u0010\u008e\u0001*\u00030\u008f\u00012\u000f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008e\u00010\u0091\u0001H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001b\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u009a\u0001\u001a\u00020[H\u0000¢\u0006\u0003\b\u0098\u0001J/\u0010£\u0001\u001a\u00020;2\u0006\u0010&\u001a\u00020(2\u0007\u0010¤\u0001\u001a\u0002012\u0007\u0010¥\u0001\u001a\u0002012\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001H\u0017J\u0012\u0010¨\u0001\u001a\u00020;2\u0007\u0010©\u0001\u001a\u00020\fH\u0017J\u0013\u0010ª\u0001\u001a\u00020;2\b\u0010«\u0001\u001a\u00030§\u0001H\u0017J\u0011\u0010¬\u0001\u001a\u00020;2\u0006\u0010\u0002\u001a\u00020\u0003H\u0017J\u001f\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\f0!2\b\u0010µ\u0001\u001a\u00030¶\u0001H\u0000¢\u0006\u0003\b·\u0001J3\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\f0!2\u0007\u0010¹\u0001\u001a\u0002012\u0007\u0010º\u0001\u001a\u00020[2\n\u0010»\u0001\u001a\u0005\u0018\u00010¼\u0001H\u0000¢\u0006\u0003\b½\u0001J\u001c\u0010¾\u0001\u001a\u00020;2\u000b\u0010¿\u0001\u001a\u00060vj\u0002`wH\u0000¢\u0006\u0003\bÀ\u0001J0\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\f0!2\u0006\u0010Z\u001a\u00020[2\u0007\u0010Â\u0001\u001a\u00020[2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0000¢\u0006\u0003\bÅ\u0001J\u0017\u0010Æ\u0001\u001a\u00020;2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0003\bÇ\u0001J\u0017\u0010È\u0001\u001a\u00020;2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0003\bÉ\u0001J\u0017\u0010Ê\u0001\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u001eH\u0000¢\u0006\u0003\bË\u0001J\u0017\u0010Ì\u0001\u001a\u00020\f2\u0006\u0010Z\u001a\u00020[H\u0000¢\u0006\u0003\bÍ\u0001J\u0018\u0010Î\u0001\u001a\u00020;2\r\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016J\u0018\u0010Ð\u0001\u001a\u00020;2\r\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016J\u000f\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020E0!H\u0003J\u0014\u0010Ó\u0001\u001a\u00020;2\t\u0010Ô\u0001\u001a\u0004\u0018\u00010UH\u0003J(\u0010Õ\u0001\u001a\u00020;2\u0007\u0010Ö\u0001\u001a\u00020[2\u0006\u0010l\u001a\u00020[2\f\b\u0002\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0002JG\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\f0!2\u0007\u0010Ö\u0001\u001a\u00020[2\t\b\u0002\u0010Ú\u0001\u001a\u00020\t2\"\u0010Û\u0001\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020;0yH\u0002JG\u0010Ü\u0001\u001a\b\u0012\u0004\u0012\u00020E0!2\u0007\u0010Ö\u0001\u001a\u00020[2\t\b\u0002\u0010Ú\u0001\u001a\u00020\t2\"\u0010Û\u0001\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020;0yH\u0002J\t\u0010Ý\u0001\u001a\u00020%H\u0002J\u000f\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u000f\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0003J!\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0007\u0010á\u0001\u001a\u0002012\u0007\u0010â\u0001\u001a\u000201H\u0003J\u000f\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0003J\u0010\u0010è\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010!H\u0002J\u001a\u0010é\u0001\u001a\u00020;2\u0007\u0010ê\u0001\u001a\u00020[2\u0006\u0010l\u001a\u00020[H\u0002J\u0012\u0010é\u0001\u001a\u00020;2\u0007\u0010ê\u0001\u001a\u00020[H\u0002J\u001a\u0010ë\u0001\u001a\u00020;2\u0007\u0010ê\u0001\u001a\u00020[2\u0006\u0010#\u001a\u00020\"H\u0002J\u001a\u0010ì\u0001\u001a\u00020;2\u0007\u0010ê\u0001\u001a\u00020[2\u0006\u0010#\u001a\u00020\"H\u0002J^\u0010î\u0001\u001a=\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\"0!¢\u0006\r\bz\u0012\t\b{\u0012\u0005\b\b(ð\u0001\u0012\u0014\u0012\u00120[¢\u0006\r\bz\u0012\t\b{\u0012\u0005\b\b(ñ\u0001\u0012\u0006\u0012\u0004\u0018\u00010\"0ï\u00012\u0007\u0010ò\u0001\u001a\u00020[2\u0007\u0010ê\u0001\u001a\u00020[2\u0006\u0010j\u001a\u00020[H\u0002J\u0017\u0010ó\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010j\u001a\u00020[H\u0003J'\u0010õ\u0001\u001a\b\u0012\u0004\u0012\u00020E0!2\u0006\u0010j\u001a\u00020[2\u000e\u0010u\u001a\n\u0018\u00010vj\u0004\u0018\u0001`wH\u0003J\u0011\u0010ö\u0001\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0003\b÷\u0001J\u0019\u0010ø\u0001\u001a\u00020;2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0003\bù\u0001J\t\u0010ú\u0001\u001a\u00020;H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010( +*\f\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010*0*0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:07X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010T\u001a\u0004\u0018\u00010U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010^\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\"\u0010m\u001a\u0010\u0012\u0004\u0012\u00020[\u0012\u0006\u0012\u0004\u0018\u00010[0n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR+\u0010~\u001a\u0004\u0018\u00010(2\b\u0010&\u001a\u0004\u0018\u00010(8@@BX\u0080\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010(8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u0094\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010±\u0001\u001a\u0002058@X\u0080\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u001b\u0010Ñ\u0001\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010!8BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u001d\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020\f0!8BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010æ\u0001R\u001b\u0010í\u0001\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001b\u0010ô\u0001\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006ý\u0001"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lcom/facebook/react/ReactHost;", "context", "Landroid/content/Context;", "reactHostDelegate", "Lcom/facebook/react/runtime/ReactHostDelegate;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "bgExecutor", "Ljava/util/concurrent/Executor;", "uiExecutor", "allowPackagerServerAccess", "", "useDevSupport", "devSupportManagerFactory", "Lcom/facebook/react/devsupport/DevSupportManagerFactory;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLcom/facebook/react/devsupport/DevSupportManagerFactory;)V", "delegate", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "memoryPressureRouter", "Lcom/facebook/react/MemoryPressureRouter;", "getMemoryPressureRouter", "()Lcom/facebook/react/MemoryPressureRouter;", "attachedSurfaces", "", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "createReactInstanceTaskRef", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "Lcom/facebook/react/runtime/internal/bolts/Task;", "Lcom/facebook/react/runtime/ReactInstance;", "reactInstance", "bridgelessReactContextRef", "Lcom/facebook/react/runtime/BridgelessReactContext;", "activity", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/app/Activity;", "lastUsedActivityRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "bridgelessReactStateTracker", "Lcom/facebook/react/runtime/BridgelessReactStateTracker;", "reactLifecycleStateManager", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "id", "", "memoryPressureListener", "Lcom/facebook/react/bridge/MemoryPressureListener;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "reactInstanceEventListeners", "", "Lcom/facebook/react/ReactInstanceEventListener;", "beforeDestroyListeners", "Lkotlin/Function0;", "", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "hostInvalidated", "lifecycleState", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", ViewProps.START, "Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Void;", "prerenderSurface", "surface", "prerenderSurface$ReactAndroid_release", "startSurface", "startSurface$ReactAndroid_release", "stopSurface", "stopSurface$ReactAndroid_release", "onHostResume", "defaultBackButtonImpl", "onHostLeaveHint", "onHostPause", "onHostDestroy", "maybeEnableDevSupport", ViewProps.ENABLED, "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "createSurface", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "moduleName", "", "initialProps", "Landroid/os/Bundle;", "isInstanceInitialized", "isInstanceInitialized$ReactAndroid_release", "()Z", "onBackPressed", "reactQueueConfiguration", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "addReactInstanceEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeReactInstanceEventListener", "reload", "reason", "setPausedInDebuggerMessage", "message", "hostMetadata", "", "getHostMetadata", "()Ljava/util/Map;", "loadNetworkResource", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "destroy", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDestroyFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "instanceDestroyedSuccessfully", "createMemoryPressureListener", "currentActivity", "getCurrentActivity$ReactAndroid_release", "()Landroid/app/Activity;", "setCurrentActivity", "(Landroid/app/Activity;)V", "lastUsedActivity", "getLastUsedActivity$ReactAndroid_release", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "uiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "getUiManager$ReactAndroid_release", "()Lcom/facebook/react/fabric/FabricUIManager;", "hasNativeModule", "T", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "Ljava/lang/Class;", "hasNativeModule$ReactAndroid_release", "nativeModules", "", "getNativeModules$ReactAndroid_release", "()Ljava/util/Collection;", "getNativeModule", "getNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "nativeModuleName", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor$ReactAndroid_release", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJsCallInvokerHolder$ReactAndroid_release", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onWindowFocusChange", "hasFocus", "onNewIntent", "intent", "onConfigurationChanged", "javaScriptContextHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder$ReactAndroid_release", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "defaultBackButtonHandler", "getDefaultBackButtonHandler$ReactAndroid_release", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "loadBundle", "bundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadBundle$ReactAndroid_release", "registerSegment", "segmentId", "path", "callback", "Lcom/facebook/react/bridge/Callback;", "registerSegment$ReactAndroid_release", "handleHostException", "e", "handleHostException$ReactAndroid_release", "callFunctionOnModule", "methodName", "args", "Lcom/facebook/react/bridge/NativeArray;", "callFunctionOnModule$ReactAndroid_release", "attachSurface", "attachSurface$ReactAndroid_release", "detachSurface", "detachSurface$ReactAndroid_release", "isSurfaceAttached", "isSurfaceAttached$ReactAndroid_release", "isSurfaceWithModuleNameAttached", "isSurfaceWithModuleNameAttached$ReactAndroid_release", "addBeforeDestroyListener", "onBeforeDestroy", "removeBeforeDestroyListener", "startTask", "getOrCreateStartTask", "moveToHostDestroy", "currentContext", "raiseSoftException", "callingMethod", "throwable", "", "callWithExistingReactInstance", "executor", "runnable", "callAfterGetOrCreateReactInstance", "getOrCreateReactContext", "getOrCreateReactInstance", "waitThenCallGetOrCreateReactInstanceTask", "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "tryNum", "maxTries", "getOrCreateReactInstanceTask", "jsBundleLoader", "getJsBundleLoader", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "isMetroRunning", "loadJSBundleFromMetro", "log", FirebaseAnalytics.Param.METHOD, "stopAttachedSurfaces", "startAttachedSurfaces", "reloadTask", "createReactInstanceUnwrapper", "Lkotlin/Function2;", "task", "stage", "tag", "getOrCreateReloadTask", "destroyTask", "getOrCreateDestroyTask", "getOrCreateReactHostInspectorTarget", "getOrCreateReactHostInspectorTarget$ReactAndroid_release", "unregisterInstanceFromInspector", "unregisterInstanceFromInspector$ReactAndroid_release", "invalidate", "CreationResult", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ThreadSafe
@SourceDebugExtension({"SMAP\nReactHostImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactHostImpl.kt\ncom/facebook/react/runtime/ReactHostImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1473:1\n1#2:1474\n1761#3,3:1475\n*S KotlinDebug\n*F\n+ 1 ReactHostImpl.kt\ncom/facebook/react/runtime/ReactHostImpl\n*L\n709#1:1475,3\n*E\n"})
public final class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;

    @NotNull
    private static final String TAG = "ReactHost";

    @NotNull
    private final AtomicReference<Activity> activity;
    private final boolean allowPackagerServerAccess;

    @NotNull
    private final Set<ReactSurfaceImpl> attachedSurfaces;

    @NotNull
    private final List<Function0<Unit>> beforeDestroyListeners;

    @NotNull
    private final Executor bgExecutor;

    @NotNull
    private final BridgelessAtomicRef<BridgelessReactContext> bridgelessReactContextRef;

    @NotNull
    private final BridgelessReactStateTracker bridgelessReactStateTracker;

    @NotNull
    private final ComponentFactory componentFactory;

    @NotNull
    private final Context context;

    @NotNull
    private final BridgelessAtomicRef<Task<ReactInstance>> createReactInstanceTaskRef;

    @Nullable
    private DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;

    @ThreadConfined(TAG)
    @Nullable
    private Task<Void> destroyTask;

    @NotNull
    private final DevSupportManager devSupportManager;
    private volatile boolean hostInvalidated;
    private final int id;

    @NotNull
    private final AtomicReference<WeakReference<Activity>> lastUsedActivityRef;

    @Nullable
    private MemoryPressureListener memoryPressureListener;

    @NotNull
    private final MemoryPressureRouter memoryPressureRouter;

    @NotNull
    private final ReactHostDelegate reactHostDelegate;

    @Nullable
    private ReactHostInspectorTarget reactHostInspectorTarget;

    @Nullable
    private ReactInstance reactInstance;

    @NotNull
    private final List<ReactInstanceEventListener> reactInstanceEventListeners;

    @NotNull
    private final ReactLifecycleStateManager reactLifecycleStateManager;

    @ThreadConfined(TAG)
    @Nullable
    private Task<ReactInstance> reloadTask;

    @ThreadConfined(TAG)
    @Nullable
    private Task<Void> startTask;

    @NotNull
    private final Executor uiExecutor;
    private final boolean useDevSupport;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger counter = new AtomicInteger(0);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$Companion;", "", "<init>", "()V", "TAG", "", "BRIDGELESS_MARKER_INSTANCE_KEY", "", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;", "", "instance", "Lcom/facebook/react/runtime/ReactInstance;", "context", "Lcom/facebook/react/bridge/ReactContext;", "isReloading", "", "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V", "getInstance", "()Lcom/facebook/react/runtime/ReactInstance;", "getContext", "()Lcom/facebook/react/bridge/ReactContext;", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreationResult {

        @NotNull
        private final ReactContext context;

        @NotNull
        private final ReactInstance instance;
        private final boolean isReloading;

        public CreationResult(@NotNull ReactInstance instance, @NotNull ReactContext context, boolean z3) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(context, "context");
            this.instance = instance;
            this.context = context;
            this.isReloading = z3;
        }

        @NotNull
        public final ReactContext getContext() {
            return this.context;
        }

        @NotNull
        public final ReactInstance getInstance() {
            return this.instance;
        }

        /* JADX INFO: renamed from: isReloading, reason: from getter */
        public final boolean getIsReloading() {
            return this.isReloading;
        }
    }

    public ReactHostImpl(@NotNull Context context, @NotNull ReactHostDelegate reactHostDelegate, @NotNull ComponentFactory componentFactory, @NotNull Executor bgExecutor, @NotNull Executor uiExecutor, boolean z3, boolean z8, @Nullable DevSupportManagerFactory devSupportManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactHostDelegate, "reactHostDelegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(bgExecutor, "bgExecutor");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        this.context = context;
        this.reactHostDelegate = reactHostDelegate;
        this.componentFactory = componentFactory;
        this.bgExecutor = bgExecutor;
        this.uiExecutor = uiExecutor;
        this.allowPackagerServerAccess = z3;
        this.useDevSupport = z8;
        DevSupportManagerFactory defaultDevSupportManagerFactory = devSupportManagerFactory == null ? new DefaultDevSupportManagerFactory() : devSupportManagerFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.devSupportManager = defaultDevSupportManagerFactory.create(applicationContext, new ReactHostImplDevHelper(this), reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z8);
        this.memoryPressureRouter = new MemoryPressureRouter(context);
        this.attachedSurfaces = new HashSet();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.createReactInstanceTaskRef = new BridgelessAtomicRef<>(Task.INSTANCE.forResult(null));
        this.bridgelessReactContextRef = new BridgelessAtomicRef<>(defaultConstructorMarker, 1, defaultConstructorMarker);
        this.activity = new AtomicReference<>();
        this.lastUsedActivityRef = new AtomicReference<>(new WeakReference(null));
        BridgelessReactStateTracker bridgelessReactStateTracker = new BridgelessReactStateTracker(ReactBuildConfig.DEBUG);
        this.bridgelessReactStateTracker = bridgelessReactStateTracker;
        this.reactLifecycleStateManager = new ReactLifecycleStateManager(bridgelessReactStateTracker);
        this.id = counter.getAndIncrement();
        this.reactInstanceEventListeners = new CopyOnWriteArrayList();
        this.beforeDestroyListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_defaultBackButtonHandler_$lambda$15(ReactHostImpl reactHostImpl) {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = reactHostImpl.defaultHardwareBackBtnHandler;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_isMetroRunning_$lambda$43(ReactHostImpl reactHostImpl, String str, TaskCompletionSource taskCompletionSource, boolean z3) {
        reactHostImpl.log(str, d0.q("Async result = ", z3));
        taskCompletionSource.setResult(Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task _get_jsBundleLoader_$lambda$42(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((Boolean) result).booleanValue() ? reactHostImpl.loadJSBundleFromMetro() : Task.INSTANCE.forResult(reactHostImpl.reactHostDelegate.getJsBundleLoader());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Task<Void> callAfterGetOrCreateReactInstance(String callingMethod, Executor executor, Function1<? super ReactInstance, Unit> runnable) {
        return Task.continueWith$default(getOrCreateReactInstance().onSuccess(new m(this, callingMethod, runnable, 1), executor), new d(this, 2), null, 2, null);
    }

    public static /* synthetic */ Task callAfterGetOrCreateReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callAfterGetOrCreateReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$29(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, q0.k("callAfterGetOrCreateReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null, 4, null);
            return null;
        }
        function1.invoke(reactInstance);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$30(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return null;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostImpl.handleHostException$ReactAndroid_release(error);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callFunctionOnModule$lambda$18(String str, String str2, NativeArray nativeArray, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactInstance.callFunctionOnModule(str, str2, nativeArray);
        return Unit.f38893a;
    }

    private final Task<Boolean> callWithExistingReactInstance(String callingMethod, Executor executor, Function1<? super ReactInstance, Unit> runnable) {
        return this.createReactInstanceTaskRef.get().onSuccess(new m(this, callingMethod, runnable, 0), executor);
    }

    public static /* synthetic */ Task callWithExistingReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callWithExistingReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean callWithExistingReactInstance$lambda$28(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        boolean z3;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, q0.k("callWithExistingReactInstance(", str, ")"), "Execute: reactInstance is null. Dropping work.", null, 4, null);
            z3 = false;
        } else {
            function1.invoke(reactInstance);
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    private final MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.l
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i7) {
                ReactHostImpl.createMemoryPressureListener$lambda$12(this.f21804a, weakReference, i7);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$12(ReactHostImpl reactHostImpl, WeakReference weakReference, int i7) {
        reactHostImpl.bgExecutor.execute(new B3.a(weakReference, i7, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$12$lambda$11(WeakReference weakReference, int i7) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.handleMemoryPressure(i7);
        }
    }

    private final Function2<Task<ReactInstance>, String, ReactInstance> createReactInstanceUnwrapper(final String tag, final String method, final String reason) {
        return new Function2() { // from class: com.facebook.react.runtime.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ReactHostImpl reactHostImpl = this.f21812a;
                String str = reason;
                String str2 = method;
                return ReactHostImpl.createReactInstanceUnwrapper$lambda$46(reactHostImpl, tag, str, str2, (Task) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance createReactInstanceUnwrapper$lambda$46(ReactHostImpl reactHostImpl, String str, String str2, String str3, Task task, String stage) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(stage, "stage");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        ReactInstance reactInstance2 = reactHostImpl.reactInstance;
        String strO = G.o("Stage: ", stage);
        String strY = q0.y(str, " reason: ", str2);
        if (!task.isFaulted()) {
            if (task.isCancelled()) {
                raiseSoftException$default(reactHostImpl, str3, u.n(str, ": ReactInstance task cancelled. ", strO, ". ", strY), null, 4, null);
                return reactInstance2;
            }
            if (reactInstance == null) {
                raiseSoftException$default(reactHostImpl, str3, u.n(str, ": ReactInstance task returned null. ", strO, ". ", strY), null, 4, null);
                return reactInstance2;
            }
            if (reactInstance2 != null && !reactInstance.equals(reactInstance2)) {
                raiseSoftException$default(reactHostImpl, str3, u.n(str, ": Detected two different ReactInstances. Returning old. ", strO, ". ", strY), null, 4, null);
            }
            return reactInstance;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strO2 = G.o("Fault reason: ", error.getMessage());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ReactInstance task faulted. ");
        sb2.append(strO);
        sb2.append(". ");
        sb2.append(strO2);
        raiseSoftException$default(reactHostImpl, str3, G.r(sb2, ". ", strY), null, 4, null);
        return reactInstance2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$10(ReactHostImpl reactHostImpl, String str, Exception exc) {
        Task<ReactInstance> task = reactHostImpl.reloadTask;
        if (task == null) {
            return reactHostImpl.getOrCreateDestroyTask(str, exc);
        }
        reactHostImpl.log("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return task.continueWithTask(new m(reactHostImpl, str, exc, 2), reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$10$lambda$9(ReactHostImpl reactHostImpl, String str, Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void destroy$lambda$8(Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function1.invoke(Boolean.valueOf(task.isCompleted() && !task.isFaulted()));
        return null;
    }

    @DoNotStrip
    private final Map<String, String> getHostMetadata() {
        return AndroidInfoHelpers.getInspectorHostMetadata(this.context);
    }

    private final Task<JSBundleLoader> getJsBundleLoader() {
        log("getJSBundleLoader()");
        if (this.useDevSupport && this.allowPackagerServerAccess) {
            return isMetroRunning().onSuccessTask(new d(this, 3), this.bgExecutor);
        }
        if (ReactBuildConfig.DEBUG) {
            p229p2.a.a(TAG, "Packager server access is disabled in this environment");
        }
        try {
            return Task.INSTANCE.forResult(this.reactHostDelegate.getJsBundleLoader());
        } catch (Exception e10) {
            return Task.INSTANCE.forError(e10);
        }
    }

    @ThreadConfined(TAG)
    private final Task<Void> getOrCreateDestroyTask(String reason, Exception ex) {
        log("getOrCreateDestroyTask()");
        raiseSoftException("getOrCreateDestroyTask()", reason, ex);
        Task<Void> task = this.destroyTask;
        if (task != null) {
            return task;
        }
        Function2<Task<ReactInstance>, String, ReactInstance> function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", reason);
        log("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        Task<Void> taskContinueWith$default = Task.continueWith$default(this.createReactInstanceTaskRef.getAndReset().continueWithTask(new g(this, function2CreateReactInstanceUnwrapper, reason, 1), this.uiExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 4), this.bgExecutor).continueWithTask(new g(function2CreateReactInstanceUnwrapper, this, reason), this.uiExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 5), this.bgExecutor), new c(this, reason, 3), null, 2, null);
        this.destroyTask = taskContinueWith$default;
        return taskContinueWith$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$57(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.log(str, "Starting React Native destruction");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting destroy");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        if (reactHostImpl.hostInvalidated) {
            ReactHostInspectorTarget reactHostInspectorTarget = reactHostImpl.reactHostInspectorTarget;
            if (reactHostInspectorTarget != null) {
                reactHostInspectorTarget.close();
            }
            reactHostImpl.reactHostInspectorTarget = null;
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.log(str, "DevSupportManager cleanup");
            reactHostImpl.getDevSupportManager().stopInspector();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, G.o("ReactContext is null. Destroy reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.log(str3, "Move ReactHost to onHostDestroy()");
        reactHostImpl2.reactLifecycleStateManager.moveToOnHostDestroy(nullable);
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$59(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Stopping surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        synchronized (reactHostImpl.attachedSurfaces) {
            reactHostImpl.attachedSurfaces.clear();
            Unit unit = Unit.f38893a;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$60(Function2 function2, ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, G.o("ReactContext is null. Destroy reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.log(str3, "Destroying MemoryPressureRouter");
        reactHostImpl2.getMemoryPressureRouter().destroy(reactHostImpl2.context);
        if (nullable != null) {
            reactHostImpl2.log(str3, "Resetting ReactContext ref");
            reactHostImpl2.bridgelessReactContextRef.reset();
            reactHostImpl2.log(str3, "Destroying ReactContext");
            nullable.destroy();
        }
        reactHostImpl2.setCurrentActivity(null);
        ResourceDrawableIdHelper.clear();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$61(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.log(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.log(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.log(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        reactHostImpl2.log(str2, "Resetting destroy task ref");
        reactHostImpl2.destroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void getOrCreateDestroyTask$lambda$62(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, G.p("React destruction failed. ReactInstance task faulted. Fault reason: ", error.getMessage(), ". Destroy reason: ", str2), task.getError());
        }
        if (!task.isCancelled()) {
            return null;
        }
        raiseSoftException$default(reactHostImpl, str, G.o("React destruction failed. ReactInstance task cancelled. Destroy reason: ", str2), null, 4, null);
        return null;
    }

    private final BridgelessReactContext getOrCreateReactContext() {
        return this.bridgelessReactContextRef.getOrCreate(new k(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BridgelessReactContext getOrCreateReactContext$lambda$31(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.log(str, "Creating BridgelessReactContext");
        return new BridgelessReactContext(reactHostImpl.context, reactHostImpl);
    }

    private final Task<ReactInstance> getOrCreateReactInstance() {
        return Task.INSTANCE.call(new b(this, 0), this.bgExecutor);
    }

    @ThreadConfined(TAG)
    private final Task<ReactInstance> getOrCreateReactInstanceTask() {
        log("getOrCreateReactInstanceTask()");
        return this.createReactInstanceTaskRef.getOrCreate(new k(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReactInstanceTask$lambda$41(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.log(str, "Start");
        p059e1.a.e(!reactHostImpl.hostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        Task<TContinuationResult> taskOnSuccess = reactHostImpl.getJsBundleLoader().onSuccess(new c(reactHostImpl, str, 1), reactHostImpl.bgExecutor);
        taskOnSuccess.onSuccess(new ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0(new C0058e(22, reactHostImpl, str)), reactHostImpl.uiExecutor);
        return Task.onSuccess$default(taskOnSuccess, new o(0), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationResult getOrCreateReactInstanceTask$lambda$41$lambda$38(ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BridgelessReactContext orCreateReactContext = reactHostImpl.getOrCreateReactContext();
        orCreateReactContext.setJSExceptionHandler(reactHostImpl.getDevSupportManager());
        reactHostImpl.log(str, "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(orCreateReactContext, reactHostImpl.reactHostDelegate, reactHostImpl.componentFactory, reactHostImpl.getDevSupportManager(), new k(reactHostImpl, 1), reactHostImpl.useDevSupport, reactHostImpl.getOrCreateReactHostInspectorTarget$ReactAndroid_release());
        reactHostImpl.reactInstance = reactInstance;
        MemoryPressureListener memoryPressureListenerCreateMemoryPressureListener = reactHostImpl.createMemoryPressureListener(reactInstance);
        reactHostImpl.memoryPressureListener = memoryPressureListenerCreateMemoryPressureListener;
        reactHostImpl.getMemoryPressureRouter().addMemoryPressureListener(memoryPressureListenerCreateMemoryPressureListener);
        reactInstance.initializeEagerTurboModules();
        reactHostImpl.log(str, "Loading JS Bundle");
        reactInstance.loadJSBundle((JSBundleLoader) result);
        reactHostImpl.log(str, "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        reactHostImpl.getDevSupportManager().onNewReactContextCreated(orCreateReactContext);
        orCreateReactContext.runOnJSQueueThread(new RunnableC0527y(5));
        return new CreationResult(reactInstance, orCreateReactContext, reactHostImpl.reloadTask != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$41$lambda$38$lambda$36(ReactHostImpl reactHostImpl, Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        reactHostImpl.handleHostException$ReactAndroid_release(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$41$lambda$38$lambda$37() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$41$lambda$39(ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.");
        }
        CreationResult creationResult = (CreationResult) result;
        ReactInstance creationResult2 = creationResult.getInstance();
        ReactContext context = creationResult.getContext();
        boolean isReloading = creationResult.getIsReloading();
        boolean z3 = reactHostImpl.reactLifecycleStateManager.getState() == LifecycleState.RESUMED;
        if (!isReloading || z3) {
            reactHostImpl.reactLifecycleStateManager.resumeReactContextIfHostResumed(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        } else {
            reactHostImpl.reactLifecycleStateManager.moveToOnHostResume(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        }
        reactHostImpl.log(str, "Executing ReactInstanceEventListeners");
        Iterator<ReactInstanceEventListener> it = reactHostImpl.reactInstanceEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onReactContextInitialized(context);
        }
        return creationResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$41$lambda$40(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((CreationResult) result).getInstance();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @ThreadConfined(TAG)
    private final Task<ReactInstance> getOrCreateReloadTask(String reason) {
        log("getOrCreateReloadTask()");
        raiseSoftException$default(this, "getOrCreateReloadTask()", reason, null, 4, null);
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            return task;
        }
        Function2<Task<ReactInstance>, String, ReactInstance> function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", reason);
        log("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        Task<ReactInstance> taskContinueWithTask = this.createReactInstanceTaskRef.getAndReset().continueWithTask(new g(this, function2CreateReactInstanceUnwrapper, reason, 0), this.uiExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 0), this.bgExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 1), this.uiExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 2), this.bgExecutor).continueWithTask(new h(function2CreateReactInstanceUnwrapper, this, 3), this.bgExecutor).continueWithTask(new c(this, reason, 2), this.bgExecutor);
        this.reloadTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$48(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.log(str, "Starting React Native reload");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting reload");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, G.o("ReactContext is null. Reload reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        if (nullable != null && reactHostImpl2.reactLifecycleStateManager.getState() == LifecycleState.RESUMED) {
            reactHostImpl2.log(str3, "Calling ReactContext.onHostPause()");
            nullable.onHostPause();
        }
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$49(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Surface shutdown");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$51(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        MemoryPressureListener memoryPressureListener = reactHostImpl.memoryPressureListener;
        if (memoryPressureListener != null) {
            reactHostImpl.log(str, "Removing memory pressure listener");
            reactHostImpl.getMemoryPressureRouter().removeMemoryPressureListener(memoryPressureListener);
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable != null) {
            reactHostImpl.log(str, "Resetting ReactContext ref");
            reactHostImpl.bridgelessReactContextRef.reset();
            reactHostImpl.log(str, "Destroying ReactContext");
            nullable.destroy();
        }
        if (reactHostImpl.useDevSupport && nullable != null) {
            reactHostImpl.log(str, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            reactHostImpl.getDevSupportManager().onReactInstanceDestroyed(nullable);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$52(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.log(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.log(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.log(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        return reactHostImpl2.getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$53(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "5: Restarting surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface restart: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.startAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$54(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, G.p("Error during reload. ReactInstance task faulted. Fault reason: ", error.getMessage(), ". Reload reason: ", str2), task.getError());
        }
        if (task.isCancelled()) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, G.o("Error during reload. ReactInstance task cancelled. Reload reason: ", str2), null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.log(str3, "Resetting reload task ref");
        reactHostImpl2.reloadTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined(TAG)
    public final Task<Void> getOrCreateStartTask() {
        Task<Void> task = this.startTask;
        if (task != null) {
            return task;
        }
        log("getOrCreateStartTask()", "Schedule");
        if (ReactBuildConfig.DEBUG) {
            p059e1.a.e(ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
            p059e1.a.e(ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
            p059e1.a.e(ReactNativeNewArchitectureFeatureFlags.useTurboModules(), "useTurboModules FeatureFlag must be set to start ReactNative.");
        }
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            p059e1.a.e(!ReactNativeNewArchitectureFeatureFlags.useFabricInterop(), "useFabricInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
            p059e1.a.e(!ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop(), "useTurboModuleInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
        }
        Task taskContinueWithTask = waitThenCallGetOrCreateReactInstanceTask().continueWithTask(new d(this, 1), this.bgExecutor);
        this.startTask = taskContinueWithTask;
        return taskContinueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$26(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return task.makeVoid();
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return Task.continueWithTask$default(reactHostImpl.getOrCreateDestroyTask(G.o("getOrCreateStartTask() failure: ", error.getMessage()), error), new f(error, 0), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$26$lambda$25(Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Task.INSTANCE.forError(exc);
    }

    private final Task<Boolean> isMetroRunning() {
        log("isMetroRunning()");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        getDevSupportManager().isPackagerRunning(new U8.a(22, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBundle$lambda$16(ReactHostImpl reactHostImpl, String str, JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.log(str, "Execute");
        reactInstance.loadJSBundle(jSBundleLoader);
        return Unit.f38893a;
    }

    private final Task<JSBundleLoader> loadJSBundleFromMetro() {
        final String str = "loadJSBundleFromMetro()";
        log("loadJSBundleFromMetro()");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        DevSupportManager devSupportManager = getDevSupportManager();
        Intrinsics.f(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
        final DevSupportManagerBase devSupportManagerBase = (DevSupportManagerBase) devSupportManager;
        DevServerHelper devServerHelper = devSupportManagerBase.getDevServerHelper();
        String jsAppBundleName = devSupportManagerBase.getJsAppBundleName();
        if (jsAppBundleName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final String devServerBundleURL = devServerHelper.getDevServerBundleURL(jsAppBundleName);
        devSupportManagerBase.reloadJSFromServer(devServerBundleURL, new BundleLoadCallback() { // from class: com.facebook.react.runtime.ReactHostImpl.loadJSBundleFromMetro.1
            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onError(Exception cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                taskCompletionSource.setError(cause);
            }

            @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
            public void onSuccess() {
                ReactHostImpl.this.log(str, "Creating BundleLoader");
                taskCompletionSource.setResult(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(devServerBundleURL, devSupportManagerBase.getDownloadedJSBundleFile()));
            }
        });
        return taskCompletionSource.getTask();
    }

    @DoNotStrip
    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        InspectorNetworkHelper.loadNetworkResource(url, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String method, String message) {
        this.bridgelessReactStateTracker.enterState("ReactHost{" + this.id + "}." + method + ": " + message);
    }

    private final void maybeEnableDevSupport(boolean enabled) {
        if (this.useDevSupport) {
            getDevSupportManager().setDevSupportEnabled(enabled);
        }
    }

    @ThreadConfined("UI")
    private final void moveToHostDestroy(ReactContext currentContext) {
        this.reactLifecycleStateManager.moveToOnHostDestroy(currentContext);
        setCurrentActivity(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prerenderSurface$lambda$1(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.log(str, "Execute");
        reactInstance.prerenderSurface(reactSurfaceImpl);
        return Unit.f38893a;
    }

    private final void raiseSoftException(String callingMethod, String message, Throwable throwable) {
        String strK = q0.k("raiseSoftException(", callingMethod, ")");
        log(strK, message);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(q0.y(strK, ": ", message), throwable));
    }

    public static /* synthetic */ void raiseSoftException$default(ReactHostImpl reactHostImpl, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        reactHostImpl.raiseSoftException(str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSegment$lambda$17(ReactHostImpl reactHostImpl, String str, int i7, String str2, Callback callback, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.log(str, "Execute");
        reactInstance.registerSegment(i7, str2);
        if (callback == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callback.invoke(new Object[0]);
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public static final Task reload$lambda$7(ReactHostImpl reactHostImpl, String str) {
        Task<ReactInstance> orCreateReloadTask;
        Task<Void> task = reactHostImpl.destroyTask;
        if (task != null) {
            reactHostImpl.log("reload()", "Waiting for destroy to finish, before reloading React Native.");
            orCreateReloadTask = task.continueWithTask(new c(reactHostImpl, str, 0), reactHostImpl.bgExecutor);
            if (orCreateReloadTask == null) {
                orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
            }
        } else {
            orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
        }
        return orCreateReloadTask.makeVoid().continueWithTask(new d(reactHostImpl, 0), reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$7$lambda$5$lambda$4(ReactHostImpl reactHostImpl, String str, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$7$lambda$6(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return task;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return reactHostImpl.getOrCreateDestroyTask("Reload failed", error);
    }

    private final void setCurrentActivity(Activity activity) {
        this.activity.set(activity);
        if (activity != null) {
            this.lastUsedActivityRef.set(new WeakReference<>(activity));
        }
    }

    @DoNotStrip
    private final void setPausedInDebuggerMessage(String message) {
        if (message == null) {
            getDevSupportManager().hidePausedInDebuggerOverlay();
        } else {
            getDevSupportManager().showPausedInDebuggerOverlay(message, new DevSupportManager.PausedInDebuggerOverlayCommandListener() { // from class: com.facebook.react.runtime.ReactHostImpl.setPausedInDebuggerMessage.1
                @Override // com.facebook.react.devsupport.interfaces.DevSupportManager.PausedInDebuggerOverlayCommandListener
                public void onResume() {
                    UiThreadUtil.assertOnUiThread();
                    ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.reactHostInspectorTarget;
                    if (reactHostInspectorTarget != null) {
                        reactHostInspectorTarget.sendDebuggerResumeCommand();
                    }
                }
            });
        }
    }

    private final void startAttachedSurfaces(String method, ReactInstance reactInstance) {
        log(method, "Restarting previously running React Native Surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                Iterator<ReactSurfaceImpl> it = this.attachedSurfaces.iterator();
                while (it.hasNext()) {
                    reactInstance.startSurface(it.next());
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSurface$lambda$2(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.log(str, "Execute");
        reactInstance.startSurface(reactSurfaceImpl);
        return Unit.f38893a;
    }

    private final void stopAttachedSurfaces(String method, ReactInstance reactInstance) {
        log(method, "Stopping all React Native surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                for (ReactSurfaceImpl reactSurfaceImpl : this.attachedSurfaces) {
                    reactInstance.stopSurface(reactSurfaceImpl);
                    reactSurfaceImpl.clear();
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopSurface$lambda$3(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.log(str, "Execute");
        reactInstance.stopSurface(reactSurfaceImpl);
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ThreadConfined(TAG)
    public final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    @ThreadConfined(TAG)
    private final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int tryNum, final int maxTries) {
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            log("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return task;
        }
        Task<Void> task2 = this.destroyTask;
        if (task2 != null) {
            if (tryNum < maxTries) {
                log("waitThenCallGetOrCreateReactInstanceTaskWithRetries", F.c(tryNum, "React Native is tearing down.Wait for teardown to finish, before trying again (try count = ", ")."));
                return task2.onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.e
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public final Object then(Task task3) {
                        return ReactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$35$lambda$34(this.f21769a, tryNum, maxTries, task3);
                    }
                }, this.bgExecutor);
            }
            raiseSoftException$default(this, "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null, 4, null);
        }
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$35$lambda$34(ReactHostImpl reactHostImpl, int i7, int i10, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries(i7 + 1, i10);
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.add(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(@NotNull ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.add(listener);
    }

    public final void attachSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        log(F.c(surface.getSurfaceID(), "attachSurface(surfaceId = ", ")"));
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.add(surface);
        }
    }

    @NotNull
    public final Task<Boolean> callFunctionOnModule$ReactAndroid_release(@NotNull String moduleName, @NotNull String methodName, @NotNull NativeArray args) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        return callWithExistingReactInstance$default(this, G.s(new StringBuilder("callFunctionOnModule(\""), moduleName, "\", \"", methodName, "\")"), null, new D6.a(moduleName, 2, methodName, args), 2, null);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public ReactSurface createSurface(@NotNull Context context, @NotNull String moduleName, @Nullable Bundle initialProps) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, moduleName, initialProps);
        ReactSurfaceView reactSurfaceView = new ReactSurfaceView(context, reactSurfaceImpl);
        reactSurfaceView.setShouldLogContentAppeared(true);
        reactSurfaceImpl.attachView(reactSurfaceView);
        reactSurfaceImpl.attach(this);
        return reactSurfaceImpl;
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> destroy(@NotNull String reason, @Nullable Exception ex, @NotNull Function1<? super Boolean, Unit> onDestroyFinished) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(onDestroyFinished, "onDestroyFinished");
        TaskInterface<Void> taskInterfaceDestroy = destroy(reason, ex);
        Intrinsics.f(taskInterfaceDestroy, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<java.lang.Void>");
        return Task.continueWith$default((Task) taskInterfaceDestroy, new f(onDestroyFinished, 1), null, 2, null);
    }

    public final void detachSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        log(F.c(surface.getSurfaceID(), "detachSurface(surfaceId = ", ")"));
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.remove(surface);
        }
    }

    @Nullable
    public final Activity getCurrentActivity$ReactAndroid_release() {
        return this.activity.get();
    }

    @Override // com.facebook.react.ReactHost
    @Nullable
    public ReactContext getCurrentReactContext() {
        return this.bridgelessReactContextRef.getNullable();
    }

    @NotNull
    public final DefaultHardwareBackBtnHandler getDefaultBackButtonHandler$ReactAndroid_release() {
        return new DefaultHardwareBackBtnHandler() { // from class: com.facebook.react.runtime.n
            @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
            public final void invokeDefaultOnBackPressed() {
                ReactHostImpl._get_defaultBackButtonHandler_$lambda$15(this.f21810a);
            }
        };
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public DevSupportManager getDevSupportManager() {
        return this.devSupportManager;
    }

    @NotNull
    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        EventDispatcher eventDispatcher;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (eventDispatcher = reactInstance.getEventDispatcher()) == null) ? BlackHoleEventDispatcher.INSTANCE : eventDispatcher;
    }

    @Nullable
    public final JavaScriptContextHolder getJavaScriptContextHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    @Nullable
    public final CallInvokerHolder getJsCallInvokerHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException$default(this, "getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null, 4, null);
        return null;
    }

    @Nullable
    public final Activity getLastUsedActivity$ReactAndroid_release() {
        WeakReference<Activity> weakReference = this.lastUsedActivityRef.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public LifecycleState getLifecycleState() {
        return this.reactLifecycleStateManager.getState();
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.memoryPressureRouter;
    }

    @Nullable
    public final <T extends NativeModule> T getNativeModule$ReactAndroid_release(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && Intrinsics.c(nativeModuleInterface, UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.getNativeModule(nativeModuleInterface);
        }
        return null;
    }

    @NotNull
    public final Collection<NativeModule> getNativeModules$ReactAndroid_release() {
        Collection<NativeModule> nativeModules;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (nativeModules = reactInstance.getNativeModules()) == null) ? z.f38935a : nativeModules;
    }

    @Nullable
    public final ReactHostInspectorTarget getOrCreateReactHostInspectorTarget$ReactAndroid_release() {
        if (this.reactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.reactHostInspectorTarget = new ReactHostInspectorTarget(this);
        }
        return this.reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    @Nullable
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    @Nullable
    public final RuntimeExecutor getRuntimeExecutor$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException$default(this, "getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null, 4, null);
        return null;
    }

    @Nullable
    public final FabricUIManager getUiManager$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getFabricUIManager();
        }
        return null;
    }

    public final void handleHostException$ReactAndroid_release(@NotNull Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        String strK = q0.k("handleHostException(message = \"", e10.getMessage(), "\")");
        log(strK);
        if (this.useDevSupport) {
            getDevSupportManager().handleException(e10);
        } else {
            this.reactHostDelegate.handleInstanceException(e10);
        }
        destroy(strK, e10);
    }

    public final <T extends NativeModule> boolean hasNativeModule$ReactAndroid_release(@NotNull Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.hasNativeModule(nativeModuleInterface);
        }
        return false;
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        p229p2.a.a(TAG, "ReactHostImpl.invalidate()");
        this.hostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    public final boolean isInstanceInitialized$ReactAndroid_release() {
        return this.reactInstance != null;
    }

    public final boolean isSurfaceAttached$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.attachedSurfaces) {
            zContains = this.attachedSurfaces.contains(surface);
        }
        return zContains;
    }

    public final boolean isSurfaceWithModuleNameAttached$ReactAndroid_release(@NotNull String moduleName) {
        boolean z3;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.attachedSurfaces) {
            try {
                Set<ReactSurfaceImpl> set = this.attachedSurfaces;
                z3 = false;
                if (set == null || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((ReactSurfaceImpl) it.next()).getModuleName(), moduleName)) {
                            z3 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @NotNull
    public final Task<Boolean> loadBundle$ReactAndroid_release(@NotNull JSBundleLoader bundleLoader) {
        Intrinsics.checkNotNullParameter(bundleLoader, "bundleLoader");
        log("loadBundle()", "Schedule");
        return callWithExistingReactInstance$default(this, "loadBundle()", null, new C0058e(23, this, bundleLoader), 2, null);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onActivityResult(@NotNull Activity activity, int requestCode, int resultCode, @Nullable Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        StringBuilder sb2 = new StringBuilder("onActivityResult(activity = \"");
        sb2.append(activity);
        sb2.append("\", requestCode = \"");
        u.u(sb2, requestCode, "\", resultCode = \"", resultCode, "\", data = \"");
        sb2.append(data);
        sb2.append("\")");
        String string = sb2.toString();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, requestCode, resultCode, data);
        } else {
            raiseSoftException$default(this, string, "Tried to access onActivityResult while context is not ready", null, 4, null);
        }
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.getNativeModule(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onConfigurationChanged(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
                DisplayMetricsHolder.initDisplayMetrics(currentReactContext);
            }
            AppearanceModule appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostDestroy() {
        log("onHostDestroy()");
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostLeaveHint(@Nullable Activity activity) {
        log("onUserLeaveHint(activity)");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostPause(@Nullable Activity activity) {
        log("onHostPause(activity)");
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release != null) {
            String simpleName = currentActivity$ReactAndroid_release.getClass().getSimpleName();
            String simpleName2 = activity == null ? BuildConfig.TRAVIS : activity.getClass().getSimpleName();
            p059e1.a.e(activity == currentActivity$ReactAndroid_release, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), currentActivity$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostResume(@Nullable Activity activity, @Nullable DefaultHardwareBackBtnHandler defaultBackButtonImpl) {
        this.defaultHardwareBackBtnHandler = defaultBackButtonImpl;
        onHostResume(activity);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onNewIntent(@NotNull Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        Intrinsics.checkNotNullParameter(intent, "intent");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            raiseSoftException$default(this, "onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null, 4, null);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity$ReactAndroid_release(), intent);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onWindowFocusChange(boolean hasFocus) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(hasFocus);
            return;
        }
        raiseSoftException$default(this, "onWindowFocusChange(hasFocus = \"" + hasFocus + "\")", "Tried to access onWindowFocusChange while context is not ready", null, 4, null);
    }

    @NotNull
    public final TaskInterface<Void> prerenderSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strC = F.c(surface.getSurfaceID(), "prerenderSurface(surfaceId = ", ")");
        log(strC, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(strC, this.bgExecutor, new j(this, strC, surface, 0));
    }

    @NotNull
    public final Task<Boolean> registerSegment$ReactAndroid_release(final int segmentId, @NotNull final String path, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        StringBuilder sb2 = new StringBuilder("registerSegment(segmentId = \"");
        sb2.append(segmentId);
        sb2.append("\", path = \"");
        final String strR = G.r(sb2, path, "\")");
        log(strR, "Schedule");
        return callWithExistingReactInstance$default(this, strR, null, new Function1() { // from class: com.facebook.react.runtime.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ReactHostImpl reactHostImpl = this.f21781a;
                int i7 = segmentId;
                String str = path;
                return ReactHostImpl.registerSegment$lambda$17(reactHostImpl, strR, i7, str, callback, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> reload(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new D(1, this, reason), this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.remove(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(@NotNull ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.remove(listener);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> start() {
        return Task.INSTANCE.call(new b(this, 1), this.bgExecutor);
    }

    @NotNull
    public final TaskInterface<Void> startSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strC = F.c(surface.getSurfaceID(), "startSurface(surfaceId = ", ")");
        log(strC, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(strC, this.bgExecutor, new j(this, strC, surface, 2));
    }

    @NotNull
    public final TaskInterface<Void> stopSurface$ReactAndroid_release(@NotNull ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String strC = F.c(surface.getSurfaceID(), "stopSurface(surfaceId = ", ")");
        log(strC, "Schedule");
        detachSurface$ReactAndroid_release(surface);
        return callWithExistingReactInstance(strC, this.bgExecutor, new j(this, strC, surface, 1)).makeVoid();
    }

    @ThreadConfined("UI")
    public final void unregisterInstanceFromInspector$ReactAndroid_release(@Nullable ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
                boolean z3 = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z3 = true;
                }
                p059e1.a.e(z3, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    private final void log(String method) {
        this.bridgelessReactStateTracker.enterState("ReactHost{" + this.id + "}." + method);
    }

    @Override // com.facebook.react.ReactHost
    @NotNull
    public TaskInterface<Void> destroy(@NotNull String reason, @Nullable Exception ex) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new CallableC1270c(this, reason, ex), this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostResume(@Nullable Activity activity) {
        log("onHostResume(activity)");
        setCurrentActivity(activity);
        maybeEnableDevSupport(true);
        this.reactLifecycleStateManager.moveToOnHostResume(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostDestroy(@Nullable Activity activity) {
        log("onHostDestroy(activity)");
        if (getCurrentActivity$ReactAndroid_release() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    @Nullable
    public final NativeModule getNativeModule$ReactAndroid_release(@NotNull String nativeModuleName) {
        Intrinsics.checkNotNullParameter(nativeModuleName, "nativeModuleName");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getNativeModule(nativeModuleName);
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    @ThreadConfined("UI")
    public void onHostPause() {
        log("onHostPause()");
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), getCurrentActivity$ReactAndroid_release());
    }

    public /* synthetic */ ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z3, boolean z8, DevSupportManagerFactory devSupportManagerFactory, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, reactHostDelegate, componentFactory, (i7 & 8) != 0 ? ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.facebook.react.runtime.ReactHostImpl") : executor, (i7 & 16) != 0 ? Task.UI_THREAD_EXECUTOR : executor2, z3, z8, (i7 & 128) != 0 ? null : devSupportManagerFactory);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactHostImpl(@NotNull Context context, @NotNull ReactHostDelegate delegate, @NotNull ComponentFactory componentFactory, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.facebook.react.runtime.ReactHostImpl");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(context, delegate, componentFactory, executorServiceNewOptimizedSingleThreadExecutor, Task.UI_THREAD_EXECUTOR, z3, z8, null, 128, null);
    }
}
