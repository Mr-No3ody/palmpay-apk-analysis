package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowTimer;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1tSDK {
    final ExecutorService AFAdRevenueData;
    public Executor getRevenue = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.appsflyer.internal.AFe1tSDK");
    final Timer getCurrencyIso4217Code = new ShadowTimer(true, "\u200bcom.appsflyer.internal.AFe1tSDK");
    public final List<AFe1uSDK> getMediationNetwork = new CopyOnWriteArrayList();
    final Set<AFe1nSDK> getMonetizationNetwork = new CopyOnWriteArraySet();
    final Set<AFe1nSDK> component3 = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFe1sSDK<?>> component2 = new ConcurrentSkipListSet();
    final NavigableSet<AFe1sSDK<?>> areAllFieldsValid = new ConcurrentSkipListSet();
    final List<AFe1sSDK<?>> component4 = new ArrayList();
    final Set<AFe1sSDK<?>> component1 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1tSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1tSDK.this.component2) {
                try {
                    final AFe1sSDK<?> aFe1sSDKPollFirst = AFe1tSDK.this.component2.pollFirst();
                    if (aFe1sSDKPollFirst == null) {
                        return;
                    }
                    AFe1tSDK.this.component1.add(aFe1sSDKPollFirst);
                    long revenue = aFe1sSDKPollFirst.getRevenue();
                    AFe1mSDK aFe1mSDK = new AFe1mSDK(Thread.currentThread());
                    if (revenue > 0) {
                        AFe1tSDK.this.getCurrencyIso4217Code.schedule(aFe1mSDK, revenue);
                    }
                    final AFe1tSDK aFe1tSDK = AFe1tSDK.this;
                    aFe1tSDK.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1tSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            for (AFe1uSDK aFe1uSDK : AFe1tSDK.this.getMediationNetwork) {
                            }
                        }
                    });
                    if (!AFe1tSDK.this.component2.isEmpty()) {
                        AFe1tSDK aFe1tSDK2 = AFe1tSDK.this;
                        aFe1tSDK2.AFAdRevenueData.submit(aFe1tSDK2.new AnonymousClass3());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                        final AFe1qSDK aFe1qSDKCall = aFe1sSDKPollFirst.call();
                        aFe1mSDK.cancel();
                        final AFe1tSDK aFe1tSDK3 = AFe1tSDK.this;
                        aFe1tSDK3.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1tSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1sSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1qSDKCall);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1tSDK.this.component1.remove(aFe1sSDKPollFirst);
                                Iterator<AFe1uSDK> it = AFe1tSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1sSDKPollFirst, aFe1qSDKCall);
                                }
                                if (aFe1qSDKCall == AFe1qSDK.SUCCESS) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                    return;
                                }
                                if (!aFe1sSDKPollFirst.AFAdRevenueData()) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                } else if (AFe1tSDK.getMediationNetwork(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1tSDK.this.component2) {
                                        try {
                                            AFe1tSDK.this.component4.add(aFe1sSDKPollFirst);
                                            for (AFe1uSDK aFe1uSDK : AFe1tSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1sSDKPollFirst)));
                        final AFe1qSDK aFe1qSDK = AFe1qSDK.TIMEOUT;
                        aFe1sSDKPollFirst.getMonetizationNetwork = aFe1qSDK;
                        final AFe1tSDK aFe1tSDK4 = AFe1tSDK.this;
                        aFe1tSDK4.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1tSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1sSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1qSDK);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1tSDK.this.component1.remove(aFe1sSDKPollFirst);
                                Iterator<AFe1uSDK> it = AFe1tSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1sSDKPollFirst, aFe1qSDK);
                                }
                                if (aFe1qSDK == AFe1qSDK.SUCCESS) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                    return;
                                }
                                if (!aFe1sSDKPollFirst.AFAdRevenueData()) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                } else if (AFe1tSDK.getMediationNetwork(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1tSDK.this.component2) {
                                        try {
                                            AFe1tSDK.this.component4.add(aFe1sSDKPollFirst);
                                            for (AFe1uSDK aFe1uSDK : AFe1tSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFe1mSDK.cancel();
                        final AFe1tSDK aFe1tSDK5 = AFe1tSDK.this;
                        final AFe1qSDK aFe1qSDK2 = AFe1qSDK.FAILURE;
                        aFe1tSDK5.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1tSDK.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                                StringBuilder sb2 = new StringBuilder("execution finished for ");
                                sb2.append(aFe1sSDKPollFirst);
                                sb2.append(", result: ");
                                sb2.append(aFe1qSDK2);
                                aFLogger.d(aFg1cSDK, sb2.toString());
                                AFe1tSDK.this.component1.remove(aFe1sSDKPollFirst);
                                Iterator<AFe1uSDK> it = AFe1tSDK.this.getMediationNetwork.iterator();
                                while (it.hasNext()) {
                                    it.next().getMonetizationNetwork(aFe1sSDKPollFirst, aFe1qSDK2);
                                }
                                if (aFe1qSDK2 == AFe1qSDK.SUCCESS) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                    return;
                                }
                                if (!aFe1sSDKPollFirst.AFAdRevenueData()) {
                                    AFe1tSDK.this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
                                    AFe1tSDK.this.getCurrencyIso4217Code();
                                } else if (AFe1tSDK.getMediationNetwork(aFe1sSDKPollFirst)) {
                                    synchronized (AFe1tSDK.this.component2) {
                                        try {
                                            AFe1tSDK.this.component4.add(aFe1sSDKPollFirst);
                                            for (AFe1uSDK aFe1uSDK : AFe1tSDK.this.getMediationNetwork) {
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1tSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFe1sSDK getCurrencyIso4217Code;

        public AnonymousClass5(AFe1sSDK aFe1sSDK) {
            this.getCurrencyIso4217Code = aFe1sSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1tSDK.this.component2) {
                try {
                    if (AFe1tSDK.this.component1.contains(this.getCurrencyIso4217Code)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.QUEUE;
                        StringBuilder sb2 = new StringBuilder("tried to add already running task: ");
                        sb2.append(this.getCurrencyIso4217Code);
                        aFLogger.d(aFg1cSDK, sb2.toString());
                        return;
                    }
                    if (!AFe1tSDK.this.component2.contains(this.getCurrencyIso4217Code) && !AFe1tSDK.this.areAllFieldsValid.contains(this.getCurrencyIso4217Code)) {
                        AFe1tSDK aFe1tSDK = AFe1tSDK.this;
                        AFe1sSDK aFe1sSDK = this.getCurrencyIso4217Code;
                        for (AFe1nSDK aFe1nSDK : aFe1sSDK.getCurrencyIso4217Code) {
                            if (aFe1tSDK.component3.contains(aFe1nSDK)) {
                                aFe1sSDK.AFAdRevenueData.add(aFe1nSDK);
                            }
                        }
                        if (AFe1tSDK.this.getRevenue(this.getCurrencyIso4217Code)) {
                            zAdd = AFe1tSDK.this.component2.add(this.getCurrencyIso4217Code);
                        } else {
                            zAdd = AFe1tSDK.this.areAllFieldsValid.add(this.getCurrencyIso4217Code);
                            if (zAdd) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK2 = AFg1cSDK.QUEUE;
                                StringBuilder sb3 = new StringBuilder("new task was blocked: ");
                                sb3.append(this.getCurrencyIso4217Code);
                                aFLogger2.d(aFg1cSDK2, sb3.toString());
                                this.getCurrencyIso4217Code.getMonetizationNetwork();
                            }
                        }
                        if (zAdd) {
                            AFe1tSDK aFe1tSDK2 = AFe1tSDK.this;
                            aFe1tSDK2.component2.addAll(aFe1tSDK2.component4);
                            AFe1tSDK.this.component4.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.QUEUE;
                            StringBuilder sb4 = new StringBuilder("task not added, it's already in the queue: ");
                            sb4.append(this.getCurrencyIso4217Code);
                            aFLogger3.d(aFg1cSDK3, sb4.toString());
                        }
                        if (!zAdd) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK4 = AFg1cSDK.QUEUE;
                            StringBuilder sb5 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb5.append(this.getCurrencyIso4217Code);
                            aFLogger4.w(aFg1cSDK4, sb5.toString());
                            return;
                        }
                        AFe1tSDK.this.component3.add(this.getCurrencyIso4217Code.getMediationNetwork);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK5 = AFg1cSDK.QUEUE;
                        StringBuilder sb6 = new StringBuilder("new task added: ");
                        sb6.append(this.getCurrencyIso4217Code);
                        aFLogger5.d(aFg1cSDK5, sb6.toString());
                        for (AFe1uSDK aFe1uSDK : AFe1tSDK.this.getMediationNetwork) {
                        }
                        AFe1tSDK aFe1tSDK3 = AFe1tSDK.this;
                        aFe1tSDK3.AFAdRevenueData.submit(aFe1tSDK3.new AnonymousClass3());
                        AFe1tSDK aFe1tSDK4 = AFe1tSDK.this;
                        synchronized (aFe1tSDK4.component2) {
                            try {
                                for (int size = (aFe1tSDK4.component2.size() + aFe1tSDK4.areAllFieldsValid.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFe1tSDK4.areAllFieldsValid.isEmpty();
                                    boolean zIsEmpty2 = aFe1tSDK4.component2.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFe1tSDK4.getRevenue(aFe1tSDK4.component2);
                                        } else if (!zIsEmpty) {
                                            aFe1tSDK4.getRevenue(aFe1tSDK4.areAllFieldsValid);
                                        }
                                    } else if (aFe1tSDK4.component2.first().compareTo(aFe1tSDK4.areAllFieldsValid.first()) > 0) {
                                        aFe1tSDK4.getRevenue(aFe1tSDK4.component2);
                                    } else {
                                        aFe1tSDK4.getRevenue(aFe1tSDK4.areAllFieldsValid);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK6 = AFg1cSDK.QUEUE;
                    StringBuilder sb7 = new StringBuilder("tried to add already scheduled task: ");
                    sb7.append(this.getCurrencyIso4217Code);
                    aFLogger6.d(aFg1cSDK6, sb7.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFe1tSDK(ExecutorService executorService) {
        this.AFAdRevenueData = executorService;
    }

    @VisibleForTesting
    public static boolean getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        return ((aFe1sSDK instanceof AFf1ySDK) && aFe1sSDK.getMediationNetwork == AFe1nSDK.ARS_VALIDATE) ? false : true;
    }

    public final void getCurrencyIso4217Code() {
        synchronized (this.component2) {
            try {
                Iterator<AFe1sSDK<?>> it = this.areAllFieldsValid.iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    AFe1sSDK<?> next = it.next();
                    if (getRevenue(next)) {
                        it.remove();
                        this.component2.add(next);
                        z3 = true;
                    }
                }
                if (z3) {
                    this.AFAdRevenueData.submit(new AnonymousClass3());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void getRevenue(NavigableSet<AFe1sSDK<?>> navigableSet) {
        AFe1sSDK<?> aFe1sSDKPollFirst = navigableSet.pollFirst();
        this.getMonetizationNetwork.add(aFe1sSDKPollFirst.getMediationNetwork);
        Iterator<AFe1uSDK> it = this.getMediationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getMediationNetwork(aFe1sSDKPollFirst);
        }
    }

    public final boolean getRevenue(AFe1sSDK<?> aFe1sSDK) {
        return this.getMonetizationNetwork.containsAll(aFe1sSDK.AFAdRevenueData);
    }
}
