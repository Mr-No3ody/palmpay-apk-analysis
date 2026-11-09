package com.google.firebase.sessions.settings;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p135j0.C1767a;
import p140j8.f;
import p176lg.b;
import p176lg.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "defaultValue", "getDefaultValue", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionConfigs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n*L\n49#1:60\n*E\n"})
public final class SessionConfigsSerializer implements Serializer<SessionConfigs> {

    @NotNull
    public static final SessionConfigsSerializer INSTANCE = new SessionConfigsSerializer();

    @NotNull
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super SessionConfigs> continuation) throws C1767a {
        try {
            b bVar = c.f39369d;
            byte[] bArrY = f.y(inputStream);
            Intrinsics.checkNotNullParameter(bArrY, "<this>");
            String str = new String(bArrY, Charsets.UTF_8);
            bVar.getClass();
            return (SessionConfigs) bVar.decodeFromString(SessionConfigs.INSTANCE.serializer(), str);
        } catch (Exception e10) {
            Intrinsics.checkNotNullParameter("Cannot parse session configs", "message");
            throw new C1767a("Cannot parse session configs", e10);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(SessionConfigs sessionConfigs, OutputStream outputStream, Continuation continuation) {
        return writeTo2(sessionConfigs, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    @Nullable
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@NotNull SessionConfigs sessionConfigs, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        String strEncodeToString = c.f39369d.encodeToString(SessionConfigs.INSTANCE.serializer(), sessionConfigs);
        Intrinsics.checkNotNullParameter(strEncodeToString, "<this>");
        byte[] bytes = strEncodeToString.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return Unit.f38893a;
    }
}
