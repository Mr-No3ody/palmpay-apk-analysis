package com.google.maps.android;

import C0.G;
import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/maps/android/Status;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.maps.android.StreetViewUtils$Companion$fetchStreetViewData$2", f = "StreetViewUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nStreetViewUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewUtil.kt\ncom/google/maps/android/StreetViewUtils$Companion$fetchStreetViewData$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class StreetViewUtils$Companion$fetchStreetViewData$2 extends h implements Function2<CoroutineScope, Continuation<? super Status>, Object> {
    final /* synthetic */ String $urlString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewUtils$Companion$fetchStreetViewData$2(String str, Continuation<? super StreetViewUtils$Companion$fetchStreetViewData$2> continuation) {
        super(2, continuation);
        this.$urlString = str;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StreetViewUtils$Companion$fetchStreetViewData$2(this.$urlString, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws IOException {
        a aVar = a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.$urlString).openConnection());
            Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP Error: " + responseCode);
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                String strE = p264r5.a.E(bufferedReader);
                bufferedReader.close();
                bufferedReader.close();
                inputStream.close();
                return StreetViewUtils.INSTANCE.deserializeResponse(strE).getStatus();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.o(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new IOException(G.o("Network error: ", e10.getMessage()));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Status> continuation) {
        return ((StreetViewUtils$Companion$fetchStreetViewData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
