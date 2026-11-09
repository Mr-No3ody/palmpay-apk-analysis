package com.palmpay.lib.apm.network;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.network.bean.BaseNQEQualityBean;
import com.palmpay.lib.apm.network.bean.NQEConfig;
import com.palmpay.lib.apm.network.bean.NQEMetrics;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.palmpay.lib.apm.network.bean.RttRecord;
import com.palmpay.lib.apm.network.bean.WeightedObservation;
import com.palmpay.lib.apm.network.impl.OnNetworkStateChangeListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;
import p112h6.a;
import p112h6.b;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020&2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020$H\u0002J\u001d\u0010.\u001a\u0004\u0018\u00010$2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002000/H\u0002¢\u0006\u0002\u00101J\u001e\u00102\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120/2\u0006\u00103\u001a\u00020\fH\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0002J\u0006\u00106\u001a\u00020\u0004J\b\u00107\u001a\u0004\u0018\u00010\fJ\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120/H\u0002J\u0006\u00109\u001a\u00020\u0011J\u000e\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020\nJ\u0006\u0010>\u001a\u00020\nJ\b\u0010?\u001a\u00020\nH\u0002J\u0010\u0010@\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0012H\u0002J\b\u0010A\u001a\u00020&H\u0002J\b\u0010B\u001a\u00020&H\u0002J\u000e\u0010C\u001a\u00020&2\u0006\u0010D\u001a\u00020\u0011J\b\u0010E\u001a\u00020&H\u0002J\u0006\u0010F\u001a\u00020&J\u0012\u0010G\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010H\u001a\u00020&H\u0002J\u0018\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/palmpay/lib/apm/network/NQEManager;", "", "()V", "CONFIG", "Lcom/palmpay/lib/apm/network/bean/NQEConfig;", "TAG", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "isFirstTimeCalculate", "", "lastNetworkQualityRecord", "Lcom/palmpay/lib/apm/network/bean/NQEQualityBean;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/palmpay/lib/apm/network/impl/OnNetworkStateChangeListener;", "metricsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/apm/network/bean/NQEMetrics;", "getMetricsMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "getNetworkCallback", "()Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback$delegate", "Lkotlin/Lazy;", "networkConnectAvailable", "networkState", "preNetworkState", "queue", "Ljava/util/Queue;", "successRateContinuousDiff", "", "updateNetworkStateCount", "updateNetworkStateTimestamp", "", "addMetrics", "", "metrics", "addNetworkStateChangeListener", "calculateDecayFactor", "decayRate", "decayPeriod", "calculateDynamicWeight", "dataTimestamp", "calculateWeightedMedian", "", "Lcom/palmpay/lib/apm/network/bean/RttRecord;", "(Ljava/util/List;)Ljava/lang/Long;", "calculateWeightedSuccessRate", "bean", "cleanOldMetrics", "clearAllMetrics", "getConfig", "getLastNetworkQualityRecord", "getMetricsForCalculation", "getNetworkState", "init", "application", "Landroid/app/Application;", "isNetworkBad", "isNetworkOffline", "isNetworkQualityBad", "isValidMetrics", "notifyNetworkStateChanged", "refreshNetworkConnect", "removeMetricsFromMap", "hashCode", "startMonitoring", "stopMonitoring", "trace", "updateNetworkState", "updateSuccessRateTrend", "oldRate", "newRate", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNQEManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NQEManager.kt\ncom/palmpay/lib/apm/network/NQEManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,666:1\n1549#2:667\n1620#2,3:668\n1045#2:671\n1603#2,9:673\n1855#2:682\n1856#2:684\n1612#2:685\n1603#2,9:686\n1855#2:695\n1856#2:697\n1612#2:698\n1603#2,9:699\n1855#2:708\n1856#2:710\n1612#2:711\n1#3:672\n1#3:683\n1#3:696\n1#3:709\n*S KotlinDebug\n*F\n+ 1 NQEManager.kt\ncom/palmpay/lib/apm/network/NQEManager\n*L\n402#1:667\n402#1:668,3\n405#1:671\n540#1:673,9\n540#1:682\n540#1:684\n540#1:685\n549#1:686,9\n549#1:695\n549#1:697\n549#1:698\n556#1:699,9\n556#1:708\n556#1:710\n556#1:711\n540#1:683\n549#1:696\n556#1:709\n*E\n"})
public final class NQEManager {

