package com.google.firebase.heartbeatinfo;

import C0.G;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p377z5.l;

/* JADX INFO: loaded from: classes2.dex */
class HeartBeatInfoStorage {
    private static final p193n0.e GLOBAL;
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final p193n0.e HEART_BEAT_COUNT_TAG;
    private static final p193n0.e LAST_STORED_DATE;
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final JavaDataStorage firebaseDataStore;

    static {
        Intrinsics.checkNotNullParameter("fire-global", "name");
        GLOBAL = new p193n0.e("fire-global");
        Intrinsics.checkNotNullParameter("fire-count", "name");
        HEART_BEAT_COUNT_TAG = new p193n0.e("fire-count");
        Intrinsics.checkNotNullParameter("last-used-date", "name");
        LAST_STORED_DATE = new p193n0.e("last-used-date");
    }

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, G.o(HEARTBEAT_PREFERENCES_NAME, str));
    }

    private synchronized long cleanUpStoredHeartBeats(p193n0.b bVar) {
        long j6;
        try {
            long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(bVar, HEART_BEAT_COUNT_TAG, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : bVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((p193n0.e) entry.getKey()).f39813a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            p193n0.e key = l.K(str);
            Intrinsics.checkNotNullParameter(key, "key");
            bVar.e(key, hashSet2);
            j6 = jLongValue - 1;
            bVar.d(HEART_BEAT_COUNT_TAG, Long.valueOf(j6));
        } catch (Throwable th) {
            throw th;
        }
        return j6;
    }

    private synchronized String getFormattedDate(long j6) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j6));
        }
        Instant instant = new Date(j6).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized p193n0.e getStoredUserAgentString(p193n0.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return l.K(((p193n0.e) entry.getKey()).f39813a);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$deleteAllHeartBeats$0(p193n0.b bVar) {
        long j6 = 0;
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                p193n0.e eVar = (p193n0.e) entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    Object[] objArr = {formattedDate};
                    HashSet hashSet = new HashSet(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        throw new IllegalArgumentException("duplicate element: " + obj);
                    }
                    bVar.d(eVar, Collections.unmodifiableSet(hashSet));
                    j6++;
                } else {
                    bVar.c(eVar);
                }
            }
        }
        if (j6 == 0) {
            bVar.c(HEART_BEAT_COUNT_TAG);
            return null;
        }
        bVar.d(HEART_BEAT_COUNT_TAG, Long.valueOf(j6));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$postHeartBeatCleanUp$1(String str, p193n0.b bVar) {
        bVar.d(LAST_STORED_DATE, str);
        removeStoredDate(bVar, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$storeHeartBeat$2(String str, String str2, p193n0.e eVar, p193n0.b bVar) {
        p193n0.e eVar2 = LAST_STORED_DATE;
        if (((String) JavaDataStorageKt.getOrDefault(bVar, eVar2, "")).equals(str)) {
            p193n0.e storedUserAgentString = getStoredUserAgentString(bVar, str);
            if (storedUserAgentString == null || storedUserAgentString.f39813a.equals(str2)) {
                return null;
            }
            updateStoredUserAgent(bVar, eVar, str);
            return null;
        }
        p193n0.e eVar3 = HEART_BEAT_COUNT_TAG;
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(bVar, eVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = cleanUpStoredHeartBeats(bVar);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, eVar, new HashSet()));
        hashSet.add(str);
        bVar.d(eVar, hashSet);
        bVar.d(eVar3, Long.valueOf(jLongValue + 1));
        bVar.d(eVar2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$updateGlobalHeartBeat$3(long j6, p193n0.b bVar) {
        bVar.d(GLOBAL, Long.valueOf(j6));
        return null;
    }

    private synchronized void removeStoredDate(p193n0.b bVar, String str) {
        try {
            p193n0.e key = getStoredUserAgentString(bVar, str);
            if (key == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, key, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.c(key);
            } else {
                bVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                bVar.e(key, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void updateStoredUserAgent(p193n0.b bVar, p193n0.e eVar, String str) {
        removeStoredDate(bVar, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, eVar, new HashSet()));
        hashSet.add(str);
        bVar.d(eVar, hashSet);
    }

    public synchronized void deleteAllHeartBeats() {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f22988a.lambda$deleteAllHeartBeats$0((p193n0.b) obj);
            }
        });
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<p193n0.e, Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().f39813a, new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @RestrictTo({p192n.c.f39803d})
    @VisibleForTesting
    public int getHeartBeatCount() {
        return ((Long) this.firebaseDataStore.getSync(HEART_BEAT_COUNT_TAG, 0L)).intValue();
    }

    public synchronized long getLastGlobalHeartBeat() {
        return ((Long) this.firebaseDataStore.getSync(GLOBAL, -1L)).longValue();
    }

    public synchronized boolean isSameDateUtc(long j6, long j10) {
        return getFormattedDate(j6).equals(getFormattedDate(j10));
    }

    public synchronized void postHeartBeatCleanUp() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f22989a.lambda$postHeartBeatCleanUp$1(formattedDate, (p193n0.b) obj);
            }
        });
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j6) {
        return shouldSendSdkHeartBeat(GLOBAL, j6);
    }

    public synchronized boolean shouldSendSdkHeartBeat(p193n0.e eVar, long j6) {
        if (isSameDateUtc(((Long) this.firebaseDataStore.getSync(eVar, -1L)).longValue(), j6)) {
            return false;
        }
        this.firebaseDataStore.putSync(eVar, Long.valueOf(j6));
        return true;
    }

    public synchronized void storeHeartBeat(long j6, final String str) {
        final String formattedDate = getFormattedDate(j6);
        final p193n0.e eVarK = l.K(str);
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                HeartBeatInfoStorage heartBeatInfoStorage = this.f22984a;
                String str2 = str;
                return heartBeatInfoStorage.lambda$storeHeartBeat$2(formattedDate, str2, eVarK, (p193n0.b) obj);
            }
        });
    }

    public synchronized void updateGlobalHeartBeat(final long j6) {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j6, (p193n0.b) obj);
            }
        });
    }

    @RestrictTo({p192n.c.f39803d})
    @VisibleForTesting
    public HeartBeatInfoStorage(JavaDataStorage javaDataStorage) {
        this.firebaseDataStore = javaDataStorage;
    }
}
