package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u001c\u0010 \u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\b\u0010!\u001a\u00020\"H\u0016J*\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160%H\u0002J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "appContext", "Landroid/content/Context;", "uuidGenerator", "Lcom/google/firebase/sessions/UuidGenerator;", "<init>", "(Landroid/content/Context;Lcom/google/firebase/sessions/UuidGenerator;)V", "myProcessName", "", "getMyProcessName", "()Ljava/lang/String;", "myProcessName$delegate", "Lkotlin/Lazy;", "myPid", "", "getMyPid", "()I", "myUuid", "getMyUuid", "myUuid$delegate", "myProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "getMyProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "myProcessDetails$delegate", "hasGeneratedSession", "", "isColdStart", "processDataMap", "", "Lcom/google/firebase/sessions/ProcessData;", "isMyProcessStale", "onSessionGenerated", "", "updateProcessDataMap", "getAppProcessDetails", "", "isProcessStale", "processDetails", "processData", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProcessDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1611#2,9:124\n1863#2:133\n1864#2:135\n1620#2:136\n1734#2,3:137\n1#3:134\n1#3:140\n*S KotlinDebug\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n*L\n78#1:124,9\n78#1:133\n78#1:135\n78#1:136\n83#1:137,3\n78#1:134\n*E\n"})
public final class ProcessDataManagerImpl implements ProcessDataManager {

    @NotNull
    private final Context appContext;
    private boolean hasGeneratedSession;
    private final int myPid;

    /* JADX INFO: renamed from: myProcessDetails$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy myProcessDetails;

    /* JADX INFO: renamed from: myProcessName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy myProcessName;

    /* JADX INFO: renamed from: myUuid$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy myUuid;

    @Inject
    public ProcessDataManagerImpl(@NotNull Context appContext, @NotNull UuidGenerator uuidGenerator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        final int i7 = 0;
        this.myProcessName = C2131j.b(new Function0(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f23081b;

            {
                this.f23081b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f23081b);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f23081b);
                }
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = C2131j.b(new c(uuidGenerator, 2));
        final int i10 = 1;
        this.myProcessDetails = C2131j.b(new Function0(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f23081b;

            {
                this.f23081b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f23081b);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f23081b);
                }
            }
        });
    }

    private final List<ProcessDetails> getAppProcessDetails() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final ProcessDetails getMyProcessDetails() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    private final boolean isProcessStale(ProcessDetails processDetails, ProcessData processData) {
        if (Intrinsics.c(getMyProcessName(), processDetails.getProcessName())) {
            return (processDetails.getPid() == processData.getPid() && Intrinsics.c(getMyUuid(), processData.getUuid())) ? false : true;
        }
        return processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails myProcessDetails_delegate$lambda$2(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.getMyProcessDetails().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public int getMyPid() {
        return this.myPid;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public String getMyProcessName() {
        return (String) this.myProcessName.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public String getMyUuid() {
        return (String) this.myUuid.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isColdStart(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> appProcessDetails = getAppProcessDetails();
        ArrayList<Pair> arrayList = new ArrayList();
        for (ProcessDetails processDetails : appProcessDetails) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            if (!isProcessStale((ProcessDetails) pair2.f38891a, (ProcessData) pair2.f38892b)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isMyProcessStale(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && Intrinsics.c(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    @NotNull
    public Map<String, ProcessData> updateProcessDataMap(@Nullable Map<String, ProcessData> processDataMap) {
        if (processDataMap != null) {
            LinkedHashMap linkedHashMapL = G.l(processDataMap);
            linkedHashMapL.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
            Map<String, ProcessData> mapK = G.k(linkedHashMapL);
            if (mapK != null) {
                return mapK;
            }
        }
        return F.b(new Pair(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
    }
}