    @NotNull
    public static final String TAG = "NQEManager";

    @Nullable
    private static ConnectivityManager connectivityManager;

    @Nullable
    private static NQEQualityBean lastNetworkQualityRecord;

    @Nullable
    private static OnNetworkStateChangeListener listener;
    private static int networkState;
    private static int preNetworkState;
    private static double successRateContinuousDiff;
    private static int updateNetworkStateCount;
    private static long updateNetworkStateTimestamp;

    @NotNull
    public static final NQEManager INSTANCE = new NQEManager();

    @NotNull
    private static ConcurrentHashMap<Integer, Boolean> networkConnectAvailable = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: networkCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy networkCallback = C2131j.b(a.f37347a);

    @NotNull
    private static final NQEConfig CONFIG = new NQEConfig();

    @NotNull
    private static final ConcurrentHashMap<Integer, NQEMetrics> metricsMap = new ConcurrentHashMap<>();

    @NotNull
    private static final Queue<NQEMetrics> queue = new ConcurrentLinkedQueue();
    private static boolean isFirstTimeCalculate = true;

    private NQEManager() {
    }

    private final double calculateDecayFactor(double decayRate, int decayPeriod) {
        return Math.pow(decayRate, 1.0d / ((double) decayPeriod));
    }

    private final double calculateDynamicWeight(long dataTimestamp) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        NQEConfig nQEConfig = CONFIG;
        return Math.pow(calculateDecayFactor(nQEConfig.getNetworkQualityConfig().getDecayRate(), nQEConfig.getNetworkQualityConfig().getDecayPeriod()), Math.abs(jElapsedRealtime - dataTimestamp) / 1000.0d);
    }

    private final Long calculateWeightedMedian(List<RttRecord> metrics) {
        if (metrics.isEmpty()) {
            return null;
        }
        List<RttRecord> list = metrics;
        ArrayList arrayList = new ArrayList(r.l(list, 10));
        for (RttRecord rttRecord : list) {
            NQEManager nQEManager = INSTANCE;
            Long time = rttRecord.getTime();
            long jLongValue = 0;
            double dCalculateDynamicWeight = nQEManager.calculateDynamicWeight(time != null ? time.longValue() : 0L);
            Long rtt = rttRecord.getRtt();
            if (rtt != null) {
                jLongValue = rtt.longValue();
            }
            arrayList.add(new WeightedObservation(jLongValue, dCalculateDynamicWeight));
        }
        List<WeightedObservation> listT = CollectionsKt.T(arrayList, new Comparator() { // from class: com.palmpay.lib.apm.network.NQEManager$calculateWeightedMedian$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t3) {
                return Bf.a.a(Long.valueOf(((WeightedObservation) t).getValue()), Long.valueOf(((WeightedObservation) t3).getValue()));
            }
        });
        Iterator it = listT.iterator();
        double weight = 0.0d;
        double weight2 = 0.0d;
        while (it.hasNext()) {
            weight2 += ((WeightedObservation) it.next()).getWeight();
        }
        double d2 = weight2 / 2.0d;
        for (WeightedObservation weightedObservation : listT) {
            weight += weightedObservation.getWeight();
            if (weight >= d2) {
                return Long.valueOf(weightedObservation.getValue());
            }
        }
        return Long.valueOf(((WeightedObservation) CollectionsKt.K(listT)).getValue());
    }

    private final void calculateWeightedSuccessRate(List<NQEMetrics> metrics, NQEQualityBean bean) {
        Iterator<NQEMetrics> it;
        double d2;
        if (metrics.isEmpty()) {
            bean.setWeightedSuccessRate(Double.NaN);
            BaseNQEQualityBean cronet = bean.getCronet();
            if (cronet != null) {
                cronet.setWeightedSuccessRate(Double.NaN);
            }
            BaseNQEQualityBean okhttp = bean.getOkhttp();
            if (okhttp == null) {
                return;
            }
            okhttp.setWeightedSuccessRate(Double.NaN);
            return;
        }
        Iterator<NQEMetrics> it2 = metrics.iterator();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (it2.hasNext()) {
            NQEMetrics next = it2.next();
            double dCalculateDynamicWeight = calculateDynamicWeight(next.getElapsedTime());
            if (next.getType() == 0) {
                d11 += dCalculateDynamicWeight;
                it = it2;
                d2 = dCalculateDynamicWeight;
                d12 += (next.getIsSuccessed() ? 1.0d : 0.0d) * d2;
                i11++;
            } else {
                it = it2;
                d2 = dCalculateDynamicWeight;
                if (next.getType() == 1) {
                    d14 += d2;
                    d15 = ((next.getIsSuccessed() ? 1.0d : 0.0d) * d2) + d15;
                    i10++;
                }
            }
            d10 += d2;
            d13 += (next.getIsSuccessed() ? 1.0d : 0.0d) * d2;
            i7++;
            it2 = it;
        }
        NQEConfig nQEConfig = CONFIG;
        bean.setWeightedSuccessRate((i7 < nQEConfig.getNetworkQualityConfig().getMinWindowSize() || d10 <= 0.0d) ? Double.NaN : d13 / d10);
        BaseNQEQualityBean cronet2 = bean.getCronet();
        if (cronet2 != null) {
            cronet2.setWeightedSuccessRate((i10 < nQEConfig.getNetworkQualityConfig().getMinWindowSize() || d14 <= 0.0d) ? Double.NaN : d15 / d14);
        }
        BaseNQEQualityBean okhttp2 = bean.getOkhttp();
        if (okhttp2 == null) {
            return;
        }
        okhttp2.setWeightedSuccessRate((i11 < nQEConfig.getNetworkQualityConfig().getMinWindowSize() || d11 <= 0.0d) ? Double.NaN : d12 / d11);
    }

    private final void cleanOldMetrics() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Queue<NQEMetrics> queue2 = queue;
            if (queue2.isEmpty()) {
                return;
            }
            NQEMetrics nQEMetricsPeek = queue2.peek();
            if (nQEMetricsPeek != null) {
                int size = queue2.size();
                NQEConfig nQEConfig = CONFIG;
                if (size <= nQEConfig.getNetworkQualityConfig().getMaxWindowSize() && jElapsedRealtime - nQEMetricsPeek.getElapsedTime() <= nQEConfig.getNetworkQualityConfig().getMaxWindowTime()) {
                    return;
                } else {
                    queue2.poll();
                }
            }
        }
    }

    private final void clearAllMetrics() {
        Queue<NQEMetrics> queue2 = queue;
        if (queue2.isEmpty()) {
            return;
        }
        queue2.clear();
    }

    private final List<NQEMetrics> getMetricsForCalculation() {
        return CollectionsKt.Y(queue);
    }

    private final ConnectivityManager.NetworkCallback getNetworkCallback() {
        return (ConnectivityManager.NetworkCallback) networkCallback.getValue();
    }

    private final boolean isNetworkQualityBad() {
        Long httpRTT;
        Long httpRTT2;
        List<NQEMetrics> metricsForCalculation = getMetricsForCalculation();
        List<NQEMetrics> list = metricsForCalculation;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NQEMetrics nQEMetrics = (NQEMetrics) it.next();
            Long httpRTT3 = nQEMetrics.getHttpRTT();
            RttRecord rttRecord = httpRTT3 != null ? new RttRecord(Long.valueOf(httpRTT3.longValue()), Long.valueOf(nQEMetrics.getElapsedTime())) : null;
            if (rttRecord != null) {
                arrayList.add(rttRecord);
            }
        }
        Long lCalculateWeightedMedian = calculateWeightedMedian(arrayList);
        NQEQualityBean nQEQualityBean = new NQEQualityBean();
        nQEQualityBean.setWeightedHttpRTT(lCalculateWeightedMedian != null ? lCalculateWeightedMedian.longValue() : 0L);
        BaseNQEQualityBean baseNQEQualityBean = new BaseNQEQualityBean();
        NQEManager nQEManager = INSTANCE;
        ArrayList arrayList2 = new ArrayList();
        for (NQEMetrics nQEMetrics2 : list) {
            NQEMetrics nQEMetrics3 = nQEMetrics2.getType() == 1 ? nQEMetrics2 : null;
            RttRecord rttRecord2 = (nQEMetrics3 == null || (httpRTT2 = nQEMetrics3.getHttpRTT()) == null) ? null : new RttRecord(Long.valueOf(httpRTT2.longValue()), Long.valueOf(nQEMetrics2.getElapsedTime()));
            if (rttRecord2 != null) {
                arrayList2.add(rttRecord2);
            }
        }
        Long lCalculateWeightedMedian2 = nQEManager.calculateWeightedMedian(arrayList2);
        baseNQEQualityBean.setWeightedHttpRTT(lCalculateWeightedMedian2 != null ? lCalculateWeightedMedian2.longValue() : 0L);
        nQEQualityBean.setCronet(baseNQEQualityBean);
        BaseNQEQualityBean baseNQEQualityBean2 = new BaseNQEQualityBean();
        NQEManager nQEManager2 = INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        for (NQEMetrics nQEMetrics4 : list) {
            NQEMetrics nQEMetrics5 = nQEMetrics4.getType() == 0 ? nQEMetrics4 : null;
            RttRecord rttRecord3 = (nQEMetrics5 == null || (httpRTT = nQEMetrics5.getHttpRTT()) == null) ? null : new RttRecord(Long.valueOf(httpRTT.longValue()), Long.valueOf(nQEMetrics4.getElapsedTime()));
            if (rttRecord3 != null) {
                arrayList3.add(rttRecord3);
            }
        }
        Long lCalculateWeightedMedian3 = nQEManager2.calculateWeightedMedian(arrayList3);
        baseNQEQualityBean2.setWeightedHttpRTT(lCalculateWeightedMedian3 != null ? lCalculateWeightedMedian3.longValue() : 0L);
        nQEQualityBean.setOkhttp(baseNQEQualityBean2);
        calculateWeightedSuccessRate(metricsForCalculation, nQEQualityBean);
        double weightedSuccessRate = nQEQualityBean.getWeightedSuccessRate();
        NQEQualityBean nQEQualityBean2 = lastNetworkQualityRecord;
        double weightedSuccessRate2 = nQEQualityBean2 != null ? nQEQualityBean2.getWeightedSuccessRate() : 0.0d;
        if (weightedSuccessRate2 > 0.0d) {
            updateSuccessRateTrend(weightedSuccessRate2, weightedSuccessRate);
        }
        nQEQualityBean.setOldSuccessRate(weightedSuccessRate2);
        nQEQualityBean.setSuccessRateContinuousDiff(successRateContinuousDiff);
        lastNetworkQualityRecord = nQEQualityBean;
        queue.size();
        BaseNQEQualityBean cronet = nQEQualityBean.getCronet();
        if (cronet != null) {
            cronet.getWeightedSuccessRate();
        }
        BaseNQEQualityBean okhttp = nQEQualityBean.getOkhttp();
        if (okhttp != null) {
            okhttp.getWeightedSuccessRate();
        }
        long jLongValue = lCalculateWeightedMedian != null ? lCalculateWeightedMedian.longValue() : 0L;
        NQEConfig nQEConfig = CONFIG;
        return jLongValue > ((long) nQEConfig.getNetworkBadThreshold().getHttpRttBadThreshold()) || (weightedSuccessRate < nQEConfig.getNetworkBadThreshold().getSuccessRateBadThreshold() && successRateContinuousDiff < nQEConfig.getNetworkBadThreshold().getSuccessRateTrendBadThreshold());
    }

    private final boolean isValidMetrics(NQEMetrics metrics) {
        if (!metrics.getIsSuccessed()) {
            metrics.setCalculateData(false, null, null, null, null, metrics.getElapsedTime());
            return true;
        }
        Long httpRTT = metrics.getHttpRTT();
        if (httpRTT != null) {
            long jLongValue = httpRTT.longValue();
            NQEConfig nQEConfig = CONFIG;
            if (jLongValue < nQEConfig.getNetworkQualityConfig().getRttMinThreshold() || jLongValue > nQEConfig.getNetworkQualityConfig().getRttMaxThreshold()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyNetworkStateChanged() {
        int i7 = preNetworkState;
        if (i7 != networkState) {
            OnNetworkStateChangeListener onNetworkStateChangeListener = listener;
            if (onNetworkStateChangeListener != null) {
                onNetworkStateChangeListener.onNetworkStateChanged(Integer.valueOf(i7), Integer.valueOf(networkState), lastNetworkQualityRecord);
            }
            preNetworkState = networkState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNetworkConnect() {
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, e.f19009c, null, new b(2, null), 2);
    }

    private final void startMonitoring() {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        ConnectivityManager connectivityManager2 = connectivityManager;
        if (connectivityManager2 != null) {
            connectivityManager2.registerNetworkCallback(networkRequestBuild, getNetworkCallback());
        }
    }

    private final void trace(NQEQualityBean bean) {
        if (bean != null) {
            LibApm libApm = LibApm.INSTANCE;
            if (libApm.isFirebaseInitialized()) {
                try {
                    Trace traceNewTrace = FirebasePerformance.getInstance().newTrace(libApm.getNqeTraceName());
                    Intrinsics.checkNotNullExpressionValue(traceNewTrace, "newTrace(...)");
                    traceNewTrace.start();
                    int i7 = networkState;
                    if (i7 == 3) {
                        long weightedHttpRTT = bean.getWeightedHttpRTT();
                        NQEConfig nQEConfig = CONFIG;
                        if (weightedHttpRTT <= nQEConfig.getNetworkBadThreshold().getHttpRttBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Good-HttpRTT");
                        } else if (bean.getWeightedSuccessRate() >= nQEConfig.getNetworkBadThreshold().getSuccessRateBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Good-SuccessRate");
                        } else if (bean.getWeightedSuccessRate() >= nQEConfig.getNetworkBadThreshold().getSuccessRateBadThreshold() || bean.getSuccessRateContinuousDiff() < nQEConfig.getNetworkBadThreshold().getSuccessRateTrendBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Good-Other");
                        } else {
                            traceNewTrace.putAttribute("NetworkState", "Good-SuccessRateContinuousDiff");
                        }
                    } else if (i7 == 2) {
                        long weightedHttpRTT2 = bean.getWeightedHttpRTT();
                        NQEConfig nQEConfig2 = CONFIG;
                        if (weightedHttpRTT2 > nQEConfig2.getNetworkBadThreshold().getHttpRttBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Bad-HttpRTT");
                        } else if (bean.getWeightedSuccessRate() < nQEConfig2.getNetworkBadThreshold().getSuccessRateBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Bad-SuccessRate");
                        } else if (bean.getWeightedSuccessRate() < nQEConfig2.getNetworkBadThreshold().getSuccessRateBadThreshold() || bean.getSuccessRateContinuousDiff() >= nQEConfig2.getNetworkBadThreshold().getSuccessRateTrendBadThreshold()) {
                            traceNewTrace.putAttribute("NetworkState", "Bad-Other");
                        } else {
                            traceNewTrace.putAttribute("NetworkState", "Bad-SuccessRateContinuousDiff");
                        }
                    } else if (i7 == 1) {
                        traceNewTrace.putAttribute("NetworkState", "Offline");
                    } else {
                        traceNewTrace.putAttribute("NetworkState", "Unknown");
                    }
                    traceNewTrace.putMetric("HttpRTT", bean.getWeightedHttpRTT());
                    double d2 = 100;
                    traceNewTrace.putMetric("SuccessRate", (long) (bean.getWeightedSuccessRate() * d2));
                    traceNewTrace.putMetric("OldSuccessRate", (long) (bean.getOldSuccessRate() * d2));
                    traceNewTrace.putMetric("SuccessRateContinuousDiff", (long) (bean.getSuccessRateContinuousDiff() * d2));
                    traceNewTrace.stop();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final void updateNetworkState() {
        synchronized (this) {
            try {
                Queue<NQEMetrics> queue2 = queue;
                if (!queue2.isEmpty() && queue2.size() > CONFIG.getNetworkQualityConfig().getMinWindowSize()) {
                    updateNetworkStateTimestamp = SystemClock.elapsedRealtime();
                    updateNetworkStateCount = 0;
                    NQEManager nQEManager = INSTANCE;
                    int i7 = nQEManager.isNetworkQualityBad() ? 2 : 3;
                    networkState = i7;
                    if (preNetworkState != i7) {
                        nQEManager.trace(lastNetworkQualityRecord);
                    }
                    nQEManager.notifyNetworkStateChanged();
                    Unit unit = Unit.f38893a;
                    return;
                }
                networkState = 0;
                INSTANCE.notifyNetworkStateChanged();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void updateSuccessRateTrend(double oldRate, double newRate) {
        if (oldRate < 0.0d || newRate < 0.0d) {
            successRateContinuousDiff = 0.0d;
            return;
        }
        double d2 = newRate - oldRate;
        if (Math.abs(d2) > 1.0d) {
            successRateContinuousDiff = 0.0d;
            return;
        }
        if (Math.abs(d2) < 0.01d) {
            successRateContinuousDiff += d2;
            return;
        }
        if (d2 > 0.0d) {
            double d10 = successRateContinuousDiff;
            if (d10 > 0.0d) {
                successRateContinuousDiff = d10 + d2;
                return;
            }
        }
        if (d2 < 0.0d) {
            double d11 = successRateContinuousDiff;
            if (d11 < 0.0d) {
                successRateContinuousDiff = d11 + d2;
                return;
            }
        }
        successRateContinuousDiff = d2;
    }

    public final void addMetrics(@NotNull NQEMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (networkState == 1) {
            if (SystemClock.elapsedRealtime() - updateNetworkStateTimestamp >= CONFIG.getNetworkQualityConfig().getUpdateNetworkPeriod()) {
                refreshNetworkConnect();
            }
            clearAllMetrics();
            updateNetworkStateTimestamp = SystemClock.elapsedRealtime();
            notifyNetworkStateChanged();
            return;
        }
        NQEConfig nQEConfig = CONFIG;
        if (nQEConfig.getEnable()) {
            if (isValidMetrics(metrics)) {
                queue.add(metrics);
                cleanOldMetrics();
                Objects.toString(metrics);
                updateNetworkStateCount++;
            }
            if (isFirstTimeCalculate && updateNetworkStateCount >= nQEConfig.getNetworkQualityConfig().getFirstWindowTime()) {
                isFirstTimeCalculate = false;
                updateNetworkState();
            } else if (updateNetworkStateCount >= nQEConfig.getNetworkQualityConfig().getUpdateNetworkDataCount() || SystemClock.elapsedRealtime() - updateNetworkStateTimestamp >= nQEConfig.getNetworkQualityConfig().getUpdateNetworkPeriod()) {
                updateNetworkState();
            }
        }
    }

    public final void addNetworkStateChangeListener(@Nullable OnNetworkStateChangeListener listener2) {
        listener = listener2;
        notifyNetworkStateChanged();
    }

    @NotNull
    public final NQEConfig getConfig() {
        return CONFIG;
    }

    @Nullable
    public final NQEQualityBean getLastNetworkQualityRecord() {
        return lastNetworkQualityRecord;
    }

    @NotNull
    public final ConcurrentHashMap<Integer, NQEMetrics> getMetricsMap() {
        return metricsMap;
    }

    public final int getNetworkState() {
        return networkState;
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Object systemService = application.getApplicationContext().getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        connectivityManager = (ConnectivityManager) systemService;
        refreshNetworkConnect();
        startMonitoring();
    }

    public final boolean isNetworkBad() {
        return networkState == 2;
    }

    public final boolean isNetworkOffline() {
        return networkState == 1;
    }

    public final void removeMetricsFromMap(int hashCode) {
        metricsMap.remove(Integer.valueOf(hashCode));
    }

    public final void stopMonitoring() {
        ConnectivityManager connectivityManager2 = connectivityManager;
        if (connectivityManager2 != null) {
            connectivityManager2.unregisterNetworkCallback(getNetworkCallback());
        }
    }
}
