package com.google.firebase.sessions;

import C0.J;
import Wf.AbstractC0777v;
import android.content.Context;
import android.os.Build;
import androidx.camera.video.u;
import androidx.datastore.core.CorruptionHandler;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.Binds;
import com.google.firebase.sessions.dagger.BindsInstance;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import com.google.firebase.sessions.dagger.Provides;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p135j0.AbstractC1775h;
import p135j0.C1767a;
import p135j0.O;
import p135j0.S;
import p135j0.U;

/* JADX INFO: loaded from: classes2.dex */
@Component(modules = {MainModule.class})
@Singleton
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "firebaseSessions", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "getSharedSessionRepository", "()Lcom/google/firebase/sessions/SharedSessionRepository;", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0016\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "appContext", "Landroid/content/Context;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "build", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        @NotNull
        Builder appContext(@NotNull Context appContext);

        @BindsInstance
        @NotNull
        Builder backgroundDispatcher(@Background @NotNull CoroutineContext backgroundDispatcher);

        @BindsInstance
        @NotNull
        Builder blockingDispatcher(@Blocking @NotNull CoroutineContext blockingDispatcher);

        @NotNull
        FirebaseSessionsComponent build();

        @BindsInstance
        @NotNull
        Builder firebaseApp(@NotNull FirebaseApp firebaseApp);

        @BindsInstance
        @NotNull
        Builder firebaseInstallationsApi(@NotNull FirebaseInstallationsApi firebaseInstallationsApi);

        @BindsInstance
        @NotNull
        Builder transportFactoryProvider(@NotNull Provider<TransportFactory> transportFactoryProvider);
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0019H'¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "eventGDTLoggerInterface", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "impl", "Lcom/google/firebase/sessions/EventGDTLogger;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "crashlyticsSettingsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "remoteSettings", "Lcom/google/firebase/sessions/settings/RemoteSettings;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "processDataManager", "Lcom/google/firebase/sessions/ProcessDataManager;", "Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Module
    public interface MainModule {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J'\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J/\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "<init>", "()V", "T", "Landroidx/datastore/core/Serializer;", "serializer", "Lk0/a;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "createDataStore", "(Landroidx/datastore/core/Serializer;Lk0/a;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "", "loadDataStoreSharedCounter", "()Z", "dataStoreFile", "", "prepDataStoreFile", "(Ljava/io/File;)V", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "()Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "()Lcom/google/firebase/sessions/UuidGenerator;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/ApplicationInfo;", "applicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/SessionDataSerializer;", "sessionDataSerializer", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionDataSerializer;)Landroidx/datastore/core/DataStore;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            private final <T> DataStore<T> createDataStore(Serializer<T> serializer, p149k0.a corruptionHandler, List<? extends DataMigration<T>> migrations, CoroutineScope scope, Function0<? extends File> produceFile) {
                CorruptionHandler aVar;
                CorruptionHandler aVar2;
                if (loadDataStoreSharedCounter()) {
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    Intrinsics.checkNotNullParameter(migrations, "migrations");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    Intrinsics.checkNotNullParameter(produceFile, "produceFile");
                    U u6 = new U(serializer, new J(scope, 8), produceFile);
                    List listC = C1849p.c(AbstractC1775h.f38045a.getInitializer(migrations));
                    if (corruptionHandler == null) {
                        aVar2 = corruptionHandler;
                        aVar2 = new com.growingio.android.debugger.a(10);
                    }
                    aVar2 = corruptionHandler;
                    return new O(u6, listC, aVar2, scope);
                }
                Intrinsics.checkNotNullParameter(serializer, "serializer");
                Intrinsics.checkNotNullParameter(migrations, "migrations");
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(produceFile, "produceFile");
                U storage = new U(serializer, S.f37981a, produceFile);
                Intrinsics.checkNotNullParameter(storage, "storage");
                Intrinsics.checkNotNullParameter(migrations, "migrations");
                Intrinsics.checkNotNullParameter(scope, "scope");
                if (corruptionHandler == null) {
                    aVar = corruptionHandler;
                    aVar = new com.growingio.android.debugger.a(10);
                }
                aVar = corruptionHandler;
                return new O(storage, C1849p.c(AbstractC1775h.f38045a.getInitializer(migrations)), aVar, scope);
            }

            public static DataStore createDataStore$default(Companion companion, Serializer serializer, p149k0.a aVar, List list, CoroutineScope coroutineScope, Function0 function0, int i7, Object obj) {
                if ((i7 & 4) != 0) {
                    list = z.f38935a;
                }
                return companion.createDataStore(serializer, aVar, list, coroutineScope, function0);
            }

            private final boolean loadDataStoreSharedCounter() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void prepDataStoreFile(File dataStoreFile) throws IOException {
                File parentFile = dataStoreFile.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.c(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException(u.k(parentFile, "Failed to delete conflicting file: "));
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e10) {
                        throw new IOException(u.k(parentFile, "Failed to create directory: "), e10);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException(u.k(parentFile, "Failed to create directory: "));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs sessionConfigsDataStore$lambda$0(C1767a ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                return SessionConfigsSerializer.INSTANCE.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionConfigsDataStore$lambda$2(Context context) throws IOException {
                File fileO = G8.a.o(context, "firebaseSessions/sessionConfigsDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileO);
                return fileO;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData sessionDataStore$lambda$3(SessionDataSerializer sessionDataSerializer, C1767a ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                return sessionDataSerializer.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionDataStore$lambda$5(Context context) throws IOException {
                File fileO = G8.a.o(context, "firebaseSessions/sessionDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileO);
                return fileO;
            }

            @Singleton
            @Provides
            @NotNull
            public final ApplicationInfo applicationInfo(@NotNull FirebaseApp firebaseApp) {
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                return SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
            }

            @Singleton
            @Provides
            @NotNull
            public final DataStore<SessionConfigs> sessionConfigsDataStore(@NotNull Context appContext, @Blocking @NotNull CoroutineContext blockingDispatcher) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                return createDataStore$default(this, SessionConfigsSerializer.INSTANCE, new p149k0.a(new com.facebook.react.packagerconnection.a(1)), null, AbstractC0777v.a(blockingDispatcher), new c(appContext, 0), 4, null);
            }

            @Singleton
            @Provides
            @NotNull
            public final DataStore<SessionData> sessionDataStore(@NotNull Context appContext, @Blocking @NotNull CoroutineContext blockingDispatcher, @NotNull final SessionDataSerializer sessionDataSerializer) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                Intrinsics.checkNotNullParameter(sessionDataSerializer, "sessionDataSerializer");
                return createDataStore$default(this, sessionDataSerializer, new p149k0.a(new Function1() { // from class: com.google.firebase.sessions.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3(sessionDataSerializer, (C1767a) obj);
                    }
                }), null, AbstractC0777v.a(blockingDispatcher), new c(appContext, 1), 4, null);
            }

            @Singleton
            @Provides
            @NotNull
            public final TimeProvider timeProvider() {
                return TimeProviderImpl.INSTANCE;
            }

            @Singleton
            @Provides
            @NotNull
            public final UuidGenerator uuidGenerator() {
                return UuidGeneratorImpl.INSTANCE;
            }
        }

        @Singleton
        @Binds
        @NotNull
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(@NotNull RemoteSettingsFetcher impl);

        @Singleton
        @Binds
        @NotNull
        EventGDTLoggerInterface eventGDTLoggerInterface(@NotNull EventGDTLogger impl);

        @NotNull
        @Singleton
        @Binds
        @LocalOverrideSettingsProvider
        SettingsProvider localOverrideSettings(@NotNull LocalOverrideSettings impl);

        @Singleton
        @Binds
        @NotNull
        ProcessDataManager processDataManager(@NotNull ProcessDataManagerImpl impl);

        @NotNull
        @Singleton
        @RemoteSettingsProvider
        @Binds
        SettingsProvider remoteSettings(@NotNull RemoteSettings impl);

        @Singleton
        @Binds
        @NotNull
        SessionFirelogPublisher sessionFirelogPublisher(@NotNull SessionFirelogPublisherImpl impl);

        @Singleton
        @Binds
        @NotNull
        SettingsCache settingsCache(@NotNull SettingsCacheImpl impl);

        @Singleton
        @Binds
        @NotNull
        SharedSessionRepository sharedSessionRepository(@NotNull SharedSessionRepositoryImpl impl);
    }

    @NotNull
    FirebaseSessions getFirebaseSessions();

    @NotNull
    SessionFirelogPublisher getSessionFirelogPublisher();

    @NotNull
    SessionGenerator getSessionGenerator();

    @NotNull
    SessionsSettings getSessionsSettings();

    @NotNull
    SharedSessionRepository getSharedSessionRepository();
}
