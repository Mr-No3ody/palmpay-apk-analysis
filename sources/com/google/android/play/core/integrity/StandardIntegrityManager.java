package com.google.android.play.core.integrity;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j6);
        }

        public static Builder builder() {
            c cVar = new c();
            cVar.a(0);
            return cVar;
        }

        public abstract int a();

        public abstract long b();
    }

    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i7);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(@Nullable String str);
        }

        public static Builder builder() {
            return new f();
        }

        @Nullable
        public abstract String a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
