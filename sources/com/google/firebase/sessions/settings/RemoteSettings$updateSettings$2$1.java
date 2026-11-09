package com.google.firebase.sessions.settings;

import Ef.a;
import Ff.h;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.sessions.FirebaseSessions;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class RemoteSettings$updateSettings$2$1 extends h implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Boolean bool;
        Double d2;
        Integer num;
        SettingsCache settingsCache;
        int defaultCacheDuration;
        SessionConfigs sessionConfigs;
        Integer num2;
        Double d10;
        Object obj2;
        a aVar = a.f2423a;
        int i7 = this.label;
        if (i7 == 0) {
            g.M(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Objects.toString(jSONObject);
            Integer num3 = 0;
            Integer num4 = null;
            Boolean bool2 = null;
            if (jSONObject.has("app_quality")) {
                Object obj3 = jSONObject.get("app_quality");
                Intrinsics.f(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj3;
                try {
                    Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d10 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                Unit unit = Unit.f38893a;
                                num = num2;
                                d2 = d10;
                                bool = bool3;
                                num3 = num4;
                            } catch (JSONException e10) {
                                e = e10;
                                Integer num5 = num4;
                                bool2 = bool3;
                                obj2 = num5;
                                new Integer(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                                num = num2;
                                d2 = d10;
                                bool = bool2;
                                num3 = obj2;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            num2 = null;
                            bool2 = bool3;
                            obj2 = null;
                        }
                    } catch (JSONException e12) {
                        e = e12;
                        num2 = null;
                        d10 = null;
                        bool2 = bool3;
                        obj2 = d10;
                        new Integer(Log.e(FirebaseSessions.TAG, "Error parsing the configs remotely fetched: ", e));
                        num = num2;
                        d2 = d10;
                        bool = bool2;
                        num3 = obj2;
                        settingsCache = this.this$0.settingsCache;
                        if (num3 != 0) {
                            defaultCacheDuration = num3.intValue();
                        } else {
                            defaultCacheDuration = RemoteSettings.Companion.getDefaultCacheDuration();
                        }
                        sessionConfigs = new SessionConfigs(bool, d2, num, new Integer(defaultCacheDuration), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
                        this.label = 1;
                        if (settingsCache.updateConfigs(sessionConfigs, this) == aVar) {
                            return aVar;
                        }
                        return Unit.f38893a;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    num2 = null;
                    d10 = null;
                }
            } else {
                bool = null;
                d2 = null;
                num = null;
            }
            settingsCache = this.this$0.settingsCache;
            if (num3 != 0) {
                defaultCacheDuration = num3.intValue();
            } else {
                defaultCacheDuration = RemoteSettings.Companion.getDefaultCacheDuration();
            }
            sessionConfigs = new SessionConfigs(bool, d2, num, new Integer(defaultCacheDuration), new Long(this.this$0.timeProvider.currentTime().getSeconds()));
            this.label = 1;
            if (settingsCache.updateConfigs(sessionConfigs, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.f38893a);
    }
}
