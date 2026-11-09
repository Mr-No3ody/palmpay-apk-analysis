package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFid", "()Ljava/lang/String;", "getAuthToken", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "<init>", "()V", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            if (r9 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object create(@org.jetbrains.annotations.NotNull com.google.firebase.installations.FirebaseInstallationsApi r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r9
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                Ef.a r1 = Ef.a.f2423a
                int r2 = r0.label
                r3 = 2
                r4 = 1
                java.lang.String r5 = ""
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.L$0
                java.lang.String r8 = (java.lang.String) r8
                androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Exception -> L81
                goto L7b
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r8 = (com.google.firebase.installations.FirebaseInstallationsApi) r8
                androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Exception -> L65
                goto L58
            L40:
                androidx.camera.core.impl.utils.executor.g.M(r9)
                r9 = 0
                com.google.android.gms.tasks.Task r9 = r8.getToken(r9)     // Catch: java.lang.Exception -> L65
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L65
                r0.L$0 = r8     // Catch: java.lang.Exception -> L65
                r0.label = r4     // Catch: java.lang.Exception -> L65
                java.lang.Object r9 = com.facebook.imagepipeline.nativecode.b.b(r9, r0)     // Catch: java.lang.Exception -> L65
                if (r9 != r1) goto L58
                goto L7a
            L58:
                com.google.firebase.installations.InstallationTokenResult r9 = (com.google.firebase.installations.InstallationTokenResult) r9     // Catch: java.lang.Exception -> L65
                java.lang.String r9 = r9.getToken()     // Catch: java.lang.Exception -> L65
                kotlin.jvm.internal.Intrinsics.e(r9)     // Catch: java.lang.Exception -> L65
                r6 = r9
                r9 = r8
                r8 = r6
                goto L67
            L65:
                r9 = r8
                r8 = r5
            L67:
                com.google.android.gms.tasks.Task r9 = r9.getId()     // Catch: java.lang.Exception -> L81
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L81
                r0.L$0 = r8     // Catch: java.lang.Exception -> L81
                r0.label = r3     // Catch: java.lang.Exception -> L81
                java.lang.Object r9 = com.facebook.imagepipeline.nativecode.b.b(r9, r0)     // Catch: java.lang.Exception -> L81
                if (r9 != r1) goto L7b
            L7a:
                return r1
            L7b:
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L81
                if (r9 != 0) goto L80
                goto L81
            L80:
                r5 = r9
            L81:
                com.google.firebase.sessions.InstallationId r9 = new com.google.firebase.sessions.InstallationId
                r0 = 0
                r9.<init>(r5, r8, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
