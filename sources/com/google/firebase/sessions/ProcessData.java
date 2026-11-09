package com.google.firebase.sessions;

import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p162kg.L;
import p162kg.V;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lcom/google/firebase/sessions/ProcessData;", "", "", "pid", "", "uuid", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkg/V;", "serializationConstructorMarker", "(IILjava/lang/String;Lkg/V;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/ProcessData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/google/firebase/sessions/ProcessData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPid", "Ljava/lang/String;", "getUuid", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProcessData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int pid;

    @NotNull
    private final String uuid;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/ProcessData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/ProcessData;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ProcessData> serializer() {
            return ProcessData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProcessData(int i7, int i10, String str, V v3) {
        if (3 != (i7 & 3)) {
            L.e(ProcessData$$serializer.INSTANCE.getDescriptor(), i7, 3);
            throw null;
        }
        this.pid = i10;
        this.uuid = str;
    }

    public static /* synthetic */ ProcessData copy$default(ProcessData processData, int i7, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = processData.pid;
        }
        if ((i10 & 2) != 0) {
            str = processData.uuid;
        }
        return processData.copy(i7, str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(ProcessData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.pid);
        output.encodeStringElement(serialDesc, 1, self.uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final ProcessData copy(int pid, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new ProcessData(pid, uuid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) other;
        return this.pid == processData.pid && Intrinsics.c(this.uuid, processData.uuid);
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (Integer.hashCode(this.pid) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.pid);
        sb2.append(", uuid=");
        return u.p(sb2, this.uuid, ')');
    }

    public ProcessData(int i7, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.pid = i7;
        this.uuid = uuid;
    }
}
