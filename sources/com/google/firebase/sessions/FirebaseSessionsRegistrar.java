package com.google.firebase.sessions;

import Wf.AbstractC0774s;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0014\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Qualified<Context> appContext;

    @NotNull
    private static final Qualified<AbstractC0774s> backgroundDispatcher;

    @NotNull
    private static final Qualified<AbstractC0774s> blockingDispatcher;

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp;

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;

    @NotNull
    private static final Qualified<FirebaseSessionsComponent> firebaseSessionsComponent;

    @NotNull
    private static final Qualified<TransportFactory> transportFactory;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR%\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000e0\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR%\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00110\u00110\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR%\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00110\u00110\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00160\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "<init>", "()V", "Lcom/google/firebase/components/Qualified;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "appContext", "Lcom/google/firebase/components/Qualified;", "getAppContext", "()Lcom/google/firebase/components/Qualified;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "getFirebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "getFirebaseInstallationsApi", "LWf/s;", "backgroundDispatcher", "getBackgroundDispatcher", "blockingDispatcher", "getBlockingDispatcher", "Lcom/google/android/datatransport/TransportFactory;", "transportFactory", "getTransportFactory", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "firebaseSessionsComponent", "getFirebaseSessionsComponent", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Qualified<Context> getAppContext() {
            return FirebaseSessionsRegistrar.appContext;
        }

        @NotNull
        public final Qualified<AbstractC0774s> getBackgroundDispatcher() {
            return FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        @NotNull
        public final Qualified<AbstractC0774s> getBlockingDispatcher() {
            return FirebaseSessionsRegistrar.blockingDispatcher;
        }

        @NotNull
        public final Qualified<FirebaseApp> getFirebaseApp() {
            return FirebaseSessionsRegistrar.firebaseApp;
        }

        @NotNull
        public final Qualified<FirebaseInstallationsApi> getFirebaseInstallationsApi() {
            return FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        @NotNull
        public final Qualified<FirebaseSessionsComponent> getFirebaseSessionsComponent() {
            return FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        @NotNull
        public final Qualified<TransportFactory> getTransportFactory() {
            return FirebaseSessionsRegistrar.transportFactory;
        }

        private Companion() {
        }
    }

    static {
        Qualified<Context> qualifiedUnqualified = Qualified.unqualified(Context.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified, "unqualified(...)");
        appContext = qualifiedUnqualified;
        Qualified<FirebaseApp> qualifiedUnqualified2 = Qualified.unqualified(FirebaseApp.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified2, "unqualified(...)");
        firebaseApp = qualifiedUnqualified2;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified3 = Qualified.unqualified(FirebaseInstallationsApi.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified3, "unqualified(...)");
        firebaseInstallationsApi = qualifiedUnqualified3;
        Qualified<AbstractC0774s> qualified = Qualified.qualified(Background.class, AbstractC0774s.class);
        Intrinsics.checkNotNullExpressionValue(qualified, "qualified(...)");
        backgroundDispatcher = qualified;
        Qualified<AbstractC0774s> qualified2 = Qualified.qualified(Blocking.class, AbstractC0774s.class);
        Intrinsics.checkNotNullExpressionValue(qualified2, "qualified(...)");
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> qualifiedUnqualified4 = Qualified.unqualified(TransportFactory.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified4, "unqualified(...)");
        transportFactory = qualifiedUnqualified4;
        Qualified<FirebaseSessionsComponent> qualifiedUnqualified5 = Qualified.unqualified(FirebaseSessionsComponent.class);
        Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified5, "unqualified(...)");
        firebaseSessionsComponent = qualifiedUnqualified5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        return ((FirebaseSessionsComponent) componentContainer.get(firebaseSessionsComponent)).getFirebaseSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessionsComponent getComponents$lambda$1(ComponentContainer componentContainer) {
        FirebaseSessionsComponent.Builder builder = DaggerFirebaseSessionsComponent.builder();
        Object obj = componentContainer.get(appContext);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        FirebaseSessionsComponent.Builder builderAppContext = builder.appContext((Context) obj);
        Object obj2 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        FirebaseSessionsComponent.Builder builderBackgroundDispatcher = builderAppContext.backgroundDispatcher((CoroutineContext) obj2);
        Object obj3 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        FirebaseSessionsComponent.Builder builderBlockingDispatcher = builderBackgroundDispatcher.blockingDispatcher((CoroutineContext) obj3);
        Object obj4 = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        FirebaseSessionsComponent.Builder builderFirebaseApp = builderBlockingDispatcher.firebaseApp((FirebaseApp) obj4);
        Object obj5 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
        FirebaseSessionsComponent.Builder builderFirebaseInstallationsApi = builderFirebaseApp.firebaseInstallationsApi((FirebaseInstallationsApi) obj5);
        Provider<TransportFactory> provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "getProvider(...)");
        return builderFirebaseInstallationsApi.transportFactoryProvider(provider).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        return C1850q.h(Component.builder(FirebaseSessions.class).name(LIBRARY_NAME).add(Dependency.required(firebaseSessionsComponent)).factory(new L4.a(11)).eagerInDefaultApp().build(), Component.builder(FirebaseSessionsComponent.class).name("fire-sessions-component").add(Dependency.required(appContext)).add(Dependency.required(backgroundDispatcher)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(firebaseApp)).add(Dependency.required(firebaseInstallationsApi)).add(Dependency.requiredProvider(transportFactory)).factory(new L4.a(12)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
