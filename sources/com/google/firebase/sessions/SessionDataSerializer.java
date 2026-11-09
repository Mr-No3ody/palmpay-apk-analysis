package com.google.firebase.sessions;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p135j0.C1767a;
import p140j8.f;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/sessions/SessionDataSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/SessionData;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "<init>", "(Lcom/google/firebase/sessions/SessionGenerator;)V", "defaultValue", "getDefaultValue", "()Lcom/google/firebase/sessions/SessionData;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/firebase/sessions/SessionData;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n*L\n49#1:60\n*E\n"})
public final class SessionDataSerializer implements Serializer<SessionData> {

    @NotNull
    private final SessionGenerator sessionGenerator;

    @Inject
    public SessionDataSerializer(@NotNull SessionGenerator sessionGenerator) {
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super SessionData> continuation) throws C1767a {
        try {
            p176lg.b bVar = p176lg.c.f39369d;
            byte[] bArrY = f.y(inputStream);
            Intrinsics.checkNotNullParameter(bArrY, "<this>");
            String str = new String(bArrY, Charsets.UTF_8);
            bVar.getClass();
            return (SessionData) bVar.decodeFromString(SessionData.INSTANCE.serializer(), str);
        } catch (Exception e10) {
            Intrinsics.checkNotNullParameter("Cannot parse session data", "message");
            throw new C1767a("Cannot parse session data", e10);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(SessionData sessionData, OutputStream outputStream, Continuation continuation) {
        return writeTo2(sessionData, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Nullable
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@NotNull SessionData sessionData, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        String strEncodeToString = p176lg.c.f39369d.encodeToString(SessionData.INSTANCE.serializer(), sessionData);
        Intrinsics.checkNotNullParameter(strEncodeToString, "<this>");
        byte[] bytes = strEncodeToString.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return Unit.f38893a;
    }
}
